package lists.trees.and.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class AncestorDatabase {
	public static final String NAME_UNKNOWN = "UNKNOWN";
	ArrayList<AncestorTree> db = new ArrayList<AncestorTree>();
	static Map<String, AncestorTree> treeByName = new HashMap<String, AncestorTree>();

	private class AncestorTree{
		
		public String name;
		private AncestorTree father;
		private AncestorTree mother;
		
		AncestorTree(String name, AncestorTree aFather, AncestorTree aMother){
			this.name = name;
			this.father = aFather;
			this.mother = aMother; 			
		}
		
		@Override
		public String toString(){
			return "(" + (NAME_UNKNOWN.equals(this.name) ? this.name : (this.name + "," + this.father.name + "," + this.mother.name) + ")") ;
		}
	}
	
	public void addPerson(String name, String aFather, String aMother){
		AncestorTree tree = new AncestorTree(name, treeByName.get(aFather), treeByName.get(aMother));
		db.add(tree);
		treeByName.put(name, tree);
		
	}
	
	public static int isAncestor(String person, String ancestor){
		if(treeByName.containsKey(person)){
			throw new IllegalArgumentException("This person is not added to database.");
		}
		if(person.equals(ancestor)){
			return 0;
		}

		int result = -1;
		Map<String, Integer> levels = new HashMap<String, Integer>(); 
		levels.put(person, 0);
		Queue<AncestorTree> queue = new LinkedList<>();
        queue.add(treeByName.get(person));
        while(!queue.isEmpty()){            	
        	AncestorTree current = queue.remove();
            if((current.name).equals(ancestor)) {
            	result = levels.get(current.name);
                break;
            }
            else{
                if(!(current.name).equals(NAME_UNKNOWN)){
                    queue.add(current.father);
                    levels.put(current.father.name, levels.get(current.name)+1);
                    queue.add(current.mother); 
                    levels.put(current.mother.name, levels.get(current.name)+1);
                }
            }
        }        
		return result;		
	}

	public static int isDescendant(String person, String descedant){
		return isAncestor(descedant, person);
}
	
	public static void main(String[] args) {
		//create Jessie's family tree
		 //Nelly is Sarah's mother, Jessie's grandma
		 //John is Jessie's father
		 //Sarah is Jessie's mother
		 AncestorDatabase data = new AncestorDatabase();		 
		 data.addPerson(NAME_UNKNOWN, null, null);
		 data.addPerson("Nelly", NAME_UNKNOWN, NAME_UNKNOWN);
		 data.addPerson("John", NAME_UNKNOWN, NAME_UNKNOWN);
		 data.addPerson("Sarah", NAME_UNKNOWN, "Nelly");
		 data.addPerson("Jessie", "John", "Sarah");
		 //Albena is not from Jessie's family
		 data.addPerson("Albena", NAME_UNKNOWN, NAME_UNKNOWN);
		 //print all objects(BinaryTreeNodes) in BinaryTree
		 System.out.println(data.db.toString());
		
		//test if John is Jessie's father - must return 1
		System.out.println(isAncestor("Jessie","John"));
		//test if Sarah is Jessie's mother - must return 1
		System.out.println(isAncestor("Jessie","Sarah"));
		//test if Nelly is Jessie's grandma - must return 2
		System.out.println(isAncestor("Jessie","Nelly"));
		//test if Jessie is ancestor of herself - must return 0
		System.out.println(isAncestor("Jessie","Jessie"));
		//test if Jessie has a family-relationship with Albena - must retun -1
		System.out.println(isAncestor("Jessie","Albena"));
		//test if Peter(not added in db) has a family-relationship with Albena - must retun -1
		System.out.println(isAncestor("Albena", "Peter"));	
		//test if Albena has a family-relationship with Peter - throws an IllegualArgumentException
		System.out.println(isAncestor("Peter","Albena"));
		//test if Nelly is Jessie's grandma - must return 2 
		System.out.println(isDescendant("Nelly","Jessie"));
		
		
		
	}	
}

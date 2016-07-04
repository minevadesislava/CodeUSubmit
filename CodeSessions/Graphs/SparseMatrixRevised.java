package lists.trees.and.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class SparseMatrixRevised {
	// map keeps all “[x, y]: value”
	static public HashMap<String, Integer> map = new HashMap<String, Integer>();
	static public int number_cols = 0;
	static public int number_rows = 0;
	SparseMatrixRevised(ArrayList<String> arr){		
		for (Iterator iterator = arr.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			String key = string.substring(1, 2) + string.substring(4, 5);
			if(number_rows < Integer.parseInt(string.substring(1, 2) + 1)){number_rows = Integer.parseInt(string.substring(1, 2)) + 1;}
			if(number_cols < Integer.parseInt(string.substring(4, 5) + 1)){number_cols = Integer.parseInt(string.substring(4, 5)) + 1;}
			map.put(key, Integer.parseInt(string.substring(8)));
		}
	}
	
	static int[][] sparseMatrix(){ 
		int[][] matrix = new int[number_rows][number_cols];
		for(int i = 0; i<matrix.length;i++){
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] =  0;
				String index ="" + i + j;
				if(map.containsKey(index)){ matrix[i][j] = map.get(index);}
		}}
		return matrix;		
	}
	
	public static void main(String[] args) {
		//reads input from the console until it equals "sparse"
		Scanner in = new Scanner(System.in);
		System.out.println("Enter elements: ");
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String s = in.nextLine();
			if (s.equals("sparse")) {
				break;
			} 
			list.add(s);
		}
		//initialize test matrix in order to test sparseMatrix() method
		SparseMatrixRevised matrix = new SparseMatrixRevised(list);
		int[][] mat = sparseMatrix();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}	
}

package sorting.searching.hashtables;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

public class QuerySteam {
	LinkedList<Query> query_steam = new LinkedList<>();
	
	boolean hasNext(){
		return false;
	}
	
	void next(){
		String next = null;
		String new_query = "<NEWQUERY>";
		for (Query query : query_steam) {
			LinkedList<String> list = query.toList();
			for (String string : list) {
				next = string;
				System.out.println(next);
			}
			next = new_query;
			System.out.println(next);
		}
		System.out.println("Finish!!!!!!!!");
	}
	
	void add(Query q){
		query_steam.add(q);
	}
	
	public static void main(String[] args) {
		QuerySteam qs = new QuerySteam();
		Query q1 = new Query("a aa aaa aaaa aaaa aaaaaa");
		Query q2 = new Query("b bb bbb bbbb bbbbb bbbbbb bbbbbbb");
		Query q3 = new Query("c cc ccc cccc ccccc ccccccc");
		Query q4 = new Query("bb bbb bbb bbbbb bbbb");
		Query q5 = new Query("d ddd dddd dddd dddd");
		qs.add(q1);
		qs.add(q2);
		qs.add(q3);
		qs.add(q4);
		qs.add(q5);

		qs.next();

	}
}

class Query{
	String date;
	String string;
	
	Query(String s){
		this.string = s;
		date = (new Date()).toString();
	}
	
	LinkedList<String> toList(){
		return new LinkedList<>(Arrays.asList(string.split(" ")));
}
}
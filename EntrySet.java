import java.util.*;
public class EntrySet {
	public static void main(String [] args){
	
	Map<String, Integer> map = new TreeMap<>();
	map.put("One", 1);
	map.put("Two", 2);
	map.put("Three", 3);
	map.put("Four", 4);
	map.put("Five", 5);
	map.put("Six", 6);
	System.out.println("Set view of map - ");
	System.out.println(map.entrySet());

	System.out.println("Printing one by one ------>");

	for(Map.Entry<String, Integer> e : map.entrySet()){
		System.out.println(e.getKey()+"------->"+e.getValue());
	}
	}
}
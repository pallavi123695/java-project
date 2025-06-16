package xyz;

import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("pallu", 100);
		tm.put("pooji", 90);
		tm.put("yogi", 80);
		System.out.println(tm);
		System.out.println(tm.get("nivi"));
		System.out.println(tm.containsKey("nivi"));
		TreeMap<String,Long> tmm=new TreeMap<>();
		tmm.put("pallavi", 9895239457L);
		tmm.put("pooji",  9612374698L);
		System.out.println(tmm);
	}

}
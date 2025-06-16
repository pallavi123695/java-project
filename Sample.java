package xyz;
import java.util.*;
class ArrayList1{
    public void ArrayList() {
    	System.out.println("List of Students");
    	List<String> arr=new ArrayList<String>();
    	arr.add("pallavi");
    	arr.add("poojitha");
    	arr.add("yogeswar");
    	System.out.println(arr);
    }
}
class LinkedList7  extends ArrayList1{
	public void LinkedList() {
		System.out.println("List of Students");
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("abc");
		ll.add("def");
		ll.add("ghi");
		System.out.println(ll);
	}
}
class HashSet1 extends ArrayList{
	public void  HashSet() {
		System.out.println("List of Students");
		HashSet<String> hs=new HashSet<String>();
		hs.add("adr");
		hs.add("soh");
		hs.add("ihg");
		System.out.println(hs);
	}
}
class HashMap1 extends ArrayList{
	public void  HashMap() {
		System.out.println("List of Students");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"adr");
		hm.put(2,"soh");
		hm.put(3,"ihg");
		System.out.println(hm);
	}
}

public class Sample {

	public static void main(String[] args) {
	   ArrayList1 obj=new ArrayList1();
       LinkedList7 obj2 =new LinkedList7();
       HashSet1 obj3=new HashSet1();
       HashMap1 obj4=new HashMap1();
       obj.ArrayList();
       obj2.LinkedList();
       obj3.HashSet();
       obj4.HashMap();
       
	}

}
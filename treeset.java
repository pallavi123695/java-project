package xyz;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
        ts.add("pallu");
        ts.add("yogi");
        ts.add("pooji");
        System.out.println(ts);
        System.out.println(ts.contains("abc"));
	}

}
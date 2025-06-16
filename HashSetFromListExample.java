package xyz;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetFromListExample {
    public static void main(String[] args) {

        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");

        System.out.println( colors);
        
        
        
        
        
        
        System.out.println(colors.contains("Green"));
        
        ArrayList<String> uniqueColors = new ArrayList<>(colors);
        System.out.println( uniqueColors);
        //Iterator//
        Iterator<String> it=colors.iterator();
        while(it.hasNext()) {
        	String colour=it.next();
        	System.out.println(colour);
        }
    }
}

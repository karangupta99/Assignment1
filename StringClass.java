package seleniumDemo;

import java.util.Arrays;

public class StringClass {

    public static void main(String[] args) {

        //  STRING operations
        String s1 = "ashish";
        String s2 = "Ashish";

        System.out.println("=== String Operations ===");
        System.out.println("Original String: " + s1);
        System.out.println("Length: " + s1.length());
        System.out.println("isEmpty: " + s1.isEmpty());
        System.out.println("charAt(0): " + s1.charAt(0));
        System.out.println("toString: " + s1.toString());
        System.out.println("equals s2: " + s1.equals(s2));
        System.out.println("compareTo s2: " + s1.compareTo(s2));
        System.out.println("contains 'sh': " + s1.contains("sh"));
        System.out.println("indexOf 's': " + s1.indexOf("s"));
        System.out.println("lastIndexOf 's': " + s1.lastIndexOf("s"));
        System.out.println("startsWith 'a': " + s1.startsWith("a"));
        System.out.println("endsWith 'h': " + s1.endsWith("h"));
        System.out.println("matches '[a-z]+': " + s1.matches("[a-z]+"));
        System.out.println("substring(1,4): " + s1.substring(1,4));
        System.out.println("toLowerCase: " + s1.toLowerCase());
        System.out.println("trim: '" + ("   " + s1 + "   ").trim() + "'");
        System.out.println("replace 'sh' with 'xx': " + s1.replace("sh","xx"));

        // split and join
        String[] parts = s1.split("s");
        System.out.println("split by 's': " + Arrays.toString(parts));
        String joined = String.join("-", parts);
        System.out.println("join with '-': " + joined);

        // valueOf
        int num = 123;
        String strNum = String.valueOf(num);
        System.out.println("valueOf 123: " + strNum);

        //  STRINGBUFFER 
        StringBuffer sb = new StringBuffer("hello");
        System.out.println("\n=== StringBuffer Operations ===");
        System.out.println("Original StringBuffer: " + sb);
        sb.append(" world");
        System.out.println("append ' world': " + sb);
        sb.insert(5, " Java");
        System.out.println("insert ' Java' at index 5: " + sb);
        sb.delete(5, 10);
        System.out.println("delete(5,10): " + sb);
        sb.replace(0, 5, "Hi");
        System.out.println("replace(0,5) with 'Hi': " + sb);
        sb.reverse();
        System.out.println("reverse: " + sb);
        System.out.println("charAt(0): " + sb.charAt(0));
        System.out.println("length: " + sb.length());
        System.out.println("capacity: " + sb.capacity());

        //  STRINGBUILDER
        StringBuilder sbd = new StringBuilder("hello");
        System.out.println("\n=== StringBuilder Operations ===");
     
        
        sbd.append(" world");
        System.out.println("append ' world': " + sbd);
        
        // insertion
        sbd.insert(5, " Java");
        
       // deletion
        sbd.delete(5, 10);
        System.out.println("delete(5,10): " + sbd);
        
        sbd.replace(0, 5, "Hi");
        System.out.println("replace(0,5) with 'Hi': " + sbd);
        sbd.reverse();
        System.out.println("reverse: " + sbd);
        System.out.println("charAt(0): " + sbd.charAt(0));
        System.out.println("length: " + sbd.length());
        System.out.println("capacity: " + sbd.capacity());
    }
}

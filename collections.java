package Collection1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {


        LinkedList l = new LinkedList();
        l.add("Hii");
        l.add("Aryan");
        l.add("Here");
        l.add("From");
        l.add("crossasyst");
        System.out.println(l);
        System.out.println(l.size());
        //to remove an element
        l.remove(3);//it is used to remove a obj based on their indexing value
        System.out.println(l);
        l.remove("Aryan");//it is used to remove a object
        System.out.println(l);
        // To insert a value in middle of the list

        l.add(1,"Aditya");
        l.add(3,"from");
        System.out.println(l);

        //retriving data


        System.out.println("RETRIVING DATA :" +l.get(1));
        //SET (OR CHANGE OF Value)
        System.out.println(l.set(4,"Wipro"));
        System.out.println(l);

        //contains returns boolean values
        System.out.println( l.contains("Wipro"));//true
        System.out.println(l.contains("crossasyst"));//false


        //using forloop
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }



        //using iterator

        Iterator il =l.iterator();
        System.out.println("While using Iterator :");
        while(il.hasNext()){

            System.out.println(il.next());
        }
    }
}

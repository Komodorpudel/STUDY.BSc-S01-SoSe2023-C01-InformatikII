package SoSe23.A_Skript.C5_Java_API;

import java.util.ArrayList;
import java.util.TreeSet;

import java.util.Iterator;

public class C5_3_Collection {

    public static void main (String[] args){

        // Collection durch laufen mit Interator (schon gemacht bei C5_2

        // S30 - Collection mit for Each Schleife durchlaufen (geht auch mit einfachem Array)

        ArrayList <String> myList = new ArrayList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        for (String s : myList){
            System.out.println(s);
        }

        System.out.println("Über iterator:");

        Iterator <String> myIterator = myList.iterator();

        while(myIterator.hasNext()){
            System.out.println(myIterator.next());
        };

        //S34 - TreeSet mit forEach Methode
        TreeSet<Integer> myTreeSet = new TreeSet<Integer>();

        myTreeSet.add(1);
        myTreeSet.add(2);
        myTreeSet.add(3);
        myTreeSet.add(4);
        myTreeSet.add(5);

        myTreeSet.forEach(n -> System.out.println(n));

    }
    
}

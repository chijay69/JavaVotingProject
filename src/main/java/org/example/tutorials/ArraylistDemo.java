package org.example.tutorials;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>(5);
        //for loop
        for (int i = 0; i <= 5; i++) {
            arrayList.add(i);
        }
        //print list out
        System.out.println(arrayList);

//      remove element at index 3
        arrayList.remove(3);

        //print list out
        System.out.println(arrayList);
        
//      printing elements one by one
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}

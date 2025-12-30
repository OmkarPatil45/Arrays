// package com.omi;
import java.util.*;

public class array1 {
    public static void main(String[] args){
        // syntax
        // datatype[] variable_name = new datatype[size];
        // int[] rno = new int[5];

        // // or
        // int[] rno2 = {1, 2, 3, 4, 5};

        // int[] ros; //declaration of array
        // ros = new int[5]; //initializaton: actually here the object is being created in memory(heap)
        // System.out.println(ros[1]);

        // //input using for loops
        // int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++){
        //     arr[i] = in.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));

        // for (int i=0; i < arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println();

        // // for-each loop
        // for (int num : arr){ //for every element in the array, print the element
        //     System.out.print(num + " " );
        // }

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i< str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "omi";
        System.out.println(Arrays.toString(str));
    } 
}
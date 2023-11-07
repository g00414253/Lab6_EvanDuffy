package org.example;

public class Main {
    public static void main(String[] args) {
       int x;
       int[] anArray;

       anArray=new int[10];

       //Assigns value to array counting for 100-1000
       for(x=0;x<10;x++){
           anArray[x]=100+(100*x);
       }

       //Prints out value of each location 0-9
       for (x=0;x<10;x++){
           System.out.println("Element at index " + x + ":" + anArray[x]);
       }
    }
}
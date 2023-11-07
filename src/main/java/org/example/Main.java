package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int x;
       int[] anArray;

       anArray=new int[10];

       //Added a scanner to read in user inputs
        Scanner in = new Scanner(System.in);

       //Assigns value to array counting for 100-1000
       for(x=0;x<10;x++){
           anArray[x]=100+(100*x);
       }

       //Prints out value of each location 0-9
       for (x=0;x<10;x++){
           System.out.println("Element at index " + x + ":" + anArray[x]);
       }

        try {
            System.out.println("Please enter a value for anArray[10]: ");
             anArray[10]=in.nextInt();
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

       /* anArray[10]=scanner.nextInt(); */
}

/* 17.Write a Java program to sort a numeric array and a string array.*/
package homework7;

import java.util.Arrays;

public class Question_17 {
    public static void main(String[] args) {
        Question_17 q17=new Question_17();
        q17.p1();
    }
    public void p1()
    {
        int[] a1 = {1254,1472,2456,2165};
        String[] a2 = {"Java","PHP","Python","Android"};

        System.out.println("Original numeric array : " +Arrays.toString(a1));
        Arrays.sort(a1);
        System.out.println("Sorted numeric array : " +Arrays.toString(a1));
        System.out.println("Original string array : " +Arrays.toString(a2));
        Arrays.sort(a2);
        System.out.println("Sorted string array : " +Arrays.toString(a2));
    }

}

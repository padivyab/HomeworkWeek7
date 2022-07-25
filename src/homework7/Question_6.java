/* 6.Write a java program to input any number and find out if it’s odd or even */
package homework7;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Question_6 q6=new Question_6();
        q6.m1();

    }
    public void m1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number :");
        int i =sc.nextInt();
        if(i % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}

/* 1.Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)*/
package homework7;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is : "+result);*/
        Question_1 q1=new Question_1();
        q1.m1();
    }
    public void m1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Number :");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is : "+result);
    }


}

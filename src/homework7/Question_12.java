/* 12. Write a program that tells us input value is number or an alphabet or symbol. */
package homework7;

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {

        Question_12 q12=new Question_12();
        q12.m1();
    }
    public void m1()
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter any value : ");
        char ch = sc.next().charAt(0);

        if (ch >= '0' && ch <= '9'){

            System.out.println(ch + " is A NUMBER.");

        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");


        } else {

            System.out.println(ch + " is A SYMBOL");
        }
    }
}

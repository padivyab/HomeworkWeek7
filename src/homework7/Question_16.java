/* 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO” */
package homework7;

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
       Question_16 q16=new Question_16();
       q16.m1();
    }
    public void m1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num =sc.nextInt();
        if(num > 0)
        {
            System.out.println("The number is Positive");
        }
        else if (num < 0)
        {
            System.out.println("The number is Nagative");
        }
        else
        {
            System.out.println("The number is Zero");
        }
    }
}

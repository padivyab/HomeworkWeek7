/* 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not? */
package homework7;
import java.util.Scanner;
public class Question_2 {

    public static void main(String[] args) {

       /* Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        } */
        Question_2 q2=new Question_2();
        q2.m1();

    }

    public void m1() {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        //int year = in.nextInt();
        int year = in.nextInt();
        //boolean x = (year % 4) == 0;
        //boolean y = (year % 100) != 0;
        //boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if(year % 4 == 0) {
        //if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}


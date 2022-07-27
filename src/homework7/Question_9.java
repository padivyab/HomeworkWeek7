/* 9.Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry using switch statement. */
package homework7;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_9 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter alphabet between a to f");
        char c1=sc.next().charAt(0);
        p1(c1);
        sc.close();

    }
    public static void p1(char c1)
    {
        ArrayList<String> city=new ArrayList<String>();
        city.add("Ahemdabad,amritsar,ambaji");
        city.add("baroda,Buffalo,bardoli,berlin");
        city.add("chennai,cairo,chicago");
        city.add("DALLAS,DENVER,DENIZLI,DELHI,DUBAI");
        city.add("edmonton,erie,evanville,evanston");
        city.add("fes,fuxin,fresno,faridabad,foshan");

        switch (c1)
        {
            case 'a':
                System.out.println(city.get(0));
                break;
            case 'A':
                System.out.print(city.get(0));
                break;
            case 'B':
                System.out.println(city.get(1));
                break;
            case 'b':
                System.out.print(city.get(1));
                break;
            case 'C':
                System.out.println(city.get(2));
                break;
            case 'c':
                System.out.print(city.get(2));
                break;
            case 'D':
                System.out.println(city.get(3));
                break;
            case 'd':
                System.out.print(city.get(3));
                break;
            case 'E':
                System.out.println(city.get(4));
                break;
            case 'e':
                System.out.print(city.get(4));
                break;
            case 'F':
                System.out.println(city.get(5));
                break;
            case 'f':
                System.out.print(city.get(5));
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }
}

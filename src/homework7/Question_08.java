/* 8.Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry */
package homework7;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Question_08 q8=new Question_08();
        q8.m1();
    }
    public void m1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter alphabets between a to f");
        char city=sc.next().charAt(0);

        if(city=='A'||city=='a')
        {
            System.out.println("ahemdabad,amritsar,ambaji");
        } else if (city=='B'||city=='b')
        {
            System.out.println("BARODA,BUFFALO,BARDOLI,BERLIN");
        } else if (city=='C'||city=='c')
        {
            System.out.println("Caracas,CHENNAI,cairo,CHICAGO");
        } else if (city=='D'||city=='d')
        {
            System.out.println("DALLAS,DENVER,DENIZLI,DELHI,DUBAI");
        } else if (city=='E'||city=='d')
        {
            System.out.println("edmonton,erie,evanville,evanston");

        } else if (city=='F'||city=='f')
        {
            System.out.println("fes,fuxin,fresno,faridabad,foshan");
        } else
        {
            System.out.println("invalid city");
        }
    }
}

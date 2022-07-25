/* 3.Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format */
package homework7;

import java.util.Scanner;

public class Question_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("|____________________________|");
        System.out.println("|      Marksheet             |");
        System.out.println("|____________________________|");
        System.out.println("|   Name     :               |");
        String name = sc.next();
        System.out.print("|   Roll No:                 |");
        int rollno = sc.nextInt();
        System.out.println("|____________________________|");
        System.out.println("|   Subjects  :        Marks |");
        System.out.println("|____________________________|");
        System.out.print("|   Math      :              |");
        int math = sc.nextInt();
        System.out.print("|   Science:                 |");
        int sci = sc.nextInt();
        System.out.print("|   English:                 |");
        int eng = sc.nextInt();
        int t = math + sci + eng;
        double p = t / 300.00 * 100.00;
        String p1 = "";
        String g = "";

            if (p >= 80) {
                g = "A+";
                p1 = "pass";
            } else if (p >= 60) {
                g = "A";
                p1 = "pass";
            } else if (p >= 50) {
                g = "B";
                p1 = "pass";
            } else if (p >= 35) {
                g = "c";
                p1 = "pass";
            } else {
                System.out.println("Fail");
            }

        System.out.println("|Total          :"         + t);
        System.out.println("|Percentage     :"         + p);
        System.out.println("|Result         :"         + p1);
        System.out.println("|Grade          :"         + g);
        System.out.println("|____________________________|");
    }
}

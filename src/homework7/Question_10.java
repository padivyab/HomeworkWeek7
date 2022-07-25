/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else) */
package homework7;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {

        Question_10 q10=new Question_10();
        q10.m1();
    }
    public void m1()
    {
        Scanner sc=new Scanner(System.in);
        String con =" ";
        do{
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            System.out.print("Enter number: ");
            int num1 = sc.nextInt();
            System.out.println("Choose Operator [1] Multiplication [2] Addition [3] Subtraction [4] Division");
            int ch = sc.nextInt();
            if(ch==1){

                System.out.println("Answer: "+(num*num1));

            }else if(ch==2){

                System.out.println("Answer: "+(num+num1));

            }else if(ch==3){

                System.out.print("Answer: "+(num-num1));

            }else if(ch==4){

                System.out.println("Answer: "+(num/num1));

            }else{

                System.out.println("Error Operator");

            }
            System.out.println("Do you want to continue? type y(Yes) type n(No): ");
            con = sc.next();
        } while("y".equals(con)||"Y".equals(con));
        if("n".equals(con)||"N".equals(con)){
            System.out.println("End Program!");
        }else{
            System.out.println("Error Input!");
        }
    }

}
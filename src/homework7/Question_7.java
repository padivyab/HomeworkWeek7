/* 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2% */
package homework7;

import java.util.Scanner;

public class Question_7 {

    public static void main(String[] args) {
        double bs = 30000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sales id");
        int id= sc.nextInt();
        System.out.println("Seller's name");
        String str = sc.next();
        double salesamount = 0;
        double commision,balance;
        
            balance = commision = 0;
            salesamount += 0.01;
            if (salesamount >= 50000) {
                commision += (balance = salesamount - 50000) * 0.35;
            } else if (salesamount >=30000) {
                commision += (balance = salesamount - 30000) * 0.20;
            } else if (salesamount >=20000) {
                commision += (balance = salesamount - 20000) * 0.10;
            } else if (salesamount >= 10000) {
                commision += (balance = salesamount - 10000) * 0.5;
            } else if (salesamount < 10000) {
                commision += (balance =salesamount - 10000) * 0.2;

            }
            else
            {
                System.out.println("error");
            }
        System.out.println("am"+salesamount);
    }
       
        
    }


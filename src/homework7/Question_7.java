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

        Scanner sc=new Scanner(System.in);
        System.out.println("Sales id");
        int id= sc.nextInt();
        System.out.println("Seller's name");
        String str =sc.next();
        System.out.println("Sales amount");
        int salesamount = sc.nextInt();

                if(salesamount >= 50000)
                {
                    //commision += (balance = salesamount - 50000) * 0.35;
                    System.out.println("Sales commission is " +(salesamount*35/100));
                }
                else if ((salesamount >=30000))
                {
                    //commision += (balance = salesamount - 30000) * 0.20;
                    System.out.println("Sales commission is "+(salesamount*30/100));
                }
                else if(salesamount >=20000)
                {
                    //commision += (balance = salesamount - 20000) * 0.10;
                    System.out.println("Sales commission is "+(salesamount*20/100));
                }
                else if(salesamount >= 10000)
                {
                    //commision += (balance = salesamount - 10000) * 0.5;
                    System.out.println("Sales commission is"+(salesamount*5/100));
                }
                //else if(salesamount < 10000)
                else
                {
                    //commision += (balance =salesamount - 10000) * 0.2;
                    System.out.println("Sales commission is "+(salesamount*2/100));
                }

            //System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesamount);
            /*balance = commision = 0;
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
        System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesamount); */

        /*final double COMMISSION_SOUGHT = 30000;
        double salesAmount, 				// Sales amount
                commission,				// Employee commission
                balance;					// Sales balance
        salesAmount = 0;					// Initialize accumulator to 0
        do {
            balance = commission = 0;	// Set balance and commission to 0
            salesAmount += 0.01;			// Increase sales amount by $0.01

            // If sales amount is $10,000.01 and above commission rate is 12%
            if (salesAmount > 10000)
                commission += (balance = salesAmount - 10000) * 0.12;

            // If sales amount is $5,000.01-$10,000 commission rate is 10%
            if (salesAmount > 5000)
                commission += (balance -= balance - 5000) * 0.10;

            // If sales amount is $0.01-$5,000 commission rate is 8%
            if (salesAmount > 0)
                commission += balance * 0.08;

            // While commission is less than commission sought loop
        } while (commission < COMMISSION_SOUGHT);

        // Display results
        System.out.printf("Minimum sales to earn $30,000: $%.0f\n", salesAmount); */
    }
}

        



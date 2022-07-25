/* 19.Write a Java program to calculate the average value of array elements.*/
package homework7;

public class Question_19 {
    public static void main(String[] args) {

       Question_19 q19=new Question_19();
       q19.p1();

    }
    public void p1()
    {
        int a[] = {1,2,3,4,5,6,7};
        int sum=0;
        for(int i : a)
        {
            sum += i;

        }
        //System.out.println("The sum is " +sum);
        double avg = sum/a.length;
        System.out.println("The Avge is : " +avg);
    }
    }
    /*  int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
       //calculate sum of all array elements
       int sum = 0;
       for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
       //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); */

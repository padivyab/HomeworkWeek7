/* 18.Write a Java program to sum values of an array. */
package homework7;

public class Question_18 {

    public static void main(String[] args) {

        Question_18 q18=new Question_18();
        q18.p1();

    }
    public void p1()
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int sum=0;
        for(int i : a)
        {
            sum += i;

        }
        System.out.println("The sum is " +sum);
    }
}

/* 20.Write a Java program to test if an array contains a specific value. */
package homework7;

public class Question_20 {
    public static void main(String[] args) {

        Question_20 q20=new Question_20();
        q20.m1();
    }
    public static boolean contains(int[] arr, int item) {
        for (int num : arr) {
            if (item == num) {
                return true;
            }
        }
        return false;
    }
    public void m1()
    {
        int[] my_array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(contains(my_array1, 7));
        System.out.println(contains(my_array1, 40));
    }
    /*
    int[] num = {1, 2, 3, 4, 5};
    int toFind = 3;
    boolean found = false;

    for (int n : num) {
      if (n == toFind) {
        found = true;
        break;
      }
    }

    if(found)
      System.out.println(toFind + " is found.");
    else
      System.out.println(toFind + " is not found."); */
}

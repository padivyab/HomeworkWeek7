package homework7;

public class Question_4 {

    public static void main(String[] args) {
        Question_4 q4=new Question_4();
        q4.isLeapYear(2000);
        q4.getDaysInMonth(2,2021);
    }
    public static void isLeapYear(int year) {
        boolean result;
        if (year < 1 || year > 9999) {
            System.out.println("Not in range");
        }
        else
        {
            if((0 == (year % 4)) && (0 != (year % 100)) || (0 == (year % 400)))
            {
                System.out.println("This is leap year");
            }
            else
            {
                System.out.println("This is not leap year");
            }

        }
       /* boolean step;

        if (year == (year % 4)) {
            if (year == (year % 100)) {
                step = result;
            }
        }
        if (year == (year % 100)) {
            if (year == (year % 400)) {
                step = result;
            }
        }
        if (year == (year % 400)) {
            step = result;
        } else {
            step = result;
        } */
    }
    public static void getDaysInMonth(int month,int year)
    {
        int m1 = month;
        int y2 = year;
        switch (m1)
        {
            case 1:
                System.out.println("January" + y2 + " has 31 days");
                break;
            case 2:
                System.out.println("February" + y2 + " Either 28 or 29 days in this month");
                break;
            case 3:
                System.out.println("March" + y2 + " has 31 days") ;
                break;
            case 4:
                System.out.println("April" + y2 + " has 30 days");
                break;
            case 5:
                System.out.println("May" + y2 + " has 31 days");
                break;
            case 6:
                System.out.println("June" + y2 + " has 30 days");
                break;
            case 7:
                System.out.println("July" + y2 + " has 31 days");
                break;
            case 8:
                System.out.println("August" + y2 + " has 31 days");
                break;
            case 9:
                System.out.println("September" + y2 + " has 30 days");
                break;
            case 10:
                System.out.println("October" + y2 + " has 31 days");
                break;
            case 11:
                System.out.println("November" + y2 + " has 30 days");
                break;
            case 12:
                System.out.println("December" + y2 + " has 31 days");
                break;
            default:
                System.out.println("valid number between 1 to 12");
        }
    }

}

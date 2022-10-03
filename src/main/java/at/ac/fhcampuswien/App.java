package at.ac.fhcampuswien;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
//       // Break als Variable speichern um Zeichen zu sparen möglich
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__"  + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`"
        );
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int sum = a + b + c + (int)d + (int)e + (int)f + (int)g + (int)h;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner numberinput = new Scanner(System.in);
        int firstnum = numberinput.nextInt();
        int secondnum = numberinput.nextInt();

        System.out.println(firstnum + secondnum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner numberinput = new Scanner(System.in);
        int firstNum = numberinput.nextInt();
        int secondNum = numberinput.nextInt();

        firstNum += secondNum;
        secondNum = firstNum - secondNum;
        firstNum -= secondNum;

        System.out.print("x: " + firstNum + System.lineSeparator() + "y: " + secondNum);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner numberinput = new Scanner(System.in);
        int firstNum = numberinput.nextInt();
        int secondNum = numberinput.nextInt();

        System.out.println("n1: " + firstNum + System.lineSeparator()+ "n2: " + secondNum);

        if (firstNum == secondNum) {
            System.out.println("n1 == n2");
            return;
        } else if (firstNum > secondNum) {
            System.out.println("n1 > n2");
            return;
        }
        System.out.println("n2 > n1");
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.println("Enter annual Revenue:");
        // input your solution here
        Scanner numberinput = new Scanner(System.in);
        int sales = numberinput.nextInt();

        if (sales < 0 || sales >= 100000) {
            System.out.println("Invalid Revenue");
            // sales is always >= 0 due to the condition check in line 97
        } else if (sales < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (sales >= 50000 && sales < 80000) {
            System.out.println("Good Sales Revenue");
            // sales is always < 100000 due to the condition check in line 97
        } else if (sales >= 80000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        System.out.println("Enter CommissionClass:");
        Scanner numberinput = new Scanner(System.in);
        int comissionClass = numberinput.nextInt();

        switch (comissionClass) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.00");
        }
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        System.out.println("Year:");
        Scanner numberinput = new Scanner(System.in);
        int year = numberinput.nextInt();

        if (year % 100 == 0 && year%400 != 0) {
            System.out.println("Not a leapyear");
        } else if (year % 4 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        System.out.println("Number:");
        Scanner numberinput = new Scanner(System.in);
        int num = numberinput.nextInt();

        // Wenn bei input größer als 999 dann return = keine Ausgabe
        if (num > 999){
            return;
        }

        if (num >= 0 && num < 10) {
            System.out.print(num);
            return;
        }

        int firstDecimal = num % 10;
        System.out.print(firstDecimal);

        if (num >= 10 && num < 100) {
            int secondDecimal = (num - firstDecimal) / 10;
            System.out.print(secondDecimal);
        }

        if (num >= 100) {
            int secondDecimal = ((num - firstDecimal) / 10) % 10;
            int thirdDecimal = (num - firstDecimal - secondDecimal * 10) / 100;
            System.out.print(""+ secondDecimal + thirdDecimal);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
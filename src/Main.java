import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static void add() {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();
        result = num1 + num2;
        System.out.print("Result = " + result + "\n");
    }
    static void sub() {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();
        result = num1 - num2;
        System.out.print("Result: " + result + "\n");
    }
    static void mul() {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();
        result = num1 * num2;
        System.out.print("Result: " + result + "\n");
    }
    static void div() {
        Scanner input = new Scanner(System.in);
        float result = 0, num1, num2;
        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();
        if (num2 == 0) {
            System.out.println("2nd number can not to be 0");
        }
        else {
            result = num1 / num2;
            System.out.print("Result: "+ result +"\n");
        }
    }
    static void expo() {
        Scanner input = new Scanner(System.in);
        int baseNum, powNum, result = 1;
        System.out.print("Enter base number: ");
        baseNum = input.nextInt();
        System.out.print("Enter power number: ");
        powNum = input.nextInt();

        for (int i = 1; i <= powNum ; i++){
            result *= baseNum;
        }
        System.out.println("Result: " + result);


    }
    static void fact() {
        Scanner input = new Scanner(System.in);
        int a, result = 1;
        System.out.print("Enter a number: ");
        a = input.nextInt();

        for (int i = 1; i <= a; i++){
            result *= i;
        }
        System.out.println("Result: " + result);
    }
    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int baseNum = input.nextInt();
        System.out.print("Enter divisor: ");
        int divNum = input.nextInt();
        System.out.println("Result: " + baseNum % divNum );
    }
    static void rectArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter long edge (cm): ");
        int edgeL = input.nextInt();
        System.out.print("Enter short edge (cm): ");
        int edgeS = input.nextInt();
        int totalArea = edgeS * edgeL;
        System.out.println("Area: " + totalArea);
    }
    static void rectEdge() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter long edge: ");
        int edgeL = input.nextInt();
        System.out.print("Enter short edge: ");
        int edgeS = input.nextInt();
        int totalEdge = (edgeL + edgeS) * 2;
        System.out.println("Result: " + totalEdge);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        String menu = "1- Addition\n" +
                "2- Subtraction\n" +
                "3- Multiplication\n" +
                "4- Division\n" +
                "5- Exponention\n" +
                "6- Factorial\n" +
                "7- Mod\n" +
                "8- Rectangle Area Calc.\n" +
                "9- Rectangle Edge Calc.\n" +
                "0- Exit program.";
        do{
            int a;
            System.out.println(menu);
            System.out.print("Please select an operation: ");
            selection = input.nextInt();
            switch (selection) {
                case 1:
                    add();
                    do {
                        System.out.print("Press 0 to back to main menu: ");
                        a = input.nextInt();
                    }
                    while (a != 0);
                    break;
                case 2:
                    sub();
                    do {
                        System.out.print("Press 0 to back to main menu: ");
                        a = input.nextInt();
                    }
                    while (a != 0);
                    break;
                case 3:
                    mul();
                    do {
                        System.out.print("Press 0 to back to main menu: ");
                        a = input.nextInt();
                    }
                    while (a != 0);
                    break;
                case 4:
                    div();
                    do {
                        System.out.print("Press 0 to back to main menu: ");
                        a = input.nextInt();
                    }
                    while (a != 0);
                    break;
                case 5:
                    expo();
                    do {
                        System.out.print("Press 0 to back to main menu: ");
                        a = input.nextInt();
                    }
                    while (a != 0);
                    break;
                case 6:
                    fact();
                    do {
                        System.out.print("Press 0 to back to main menu: ");
                        a = input.nextInt();
                    }
                    while (a != 0);
                    break;
                case 7:
                    mod();
                    do {
                        System.out.print("Press 0 to back to main menu: ");
                        a = input.nextInt();
                    }
                    while (a != 0);
                    break;
                case 8:
                    rectArea();
                    do {
                        System.out.print("Press 0 to back to main menu: ");
                        a = input.nextInt();
                    }
                    while (a != 0);
                    break;
                case 9:
                    rectEdge();
                    do {
                        System.out.print("Press 0 to back to main menu: ");
                        a = input.nextInt();
                    }
                    while (a != 0);
                    break;
            }
        }
        while (selection != 0);
    }
}
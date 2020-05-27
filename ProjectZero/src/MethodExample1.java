import java.util.*;
public class MethodExample1 {
    public static void main(String[] args) {
        // System.out.println("result: " + sum(10, 20));
        // System.out.println("result: " + sum(10, 20, 30));
        // System.out.println("result: " + toSum(1, 10));
        // printStar(1, 5);
        // printStar(3);
        // printDouble(20, 3);
        // printString("Good Day!", "Kim");
        // printSome(5, "Hello");
        //Scanner scn = new Scanner(System.in);
        //System.out.print("몇단?");
        //int inputValue = scn.nextInt();
        //printGugudan(inputValue);
        //printTriangle(5, "&");
        example03();
        

    }
    public static void example03() {
        int sum = 0;
        for(int i =1; i<=100; i++) {
            if(i % 3==0) {
                sum += i;
            }
        }
        System.out.println("1~100 3의 배수 합: "+sum);
    }



    public static void printTriangle(int num1, String str) {
        for (int i = 1; i <= num1; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }


    public static void printGugudan(int dan) {
        System.out.println("You selected: " + dan);
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }

    public static void printSome(int num1, String str) {
        for (int i = 1; i <= num1; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    public static void printString(String str, String name) {
        System.out.println(str + ", " + name);
    }

    public static void printDouble(int num1, int num2) { // void는 반환되는값이 없음 int는 int값을 반환해줘야함 즉 return을 써야함
        System.out.println(num2 * num1);
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static int sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;
    }

    public static int toSum(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i; // sum = sum + i
        }
        return sum;
    }

    public static void printStar(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= num2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStar(int num1) {
        for (int i = 1; i <= num1; i++) {
            System.out.println("*****");
        }
    }
}
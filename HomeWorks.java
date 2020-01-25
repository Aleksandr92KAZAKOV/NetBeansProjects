package homeWorks;

import java.util.Scanner;

public class HomeWorks {
    
    public static void test (String[] args) {
        int a, b, result;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter num (a): ");
        a = num.nextInt();
        System.out.print("Enter num (b): ");
        b = num.nextInt();
        result = a * b;
        System.out.println("a * b = " + result);
    }
    
}

        
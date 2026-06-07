import java.util.Scanner;

// this is the first function to practice.

public class functions {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     String naam = sc.next();
//     printMyName(naam);
// }

// 2nd function to practice.
// public static int calculateProduct(int a, int b){
//     int product = a*b;
//     return product;
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int sum = calculateProduct(x , y);
//         System.out.println("Product of two no is "+sum);
//     }

// factorial function.

public static void printFactorial(int n) {
    if (n<0) {
        System.out.println("invalid no");
        return;
        
    }
    int factorial = 1;
    for(int i =n; i>=1;i--){
        factorial= factorial*i;
    }
    System.out.println(factorial);
    return;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printFactorial(a);
    }
}

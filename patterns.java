import java.util.Scanner;

public class patterns  {
    public static void main(String[] args) {
        // int n = 4;
        // int m = 5;
        // //outer loop
        // for(int i =1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

//outer loop 
// for(int i = 1 ; i <= n; i++){
//     //inner loop
//     for(int j = 1; j <= m; j++){
//         if (i == 1 || j == 1 || i == n || j == m) {
//             System.out.print("*");
            
//         }else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }
// int x = 7;
// int y = 7;
// for(int i=1;i<=y;i++){
//    for(int j =1;j<=x-i;j++){
//     System.out.print(" ");
//    }
//    for(int j = 1; j<=i;j++){
//     System.out.print("*");
// }
//    System.out.println();
// }
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// for(int i= 1;i<=a;i++){
//     for(int j= 1;j<=i;j++){
//         System.out.print(j);
//        System.out.print(" ");
//     }
//     System.out.println();
// }
// int n = 20;
// //upper half
// for (int i = 1;i<=n;i++){
//     //first half
//     for(int j = 1; j<=i;j++){
//         System.out.print("*");
//     }
//     // spaces
//     for(int j = 1; j <= (n-i)*2;j++){
//         System.out.print(" ");
//     }
//     //2nd half
//     for(int j=1;j<= i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// };
// //upper half
// for (int i = n;i>=1;i--){
//     //first half
//     for(int j = 1; j<=i;j++){
//         System.out.print("*");
//     }
//     // spaces
//     for(int j = 1; j <= (n-i)*2;j++){
//         System.out.print(" ");
//     }
//     //2nd half
//     for(int j=1;j<= i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// solid rohmbus
// int n =10;
// for(int i = 1;i<=n;i++){
//     for(int j = 1;j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j = 1; j<=n; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
// Palandromic triangle
// int n = 5;

// for(int i = 1; i<= n; i++){
//     for(int j = 1; j<=n-i;j++){
//         System.out.print(" ");
//     }
//     for(int j=i; j>=1 ;j--){
//         System.out.print(j);
//     }
//     for(int j= 2; j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

// Diamond Shape Pattern
// Upper half
int n = 5;
for(int i = 1; i<=n ; i++){
    for(int j = 1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1; j<=2*i-1;j++){
        System.out.print("*");
    }
System.out.println();
}
for(int i = n; i>=1 ; i--){
    for(int j = 1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int j=1; j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();

}

    }
}

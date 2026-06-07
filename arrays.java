import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] =98;
        // marks[1] = 99999;
        // marks[2]= 98;
        // for(int i =  0;i<3;i++){
        //     System.out.println(marks[i]);
        // }
        

        // another way to define array 
        // int marks [] = {98,99999,98};
        // for(int i =  0;i<3;i++){
        //  System.out.println(marks [i]);
        //  }

        //input in array
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int number[] = new int [size];
        // for(int i = 0; i<size;i++){
        //     System.out.println(number[i]);
        // }

            // How to input in a array
            // Scanner sc = new Scanner(System .in);
            // int Size = sc.nextInt();
            // int number[] = new int [Size];
            // for (int i = 0 ; i<Size;i++){
            //     number [i]= sc.nextInt();
            // }
            // for(int i = 0; i<Size;i++){
            //     System.out.println(number[i]);
            // }

            //how to find a no on  your array ?
     
            // Scanner sc = new Scanner(System .in);
            // int Size = sc.nextInt();
            // int number[] = new int [Size];
            //     //input
            // for (int i = 0 ; i<number.length;i++){//now we need not to write the size of an array we can write (name of an object.length) 
            //     number [i]= sc.nextInt();
            // }
            // int x = sc.nextInt();
            // //output
            // for(int i = 0; i<number.length;i++){
            //     if (number[i]==x) {
            //         System.out.println("the value found on "+i);
                    
            //     };
            // }






            //Now learn about 2D arrays
  
            // Scanner sc = new Scanner(System.in);
            // int rows = sc.nextInt();
            // int colm = sc.nextInt();
            // int[][] numbers= new int[rows][colm];

            // //input
            // for(int i=0; i<rows;i++){
            //     for(int j =0; j<colm; j++){
            //     numbers[i][j] = sc.nextInt();
            //     }
            // }
            // for(int i =0 ; i<rows; i++){
            //     for(int j = 0;j<colm; j++){
            //         System.out.print(numbers[i][j]+" ");
            //     }
            //     System.out.println();
            // }
        

            // Take a no input from the user . Search for a given number x and print the indice at which it occurs.

             Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int colm = sc.nextInt();
            int[][] numbers= new int[rows][colm];

            //input
            for(int i=0; i<rows;i++){
                for(int j =0; j<colm; j++){
                numbers[i][j] = sc.nextInt();
                }
            }
            int x = sc.nextInt();
            for(int i =0 ; i<rows; i++){
                for(int j = 0;j<colm; j++){
                    if (numbers[i][j] == x){
                        System.out.print(i+","+j);
                    } {
                        
                    }

                   
                }
            }
    }
}

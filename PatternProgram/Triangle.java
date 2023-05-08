//WRITE A PROGRAM TO PRINT TRIANGLE USING STAR PATTERN PROGRAMMING LOGIC

import java.util.Scanner;

public class Triangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER A NUMBER");
         int n = sc.nextInt();
        for(int i =1 ; i<=n ;i++){
            for(int j = n-i ; j>=1 ;j--){
                System.out.print(" ");

            }
            for(int k = 1; k<=i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

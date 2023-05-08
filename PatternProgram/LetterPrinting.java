// Write a program to print Alphabet A,B,C,D,E,F,G,H,using pattern programming logic

public class LetterPrinting{
    public static void main(String args[]){
        int n =8;

// PRINTING A
      for(int i = 0; i<=n;i++){
        for(int j =0; j<=n/2 ;j++){
            if( j==0 || j == n/2 || i ==0 || i == n/2){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
      }
 //  PRINTING B
        for(int i =0 ;i<=n;i++){
            for (int j =0 ;j<=n/2;j++){
                if(j ==0 || j!=4 && i%4 ==0 || i%4 !=0 && j == 4){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

// PRINTING C
    for(int i =0; i<=n ; i++){
        for(int j = 0; j<=n/2;j++){
            if(j==0 || i== 0 || i ==n){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

// PRINTING D
    for(int i =0;i<=n; i++){
        for(int j =0; j<=n/2; j++){
            if(j == 0 || j == n/2 && i%n !=0 ||i% n ==0 && j!= n/2){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

// PRINTING E
     for(int i =0 ;i<=n; i++){
        for(int j =0 ;j<=n/2 ;j++){
            if(j == 0|| i % (n/2) ==0){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
     }

//  PRINTING F
     for(int i = 0;i<=n;i++){
         for(int j =0 ;j<=n/2;j++){
            if(j ==0 || i ==0 || i ==n/2){
                System.out.print("* ");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
     }

// PRINTING G
      for(int i = 0; i<=n ; i++){
        for(int j =0 ; j<=n/2 ;j++){
            if( j ==0 || i%n ==0 || j == n/2 && i>= (n/2) || i == n/2 && j>1){
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
       }

// PRINTING H
     for(int i =0; i<=n ;i++){
        for(int j =0;j <=n/2 ;j++){
            if(j ==0 || j == n/2 || i == n/2){
                System.out.print("* ");
            }
            else {
                System.out.print("  ");
            }
        }
        System.out.println();
     }
    }
}
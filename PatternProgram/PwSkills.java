public class PwSkills {
    public static void main(String args[]){
        int n = 8;

        for(int i =0 ; i<=n ; i++){
            for(int j = 0;j <= n ; j++){
                if(j == 0 || i == 0  || i == n/2 || j == n && i<n/2 +1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j= 0 ;j<=n ; j++){
                if(j == 0|| j == n || i+j == n && i>3 && i< n || i == j && i>n/2 && i<n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0;j<=n ; j++){
                if(j == 0 && i<(n/2)+1 || i == 0|| i == n/2  || j == n && i >=n/2 || i == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j =0 ; j<=n ; j++){
                if(j == 0 || i+j == 4 && i<n/2 || i-j ==4 && i>n/2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0 ; j<=n ; j ++){
                if(i ==0 || i == n ||j == n/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0 ; j<=n ; j ++){
                if(j == 0 || i == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0 ; j<=n ; j ++){
                if(j == 0 || i == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j = 0;j<=n ; j++){
                if(j == 0 && i<(n/2)+1 || i == 0|| i == n/2  || j == n && i >=n/2 || i == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    
}

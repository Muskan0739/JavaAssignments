public class PatternProgram {
    public static void main(String args[]){
      int n =14;
      
      for(int i = 1; i<=n ; i++){
        for(int j = 1;j<=n; j++){
            if(j == 1|| i == 1 || j == n|| i == n|| i+j <= 8 && j !=1 && i != 1 || j-i >= 6 && j != 1 && i !=1){
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

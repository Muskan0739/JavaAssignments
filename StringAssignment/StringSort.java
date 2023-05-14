//WAP to sort the given string in alphabetical order

import java.util.Scanner;
public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please! enter a string");
        String str = sc.nextLine();
        char s ;

        str = str.toLowerCase();

        char[] arr = str.toCharArray();

        for(int i =0 ; i<arr.length; i++){
            for(int j =0; j<arr.length ; j++){
                if(arr[j] > arr[i]){
                    s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
        }
        System.out.println("Sorted String : ");
        for(int i = 0 ;i<arr.length ;i++){
            System.out.print(arr[i]);
        }
    }
}

public class Pangram {
    public static void main(String[] args) {
        String s = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        s = s.replace(" ","");
        char[] ch= s.toCharArray();
        int arr[] = new int[26];
        for(int i=0 ;i<s.length()-1;i++){
            arr[ch[i] -65]++;
        }
        for(int i =0;i<26;i++){
            if(arr[i] == 1){
                System.out.println("pangram");
            }
            else{
                System.out.println("not pangram");
            }
        }

    }
}

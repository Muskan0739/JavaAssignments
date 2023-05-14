//WAP to reverse the given sentence 
// input : "Think Twice"
//Output : "kniht eciwt"

public class ReverseSentence {
    public static void main(String[] args) {
        String str1 = "Think Twice";
        String str2 ="";

        str1 = str1.toLowerCase();

        String arr[] = str1.split(" ");

        for(int i= 0; i<arr.length;i++){
            for(int  j = arr[i].length()-1;j>=0;j--){
                str2 = str2 + arr[i].charAt(j);
            }
            str2 = str2+ " ";
        }
        System.out.println(str2);
    }
}

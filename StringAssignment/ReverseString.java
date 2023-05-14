//WAP to reverse the given string
//Input : "PWSKILLS"
//Output : "SLLIKSWP"

public class ReverseString{
    public static void main(String[] args) {
        String str1= "PWSKILLS";
        String str2 = "";

        for(int i = str1.length()-1;i>=0;i--){
            str2 = str2 +str1.charAt(i);
        }
        System.out.println("Reversed string " + str2);
    }
}
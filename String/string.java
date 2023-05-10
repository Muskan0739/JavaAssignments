class string{
    public static void main(String[] args) {
        String name = "Hello, have a good day";
        char s;
        for(int i = 0 ; i<name.length();i++){
            s = name.charAt(i);
            if(s == 'a' || s == 'e' || s == 'i' || s== 'o' || s== 'u'){
                System.out.print(s + " ");
            }
        }
    }
}
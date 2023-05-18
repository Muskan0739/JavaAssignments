class Pallandrome{
    public static void main(String[] args) {
        String name = "2552";
        String s = "";
        for(int i = name.length()-1; i>=0 ;i--){
            s = s + name.charAt(i);
        }
        if(s.equals(name)){
            System.out.println("PALLANDROME");
        }
        else{
            System.out.println("not a palllandrome");
        }
    }
}
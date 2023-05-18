class tempCodeRunnerFile{
        public static void main(String[] args) {
    
            String str1 = "pwskills java";
            String str2 = "";
            String s ="";
            String sarr[] = str1.split(" ");
            for(int i = sarr.length -1; i>=0;i--){
    
                str2 = str2 + sarr[i] + " ";
            }
            System.out.println(str2);
        
            for(int i = str2.length()-1;i>=0;i--){
                s = s + str2.charAt(i);
            }
            System.out.println(s);
           /* String s = "pwjava";
            String s1 = "";
            for(int i = s.length()-1;i>=0;i--){
                s1 = s1+ s.charAt(i);
            }
            System.out.println(s1);*/
        }
    }    
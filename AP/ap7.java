import java.util.Scanner;

public class ap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String na = sc.nextLine(); 
        sc.close();
        System.out.println(reverseWord(na));
    }
    public static String reverseWord(String str){  
        String words[]=str.split(" ");  
        String reverseWord="";  
        
        for(String w:words){  
            StringBuilder sb=new StringBuilder(w);  
            sb.reverse();  
            reverseWord+=sb.toString()+" ";  
        }  
        
        return reverseWord.trim();  
    }  
}

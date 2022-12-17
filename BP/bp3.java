import java.util.*;
public class bp3
{
    public static String filterVowel(char[] na){
        String ans = "";
        for(char x : na){
            if(!isVowel(x)){
                ans+=x;
            }
        }
        return ans;
    }
    public static boolean isVowel(char x){
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        char[] ch = {'s','o','u','r','a','v'};
        char[] fans = filterVowel(ch).toCharArray();
        for(char x : fans){
            System.out.println(x);
        }
        
    }
}
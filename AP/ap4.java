/*
 
Construct a character counter that inputs a piece of text that is analyzed character by character to determine the vowels, 
spaces and letters used. Fill in the code that computes the number of spaces, vowels, and consonants.


 */

public class ap4 {


    public static boolean isvowel(char x){
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x =='u'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String text = "To be or not to be, that is the question;"

        +"Whether this nobler in the mind to suffer"

        +" the slings and arrows of outrageous fortune,"

        +" or to take arms against a sea of troubles,"

        +" and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;
       

        //YOUR CODE HERE

        text = text.toLowerCase();
      
        for(char x : text.toCharArray()){
            
            if(isvowel(x)) vowels++;
          

            if(x == ' ') spaces++;
            else if(x >= 'a' && x<= 'z') letters++;

        }
        int c = letters - vowels;
        System.out.println("the text contains\nvowels : " + vowels + "\nconsonants : " +  c + "\nspaces : " + spaces );
  

    }

}





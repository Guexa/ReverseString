
package View;

/**
 *
 * @author guexa
 */

public class Main {
    
    public static void main(String[] args) {
        
        String r = reverse("ALEXA");
        System.out.println(r);
    }
    
    public static String reverse(String s){
        char[] letters = new char[s.length()];
        int letterIndex = 0;
        
        //Simple String
        /*
        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
        */      
        
        //Reverse String
        /*
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.println(s.charAt(i));
        }
        */
        
        for(int i = s.length() - 1; i >= 0; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            reverse += letters[i];
        }
        return reverse;
    }
}

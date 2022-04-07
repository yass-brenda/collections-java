import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        String a = "anagram";
        String b ="margaha";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int count = 0;

        /**

        if(a.length() == b.length()){
            return false;
        }

        for(int i=0; i <= b.length()-1;i++){
            if(!a.contains(String.valueOf(b.charAt(i)))){
                return false;
            }
        }**/

        char [] myChars = b.toCharArray();
        for (int i=0; i < myChars.length;i++){
            char character= myChars[i];
            for(int j=0; j < myChars.length;j++){
                if(myChars[j] == character){
                    count++;
                }

            }
            System.out.println(myChars[i] + " "+ count);
            count = 0;

        }



        return true;
    }
}



/**

 if (a.length() == b.length()){
 for(int i=0; i <= b.length()-1;i++){
 if(a.contains(String.valueOf(b.charAt(i)))) {
 if(a.charAt(i) == b.charAt(i)){
 count +=1;
 System.out.print(count);
 }
 } else {
 return false;
 }
 }
 } else {
 return false;
 }
 **/
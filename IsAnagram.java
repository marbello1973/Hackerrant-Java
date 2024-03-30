import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {

    static boolean isAnagram(String a, String b){
        //complete funcion

        if(a.length() != b.length()){
            return false;
        }

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

       return Arrays.equals(arrA, arrB);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}

/* con for
a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()){
            return false;
        }

        int[] charFrequency = new int[26];

        for(int i = 0; i < a.length(); i++){
            charFrequency[a.charAt(i) - 'a']++;
        }

        for(int i = 0; i < b.length(); i++){
            charFrequency[b.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(charFrequency[i] != 0) return false;
        }

        return true;

*/

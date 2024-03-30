import java.util.*;

public class Palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        boolean esPalindrome = true;

        for (int i = 0; i < A.length() / 2; i++ ){
            char chI = A.charAt(i);
            char chJ = A.charAt(A.length() - 1 - i);

            if(chI != chJ){
                esPalindrome = false;
                break;
            }
        }

        if(esPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}

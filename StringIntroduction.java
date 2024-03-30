
import java.util.*;

public class StringIntroduction {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        /* Enter your code here. Print output to STDOUT. */

        int longitudA = Integer.parseInt(String.valueOf(A.length()));
        int longitudB = Integer.parseInt(String.valueOf(B.length()));
        int suma = longitudA + longitudB;
        System.out.println(suma);

        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        String primeraLetraMayuscula_A = A.substring(0,1).toUpperCase() + A.substring(1);
        String primeraLetraMayuscula_B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(primeraLetraMayuscula_A + " " + primeraLetraMayuscula_B);


    }
}

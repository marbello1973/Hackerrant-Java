import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution.
        */

        Scanner sc = new Scanner(System.in);
        BigInteger numA = sc.nextBigInteger();
        BigInteger numB = sc.nextBigInteger();
        BigInteger suma = numA.add(numB);
        BigInteger mul = numA.multiply(numB);
        System.out.println(suma);
        System.out.println(mul);

    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//Es primo o no es primo, o es probable primo
public class IsProbablePrim {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        boolean result;
        BigInteger a = new BigInteger(n);
        result = a.isProbablePrime(100);
        if (!result){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }

        bufferedReader.close();
    }
}

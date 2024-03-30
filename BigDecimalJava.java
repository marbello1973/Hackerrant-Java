import java.util.Arrays;
import java.util.Scanner;
import java.math.BigDecimal;

public class BigDecimalJava {

    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n + 2];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();
        //write your code here
/*
        //Convertir los elementos del array 's' a BigDecimal
        BigDecimal[] decimalArray = new BigDecimal[n];
        for(int i = 0; i < n; i++){
            decimalArray[i] = new BigDecimal(s[i]);
        }
*/
/*
        //Ordenar el array 'decimalArray' en orden descendente utilizando un algoritmo d ordenamiento Bubble Sort
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(decimalArray[j].compareTo(decimalArray[j + 1]) < 0){
                    BigDecimal numTemporal = decimalArray[j];
                    decimalArray[j] = decimalArray[j + 1];
                    decimalArray[j + 1] = numTemporal;
                }
            }
        }
*/

        Arrays.sort(s, 0, n, (a, b) -> {
            BigDecimal numeroA = new BigDecimal(a);
            BigDecimal numeroB = new BigDecimal(b);
            return numeroB.compareTo(numeroA);
        });

        //output
        for(int i = 0; i < n; i++){
            //s[i] = String.valueOf(decimalArray[i]);
            System.out.println(s[i]);
        }
    }
}

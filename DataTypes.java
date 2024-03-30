import java.util.*;

public class DataTypes {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Número de casos de prueba

        for (int i = 0; i < t; i++) {

            String input = scanner.next(); // Leer el número entero

            try{
                long num = Long.parseLong(input);
                System.out.println(num + " can be fitted in:");

                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            }catch(NumberFormatException e){
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}

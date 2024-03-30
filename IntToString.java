import java.util.*;

public class IntToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ns = scanner.nextInt();
        scanner.close();

        String nStr = String.valueOf(ns);

        if(nStr != null && nStr.equals(String.valueOf(ns))){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }

    }
}

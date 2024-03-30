import java.util.Arrays;
import java.util.Scanner;

public class TokenString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //Write your code here.

        //s.replace("?", "");

        String leng = String.valueOf(s.length());
        System.out.println(leng);


        String[] palabras = s.split(" ");
        for (int i = 0; i < palabras.length; i++){
            if (palabras[i].contains("'")){
                String partes = Arrays.toString(palabras[i].replace("'"," ").split(" "));
                System.out.println(partes);
            }
        }


//        System.out.println(Arrays.toString(palabras));
        /*
        for (int i = 0; i < palabras.length; i++){
            //System.out.println(palabras[i]);
            if(palabras[i].contains("'")){
                String[] partes = palabras[i].split("'");
                palabras[i] = partes[0];
                System.out.println(palabras[i]);

            }

//            if(palabras[i].contains("'")){
//                String[] partes = palabras[i].split("'");
//                palabras[i] = partes[0];
//
//                if(partes.length > 1){
//                    palabras[i + 1] = partes[1] + palabras[i + 1];
//                }
//            }
        }*/

        for(String palabra : palabras){
            System.out.println(palabra);
        }

//        s.replace("?", " ").replace("'", " ");
//        String[] S = s.split(" ");
//        //System.out.println(S);
//
//        for(String sep : S){
//            sep.replace("?", " ").replace("'", " ");
//            System.out.println(sep);
//        }

        sc.close();
    }
}

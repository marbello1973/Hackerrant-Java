import java.util.*;

public class EndOfFile {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; ; i++){
            if(scanner.hasNext()){
                System.out.println(i+" "+scanner.nextLine());
            }else {
                break;
            }

        }

    }
}

/*
programacion funcional
 IntStream.iterate(1, i -> i + 1).forEach(i -> System.out.println(i + " " + scanner.nextLine()));
 scanner.close();
 */

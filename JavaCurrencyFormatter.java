import java.io.*;
import java.util.*;
public class JavaCurrencyFormatter {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++){
            String queryType = sc.nextLine();
            if(queryType.equals("Insert")){
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (queryType.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
            sc.nextLine();
        }
        for(int num : list){
            System.out.println(num + " ");
        }
    }
}



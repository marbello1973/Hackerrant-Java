import java.util.*;
import java.lang.*;

public class Substring {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        if(start < 0 || end > S.length() || start >= end){
            throw new IllegalArgumentException("Index not valid");
        }

        String sub = S.substring(start, end);

        System.out.println(sub);

    }
}

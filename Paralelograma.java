import java.util.*;

public class Paralelograma {

    static int breadth;
    static int height;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        scanner.close();
        if (breadth <= 0 || height <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = true;
        }
    }

    public static void main(String[] args) {

        if(flag){
            int area = breadth * height;
            System.out.println(area);
        }
    }
}

import java.util.Scanner;

public class r2 {

    static Scanner sc = new Scanner(System.in);

    static void display(int i, int n) {
        if (i > n)
            return;

        String name = sc.next();
        System.out.print(name + " ");

        display(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        display(1, n);

        sc.close();
    }
}
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int gt = 1;
        do {
         System.out.println("nhap vao n: ");
        n = sc.nextInt();
        } while (n<1);

        while (n>0) {
            gt*=n;
            n--;
        }
        System.out.println("Giai thua n = " +gt);
    }
}

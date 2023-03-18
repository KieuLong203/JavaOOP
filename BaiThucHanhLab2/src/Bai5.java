import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n, tong = 0;

        while (tong<100) {
            System.out.println("nhap vao n = ");
            n = sc.nextInt();
            tong+=n;
        }
        System.out.println("Tong = " +tong);
    }
}

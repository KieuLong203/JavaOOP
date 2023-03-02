import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        int tong=0;
        int n;
        Scanner sc = new Scanner(System.in);
        while (tong<100) {
            System.out.println("Nhap vao n: ");
            n = sc.nextInt();
            tong+=n;
        }
        System.out.println("Tong = " + tong);
    }
    
}

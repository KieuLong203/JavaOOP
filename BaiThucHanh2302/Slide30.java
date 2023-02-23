import java.util.Scanner;

public class Slide30 {

    public static void main(String[] args) {
        
        int tong = 0;
        System.out.println("nhap vao n > 0 = ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.printf("so ban da nhap la %d", N);
        
        while (N>0) {
            tong+=N%10;
            N = N/10;
        }
        System.out.printf("Tong cac so vua nhap la %d", +tong);
    }
}
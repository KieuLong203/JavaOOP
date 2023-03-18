import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, number;
        int tong = 0;
        System.out.println("Nhap vao day so n = ");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf("nhap so thu %d: ", i+1);
            number = sc.nextInt();
            tong+=number;
        }
        System.out.println("Trung binh cong cua n so vua nhap la: " +((float)tong/n));
    }
}

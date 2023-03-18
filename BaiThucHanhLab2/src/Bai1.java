import java.util.Scanner;

/**
 * Bai1
 */
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;
        System.out.println("nhap vao a = ");
        a = sc.nextFloat();
        System.out.println("nhap vao b= ");
        b = sc.nextFloat();
        if(a>b){
            System.out.printf("%.2f > %.2f\n", a, b);
        }else{
            System.out.printf("%.2f < %.2f\n", a, b);
        }
        System.out.println("tong cua 2 so la: "+(a+b));
        System.out.println("hieu cua 2 so la: "+(a-b));
        System.out.println("tich cua 2 so la: "+(a*b));
        System.out.println("thuong cua 2 so la: "+(a/b));
        System.out.println("chia lay du cua 2 so la: "+(a%b));

    }
}
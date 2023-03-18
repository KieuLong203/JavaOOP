import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap vao n = ");
        n = sc.nextInt();

        if(n%2==0){
            System.out.println("day la so chan");
        }else{
            System.out.println("day la so le");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

/**
 * BTH2505
 */
public class BTH2505 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> std = new ArrayList<>();
        try {
            System.out.print("Nhap vao so luong cua sinh vien: ");
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) { 
                System.out.print("Nhap vao ma sinh vien cua sinh vien thu " + (i+1) + ": ");
                std.add(sc.nextInt());
            }
        }
        
        catch (Exception e) {
            System.out.print(e + " Vui long nhap dung kieu du lieu");
        }
        
        finally {
            System.out.print("\n");
        }
    }
}
import java.util.Scanner;

/**
 * Slide40
 */
public class Slide40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int thu;
        System.out.println("nhap vao ngay: ");
        thu = sc.nextInt();
        switch (thu) {
            case 1:
                System.out.println("Chu nhat");
                break;
            case 2:
                System.out.println("Thu 2");
                break;
            case 3:
                System.out.println("Chu 3");
                break;
            case 4:
                System.out.println("Thu 4");
                break;
            case 5:
                System.out.println("Thu 5");
                break;
            case 6:
                System.out.println("Thu 6");
                break;
            case 7:
                System.out.println("Thu 7");
                break;

        
            default: System.out.println("Khong phai ngay trong tuan");
                break;
        }
    }
}
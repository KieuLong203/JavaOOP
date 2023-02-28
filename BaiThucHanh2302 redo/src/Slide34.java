import java.util.Scanner;

public class Slide34 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Nhap a (a # 0): ");
                a = sc.nextDouble();
            } while (a == 0);

            System.out.println("Nhap b ");
            b =sc.nextDouble();

            System.out.println("Nhap c ");
            c =sc.nextDouble();
        }
        System.out.println("Phuong trinh bac hai vua nhap co dang: "+a+"x^2 + "+b+"x + "+c+" = 0");

        delta = Math.pow(b, 2) - 4 * a * c;
        if(delta<0){
            System.out.println("Phuong trinh vo nghiem");
        }else if(delta==0){
            x1=x2= -b/(2*a);
            System.out.println("phuong trinh co nghiem kep x1 = x2 = " + x2);

        }else{
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("phuong trinh co 2 nghiem phan biet: x1 = %.2f, x2 = %.2f", + x1, + x2);
        }

    }
}

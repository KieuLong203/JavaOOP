import java.util.Scanner;

public class Slide35 {
    
    public static void main(String[] args) {
        int a, b;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap vao a: ");
            a = scanner.nextInt();
            System.out.println("Nhap vao b: ");
            b = scanner.nextInt();
        }
        if(a<b){
            System.out.println("Min = a = " + a);
        }else{
            System.out.println("Min = b = " + b);
        }
    
    }

}   

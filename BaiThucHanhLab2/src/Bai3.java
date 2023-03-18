import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho va ten ");
        String name = sc.nextLine();
        System.out.println("Nhap vao nam sinh cua ban: ");
        int born = sc.nextInt();
        System.out.println("Ho Ten va Nam sinh cua ban la: " +name+ "\t" +born);

        int year = 2023 - born;
        if(year<16){
            System.out.printf("Ban %s o do tuoi vi thanh nien", name);
        }else if(year>=16 && year < 18){
            System.out.printf("Ban %s o do tuoi truong thanh", name);
        }else if(year>=18){
            System.out.printf("Ban %s da gia", name);
        }
    }
}

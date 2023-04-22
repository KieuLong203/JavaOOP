import java.util.Scanner;

public class Employee {
   
   
    String fullName;
    int Age;
    float HSL;
    final float basicSalary = 1490000f;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ten: ");
        fullName = sc.nextLine();
        System.out.print("nhap vao tuoi: ");
        Age = sc.nextInt();
        System.out.print("nhap vao he so luong: ");
        HSL = sc.nextFloat();
    }

    float calculateSalary(){
        return HSL * basicSalary;
    }

    void inThongTin(){
        System.out.printf("%s - %d tuoi\n", fullName, Age);
        System.out.printf("He so luong la %f\n", HSL);
        System.out.printf("Luong nhan vien = %f\n", calculateSalary());
    }
}

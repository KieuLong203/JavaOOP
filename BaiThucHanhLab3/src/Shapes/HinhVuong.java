package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{


    public HinhVuong(){
        ten = "Hinh Vuong";
    }

    public void nhapCanh(){
        System.out.println("\nnhap vao canh = ");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextFloat();
    }
}

package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{

    public float dai, rong;

    public HinhChuNhat(){
        ten = "Hinh chu nhat";
    }

    public void nhapChieuDai(){
        System.out.println("\nNhap vao chieu dai = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
    }
    
    public void nhapChieuRong(){
        System.out.println("\nNhap vao chieu Rong = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
    }

    public void tinhChuVi(){
        chuVi = (dai + rong) * 2;
    }

    public void tinhDienTich(){
        dienTich = dai * rong;
    }
}

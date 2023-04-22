package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{

    private float dai, rong;

    public HinhChuNhat(){
        super.setTen("Hinh Chu Nhat");
    }
    public HinhChuNhat(String ten){
        super.setTen(ten);
    }
//getter & setter
    public float getDai(){
        return this.dai;
    }
    public void setDai(float dai){
        this.dai = dai;
    }
    public float getRong(){
        return this.rong;
    }
    public void setRong(float rong){
        this.rong = rong;
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
        setChuVi(2*(dai + rong));
    }

    public void tinhDienTich(){
        setDienTich(dai * rong);
    }
}

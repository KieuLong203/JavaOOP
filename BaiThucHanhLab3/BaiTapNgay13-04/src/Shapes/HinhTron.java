package Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc{

    private float banKinh;

    public HinhTron(float banKinh){
        this.banKinh = banKinh;
    }

    public HinhTron(){
        super.setTen("Hinh Tron");
    }
    public HinhTron(String ten){
        super.setTen(ten);
    }
    public float getBanKinh(){
        return this.banKinh;
    }
    public void setBanKinh(float banKinh){
        this.banKinh = banKinh;
    }

    public void nhapBanKinh(){
        System.out.println("\nNhap vao r = ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
        setBanKinh(banKinh);
     }

    public void tinhChuViHinhTron() {
        setChuVi(2 * getPI() * getBanKinh());
    }

    public void tinhDienTich(){
        setDienTich(getPI() * getBanKinh() * getBanKinh());
    }
}
package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {

    private float chieuCao;

    public HinhTru(){
        super.setTen("Hinh Tru");
    }
    public HinhTru(String ten){
        super.setTen(ten);
    }
    
    public float getChieuCao(){
        return this.chieuCao;
    }
    public void setChieuCao(float chieuCao){
        this.chieuCao = chieuCao;
    }
    public void nhapChieuCao(){
        System.out.println("\nNhap vao chieu cao = ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }

   
    public void tinhTheTich(){
        tinhDienTich();
        setTheTich(getDienTich() * chieuCao);
    }
}

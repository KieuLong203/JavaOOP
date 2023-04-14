package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {

    public float chieuCao;

    public HinhTru(){
        ten = "Hinh Tru";
    }
    
    public void nhapChieuCao(){
        System.out.println("\nNhap vao chieu cao = ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }

    public void tinhTheTich(){
        tinhDienTich();
        thetich = dienTich * chieuCao;
    }
}

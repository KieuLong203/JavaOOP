package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{


    public HinhVuong(){
        super.setTen("Hinh Vuong");
    }
    public HinhVuong(String ten){
        super.setTen(ten);
    }

    public void nhapCanh(){
        System.out.println("\nnhap vao canh = ");
        Scanner sc = new Scanner(System.in);
        float canh = sc.nextFloat();
        setDai(canh);
        setRong(canh);
    }
}

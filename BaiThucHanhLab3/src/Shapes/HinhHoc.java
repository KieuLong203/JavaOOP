package Shapes;

public class HinhHoc {
    public final float PI = 3.14f;
    public String ten;
    public float chuVi, dienTich, thetich;
    
    public void xuatTen(){
        System.out.printf("\n--------- %s ---------", ten);
    }

    public void inChuVi(){
        System.out.printf("Chu vi = %f ", chuVi);
    }

    public void inDienTich(){
        System.out.printf("Dien tich = %f ", dienTich);
    }

    public void inTheTich(){
        System.out.printf("The tich = %f ", thetich);
    }
}

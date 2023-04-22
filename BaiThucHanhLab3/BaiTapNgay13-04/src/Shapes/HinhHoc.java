package Shapes;

public class HinhHoc {
    private final float PI = 3.14f;
    private String ten;
    private float chuVi, dienTich, thetich;
    

    public float getPI(){
        return PI; 
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }

    public float getChuVi(){
        return this.chuVi;
    }
    public void setChuVi(float chuVi){
        this.chuVi = chuVi;
    }

    public float getDienTich(){
        return this.dienTich;
    }
    public void setDienTich(float dienTich){
        this.dienTich = dienTich;
    }

    public float getTheTich(){
        return this.thetich;
    }
    public void setTheTich(float thetich){
        this.thetich = thetich;
    }


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

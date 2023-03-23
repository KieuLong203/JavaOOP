import java.util.Scanner;

/**
 * HinhTruTron
 */
public class HinhTruTron {

    float banKinh;
    float chieuCao;
    float SxungQuanh, StoanPhan, theTich;
    final float PI = 3.14f;

    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ban kinh cua hinh tru: ");
        banKinh = sc.nextFloat();
        System.out.print("nhap vao chieu cao cua hinh tru: ");
        chieuCao = sc.nextFloat();
    }
    float Sxq(){
        SxungQuanh = 2*PI*banKinh*chieuCao;
        return SxungQuanh;
    }

    float Stp(){
        StoanPhan = 2 * PI * banKinh * (banKinh+chieuCao);
        return StoanPhan;
    }

    float theTich(){
        theTich = PI * banKinh*banKinh * chieuCao;
        return theTich;
    }

    void inThongTin(){
        System.out.printf("Hinh tru cua ban co Sxq=%f; Stp = %f; V = %f", Sxq(), Stp(), theTich());
    }
}
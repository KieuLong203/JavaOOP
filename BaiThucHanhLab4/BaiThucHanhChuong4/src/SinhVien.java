
//Xây dựng class SinhVien gồm ba thông tin: Mã sinh viên, Họ và tên, Lớp.
//Dùng Map để:
//Nhập danh sách n sinh viên.
//Nhập tên Lớp từ bàn phím. Hiển thị những sinh viên thuộc Lớp vừa nhập.
//Nhập Mã sinh viên từ bàn phím. Hiển thị họ tên và Lớp tương ứng.

import java.util.HashMap;
import java.util.Scanner;

public class SinhVien {
    public String MSV;
    public String fullName;
    public String lop;


    public static void inputInfo(HashMap<SinhVien, SinhVien> hMap) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) { 
            SinhVien sv = new SinhVien();
            System.out.print("Nhap vao ho ten cua sinh vien thu " +(i + 1)+ ": ");
            sv.fullName = sc.nextLine();
            System.out.print("Nhap vao ma sinh vien: ");
            sv.MSV = sc.nextLine();
            System.out.print("Nhap vao lop cua sinh vien: ");
            sv.lop = sc.nextLine();
            hMap.put(sv, sv);
        }
    }

    public static void displayInfo(HashMap<SinhVien, SinhVien> hMap) { 
        System.out.println("Thong tin cua tat ca sinh vien ban da nhap: ");
        int i = 1;
        for(SinhVien sv : hMap.keySet()) {
            System.out.println("Sinh vien thu " + i + ": ");
            System.out.println("Ho ten: " + sv.fullName);
            System.out.println("Ma sinh vien: " + sv.MSV);
            System.out.println("Lop: " + sv.lop);
            i++;
        }
    }

    public static void searchByClass(HashMap<SinhVien, SinhVien> hMap) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten lop: ");
        String cL = sc.nextLine();
        boolean found = false;
        for(SinhVien sv : hMap.keySet()) {
            if(sv.lop.equals(cL)) {
                System.out.print("Thong tin cua sinh vien thuoc lop: " + cL);
                System.out.print("\nHo ten: " + sv.fullName);
                System.out.print("\nMa sinh vien: " + sv.MSV);
                System.out.print("\n ");
                found = true;
            }
        }
        if(!found) { 
            System.out.println("Khong tim thay lop ban da nhap");
        }
    }

    public static void searchByMSV(HashMap<SinhVien, SinhVien> hMap) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma sinh vien can tim: ");
        String maSV = sc.nextLine();
        boolean found = false;
        for(SinhVien sv : hMap.keySet()) { 
            if(sv.MSV.equals(maSV)) { 
                System.out.print("Day la thong tin cua ma sinh vien " +maSV);
                System.out.print("\nHo Ten: " +sv.fullName);
                System.out.print("\nLop: " +sv.lop);
                found = true;
            }
        }
        if(!found) { 
            System.out.println("Khong tim thay sinh vien " +maSV);
        }
    }
}

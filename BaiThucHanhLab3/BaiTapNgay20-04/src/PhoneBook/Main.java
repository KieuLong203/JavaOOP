package PhoneBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhBa db = new DanhBa("", "");
        int chon;
        do {
            System.out.println("1 Nhap moi contact");
            System.out.println("2 Cap nhat so dien thoai");
            System.out.println("3 Xoa contact khoi danh ba");
            System.out.println("4 Tim kiem sdt theo ten");
            System.out.println("0 Thoat");
            System.out.print(" Nhap lua chon ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    db.nhap();
                    break;
                case 2:
                    db.capNhat();
                    break;
                case 3:
                    db.xoa();
                    break;
                case 4:
                    db.timKiem();
                    break;
                case 0:
                    System.out.println();
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (chon != 0);
    }
}

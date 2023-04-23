package PhoneBook;

import java.util.Scanner;

class DanhBa extends Contact {
    private static final int MAX_SIZE = 100;
    private static DanhBa[] danhBa = new DanhBa[MAX_SIZE];
    private static int soLuong = 0;

    public DanhBa(String ten, String sdt) {
        super(ten, sdt);
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        this.sdt = sc.nextLine();
        danhBa[soLuong++] = this;
        System.out.println("Them moi contact thanh cong!");
    }

    @Override
    public void capNhat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten can cap nhat so dien thoai: ");
        String update = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < soLuong; i++) {
            if (danhBa[i].ten.equals(update)) {
                System.out.print("Nhap so dien thoai moi: ");
                danhBa[i].sdt = sc.nextLine();
                System.out.println("Cap nhat so dien thoai thanh cong!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ten trong danh ba");
        }
    }

    @Override
    public void xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten can xoa: ");
        String tenXoa = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < soLuong; i++) {
            if (danhBa[i].ten.equals(tenXoa)) {
                for (int j = i; j < soLuong - 1; j++) {
                    danhBa[j] = danhBa[j + 1];
                }
                danhBa[soLuong - 1] = null;
                soLuong--;
                System.out.println("Xoa contact thanh cong!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ten trong danh ba");
        }
    }

    @Override
    public void timKiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten can tim kiem: ");
        String tenTK = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < soLuong; i++) {
            if (danhBa[i].ten.equals(tenTK)) {
                System.out.printf("So dien thoai cua %s la: %s\n", danhBa[i].ten, danhBa[i].sdt);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ten trong danh ba");
        }
    }
}

package Shapes;

public class demo {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        HinhTru ht1 = new HinhTru();
        ht1.xuatTen();
        ht1.nhapChieuCao();
        ht1.nhapBanKinh();
        ht1.tinhDienTich();
        ht1.tinhTheTich();
        ht1.inTheTich();

        HinhChuNhat ht2 = new HinhChuNhat();
        ht2.xuatTen();
        ht2.nhapChieuDai();
        ht2.nhapChieuRong();
        ht2.tinhChuVi();
        ht2.tinhDienTich();
        ht2.inChuVi();
        ht2.inDienTich();

        HinhVuong ht3 = new HinhVuong();
        ht3.xuatTen();
        ht3.nhapCanh();
        ht3.tinhChuVi();
        ht3.tinhDienTich();
        ht3.inChuVi();
        ht3.inDienTich();
    }
}

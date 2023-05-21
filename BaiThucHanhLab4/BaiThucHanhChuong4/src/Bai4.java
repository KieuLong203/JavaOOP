import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so luong trai cay: ");
        int soLuong = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= soLuong; i++) {
            System.out.print("Nhap vao ten trai cay thu " + i + ": ");
            String tenTraiCay = sc.nextLine();
            set.add(tenTraiCay);
        }

        System.out.println("Danh sach trai cay da nhap la: ");
        for (String traiCay : set) {
            System.out.print(traiCay + "\t");
        }
        System.out.println("\nSo luong trai cay da nhap la: " + set.size());


        System.out.print("Nhap vao loai trai cay can tim: ");
        String search = sc.nextLine();
        if (set.contains(search)) {
            System.out.println("Trai cay " + search + " da co trong danh sach");
        } else {
            System.out.println("Khong tim thay trai cay " + search + " trong danh sach");
        }


        System.out.print("Nhap vao 1 loai trai cay bat ki de xoa: ");
        String delete = sc.nextLine();
        if (set.contains(delete)) {
            set.remove(delete);
            System.out.println("Da xoa thanh cong trai cay " +delete);
            System.out.println("Danh sach trai cay con lai:");
            for (String traiCay : set) {
                System.out.print(traiCay + "\t");
            }
        } else {
            System.out.println("Khong tim thay loai trai cay can xoa");
        }

        List<String> list = new ArrayList<String>();
        list.addAll(set);


        set.addAll(list);


        Iterator<String> iter = set.iterator();
        System.out.println("\nHashSet sau khi them cac phan tu cua list:");
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.print(element + "\t");
        }


        list.removeIf(set::contains);
        iter = set.iterator();
        System.out.println("\nHashSet sau khi xoa cac phan tu cua list:");
        while (iter.hasNext()) {
            String element = iter.next();
            System.out.print(element + "\t");
        }

        sc.close();
    }
}
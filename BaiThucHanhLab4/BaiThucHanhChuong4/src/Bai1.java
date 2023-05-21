import java.util.ArrayList;
import java.util.Scanner;

/**
 * Bài 1:
Viết chương trình nhập vào một dãy số các số nguyên, sử dụng ArrayList. Thực hiện các công việc sau:
Tìm số nguyên có giá trị lớn nhất
Nhập vào 1 số nguyên, xoá khỏi mảng các phần từ có giá trị bằng giá trị vừa nhập
Sắp xếp dãy số và in dãy số ra màn hình
 */
public class Bai1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i+1) + ": ");
            arr.add(sc.nextInt());
        }

        System.out.println("Cac phan tu cua ArrayList la: ");
        for(int number : arr) { 
            System.out.print(number + "\t");
        }
        
        System.out.print("\nSo nguyen co gia tri lon nhat la: ");
        int max = 0;
        for(int i = 0; i < arr.size(); i++) { 
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.print(max);

        System.out.println("\nNhap vao mot so nguyen muon xoa: ");
        int delete = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.size(); i++) { 
            if(arr.get(i)==delete) {
                arr.remove(i);
                found = true;
                break;
            }
        }
        if(!found) { 
            System.out.println("So nguyen ban nhap khong co trong danh sach");
        } else {
            System.out.println("Da xoa thanh cong");
        }
        System.out.print("ArrayList sau khi xoa phan tu: " +arr);

        for(int i = 0; i < arr.size()-1; i++) {
            for(int j = i + 1; j < arr.size(); j++) { 
                if(arr.get(i)>arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                }
            }
        }
        System.out.print("\nMang sau khi sap xep tang dan: "+arr);

        sc.close();
    }
}
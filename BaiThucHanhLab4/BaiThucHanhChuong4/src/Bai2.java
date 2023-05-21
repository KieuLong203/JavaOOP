/*Bài 2:
Viết chương trình xây dựng 1 danh sách liên kết (LinkedList) lưu trữ n số nguyên dương (n được nhập từ bàn phím). 
Sau đó tính trung bình cộng của các số chẵn và hiển thị kết quả ra màn hình.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua LinkedList: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++) { 
            System.out.print("Phan tu thu " +(i+1) + ": ");
            link.add(sc.nextInt());
        }
        System.out.println("LinkedList sau khi da nhap la: ");
        for(int number : link) {
            System.out.print(number + "\t");
        }

        int number = 2;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < link.size(); i++){
            if(link.get(i) % number == 0) {
                sum += link.get(i);
                count ++;
            }
        }
        float tbc = (float)sum/count;
        System.out.print("\nTrung binh cong cua cac so chan la: " +tbc);

        sc.close();
    }
}

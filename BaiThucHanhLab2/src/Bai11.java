import java.util.Scanner;
/*
Viết chương trình thực hiện các công việc sau:
Nhập liệu cho mảng A có n phần tử nguyên từ bàn phím. 
Sắp xếp mảng số đã nhập tăng dần theo giá trị của các phần tử có trong mảng.
 In ra màn hình mảng số ban đầu và mảng đã sắp xếp theo thứ tự tăng dần.
*/
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap vao so phan tu cua mang: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            System.out.printf("A[%d] = ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("mang ban da nhap la: ");
        for(int i=0;i<arr.length;i++){
            System.out.printf("%d ", arr[i]);
        }

        for(int i=0;i<n-1;i++){
            for(int j=n+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nmang sau khi da sap xep tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}

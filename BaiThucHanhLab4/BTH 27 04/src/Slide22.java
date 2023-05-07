import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Slide22
 */
public class Slide22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        System.out.println("Nhap vao kich thuoc cua arr list: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap vao gia tri thu %d: ", i);
            int gt = sc.nextInt();
            arrList.add(gt);
        }
        System.out.println("arr list da nhap la: ");
        HienThi(arrList);
        int max, min;
        max = min = arrList.get(0);
        for(int i = 0; i < arrList.size(); i++){
            if(arrList.get(i)>max) max = arrList.get(i);
            if(arrList.get(i)<min) min = arrList.get(i);
        }
        System.out.println("\narr list sau khi sap xep:");
        Collections.sort(arrList); // sap xep tang dan
        // Collections.sort(arrList, Collections.reverseOrder()); // sap xep giam dan
        HienThi(arrList);
        System.out.printf("\nMax = %d, Min = %d", max, min);
    }
    
    public static void HienThi(ArrayList<Integer> arrList){
        for(int number : arrList){
            System.out.print(number+"\t");
        }
    }
}
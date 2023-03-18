import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi bat ky: ");
        String count = sc.nextLine();

        int chuThuong = 0;
        int chuHoa = 0;
        int chuSo = 0;

        for (int i = 0; i < count.length(); i++) {
            char c = count.charAt(i);
            if (c>=97 && c<=122){
                chuThuong++;
            } else if (c>=65 && c<=90){
                chuHoa++;
            } else if (c>=48 && c<=57){
                chuSo++;
            }
        }

        System.out.println("so ky tu thuong: " + chuThuong);
        System.out.println("so ky tu hoa: " + chuHoa);
        System.out.println("so ky tu so: " + chuSo);
    }
}

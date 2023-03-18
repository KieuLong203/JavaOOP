import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String count;
        do{
            System.out.println("nhap vao chuoi: ");
            count = sc.nextLine();
        }while(count.length()>80);

        String kyTu;
        do{
            System.out.println("nhap vao 1 ky tu muon dem: ");
            kyTu = sc.nextLine();
        }while(kyTu.length()>1);
        
        int dem = 0;
        for(int i=0;i<count.length();i++){
            char c = count.charAt(i);
            if(c==kyTu.charAt(0)){
                dem++;
            }
        }
        System.out.println("ky tu muon dem co so lan xuat hien la: " +dem);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    public String fullName;
    public int Age;
    public float Diem;
    
    public static void Input(ArrayList<Bai3> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
    
        for (int i = 0; i < n; i++) {
            Bai3 std = new Bai3();
            System.out.printf("Sinh vien thu %d: ", i+1);
            sc.nextLine(); 
            System.out.print("Ho ten: ");
            std.fullName = sc.nextLine();
            System.out.print("Tuoi: ");
            std.Age = sc.nextInt();
            System.out.print("Diem: ");
            std.Diem = sc.nextFloat();
            arr.add(std);
        }
    }

    public static void displayInfo(ArrayList<Bai3> arr) {
        System.out.println("\nThong tin cua tat ca sinh vien ban da nhap: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("\nSinh vien thu %d: \n" , i+1);
            System.out.print("Ho ten: " + arr.get(i).fullName);
            System.out.print("\tTuoi: " + arr.get(i).Age);
            System.out.println("\tDiem: " +arr.get(i).Diem);
        }
    }

    public static void add(ArrayList<Bai3> arr) { 
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.print("\nChon 1 de them mot sinh vien vao danh sach");
            System.out.print("\nChon 2 de thoat");
            System.out.println("\nHay chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Bai3 std = new Bai3();
                    while (true) {
                        System.out.print("Ho ten sinh vien: ");
                        std.fullName = sc.nextLine();
                        if (std.fullName.isEmpty()) {
                            break; 
                        }
                        System.out.print("Tuoi: ");
                        std.Age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Diem: ");
                        std.Diem = sc.nextFloat();
                        arr.add(std);
                        System.out.println("Da them sinh vien vao danh sach");
                        System.out.print("\nDanh sach sau khi them thong tin: " );
                        Bai3.displayInfo(arr);
                    }
                    break;
                case 2:
                    System.out.println(" ");
                default:
                    System.out.print("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 2);   
    }

    public static void lowScoreSearch(ArrayList<Bai3> arr) {
        int count = 0;
        System.out.println("\nSinh vien phai thi lai: ");
        boolean found = false;
        for(int i = 0; i < arr.size(); i++) { 
            if(arr.get(i).Diem <= 5) { 
                System.out.println("Ho ten: " + arr.get(i).fullName);
                System.out.println("Tuoi: " + arr.get(i).Age);
                System.out.println("Diem: " + arr.get(i).Diem);
                count ++;
                found = true;
            }
        }
        if(!found) {
            System.out.println("Khong co sinh vien phai thi lai ");
        } else { 
            System.out.print("\nTong so sinh vien phai thi lai la " +count);
        }
    }

    public static void highScoreSearch(ArrayList<Bai3> arr) {
        float maxScore = arr.get(0).Diem;
        ArrayList<Bai3> highestScores = new ArrayList<Bai3>();
    
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).Diem > maxScore) {
                maxScore = arr.get(i).Diem;
            }
        }
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).Diem == maxScore) {
                highestScores.add(arr.get(i));
            }
        }
        System.out.println("\nCac sinh vien co diem cao nhat la:");
        for (int i = 0; i < highestScores.size(); i++) {
            System.out.println("\nSinh vien thu " + (i+1));
            System.out.println("Ho ten: " + highestScores.get(i).fullName);
            System.out.println("Tuoi: " + highestScores.get(i).Age);
            System.out.println("Diem: " + highestScores.get(i).Diem);
        }
    }

    public static void searchByName(ArrayList<Bai3> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap vao ho ten sinh vien muon tim: ");
        String name = sc.nextLine();
        boolean found = false;
        for(int i = 0; i < arr.size(); i++) { 
            if(arr.get(i).fullName.equals(name)) { 
                System.out.println("\nHo ten: " +arr.get(i).fullName);
                System.out.println("Tuoi: " +arr.get(i).Age);
                System.out.println("Diem: " +arr.get(i).Diem);
                found = true;
                break;
            }
        }
        if(!found) { 
            System.out.println("Khong tim thay sinh vien co ten la: " +name);
        } else {
            System.out.println("Day thong tin cua sinh vien can tim");
         }
    }
    public static void main(String[] args) {
        ArrayList<Bai3> std = new ArrayList<Bai3>();
        
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Nhap thong tin cho danh sach sinh vien");
            System.out.println("2. Hien thi danh sach thong tin sinh vien");
            System.out.println("3. Them sinh vien vao danh sach");
            System.out.println("4. Tim kiem cac sinh vien co diem thap <= 5 va phai thi lai");
            System.out.println("5. Tim kiem cac sinh vien co diem cao nhat");
            System.out.println("6. Tim kiem thong tin cua sinh vien theo ten");
            System.out.println("7. Thoat ");
            System.out.println("Hay chon: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Bai3.Input(std);
                    break;
                case 2:
                    Bai3.displayInfo(std);
                    break;
                case 3:
                    Bai3.add(std);
                    break;
                case 4:
                    Bai3.lowScoreSearch(std);
                    break;
                case 5:
                    Bai3.highScoreSearch(std);
                    break;
                case 6:
                    Bai3.searchByName(std);
                    break;
                case 7:
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }
        } while (choice != 7);

        sc.close();
    }
}

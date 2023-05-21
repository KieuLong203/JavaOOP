import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
            HashMap<SinhVien, SinhVien> sv = new HashMap<>();
            SinhVien.inputInfo(sv);
            SinhVien.displayInfo(sv);
            SinhVien.searchByClass(sv);
            SinhVien.searchByMSV(sv);
    }
}

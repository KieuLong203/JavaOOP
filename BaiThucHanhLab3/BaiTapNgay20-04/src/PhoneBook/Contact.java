package PhoneBook;

public abstract class Contact {
    
        protected String ten;
        protected String sdt;
    
        public Contact(String ten, String sdt) {
            this.ten = ten;
            this.sdt = sdt;
        }
    
        public abstract void nhap();
    
        public abstract void capNhat();
    
        public abstract void xoa();
    
        public abstract void timKiem();
    
}

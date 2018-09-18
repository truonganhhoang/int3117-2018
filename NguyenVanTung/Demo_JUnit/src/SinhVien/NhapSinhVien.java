package SinhVien;

import java.util.Scanner;


public class NhapSinhVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        SinhVien a[] = new SinhVien[3];
        String ten;
        String lop;
        float diem;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i <3 ; i ++){
             a[i] = new SinhVien();
            System.out.println("Nhap ten sinh vien: ");
            ten = sc.nextLine();
            a[i].setTen(ten);
            System.out.println("Nhap lop: ");
            lop = sc.nextLine();
            a[i].setLop(lop);
            System.out.println("Nhap diem: ");
            diem = sc.nextFloat();
            a[i].setDiem(diem);
            sc.nextLine();
        }
        System.out.println("Thong tinh sinh vien: ");
        for(int i = 0; i < 3; i ++){
            System.out.println("Ten cua sinh vien la : " +a[i].getTen());
            System.out.println("Tuoi cua sinh vien la : "+ a[i].getLop());
            System.out.println("Diem cua sinh vien la : "+ a[i].getDiem());
        }
    }
    
}
class SinhVien{
    private String ten;
    private String lop;
    private float diem;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	public SinhVien() {
		super();
		this.ten = "";
		this.lop = "";
		this.diem = 0;
	}
	public SinhVien(String ten, String lop, float diem) {
		super();
		this.ten = ten;
		this.lop = lop;
		this.diem = diem;
	}
    
    
   
        }
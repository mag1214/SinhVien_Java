package Class;
import java.util.Scanner;
public class SinhVien {
    private String Mssv, Ho, Ten, Lop, GioiTinh, Nganh,SDT,CCCD,NgayThangNam;
    //contructor 
    public SinhVien(){
        
    }
    public SinhVien(String Mssv, String Ho,String Ten, String Lop, String GioiTinh, String Nganh,String SDT, String CCCD ,String NgayThangNam)
    {
        this.Mssv=Mssv;
        this.Ho=Ho;
        this.Ten=Ten;
        this.Lop=Lop;
        this.GioiTinh=GioiTinh;
        this.Nganh=Nganh;
        this.SDT=SDT;
        this.CCCD=CCCD;
        this.NgayThangNam=NgayThangNam;
    }
    public SinhVien(SinhVien svcp)
    {
        Mssv=svcp.Mssv;
        Ho=svcp.Ho;
        Ten=svcp.Ten;
        Lop=svcp.Lop;
        GioiTinh=svcp.GioiTinh;
        Nganh=svcp.Nganh;
        SDT=svcp.SDT;
        CCCD=svcp.CCCD;
        NgayThangNam=svcp.NgayThangNam;
    }
    Scanner sc = new Scanner(System.in);
    //get set
    public String getMssv()
    {
        return Mssv;
    }
    public void Setmssv(String Mssv)
    {
        this.Mssv=Mssv;
    }
    public String getTen(){
        return Ten;
    }
    public void SetTen(String Ho){
        this.Ho=Ho;
    }
    public String getHo(){
        return Ho;
    }
    public void SetHo(String Ten){
        this.Ten=Ten;
    }
    public String getLop()
    {
        return Lop;
    }
    public void setLop(String Lop)
    {
        this.Lop=Lop;
    }
    public String getGioiTinh()
    {
        return GioiTinh;
    }
    public void setGioiTinh(String GioiTinh)
    {
        this.GioiTinh=GioiTinh;
    }
     public String getNganh()
    {
        return Nganh;
    }
    public void setNganh(String Nganh)
    {
        this.Nganh=Nganh;
    }
     public String getSDT()
    {
        return SDT;
    }
    public void setSDT(String SDT)
    {
        this.SDT=SDT;
    }
     public String getCCCD()
    {
        return CCCD;
    }
    public void setCCCD(String CCCD)
    {
        this.CCCD=CCCD;
    }
    public String getNgayThangNam()
    {
        return NgayThangNam;
    }
    public void setNgayThangNam(String NgayThangNam)
    {
        this.NgayThangNam=NgayThangNam;
    }
    public void Nhap()
    { 
        System.out.print("Nhap ma so sinh vien: ");
        Mssv=sc.nextLine();
        System.out.print("Nhap Ho sinh vien: ");
        Ho=sc.nextLine();
        System.out.print("Nhap Ten sinh vien: ");
        Ten=sc.nextLine();
        System.out.print("Nhap lop cua sinh vien: ");
        Lop=sc.nextLine();
        System.out.print("Nhap gioi tinh sinh vien: ");
        GioiTinh=sc.nextLine();
        System.out.print("Nhap nganh sinh vien theo hoc: ");
        Nganh=sc.nextLine();
        System.out.print("Nhap so dien thoai sinh vien theo hoc: ");
        SDT=sc.nextLine();
        System.out.print("Nhap can cuoc cong dan sinh vien theo hoc: ");
        CCCD=sc.nextLine();
        System.out.print("Nhap ngay thang nam sinh sinh vien: ");
        NgayThangNam=sc.nextLine();
    }
    public void Xuat()
    {
        System.out.println("Ma so sinh vien: "+Mssv);
        System.out.println("Ho va Ten sinh vien: "+Ho+" "+Ten);
        System.out.println("Lop: "+Lop);
        System.out.println("Gioi tinh: "+GioiTinh); 
        System.out.println("Nganh: "+Nganh);
        System.out.println("So dien thoai: "+SDT);
        System.out.println("Can cuoc cong dan: "+CCCD);
        System.out.println("Nam Sinh: "+NgayThangNam); 
    }
} 


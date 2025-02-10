package Class;
import java.util.Scanner;

public class SinhVienLienThong extends SinhVien
{
    private String NamTotNghiep, NganhHocCaoDang;
    Scanner sc = new Scanner(System.in);
    public SinhVienLienThong(){

    }
    public SinhVienLienThong(String Mssv, String Ho,String Ten, String Lop, String GioiTinh, 
    String Nganh,String SDT, String CCCD ,String NgayThangNam,String NamTotNghiep,String NganhHocCaoDang)
    {
        super(Mssv, Ho, Ten, Lop, GioiTinh, Nganh,SDT,CCCD,NgayThangNam);
        this.NamTotNghiep = NamTotNghiep;
        this.NganhHocCaoDang=NganhHocCaoDang;
    }
    public SinhVienLienThong(SinhVienLienThong sv)
    {
        super((SinhVien)sv);
        NamTotNghiep=sv.NamTotNghiep;
        NganhHocCaoDang=sv.NganhHocCaoDang;
    }
    public String getNamTotNghiep()
    {
        return NamTotNghiep;
    }
    public void setNamTotNghiep(String NamTotNghiep)
    {
        this.NamTotNghiep=NamTotNghiep;
    }
    public String NganhHocCaoDang()
    {
        return NganhHocCaoDang;
    }
    public void setNganhHocCaoDang(String NganhHocCaoDang)
    {
        this.NganhHocCaoDang=NganhHocCaoDang;
    }
    @Override public void Nhap()
    {
        super.Nhap();
        System.out.print("Nhap Nam tot nghiep: ");
        NamTotNghiep=sc.nextLine();
        System.out.print("Nhap nganh hoc cao dang: ");
        NganhHocCaoDang=sc.nextLine();
    }
    @Override public void Xuat()
    {
        super.Xuat();
        System.out.println("Nam tot nghiem: "+NamTotNghiep);
        System.out.println("Nganh hoc cao dang: "+NganhHocCaoDang);
    }
}
package Class;
import java.util.Scanner;

public class SinhVienChinhQuy extends SinhVien{
    private int DiemRenLuyen;
    Scanner sc = new Scanner(System.in);
    public SinhVienChinhQuy()
    {
    }
    public SinhVienChinhQuy(String Mssv, String Ho,String Ten, String Lop, String GioiTinh, String Nganh,String SDT, String CCCD ,String NgayThangNam,int DiemRenLuyen)
    {
        super(Mssv, Ho, Ten, Lop, GioiTinh, Nganh,SDT,CCCD,NgayThangNam);
        this.DiemRenLuyen=DiemRenLuyen;
    }
    public SinhVienChinhQuy(SinhVienChinhQuy Sv)
    {
        super((SinhVien)Sv);
        DiemRenLuyen=Sv.DiemRenLuyen;
    }
    public int getDiemRenLuyen()
    {
        return DiemRenLuyen;
    }
    public void setDiemRenLuyen(int DiemRenLuyen)
    {
        this.DiemRenLuyen=DiemRenLuyen;
    }
    @Override public void Nhap()
    {
        super.Nhap();
        System.out.println("Nhap diem ren luyen: ");
        DiemRenLuyen=sc.nextInt();
    }
    @Override public void Xuat()
    {
        super.Xuat();
        System.out.println("Diem ren luyen: "+DiemRenLuyen);
    }
}

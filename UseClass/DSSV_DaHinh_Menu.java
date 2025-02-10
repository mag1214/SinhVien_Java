package UseClass;
import java.util.Scanner;

import Class.DSSV_DaHinh;

public class DSSV_DaHinh_Menu {
    DSSV_DaHinh sv = new DSSV_DaHinh();
    Scanner scint = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);
    public void Menu()
    {
        //sv.Nhap();
        sv.NhapCung();
        int number=-1;
        boolean flag=true;
            while(flag)
            {
                System.out.println("*********-Menu_Danh_Sach_Sinh_vien-********");
                System.out.println("*       1.Xuat Danh Sach sinh vien        *");
                System.out.println("*            2.Them sinh vien             *");
                System.out.println("*        3.Sua thong tin sinh vien        *");
                System.out.println("*     4.Xoa sinh vien trong danh sach     *");
                System.out.println("*           5.Tim kiem sinh vien          *");
                System.out.println("*           6.Thong Ke Nam Sinh           *");
                System.out.println("*       7.Thong Ke diem ren luyen         *");
                System.out.println("*        8.Thong Ke nam tot nghiep        *");
                System.out.println("*        9.Nhap Danh Sach sinh vien       *");
                System.out.println("*                0.Exit                   *");
                System.out.println("*******************************************");
                System.out.print("Nhap so ban muon chon: ");
                number=scint.nextInt();
                switch (number) 
                {
                    case 1:
                        sv.Xuat();
                        break;
                    case 2:
                        sv.Them();
                        break;
                    case 3:
                        MenuSua();
                        break;
                    case 4:
                        MenuXoa();
                        break;
                    case 5:
                        MenuTimKiem();
                        break;
                    case 6:
                        sv.NamSinh();
                        break;
                    case 7:
                        sv.DiemRenLuyen();
                        break;
                    case 8:
                        sv.NamTotNghiep();
                        break;
                    case 9:
                        sv.Nhap();
                        break;
                    case 0:
                        flag=false;
                        break;
                    default:
                        System.out.println("Nhap Sai!! Hay nhap lai");
                        break;
                }
            }         
    }
    public void MenuSua()
    {
        int number=-1;
        boolean flag=true;
        while(flag)
        {
            System.out.println("***********-Menu_Sua_Sinh_Vien-***********");
            System.out.println("*       1.Sua sinh vien co tham so       *");
            System.out.println("*     2.Sua sinh vien khong tham so      *");
            System.out.println("*          0.Thoat ra menu dssv           *");
            System.out.println("*******************************************");
            System.out.print("Nhap so ban muon chon: ");
            number=scint.nextInt();
            switch (number) 
            {
                case 1:
                    String sv1;
                    System.out.print("Nhap ma sinh vien can sua: ");
                    sv1=scString.nextLine();
                    sv.Sua(sv1);
                    break;
                case 2:
                    sv.Sua();
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("Nhap Sai!! Hay nhap lai");
            }
        }
    }
    public void MenuXoa()
    {
        int number=-1;
        boolean flag=true;
        while(flag)
        {
            System.out.println("***********-Menu_Xoa_Sinh_Vien-*************");
            System.out.println("*   1.Xoa theo ma sinh vien khong tham so  *");
            System.out.println("*    2.Xoa theo ma sinh vien co tham so    *");
            System.out.println("*          0.Thoat ra menu dssv            *");
            System.out.println("********************************************");
            System.out.print("Nhap so ban muon chon: ");
            number=scint.nextInt();
            switch (number) 
            {
                case 1:
                    sv.XoaMa();
                    break;
                case 2:
                    String sv1;
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    sv1=scString.nextLine();
                    sv.XoaMa(sv1);
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("Nhap Sai!! Hay nhap lai");
            }
        }
    }

    public void MenuTimKiem()
    {
        int number=-1;
        boolean flag=true;
        while(flag)
        {
            System.out.println("*******************-Menu_TimKiem_Sinh_Vien-*******************");
            System.out.println("*       1.Tim kiem cac theo MA sinh vien khong tham so       *");
            System.out.println("*   2.Tim theo Ma sinh vien co tham so theo kieu SinhVien    *");
            System.out.println("*                   0.Thoat ra menu dssv                     *");
            System.out.println("**************************************************************");
            System.out.print("Nhap so ban muon chon: ");
            number=scint.nextInt();
            switch (number) 
            {
                case 1:
                    sv.TimKiemMssv();
                    break;
                case 2:
                    String sv2;
                    System.out.print("Nhap ma sinh vien can tim: ");
                    sv2=scString.nextLine();
                    if(sv.TimKiemmMssv(sv2)==null)
                        System.out.println("khong tim thay sinh vien");
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("Nhap Sai!! Hay nhap lai");
         
            }       
        }
    }
}

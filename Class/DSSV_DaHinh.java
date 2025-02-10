package Class;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class DSSV_DaHinh {
    int n, SoSinhVien=0;
    SinhVien []dssv = new SinhVien[n];
    Scanner sc = new Scanner(System.in);
    Scanner scString= new Scanner(System.in);
    public DSSV_DaHinh(){}
    public DSSV_DaHinh(int n, SinhVien [] dssv)
    {
        this.n=n;
        this.dssv=dssv;
    }
    public int getN()
    {
        return n;
    }
    public void setN(int n)
    {
        this.n=n;
    }
    public void Nhap()
    {
        System.out.print("Nhap so sinh vien: ");
        n = sc.nextInt();
        dssv= new SinhVien[n];
        int number=-1;
        while(SoSinhVien<n)
        {
            System.out.println("*************-Menu-NhapSinhVien************");
            System.out.println("*       1.Nhap sinh vien lien thong       *");
            System.out.println("*        2.Nhap sinh vien chinh quy       *");
            System.out.println("*                 0.Thoat                 *");
            System.out.println("*******************************************");
            System.out.print("Nhap sinh vien can them vao: ");
            number=sc.nextInt();
            switch(number)
            {
                case 1:
                        System.out.print("Nhap sinh vien thu: "+SoSinhVien);
                        System.out.println();
                        dssv[SoSinhVien]=new SinhVienLienThong();
                        dssv[SoSinhVien].Nhap();
                        SoSinhVien++;
                    break;
                case 2:
                        System.out.print("Nhap sinh vien thu: "+SoSinhVien);
                        System.out.println();
                        dssv[SoSinhVien]=new SinhVienChinhQuy();
                        dssv[SoSinhVien].Nhap();
                        SoSinhVien++;
                    break;
                case 0:
                    n = SoSinhVien;
                    dssv = Arrays.copyOf(dssv, n);
                    break;   
                default:
                    System.out.println("Nhap sai so vui long nhap lai!!!"); 
            }
        }
    }
    public void  NhapCung()
    {
        n=10;
        dssv = new SinhVien[n];
        dssv[0]=new SinhVienLienThong("SV1","Nguyen","Thanh Tan","A1","Nam","CNTT","0123456111","9999900","24/5/2002","2023","CNTT");
        dssv[1]=new SinhVienChinhQuy("SV2","Tran","Van Luu","A2","Nam","CNTT","0123456112","9999901","02/5/2000",50);
        dssv[2]=new SinhVienChinhQuy("SV3","Le","Van Bao","B1","Nu","NNA","0123456111","9999902","07/8/1999",70);
        dssv[3]=new SinhVienLienThong("SV4","Nguyen","Thanh Nhan","C1","Nam","QTKD","0123456113","9999903","11/9/2003","2022","QTKD");
        dssv[4]=new SinhVienChinhQuy("SV5","Lam","Thi Yen Tam","A2","Nu","CNTT","0123456114","9999904","08/12/2004",50);
        dssv[5]=new SinhVienLienThong("SV6","Pham","Thanh Tan","C2","Nam","QTKD","0123456115","9999905","26/5/1998","2021","CNTT");
        dssv[6]=new SinhVienChinhQuy("SV7","Nguyen","Thanh Tan","B2","Nam","NNA","0123456116","9999906","03/8/2002",80);
        dssv[7]=new SinhVienLienThong("SV8","Nguyen","Thanh Tan","C1","Nam","QTKD","0123456117","9999907","03/9/2002","2022","CNTT");
        dssv[8]=new SinhVienLienThong("SV9","Le","Van Duyet","B2","Nu","NNA","0123456118","9999908","10/9/2002","2023","CNTT");
        dssv[9]=new SinhVienChinhQuy("SV10","Tran","Van Tri","B1","Nam","NNA","0123456119","9999900","12/5/2002",60);
        
    }
    public void Xuat()
    {
        System.out.println("DANH SACH CAC SINH VIEN");   
        for(int i=0; i<n; i++)
        {
            dssv[i].Xuat();
        }
    }

    public void Them()
    {
        int number=-1,ThemCuoi=n;
            System.out.println("*****************-Them-********************");
            System.out.println("*       1.Them sinh vien lien thong       *");
            System.out.println("*        2.Them sinh vien chinh quy       *");
            System.out.println("*                 0.Thoat                 *");
            System.out.println("*******************************************");
            System.out.print("Nhap sinh vien can them vao: ");
            number=sc.nextInt();
            switch(number)
            {
                case 1:
                        dssv = Arrays.copyOf(dssv,n+1);
                        System.out.print("Nhap sinh vien thu: "+SoSinhVien);
                        System.out.println();
                        dssv[ThemCuoi]=new SinhVienLienThong();
                        dssv[ThemCuoi].Nhap();
                        n++;
                        System.out.println("**********Da them sinh vien vao danh sach**********");
                    break;
                case 2:
                        dssv = Arrays.copyOf(dssv,n+1);
                        System.out.print("Nhap sinh vien thu: "+SoSinhVien);
                        System.out.println();
                        dssv[ThemCuoi]=new SinhVienChinhQuy();
                        dssv[ThemCuoi].Nhap();
                        n++;
                        System.out.println("**********Da them sinh vien vao danh sach**********");
                case 0:
                    break;
            }
    }
    public void Them(SinhVienLienThong x)
    {
        n=dssv.length;
        dssv = Arrays.copyOf(dssv,n+1);
        dssv[n]=new SinhVienLienThong();
        SinhVien dssv2 = new SinhVienLienThong(x);
        dssv[n]=dssv2;
        n++;
        System.out.println("**********Da them sinh vien vao danh sach**********");
    }
    public void Them(SinhVienChinhQuy x)
    {
        n=dssv.length;
        dssv = Arrays.copyOf(dssv,n+1);
        dssv[n]=new SinhVienChinhQuy();
        SinhVien dssv2 = new SinhVienChinhQuy(x);
        dssv[n]=dssv2;
        n++;
        System.out.println("**********Da them sinh vien vao danh sach**********");
    }
    public void XoaMa()
    {
        n=dssv.length;
        int a;
        String MaSo;
        System.out.print("Nhap ma so sinh vien can xoa: ");
        MaSo=scString.nextLine();
        a=TimKiemMssv(MaSo);
        if(a!=-1)
        {
            for(int i=a; i<n-1; i++)
                dssv[i]=dssv[i+1];
            dssv = Arrays.copyOf(dssv,n-1);
            n--;
        }
        else
        {
            System.out.println("Khong tim thay sinh vien");
        }
    }
    //Xoa 1 sinh vien theo ma so co tham so
    public void XoaMa(String Ma)
    {
        n=dssv.length;
        int a=TimKiemMssv(Ma);
        if(a!=-1)
        {
            for(int i=a; i<n-1; i++)
                dssv[i]=dssv[i+1];
            dssv = Arrays.copyOf(dssv,n-1);
            n--;
        }
        else 
            System.out.println("Khong tim thay sinh vien");
    }
    public void Sua()
        {
        int number=-1;
        int ViTri;
        String MaSo;
        System.out.print("Nhap ma so sinh vien can sua: ");
        MaSo=scString.nextLine();
        ViTri=TimKiemMssv(MaSo);
        System.out.println("*****************-Sua-********************");
        System.out.println("*       1.Sua sinh vien lien thong       *");
        System.out.println("*        2.Sua sinh vien chinh quy       *");
        System.out.println("*                 0.Thoat                 *");
        System.out.println("*******************************************");
        System.out.print("Nhap sinh vien can them vao: ");
        number=sc.nextInt();
        switch(number)
        {
            case 1:
                SinhVienLienThong LienThong =new SinhVienLienThong();
                if(ViTri!=-1)
                {
                    System.out.println("******NHAP THONG TIN SINH VIEN CAN SUA******");
                    LienThong.Nhap();
                    dssv[ViTri]=LienThong;
                }
                else
                {
                    System.out.println("Khong tim thay sinh vien can sua");
                }
                break;
            case 2:
                SinhVienChinhQuy ChinhQuy= new SinhVienChinhQuy();;
                if(ViTri!=-1)
                {
                    System.out.println("******NHAP THONG TIN SINH VIEN CAN SUA******");
                    ChinhQuy.Nhap();
                    dssv[ViTri]=ChinhQuy;
                }
                else
                {
                    System.out.println("Khong tim thay sinh vien can sua");
                }
                break;
            case 0:
                break;
            }
        }
        //Sua 1 sinh vien co tham so theo ma sinh vien
    public void Sua(String x)
    {
        int number=-1;
        int ViTri=TimKiemMssv(x);
        SinhVien SuaSv= new SinhVien();
        if(ViTri!=-1)
        {
            System.out.println("******NHAP THONG TIN SINH VIEN CAN SUA******");
            SuaSv.Nhap();
            dssv[ViTri]=SuaSv;
        }
        else
            System.out.println("Khong tim thay sinh vien can sua");

        System.out.println("*****************-Sua-********************");
        System.out.println("*       1.Sua sinh vien lien thong       *");
        System.out.println("*        2.Sua sinh vien chinh quy       *");
        System.out.println("*                 0.Thoat                 *");
        System.out.println("*******************************************");
        System.out.print("Nhap sinh vien can them vao: ");
        number=sc.nextInt();
        switch(number)
        {
            case 1:
                SinhVienLienThong LienThong =new SinhVienLienThong();
                if(ViTri!=-1)
                {
                    System.out.println("******NHAP THONG TIN SINH VIEN CAN SUA******");
                    LienThong.Nhap();
                    dssv[ViTri]=LienThong;
                }
                else
                {
                    System.out.println("Khong tim thay sinh vien can sua");
                }
                break;
            case 2:
                SinhVienChinhQuy ChinhQuy= new SinhVienChinhQuy();;
                if(ViTri!=-1)
                {
                    System.out.println("******NHAP THONG TIN SINH VIEN CAN SUA******");
                    ChinhQuy.Nhap();
                    dssv[ViTri]=ChinhQuy;
                }
                else
                {
                    System.out.println("Khong tim thay sinh vien can sua");
                }
                break;
            case 0:
                break;
            }
    }
    public void TimKiemMssv()
    {
        n=dssv.length;
        int flag=0;
        String MaSo;
        System.out.print("Nhap ma so sinh vien can tim: ");
        MaSo=scString.nextLine();
        for(int i=0; i<n; i++)
        {
            if(dssv[i].getMssv().equals(MaSo))
            {
                dssv[i].Xuat();
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("khong tim thay sinh vien");
        }
    }
        //Tim kiem sinh vien theo ma so co tham so int
    public int TimKiemMssv(String Ma)
    {
        n=dssv.length;
        int flag=0;
        for(int i=0; i<n; i++)
        {
            if(dssv[i].getMssv().equals(Ma))
            {
                flag=i;
                break;
            }
        }
        return flag;
    }
        //Tim kiem sinh vien theo ma so co tham so theo kieu Sinhvien
    public SinhVien TimKiemmMssv(String Ma)
    {
        n=dssv.length;
        SinhVien flag=null;
        for(int i=0; i<n; i++)
        {
            if(dssv[i].getMssv().equals(Ma))
            {
                dssv[i].Xuat();
                flag=dssv[i];
            }
        }
        return flag;
    }
    public void TimKiemDiemRenLuyen()
    {
        n=dssv.length;
        int flag=0;
        int Diem;
        System.out.print("Nhap diem ren luyen: ");
        Diem=sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            if(dssv[i] instanceof SinhVienChinhQuy)
            {
                SinhVienChinhQuy ChinhQuy = new SinhVienChinhQuy();
                ChinhQuy=(SinhVienChinhQuy)dssv[i];
                if(ChinhQuy.getDiemRenLuyen()==Diem)
                    ChinhQuy.Xuat();
                System.out.println("-------SINH VIEN CHINH QUY--------");
                
            }
        }
        if(flag==0)
        {
            System.out.println("khong tim thay sinh vien");
        }
    }
    public void TimKiemNamTotNghiep()
    {
        n=dssv.length;
        int flag=0;
        String Nam;
        System.out.print("Nhap diem ren luyen: ");
        Nam=sc.nextLine();
        
        for(int i=0; i<n; i++)
        {
            if(dssv[i] instanceof SinhVienLienThong)
            {
                SinhVienLienThong LienThong = new SinhVienLienThong();
                LienThong=(SinhVienLienThong)dssv[i];
                if(LienThong.getNamTotNghiep().contains(Nam))
                    LienThong.Xuat();
                System.out.println("-------SINH VIEN Lien Thong--------");
            }
        }
        if(flag==0)
        {
            System.out.println("khong tim thay sinh vien");
        }
    }
    public void NamSinh()
    {
        HashMap<String,Integer> hashMap =new HashMap<String,Integer>();
        for(SinhVien i: dssv)
        {
            String Nam = TachNam(i.getNgayThangNam());
            if(hashMap.containsKey(Nam))
            {
                hashMap.put(Nam,hashMap.get(Nam)+1);
            }else{
                hashMap.put(Nam,1);
            }
        }
        for(Map.Entry<String,Integer> entry: hashMap.entrySet())
        {
            System.out.println("Sinh vien sinh nam "+ entry.getKey()+" la "+entry.getValue());
        }
    }
        //tach nam sinh
    public String TachNam(String s)
    {
        String[] NgayThangNam = s.split("/");
        String Nam=NgayThangNam[NgayThangNam.length-1];
        return Nam;
    }
    public void NamTotNghiep()
    {
        HashMap<String,Integer> hashMap =new HashMap<String,Integer>();
        for(SinhVien i: dssv)
        {
            if(i instanceof SinhVienLienThong)
            {
                SinhVienLienThong LienThong = new SinhVienLienThong();
                LienThong=(SinhVienLienThong)i;
                String Nam=LienThong.getNamTotNghiep();
                if(hashMap.containsKey(Nam))
                {
                    hashMap.put(Nam,hashMap.get(Nam)+1);
                }else{
                    hashMap.put(Nam,1);
                }
            }
        }
        for(Map.Entry<String,Integer> entry: hashMap.entrySet())
        {
            System.out.println("Sinh vien tot nghiep nam "+ entry.getKey()+" la "+entry.getValue());
        }     
    }

    public void DiemRenLuyen() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;
        for(SinhVien sv : dssv) {
            if(sv instanceof SinhVienChinhQuy) {
                SinhVienChinhQuy ChinhQuy = new SinhVienChinhQuy();
                ChinhQuy = (SinhVienChinhQuy)sv;
                int Diem = ChinhQuy.getDiemRenLuyen();
                if(Diem >= 80) {
                    gioi++;
                } else if(Diem < 80 && Diem >= 65) {
                    kha++;
                } else if(Diem < 65 && Diem >= 50) {
                    tb++;
                } else{
                    yeu++;
                }
            }
        }
        System.out.println("So sinh vien co diem ren luyen loai gioi:" + gioi);
        System.out.println("So sinh vien co diem ren luyen loai kha:" + kha);
        System.out.println("So sinh vien co diem ren luyen loai trung binh:" + tb);
        System.out.println("So sinh vien co diem ren luyen loai yeu:" + yeu);
    }
}

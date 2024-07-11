/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class model_NhanVien {
    private String ma;
    private String ten;
    private String sdt;
    private int trangthai;

    public model_NhanVien() {
    }

    public model_NhanVien(String ma, String ten, String sdt, int trangthai) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.trangthai = trangthai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
    public Object[] toDataRow(){
        return new Object[]{
           this.ma,this.ten,this.sdt,this.trangthai ==1 ?"Hoạt động" : "Không hoạt động" 
        };
    }
}

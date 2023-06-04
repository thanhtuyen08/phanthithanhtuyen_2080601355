package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "NHAN_VIEN")
public class NhanVien {
    @Id
    @NotBlank(message = "Trường này không được phép bỏ trống")
    @Length(min = 3, max = 3, message = "Phải nhập vào 3 ký tự bao gồm chữ và số")
    @Column(name = "Ma_NV")
    private String id;

    @NotBlank(message = "Trường này không được phép bỏ trống")
    @Length(min = 3, max = 100, message = "Phải nhập tên nhân viên")
    @Column(name = "Ten_NV")
    private String tenNv;

    @Length(min = 0, max = 3, message = "nhập giới tính")
    @Column(name = "Phai")
    private String phai;

    @Length(min = 0, max = 200, message = "nhập nơi sinh")
    @Column(name = "Noi_sinh")
    private String noisinh;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_phong")
    private PhongBan phongban;





    @Column(name = "Lương")
    private int luong;


    public NhanVien(){}

    public NhanVien(String id, String tenNv, String phai, String noisinh, int luong, PhongBan phongban1) {
        this.id = id;
        this.tenNv = tenNv;
        this.phai = phai;
        this.noisinh = noisinh;
        this.phongban = phongban1;
        this.luong = luong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }

    public PhongBan getPhongban() {
        return phongban;
    }

    public void setPhongban(PhongBan phongban) {
        this.phongban = phongban;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public NhanVien(String id, String tenNv, String phai, String noisinh, PhongBan phongban, int luong) {
        this.id = id;
        this.tenNv = tenNv;
        this.phai = phai;
        this.noisinh = noisinh;
        this.phongban = phongban;
        this.luong = luong;
    }
}
package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Entity
@Table(name = "PhongBan")
public class PhongBan {
    @Id
    @Length(min = 2, max = 2)
    private String Ma_phong;
    @Column
    private String Ten_Phong;

    public String getMa_phong() {
        return Ma_phong;
    }

    public void setMa_phong(String ma_phong) {
        Ma_phong = ma_phong;
    }

    public String getTen_Phong() {
        return Ten_Phong;
    }

    public void setTen_Phong(String ten_Phong) {
        Ten_Phong = ten_Phong;
    }

    public PhongBan(String ma_phong, String ten_Phong) {
        Ma_phong = ma_phong;
        Ten_Phong = ten_Phong;
    }

    public PhongBan() {
    }
    @OneToMany(mappedBy = "phongban", fetch = FetchType.LAZY)
    private List<NhanVien> nhanVienList;
}

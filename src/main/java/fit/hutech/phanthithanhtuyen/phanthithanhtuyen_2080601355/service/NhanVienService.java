package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.service;

import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> getAllNV();
    void  saveNV(NhanVien nhanVien);

    NhanVien getNhanVienById(String id);

    void delNV(String id);
}

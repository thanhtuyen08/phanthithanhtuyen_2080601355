package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.service;

import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model.NhanVien;
import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model.PhongBan;

import java.util.List;

public interface PhongBanService {
    List<PhongBan> get();
    void  save(PhongBan phongBan);

    PhongBan getById(String id);

    void delPB(String id);

}

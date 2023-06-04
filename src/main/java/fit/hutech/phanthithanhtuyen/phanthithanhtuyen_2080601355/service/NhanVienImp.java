package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.service;

import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model.NhanVien;
import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.repository.NvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienImp implements NhanVienService{
    @Autowired
    private NvRepository nvRepository;
    @Override
    public List<NhanVien> getAllNV(){
        return nvRepository.findAll();
    }
    @Override
    public void saveNV(NhanVien nhanVien){
        this.nvRepository.save(nhanVien);
    }
    @Override
    public NhanVien getNhanVienById(String id){
        Optional<NhanVien> optional = nvRepository.findById(id);
        NhanVien nhanVien = null;
        if ((optional.isPresent())){
            nhanVien=optional.get();
        }else {
            throw  new RuntimeException("Khong co nhan vien nay");
        }
        return nhanVien;
    }
    @Override
    public void delNV(String id){
        this.nvRepository.deleteById(id);
    }
}

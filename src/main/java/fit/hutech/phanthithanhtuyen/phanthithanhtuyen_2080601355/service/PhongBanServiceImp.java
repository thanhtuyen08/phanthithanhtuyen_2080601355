package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.service;

import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model.PhongBan;
import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.repository.PbReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhongBanServiceImp implements PhongBanService{
    @Autowired
    private PbReository pbReository;
@Override
    public List<PhongBan> get(){
        return pbReository.findAll();
    }
@Override
    public void save(PhongBan phongBan){
        this.pbReository.save(phongBan);
    }
@Override
    public PhongBan getById(String id){
        Optional<PhongBan> optional = pbReository.findById(id);
        PhongBan phongBan = null;
        if ((optional.isPresent())){
            phongBan=optional.get();
        }else {
            throw  new RuntimeException("Khong co phong ban nay");
        }
        return phongBan;
    }

    @Override
    public void delPB(String id) {

    }

}

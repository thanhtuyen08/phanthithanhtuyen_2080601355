package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.repository;

import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NvRepository extends JpaRepository<NhanVien, String> {
}

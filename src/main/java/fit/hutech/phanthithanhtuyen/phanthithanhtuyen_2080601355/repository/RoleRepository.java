package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.repository;
import java.util.Optional;

import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
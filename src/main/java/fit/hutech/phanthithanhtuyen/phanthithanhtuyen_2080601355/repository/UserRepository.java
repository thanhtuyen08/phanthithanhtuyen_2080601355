package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.repository;

import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    boolean existsByUsername(String username);
}
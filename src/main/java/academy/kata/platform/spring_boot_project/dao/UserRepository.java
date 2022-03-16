package academy.kata.platform.spring_boot_project.dao;

import academy.kata.platform.spring_boot_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

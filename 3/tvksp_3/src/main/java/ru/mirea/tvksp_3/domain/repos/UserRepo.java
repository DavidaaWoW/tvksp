package ru.mirea.tvksp_3.domain.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.tvksp_3.data.User;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}

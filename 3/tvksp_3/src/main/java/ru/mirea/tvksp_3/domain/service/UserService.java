package ru.mirea.tvksp_3.domain.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.tvksp_3.data.User;
import ru.mirea.tvksp_3.domain.dto.UserDTO;
import ru.mirea.tvksp_3.domain.repos.UserRepo;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User create(UserDTO userDTO) {
        User user = userRepo.save(
                User.builder()
                        .name(userDTO.getName())
                        .birth_date(userDTO.getBirth_date())
                        .build());
        return user;
    }

    public List<User> readAll() {
        return userRepo.findAll();
    }
}

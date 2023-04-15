package pl.zajavka.w14.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Data
public class UserManagementService {
    private UserManagementRepository userManagementRepository;

    public void create(User user) {
        if (userManagementRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException(String.format("User with email: [%s] is already created", user.getEmail()));
        }
        userManagementRepository.create(user);
    }

    public Optional<User> findByEmail(String email) {

        return userManagementRepository.findByEmail(email);
    }

    public List<User> findAll() {
        return userManagementRepository.findAll();
    }

    public List<User> findByName(String name) {
        return userManagementRepository.findByName(name);
    }

    public void update(String oldEmail, User withNewEmail) {
        if(userManagementRepository.findByEmail(oldEmail).isEmpty()){
            throw new RuntimeException(String.format("User with email: [%s] doesn't exist",oldEmail));
        }
        userManagementRepository.update(oldEmail, withNewEmail);

    }

    ;

    public void delete(String email) {
        if (userManagementRepository.findByEmail(email).isEmpty()) {
            throw new RuntimeException(String.format("User with email: [%s] doesn't exist", email));
        }
        userManagementRepository.delete(email);
    }
}

package pl.zajavka.w14.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@Repository

public class UserManagementInMemoryRepository implements UserManagementRepository{


    Map<String,User> userMap=new HashMap<>();
   @Override
    public Optional<User> findByEmail(String email){

       return Optional.ofNullable(userMap.get(email));
    }

    @Override
    public List<User> findAll() {
        return userMap.values().stream().toList();
    }

    @Override
    public List<User> findByName(String name) {
        return userMap.values().stream()
                .filter(user->user.getName().equals(name))
                .toList();
    }

    @Override
    public void create(User user) {
        userMap.put(user.getEmail(),user);
    }

    @Override
    public void update(String oldEmail, User user) {
        userMap.remove(oldEmail);
        userMap.put(user.getEmail(),user);
    }

    @Override
    public void delete(String email) {
        userMap.remove(email);
    }
}

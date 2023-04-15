package pl.zajavka.w13.project.service;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Repository;
import pl.zajavka.w13.project.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

@Repository
@AllArgsConstructor
@Value
public class ReadFile {

 List<User> users;

    public List<User> readFileAndCreateListOfUsers(Path path){
        try(BufferedReader bufferedReader= Files.newBufferedReader(path)) {
            List<String> users = bufferedReader.lines().skip(1).toList();
            save(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    private void save(List<String> users) {
        for (String user : users) {
            String[] split = user.split(";");
            String email = split[0];
            String name = split[1];
            String publicName = split[2];
            LocalDate birthDate = LocalDate.parse(split[3]);
            this.users.add(new User(email,name,publicName,birthDate));
        }
    }
}

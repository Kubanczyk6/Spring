package pl.zajavka.w13.project.model;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.LocalDate;

@AllArgsConstructor
@Value
public class User {

    String email;
    String name;
    String publicName;
    LocalDate birthDate;

}

package pl.zajavka.w14.exercise;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@Builder
@Value
@With
public class User implements Comparable<User> {

    String name;
    String surname;
    String email;

    @Override
    public int compareTo(User o) {
        return this.email.compareTo(o.email);
    }
}

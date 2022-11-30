package task1;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
    private String name;
    private String email;
    private Integer age;
    private Integer id;

    private DBase DB;

    public User(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void save() {
        DB.add_one_user(this);
    }
}
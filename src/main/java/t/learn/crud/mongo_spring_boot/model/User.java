package t.learn.crud.mongo_spring_boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    public String username;
    public Number age;
}

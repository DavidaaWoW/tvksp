package ru.mirea.tvksp_3.data;

import lombok.*;

import jakarta.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue( strategy =
            GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String birth_date;

    public User(String name, String birth_date) {
        this.name = name;
        this.birth_date = birth_date;
    }
}

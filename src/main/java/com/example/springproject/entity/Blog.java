package com.example.springproject.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Data
@Entity(name="blogs")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="name")
    String name;

    @Column(name="definition")
    String definition;

    @Column(name="author")
    String author;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id",referencedColumnName = "id")
    User user;

}

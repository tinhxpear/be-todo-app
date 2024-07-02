package dev.tinhxpear.todo_app_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String username;
    private String description;
    @Column(name = "create_date")
    private LocalDate createDate;
    @Column(name = "target_date")
    private LocalDate targetDate;
    private boolean status;
}

package com.platzi.pizza.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.User;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@IdClass(UserRoleId.class)
@Table(name = "user_role")
public class UserRoleEntity {

    @Id
    @Column(nullable = false, length = 20)
    private String username;

    @Id
     @Column(nullable = false, length = 20)
    private String role;

    @Column(name = "granted_date", nullable = false)
    private LocalDateTime grantedDate;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username", insertable = false,updatable=false)
    private UserEntity user;
}

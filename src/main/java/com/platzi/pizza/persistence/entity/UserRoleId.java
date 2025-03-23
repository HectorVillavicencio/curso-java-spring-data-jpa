package com.platzi.pizza.persistence.entity;

import java.io.Serializable;
import java.util.Objects;

public class UserRoleId implements Serializable {

    private String username;
    private String role;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof UserRoleId that)) return false;
        return Objects.equals(username, that.username) && Objects.equals(role, that.role);
    }

    public int hashcode(){
        return Objects.hash(username,role);
    }
}

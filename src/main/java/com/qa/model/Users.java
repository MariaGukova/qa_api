package com.qa.model;

import com.qa.model.enums.Roles;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Users implements UserDetails {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Roles role;

    private String username;
    private String password;
    private String fio;
    private String avatar;
    private String address;
    private String city;
    private String country;

    @OneToMany(mappedBy = "user", orphanRemoval = true)
    private List<Task> tasks;

    public Users(String username, String password, String fio, Roles role, String avatar) {
        this.role = role;
        this.username = username;
        this.password = passwordEncoder().encode(password);
        this.fio = fio;
        this.avatar = avatar;
        this.tasks = new ArrayList<>();
        this.address = "";
        this.city = "";
        this.country = "";
    }

    public void addTask(Task task){
        tasks.add(task);
        task.setUser(this);
    }

    public void removeTask(Task task){
        tasks.remove(task);
        task.setUser(null);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(getRole());
    }

    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12);
    }
}

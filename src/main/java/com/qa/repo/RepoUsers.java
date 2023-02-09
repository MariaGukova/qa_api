package com.qa.repo;

import com.qa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface RepoUsers extends JpaRepository<Users, Long> {
    public UserDetails findByUsername(String username);
    public UserDetails findByFio(String fio);
}

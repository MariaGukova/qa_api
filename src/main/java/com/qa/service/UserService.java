package com.qa.service;

import com.qa.model.Task;
import com.qa.model.Users;
import com.qa.repo.RepoUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private RepoUsers repoUsers;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repoUsers.findByUsername(username);
    }

    public List<Users> findAll(){
        return repoUsers.findAll();
    }

    public Users update(Users user) {
        return repoUsers.save(user);
    }
}

package com.crud_rest.crud.Repo;

import com.crud_rest.crud.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}

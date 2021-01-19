package com.example.FilesFoldersHomeWorkJava.repositories;

import com.example.FilesFoldersHomeWorkJava.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

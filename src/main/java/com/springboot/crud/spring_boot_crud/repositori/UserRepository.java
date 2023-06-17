package com.springboot.crud.spring_boot_crud.repositori;

import com.springboot.crud.spring_boot_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

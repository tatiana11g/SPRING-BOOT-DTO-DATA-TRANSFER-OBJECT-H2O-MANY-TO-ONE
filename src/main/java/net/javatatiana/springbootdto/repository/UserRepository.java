package net.javatatiana.springbootdto.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import net.javatatiana.springbootdto.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
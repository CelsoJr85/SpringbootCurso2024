package com.magnasoftwares.Curso2024.repositories;

import com.magnasoftwares.Curso2024.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

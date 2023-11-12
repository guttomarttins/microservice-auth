package br.com.microservice.statefulauthapi.core.repository;

import br.com.microservice.statefulauthapi.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String username);
}

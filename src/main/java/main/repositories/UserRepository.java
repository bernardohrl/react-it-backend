package main.repositories;

import org.springframework.data.repository.CrudRepository;

import main.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {


}

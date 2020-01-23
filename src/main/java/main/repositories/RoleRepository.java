package main.repositories;

import org.springframework.data.repository.CrudRepository;

import main.models.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {


}

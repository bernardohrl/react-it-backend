package main.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<EndUser, Integer> {


}

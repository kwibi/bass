package md.bass.internship.bootcamp.services;

import md.bass.internship.bootcamp.entities.User;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public interface UsersServiceSave extends CrudRepository<User,Integer> {
    List<User> findAll();
   // User findByName(String fname);
}

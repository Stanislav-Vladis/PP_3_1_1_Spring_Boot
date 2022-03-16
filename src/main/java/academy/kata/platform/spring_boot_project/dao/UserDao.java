package academy.kata.platform.spring_boot_project.dao;

import academy.kata.platform.spring_boot_project.model.User;

import java.util.List;

public interface UserDao {

   void saveOrUpdate(User user);

   void removeUserById(long id);

   List<User> getAllUsers();

}

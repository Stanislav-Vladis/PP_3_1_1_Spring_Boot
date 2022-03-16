package academy.kata.platform.spring_boot_project.service;

import academy.kata.platform.spring_boot_project.model.User;

import java.util.List;

public interface UserService {

    void saveOrUpdate(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

}

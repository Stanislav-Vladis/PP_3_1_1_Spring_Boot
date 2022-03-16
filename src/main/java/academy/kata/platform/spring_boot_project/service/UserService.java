package academy.kata.platform.spring_boot_project.service;

import academy.kata.platform.spring_boot_project.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveOrUpdate(User user);

    void removeUserById(long id);

}

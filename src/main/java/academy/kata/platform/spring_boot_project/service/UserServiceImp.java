package academy.kata.platform.spring_boot_project.service;

import academy.kata.platform.spring_boot_project.dao.UserDao;
import academy.kata.platform.spring_boot_project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;


   @Transactional
   @Override
   public void saveOrUpdate(User user) {
      userDao.saveOrUpdate(user);
   }

   @Transactional
   @Override
   public void removeUserById(long id) {
      userDao.removeUserById(id);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> getAllUsers() {
      return userDao.getAllUsers();
   }

}

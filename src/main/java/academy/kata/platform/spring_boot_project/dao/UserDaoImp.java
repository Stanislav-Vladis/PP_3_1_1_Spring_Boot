package academy.kata.platform.spring_boot_project.dao;

import academy.kata.platform.spring_boot_project.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private EntityManager entityManager;


   @Override
   public void saveOrUpdate(User user) {
      Session session = entityManager.unwrap(Session.class);
      session.saveOrUpdate(user);
   }

   @Override
   public void removeUserById(long id) {
      Session session = entityManager.unwrap(Session.class);
      session.delete(session.get(User.class, id));
   }

   @Override
   public List<User> getAllUsers() {
      Session session = entityManager.unwrap(Session.class);
      TypedQuery<User> query = session.createQuery("FROM User");
      return query.getResultList();
   }

}

package web.dao;

import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
}

package com.joshiSoftware.repo;

import com.joshiSoftware.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findByUserId(String userId);

}

package com.fanpeng.fullstackCRUDspringboottest.repository;

import com.fanpeng.fullstackCRUDspringboottest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}

package com.hjy.hrms.dao;

import com.hjy.hrms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author HJY
 * @date 2020/10/10 10:12
 */
public interface UserDao extends JpaRepository<User,String> {

    /**
     * 根据用户名查找用户
     * @param username 用户名
     * @return User实体
     */
    User findByUserName(String username);
}

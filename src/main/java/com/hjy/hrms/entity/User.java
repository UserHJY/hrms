package com.hjy.hrms.entity;

import com.sun.istack.NotNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author HJY
 * @date 2020/10/9 10:45
 * @Description 用户实体类
 */
@Entity
@Table(name = "sec_user")
public class User implements Serializable, UserDetails {

    // 用户ID
    @Id
    private String ID;
    // 用户名(姓名)
    @NotNull
    private String userName;
    // 密码
    @NotNull
    private String password;
    // 权限
    @NotNull
    private String role;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        List<GrantedAuthority> auths = new ArrayList<>();
        auths.add(new SimpleGrantedAuthority(this.getRole()));
        return auths;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

}

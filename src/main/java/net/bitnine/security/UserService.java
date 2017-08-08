package net.bitnine.security;

import java.util.Optional;

import net.bitnine.entity.User;

/**
 * 
 * @author vladimir.stankovic
 *
 * Aug 17, 2016
 */
public interface UserService {
    public Optional<User> getByUsername(String username);
}

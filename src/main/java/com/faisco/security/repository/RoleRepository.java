package com.faisco.security.repository;

import com.faisco.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lxg
 * on 2017/2/20.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}

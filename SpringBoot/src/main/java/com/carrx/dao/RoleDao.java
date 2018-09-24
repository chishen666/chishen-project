package com.carrx.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

import com.carrx.bean.po.Role;

@Mapper
public interface RoleDao extends JpaRepository<Role, Integer> {

}

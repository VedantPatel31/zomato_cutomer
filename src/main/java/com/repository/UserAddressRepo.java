package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.UserAddress;

public interface UserAddressRepo extends JpaRepository<UserAddress, Integer>{

}

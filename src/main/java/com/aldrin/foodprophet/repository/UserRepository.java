/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aldrin.foodprophet.repository;

import com.aldrin.foodprophet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Java Programming with Aldrin
 */
public interface UserRepository extends JpaRepository<User, Long>{
    
}

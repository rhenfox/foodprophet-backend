/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodprophet.exception;

/**
 *
 * @author Java Programming with Aldrin
 */
public class UserNotFoundException extends RuntimeException{
    
    public UserNotFoundException(Long id){
        super("Could not found the user id"+id);
    }
    
}

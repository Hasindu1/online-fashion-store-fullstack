package com.programmingfoundation.onlinefashionstore.controllers;

import com.programmingfoundation.onlinefashionstore.dto.UserDTO;
import com.programmingfoundation.onlinefashionstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users-api")
public class UserRestController {

    @Autowired
    private UserService userService;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/users")
    public List<UserDTO> getAllproducts(){

        return (userService.findAll());
    }
    @PostMapping("/users")
    public UserDTO saveUserDTO(@RequestBody UserDTO userDTO){

        userService.saveUserDTO(userDTO);
        return userDTO;
    }
    @GetMapping("/users/{id}")
    public UserDTO findById(@PathVariable String id){
        if(userService.findUserDTOById(id) != null){
            return userService.findUserDTOById(id);
        }
        else{
            throw new RuntimeException("User id not found " + id);
        }
    }
    @DeleteMapping("/users/{id}")
    public String DeleteProductById(@PathVariable String id){
        if(userService.findUserDTOById(id) != null){
            userService.deleteUserDTOById(id);
            return "User id: " + id + "Successfully deleted " ;
        }
        else{
            return  "User not available ";
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/users")
    public UserDTO updateUserDTO(@RequestBody UserDTO userDTO){
        userService.saveUserDTO(userDTO);
        return userDTO;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/users-validation")
    public UserDTO validateUserDTO(@RequestBody UserDTO userDTO){
        System.out.println("This is" + userDTO);
        List<UserDTO> tempUserDTOList =userService.findAll();
        for(UserDTO tempUserDTO : tempUserDTOList){
            if(tempUserDTO.getUserName().equalsIgnoreCase(userDTO.getUserName()) && tempUserDTO.getPassword().equalsIgnoreCase(userDTO.getPassword()) ){
                System.out.println("out put is" +tempUserDTO);
                return tempUserDTO;

            }

        }

        return null;

    }
}

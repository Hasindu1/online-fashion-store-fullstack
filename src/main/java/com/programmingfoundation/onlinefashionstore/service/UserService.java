package com.programmingfoundation.onlinefashionstore.service;

import com.programmingfoundation.onlinefashionstore.dto.UserDTO;

import java.util.List;

public interface UserService {
    public List<UserDTO> findAll();
    public void saveUserDTO(UserDTO userDTO);
    public UserDTO findUserDTOById(String id);
    public void deleteUserDTOById(String id);
}

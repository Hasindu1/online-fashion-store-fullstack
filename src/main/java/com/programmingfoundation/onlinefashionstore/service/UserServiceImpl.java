package com.programmingfoundation.onlinefashionstore.service;

import com.programmingfoundation.onlinefashionstore.dao.UserDAO;
import com.programmingfoundation.onlinefashionstore.dto.UserDTO;
import com.programmingfoundation.onlinefashionstore.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    public List<UserDTO> findAll() {
        List<User>tempUserList = userDAO.findAll();
        List<UserDTO> tempUserDTOList = new ArrayList<UserDTO>();
        for(User tempUser : tempUserList){
            tempUserDTOList.add(new UserDTO(tempUser.getId(),tempUser.getUserName(),tempUser.getPassword(),tempUser.getCart(),tempUser.getWishList()));

        }
        return tempUserDTOList;
    }

    @Override
    public void saveUserDTO(UserDTO userDTO) {
        userDAO.save(new User(userDTO.getId(),userDTO.getUserName(),userDTO.getPassword(),userDTO.getCart(),userDTO.getWishList()));
    }

    @Override
    public UserDTO findUserDTOById(String id) {
        Optional<User> tempUser = userDAO.findById(id);
        return new UserDTO(tempUser.get().getId(),tempUser.get().getUserName(),tempUser.get().getPassword(),tempUser.get().getCart(),tempUser.get().getWishList());

    }

    @Override
    public void deleteUserDTOById(String id) {
        userDAO.deleteById(id);

    }
}

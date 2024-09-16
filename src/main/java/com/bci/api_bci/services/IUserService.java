package com.bci.api_bci.services;

import com.bci.api_bci.dto.UserDTO;
import com.bci.api_bci.entity.User;

import java.util.List;

public interface IUserService {
    UserDTO create(User user) throws ServiceException;
}

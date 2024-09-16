package com.bci.api_bci.services;

import com.bci.api_bci.dto.UserDTO;
import com.bci.api_bci.entity.User;
import com.bci.api_bci.mapper.UserMapper;
import com.bci.api_bci.repository.IUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    static final String EMAIL_REGEX = "^[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,5}$";
    private final IUserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(IUserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO create(User user) throws ServiceException {
        try {
            if (!this.isValid(user.getEmail())) {
                throw new ServiceException("El campo email no tiene un formato correcto");
            }

            User response = this.userRepository.findByEmail(user.getEmail());

            if (response!= null) {
                throw new ServiceException("El correo ya está registrado");
            }

            Date date = new Date();
            user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
            user.setCreated(date);
            user.setModified(date);
            user.setLastLogin(date);
            user.setToken(UUID.randomUUID().toString());
            user.setActive(true);

            User user1 = this.userRepository.save(user);
            return this.userMapper.toDTO(user1);

        } catch (Exception e) {
            log.error(e.getMessage());
            throw new ServiceException(e.getMessage());
        }
    }

    boolean isValid(String email) {
        return email != null && email.matches(EMAIL_REGEX);
    }
}

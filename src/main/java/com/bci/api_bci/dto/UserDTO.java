package com.bci.api_bci.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private UUID id;
    private String name;
    private String email;
    private Date created;
    private Date modified;
    private Date lastLogin;
    private String token;
    private boolean isActive;
}

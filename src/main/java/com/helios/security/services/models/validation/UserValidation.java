package com.helios.security.services.models.validation;

import com.helios.security.persistence.entities.UserEntity;
import com.helios.security.services.models.dtos.ResponseDTO;

public class UserValidation {
    public ResponseDTO validate(UserEntity user) {
        ResponseDTO response = new ResponseDTO();

        response.setNumOfErrors(0);

        if(user.getFirstName() == null || user.getFirstName().length() < 3 || user.getFirstName().length() > 50) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("First name must be between 3 and 50 characters");
        }

        if(user.getLastName() == null || user.getLastName().length() < 3 || user.getLastName().length() > 50) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Last name must be between 3 and 50 characters");
        }

        if(user.getEmail() == null || user.getEmail().length() < 3 || user.getEmail().length() > 50) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Email must be between 3 and 50 characters and must be a valid email address");
        }
        return response;
    }
}

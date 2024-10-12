package com.helios.security.services.models.validation;

import com.helios.security.persistence.entities.UserEntity;
import com.helios.security.services.models.dtos.ResponseDTO;

public class UserValidation {
    public ResponseDTO validate(UserEntity user) {
        ResponseDTO response = new ResponseDTO();

        response.setNumOfErrors(0);

        if (user.getFirstName() == null || user.getFirstName().length() < 3 || user.getFirstName().length() > 50) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("First name must be between 3 and 50 characters");
        }

        if (user.getLastName() == null || user.getLastName().length() < 3 || user.getLastName().length() > 50) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Last name must be between 3 and 50 characters");
        }

        if (user.getEmail() == null || user.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage("Email must be a valid email address");
        }

        if (user.getPassword() == null
                || user.getPassword().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@#$%^&+=]).{8,}$")) {
            response.setNumOfErrors(response.getNumOfErrors() + 1);
            response.setMessage(
                    "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one number and one special character");
        }
        return response;
    }
}

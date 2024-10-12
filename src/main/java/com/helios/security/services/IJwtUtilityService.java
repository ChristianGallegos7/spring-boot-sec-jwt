package com.helios.security.services;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import com.nimbusds.jose.JOSEException;

public interface IJwtUtilityService {
    public String generateJWT(Long userId)
            throws NoSuchAlgorithmException, InvalidKeySpecException, IOException, JOSEException;
}

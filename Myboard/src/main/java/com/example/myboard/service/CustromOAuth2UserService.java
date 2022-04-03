package com.example.myboard.service;

import com.example.myboard.domain.User;
import com.example.myboard.dto.OAuthAttributes;

public class CustromOAuth2UserService {

    private User saveOrUpate(OAuthAttributes attributes){

        User user = userRepository.findByEmail(attributes.getEmail())
                .map(entity -> entity.update(attributes.getName(), attributes.getPicture()))
                .orElse(attributes.toEntity());

        return userRepository.save(user);

    }

}

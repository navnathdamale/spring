package com.springmicro.userservice.service;

import com.springmicro.userservice.dto.Department;
import com.springmicro.userservice.dto.ResponseTemplateDTO;
import com.springmicro.userservice.entity.User;
import com.springmicro.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateDTO getUserWithDepartment(Long userId) {
        ResponseTemplateDTO responseTemplateDTO = new ResponseTemplateDTO();
        User user = userRepository.findById(userId).get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDeptId(), Department.class);
        responseTemplateDTO.setUser(user);
        responseTemplateDTO.setDepartment(department);
        return responseTemplateDTO;
    }
}

package com.springmicro.userservice.dto;

import com.springmicro.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateDTO {

    private User user;
    private Department department;
}

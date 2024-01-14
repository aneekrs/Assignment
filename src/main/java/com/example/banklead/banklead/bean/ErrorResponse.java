package com.example.banklead.banklead.bean;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse{
    public String code;
    public List<String> messages;
}
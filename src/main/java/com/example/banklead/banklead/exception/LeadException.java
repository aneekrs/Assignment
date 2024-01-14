package com.example.banklead.banklead.exception;

import com.example.banklead.banklead.bean.ErrorResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeadException extends RuntimeException {
    private String status;
    private ErrorResponse errorResponse;
}
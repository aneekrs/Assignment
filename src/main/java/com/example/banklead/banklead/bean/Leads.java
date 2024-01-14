package com.example.banklead.banklead.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "leads")
public class Leads {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    public int leadId;

    @NotNull(message= "lead Id may not be empty")
    @Pattern(regexp="^[a-zA-Z]+$",message="Username must be alphabetic with no spaces")
    public String firstName;

    @Pattern(regexp="^[a-zA-Z]+$",message="Username must be alphabetic with no spaces")
    public String middleName;

    @NotNull(message= "lead Id may not be empty")
    @Pattern(regexp="^[a-zA-Z]+$",message="Username must be alphabetic with no spaces")
    public String lastName;

    @NotNull(message= "mobile number may not be empty")
    @Pattern(regexp="^[5-9][0-9]{9}$",message="only numbers")
    public int mobileNumber;

    @Pattern(regexp="^(Male|Female|Others)$",message="invalid value")
    @JsonProperty("Gender")
    public String gender;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("DOB")
    public String dob;

    @Pattern(regexp="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,}$",message="inavlid mail or format")
    public String email;

    @Override
    public String toString() {
        return super.toString();
    }
}
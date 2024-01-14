package com.example.banklead.banklead.controller;

import com.example.banklead.banklead.bean.ErrorResponse;
import com.example.banklead.banklead.bean.Leads;
import com.example.banklead.banklead.exception.LeadException;
import com.example.banklead.banklead.service.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LeadsController{

    @Autowired
    LeadService leadService;

    @PostMapping("/savelead")
    public ResponseEntity<Leads> createLead(@RequestBody Leads leads){
        try {
            Leads savedleads = leadService.createLead(leads);
            return new ResponseEntity<>(savedleads, HttpStatus.CREATED);
        }catch(Exception e){
            ErrorResponse error = new ErrorResponse();
            error.setCode("E10010");
            List<String> msg = new ArrayList<>();
            msg.add("Lead Already Exists in the database with the lead id");
            error.setMessages(msg);
            throw new LeadException("error", error);
        }
    }

    @GetMapping("/leads/{mobileNo}")
    public Leads getLead(@PathVariable("mobileNo") int mobileNo)
    {
        try {
            return leadService.getLeads(mobileNo);
        } catch (Exception e) {
            ErrorResponse error = new ErrorResponse();
            error.setCode("E10011");
            List<String> msg = new ArrayList<>();
            msg.add("No Lead found with the Mobile Number");
            error.setMessages(msg);
            throw new LeadException("error", error);
        }
    }
}
package com.example.banklead.banklead.service;
import com.example.banklead.banklead.bean.ErrorResponse;
import com.example.banklead.banklead.bean.Leads;
import com.example.banklead.banklead.exception.LeadException;
import com.example.banklead.banklead.repository.LeadsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {

    @Autowired
    LeadsRepository leadsRepository;

    public Leads createLead(Leads leads) {
        try {
            return leadsRepository.save(leads);
        }
        catch(Exception e){
            throw e;
        }
    }

    public Leads getLeads(int mobileNo){
        try {
            return leadsRepository.findByMobileNumber(mobileNo);
        }catch(Exception e) {
            throw e;
        }
    }
}
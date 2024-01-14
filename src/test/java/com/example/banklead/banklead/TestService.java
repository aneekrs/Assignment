package com.example.banklead.banklead;

import com.example.banklead.banklead.bean.Leads;
import com.example.banklead.banklead.controller.LeadsController;
import com.example.banklead.banklead.repository.LeadsRepository;
import com.example.banklead.banklead.service.LeadService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestService {
    @InjectMocks
    LeadService service;

    @Mock
    LeadsRepository leadsRepository;


    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateLead(){
        Leads leads = new Leads();
        leads.setLeadId(1233);
        leads.setFirstName("ashwin");
        Mockito.when(leadsRepository.save(Mockito.any())).thenReturn(leads);
        service.createLead(leads);
    }

    @Test
    public void testGetLeads(){
        Leads leads = new Leads();
        leads.setLeadId(1233);
        leads.setFirstName("ashwin");
        Mockito.when(leadsRepository.findByMobileNumber(Mockito.anyInt())).thenReturn(leads);
        service.getLeads(918299991);
    }
}
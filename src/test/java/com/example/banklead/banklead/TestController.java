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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestController {

    @Mock
    LeadService service;

    @Mock
    LeadsRepository leadsRepository;

    @InjectMocks
    LeadsController controller;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateLead(){
        Leads leads = new Leads();
        leads.setLeadId(123);
        leads.setFirstName("happy");
        Mockito.when(service.createLead(Mockito.any())).thenReturn(leads);
        controller.createLead(leads);
    }

    @Test
    public void testGetLeads(){
        Leads leads = new Leads();
        leads.setLeadId(123);
        leads.setFirstName("happy");
        Mockito.when(service.getLeads(Mockito.anyInt())).thenReturn(leads);
        controller.getLead(908657890);
    }
}

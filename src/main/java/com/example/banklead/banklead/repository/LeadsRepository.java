package com.example.banklead.banklead.repository;

import com.example.banklead.banklead.bean.Leads;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadsRepository extends CrudRepository<Leads, Integer> {
    Leads findByMobileNumber(int mobileNumber);
}
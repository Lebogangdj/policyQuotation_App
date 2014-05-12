/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livhuwani.rambuda.policyquotation_app.service.Impl;

import com.livhuwani.rambuda.policyquotation_app.domain.ChildMaintenance;
import com.livhuwani.rambuda.policyquotation_app.repository.ChildMaintenanceRepository;
import com.livhuwani.rambuda.policyquotation_app.service.Crud.ChildMaintenanceCrudService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DeeJayMD
 */

@Service
public class ChildMaintenanceCrudServiceImpl implements ChildMaintenanceCrudService
{
    @Autowired
    private ChildMaintenanceRepository childMaintenanceRepository;
    
    @Override
    public ChildMaintenance createChildMaintenance() 
    {
        ChildMaintenance newChildMaintenance = new ChildMaintenance();
        newChildMaintenance.setId(Long.MAX_VALUE+1);
        newChildMaintenance.setAnnualIncreasePercentage(50);
        newChildMaintenance.setCashValue(BigDecimal.valueOf(2500));
        newChildMaintenance.setTerm(60);
        
        ChildMaintenance savedChildMaintenance = childMaintenanceRepository.saveAndFlush(newChildMaintenance);
        return savedChildMaintenance;
    }
}

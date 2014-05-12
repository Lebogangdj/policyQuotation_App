/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livhuwani.rambuda.policyquotation_app.service.Impl;

import com.livhuwani.rambuda.policyquotation_app.domain.BusinessInterest;
import com.livhuwani.rambuda.policyquotation_app.repository.BusinessInterestRepository;
import com.livhuwani.rambuda.policyquotation_app.service.Crud.BusinessInterestCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DeeJayMD
 */
@Service
public class BusinessInterestCrudServiceImpl implements BusinessInterestCrudService
{
    @Autowired
    private BusinessInterestRepository businessInterestRepository;

    @Override
    public BusinessInterest createBusinessInterest() 
    {
        BusinessInterest newBusinessInterest = new BusinessInterest();
        newBusinessInterest.setId(Long.MAX_VALUE+1);
        newBusinessInterest.setBusniessType("Private Company");
        newBusinessInterest.setRegisteredName("MD Corperations SA");
        
        BusinessInterest savedBusiness = businessInterestRepository.saveAndFlush(newBusinessInterest);
        return savedBusiness;
    }
}

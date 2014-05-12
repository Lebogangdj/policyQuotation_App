/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livhuwani.rambuda.policyquotation_app.service.Crud;

import java.util.List;
import com.livhuwani.rambuda.policyquotation_app.domain.BusinessInterest;
import com.livhuwani.rambuda.policyquotation_app.domain.ChildMaintenance;
import com.livhuwani.rambuda.policyquotation_app.domain.InsuranceDetails;
import com.livhuwani.rambuda.policyquotation_app.domain.Investment;
import com.livhuwani.rambuda.policyquotation_app.domain.Policy;
import com.livhuwani.rambuda.policyquotation_app.domain.PolicyType;

/**
 *
 * @author E939964
 */
public interface PolicyCrudService
{
    public Policy createBusinessPolicy(BusinessInterest type);
    
    public List<Policy> getAllBusinessPolicy(PolicyType type);
    
    public Policy createInsurancePolicy(InsuranceDetails type);
    
    public List<Policy> getAllInsurancePolicy(PolicyType type);
    
    public Policy createInvestmentPolicy(Investment type);
    
    public List<Policy> getAllIvestmentPolicy(PolicyType type);
    
    public Policy createChildMaintenancePolicy(ChildMaintenance type);
    
    public List<Policy> getAllMaintenancePolicy(PolicyType type);
    
}

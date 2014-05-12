/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livhuwani.rambuda.policyquotation_app.service.Impl;

import com.livhuwani.rambuda.policyquotation_app.domain.Person;
import com.livhuwani.rambuda.policyquotation_app.domain.Policy;
import com.livhuwani.rambuda.policyquotation_app.domain.PolicyQuote;
import com.livhuwani.rambuda.policyquotation_app.repository.PolicyQuoteRepository;
import com.livhuwani.rambuda.policyquotation_app.service.Crud.PolicyQuoteCrudService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DeeJayMD
 */

@Service
public class PolicyQuoteCrudServiceImpl implements PolicyQuoteCrudService
{
    @Autowired
    private PolicyQuoteRepository policyQuoteRepository;
    
    @Override
    public PolicyQuote createPolicyQuotes(Person person, Policy policy) 
    {
        PolicyQuote quote = new PolicyQuote();
        quote.setId(Long.MAX_VALUE+1);
        quote.setPerson(person);
        quote.setPolicy(policy);
        quote.setQuoteAmount(BigDecimal.valueOf(3200));
        quote.setQuoteStatus(Boolean.TRUE);
        quote.setQuoteDate(new Date());
        
        PolicyQuote savedQuote = policyQuoteRepository.saveAndFlush(quote);
        return savedQuote;
    }

    @Override
    public List<PolicyQuote> getAllPolicyQuotes(Person person) 
    {
        List<PolicyQuote> quotes = new ArrayList<PolicyQuote>();
        List<PolicyQuote> allQuotes= policyQuoteRepository.findAll();
        
        for(PolicyQuote quote : allQuotes)
        {
            if(quote.getPerson() == person)
            {
                quotes.add(quote);
            }
        }
        return quotes;
    }
}

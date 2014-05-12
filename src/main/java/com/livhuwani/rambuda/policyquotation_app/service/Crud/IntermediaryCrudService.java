/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livhuwani.rambuda.policyquotation_app.service.Crud;

import java.util.List;
import com.livhuwani.rambuda.policyquotation_app.domain.Intermediary;

/**
 *
 * @author E939964
 */
public interface IntermediaryCrudService
{
    public Intermediary createIntermediary();
    
    public List<Intermediary> getIntermediaries();
    
    public Intermediary updateIntermediary(Long id);
    
    public void deleteIntermediary(Long id);
}

/* File: Contact.java
 * This entity class will hold all the information required for a complete contact record
 * Creator: Livhuwani Lucky Rambuda
 * Date created: 03 May 2014
 */

package com.livhuwani.rambuda.policyquotation_app.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author DeejayMD
 */
@Embeddable
public class Contact implements Serializable
{
    private String phoneNumber;
    
    private String cellNumber;

    public String getContactNumber() 
    {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) 
    {
        this.cellNumber = cellNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }
}

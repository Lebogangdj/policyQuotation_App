/* File: Person.java
 * This entity class will hold all the information required for a complete person record
 * Creator: Livhuwani Lucky Rambuda
 * Date created: 03 May 2014
 */

package com.livhuwani.rambuda.policyquotation_app.domain;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author DeejayMD
 */
@Entity
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    private String sname;
    
    @OneToOne
    private Intermediary user;
    
    private String memberNumber;
    
    @Embedded
    private Contact contact;
    
    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }
    
     public String getName() 
     {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
     public String getSName() 
     {
        return sname;
    }

    public void setSName(String sname)
    {
        this.sname = sname;
    }
    
    public Intermediary getUser() 
    {
        return user;
    }

    public void setUser(Intermediary user) 
    {
        this.user = user;
    }
    
    public String getMemberNumber() 
    {
        return memberNumber;
    }

    public void setMemberNumber(String memberNumber) 
    {
        this.memberNumber = memberNumber;
    }
    
    public Contact getContact() 
    {
        return contact;
    }

    public void setContact(Contact contact) 
    {
        this.contact = contact;
    }
    
    @Override
    public int hashCode() 
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) 
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) 
        {
            return false;
        }
        Person other = (Person) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "com.livhuwani.rambuda.policyquotation_app.domain.Person[ id=" + id + " ]";
    }
    
}

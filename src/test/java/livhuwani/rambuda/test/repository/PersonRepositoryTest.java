/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livhuwani.rambuda.test.repository;


import com.livhuwani.rambuda.policyquotation_app.app.conf.ConnectionConfig;
import com.livhuwani.rambuda.policyquotation_app.domain.Intermediary;
import com.livhuwani.rambuda.policyquotation_app.domain.Person;
import com.livhuwani.rambuda.policyquotation_app.repository.IntermediaryRepository;
import com.livhuwani.rambuda.policyquotation_app.repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DeeJayMD
 */
public class PersonRepositoryTest 
{
    public static ApplicationContext ctx;
    private Long id;
    private Intermediary intermediary;
    private PersonRepository personRepo;
    private IntermediaryRepository userRepo;
    
    public PersonRepositoryTest() 
    {
    }
    
    @Test
    public void CreateUser()
    {
         //Save Intermediary
        userRepo = ctx.getBean(IntermediaryRepository.class);
        Intermediary user = new Intermediary();
        user.setId(Long.MAX_VALUE+1);
        user.setIntermediaryCode("E939964");
        intermediary = user;
        userRepo.saveAndFlush(intermediary);
        
        id = intermediary.getId();
        Assert.notNull(id);
    }
    
    @Test(dependsOnMethods = "CreateUser")
    public void SavePerson() 
    {
        //Intermediary Creates a Person
        personRepo = ctx.getBean(PersonRepository.class);
        Person cust = new Person();
        cust.setName("Livhuwani");
        cust.setSName("Rambuda");
        cust.setMemberNumber("208224262");
        cust.setUser(intermediary);
        personRepo.saveAndFlush(cust);
        
        id = cust.getId();
        Assert.notNull(id);
     }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception 
    {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception 
    {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception 
    {
    }
}

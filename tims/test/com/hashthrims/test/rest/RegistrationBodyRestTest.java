/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hashthrims.test.rest;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.hashthrims.domain.offices.RegistrationBody;
import com.hashthrims.application.webservices.rest.resources.hashthrims.util.RegistrationBodyForm;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author stud
 */
public class RegistrationBodyRestTest {

    public RegistrationBodyRestTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        WebClient client = WebClient.create("http://localhost:8084/registrationBody/ws/registrationBodyservice/");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
   public void readRegistrationBody()
   {
      WebClient client = WebClient.create("http://localhost:8084/registrationBody/ws/registrationBodyservice/");

      RegistrationBody registrationBody = client.path("registrationBody/1770").accept("application/xml").get(RegistrationBody.class);
      Assert.assertNotNull(registrationBody);
   }

   @Test
   public void updateRegistrationBody()
   {
     WebClient client = WebClient.create("http://localhost:8084/registrationBody/ws/registrationBodyservice/");
     RegistrationBody registrationBody = client.path("PATH/1770").accept("application/xml").get(RegistrationBody.class);

     client.back(true);
     client.path("/PATH/update");
     client.put(registrationBody);
     client.back(true);

    RegistrationBody newRegistrationBody = client.path("PATH/1770").accept("application/xml").get(RegistrationBody.class);

   }
   public void testCreateRegistrationBody()
   {
    WebClient client = WebClient.create("http://localhost:8084/hashpay/registrationBodyservice/");
    client.path("PATH");
    RegistrationBodyForm pf = new RegistrationBodyForm();



    client.post(pf);
    client.back(true);


   }
   public void printRegistrationBody()
   {
     WebClient client = WebClient.create("http://localhost:8084/hashpay/registrationBodyservice/");
     RegistrationBodyForm pf = new RegistrationBodyForm();


   }



}
package com.util;
import java.util.List;

import com.Email.EmailApp.GEMailSender;
import com.model.Ticket;
public class RoutingTickets {

	public static void routeGeneratedTickets(List<Ticket> t)
	{
		for(Ticket t1:t)
    	{
    		if(t1.getIncident_description().equals("Database_corruption"))
    		{
    	
        GEMailSender mail=new GEMailSender();
        String from="surajsinghchauhan636@gmail.com";
        String to="surajsinghchauhan636@gmail.com";
        String sub="New incident happen for DATABASE CORRUPTION";
       boolean b= mail.sendEmail(to,from,sub, t1);
       if(b)
       {
    	   System.out.println("Mail sent to Reporting Team successfully.");
       }
       else
       {
    	   System.out.println("there is a problem sending email to Reporting Team");
       }
    		}
    		
    		/////////////////////////////////////////////////////////////////////////////
    		
    		if(t1.getIncident_description().equals("Server_crash"))
    		{
    	
   	
    	
        GEMailSender mail=new GEMailSender();
        String from="surajsinghchauhan636@gmail.com";
       
        String to="surajsinghchauhan636@gmail.com";
        String sub="New incident happen for SERVER CRASH";
      
       boolean b= mail.sendEmail(to,from,sub, t1);
       if(b)
       {
    	   System.out.println("mail sent to Server  Team successfully");
       }
       else
       {
    	   System.out.println("there is a problem sending email to Access Issue Team");
       }
    		}
    		//////////////////////////////////////////////////////////////////////////////////////
    		if(t1.getIncident_description().equals("Network_outage"))
    		{
    	
   	
    	
        GEMailSender mail=new GEMailSender();
        String from="surajsinghchauhan636@gmail.com";
       
        String to="surajsinghchauhan636@gmail.com";
        String sub="New incident happen of NETWORK OUTAGE";
      
       boolean b= mail.sendEmail(to,from,sub, t1);
       if(b)
       {
    	   System.out.println("Mail sent to Network Team successfully");
       }
       else
       {
    	   System.out.println("there is a problem sending email to Access Issue Team");
       }
    		}
    		//////////////////////////////////////////////////////////////////////////////////////
    		if(t1.getIncident_description().equals("Security_breach"))
    		{
    	
   	
    	
        GEMailSender mail=new GEMailSender();
        String from="surajsinghchauhan636@gmail.com";
       
        String to="surajsinghchauhan636@gmail.com";
        String sub="New incident reported for SECURITY_BREACH";
      
       boolean b= mail.sendEmail(to,from,sub, t1);
       if(b)
       {
    	   System.out.println("Mail sent to Security  Team successfully");
       }
       else
       {
    	   System.out.println("there is a problem sending email to Access Issue Team");
       }
    		}
    		//////////////////////////////////////////////////////////////////////////////////////
    		
    	
    		
    }
    	
    	 
		
	}

}

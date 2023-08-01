package com.util;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.exception.InvalidTicketException;
import com.model.Ticket;
public class Util 
{
	public List<Ticket> findSeverity(List<Ticket> ticketList)
	{
		
		for(Ticket t:ticketList)
		{
            
			if(t.getIncident_description().equals("Database_corruption"))
			{
				t.setSeverity("Mid");
				
			}
			else if(t.getIncident_description().equals("Network_outage"))
			{
				t.setSeverity("High");
			}
			else if(t.getIncident_description().equals("Security_breach"))
			{
				t.setSeverity("Mid");
			}
			else if(t.getIncident_description().equals("Server_crash"))
			{
				t.setSeverity("High");
			}
		}
		return ticketList;
	}

public 	List<Ticket> readFile(String inputfeed)
	{
	List<Ticket> ticketlist = new ArrayList();
	FileInputStream inputStream = null;
	BufferedReader bufferedReader = null;
	try {
	if (inputfeed != null) {
		
			inputStream = new FileInputStream(inputfeed);
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String strline;
			boolean eligible=false;
			while ((strline = bufferedReader.readLine()) != null) {
				String[] fields = strline.split(",");;
		
				Ticket t=new Ticket(fields[0],fields[1],fields[2],"");
				ticketlist.add(t);
			
			
			}
		}
	}
	catch(Exception  e)
	{
		System.out.println(e);
	}
	
	return findSeverity(ticketlist);
	
	}
	

public boolean validateTicketType(String s) throws InvalidTicketException
{
	if((s.equals("Database_corruption"))||s.equals("Database_corruption" )||s.equals("Database_corruption")||s.equals("Database_corruption"))
	{
		return true;
	}
	else
	{
		throw new InvalidTicketException("Invalid Ticket");
	}
}
}

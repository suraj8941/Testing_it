package com.Email.EmailApp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.model.Ticket;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class server_ms {
	public List<Ticket> give_response() {
		List<Ticket> tickets = null;
		
		try {
            URL Url = new URL("http://localhost:7200/ticket/getTickets");
            HttpURLConnection con = (HttpURLConnection) Url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
                       
           inputLine = in.readLine();
           System.out.println(inputLine);  
           ObjectMapper mapper = new ObjectMapper();
           JsonNode rootNode = mapper.readTree(inputLine);
           tickets = mapper.convertValue(rootNode, new TypeReference<List<Ticket>>(){});
           in.close();

            // Print the response
           
        } catch (Exception e) {
            e.printStackTrace();
        }


		return tickets;
	}

}

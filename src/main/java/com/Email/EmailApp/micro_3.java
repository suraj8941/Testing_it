package com.Email.EmailApp;
import java.net.HttpURLConnection;
import java.net.URL;
import com.model.Ticket;
import java.util.List;
public class micro_3{
		public int final_call() {
			
			
			try {
	            URL Url = new URL("http://localhost:7202/tickets");
	            HttpURLConnection con = (HttpURLConnection) Url.openConnection();
	            con.setRequestMethod("GET");
	            int responseCode = con.getResponseCode();
	            System.out.println("Response Code for micro3: " + responseCode);
	           

	            // Print the response
	           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


			return 1;
		}

	}


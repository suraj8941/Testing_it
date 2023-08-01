package com.Email.EmailApp;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Ticket;
import java.util.List;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;

public class micro2{
		public List<Ticket> tech_assign(List<Ticket> ticketList) throws ClientProtocolException, IOException {
			List<Ticket> tickets = ticketList;
			CloseableHttpClient httpClient = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost("http://localhost:7201/tickets");
			httpPost.setHeader("Content-type", "application/json");
			StringEntity stringEntity = new StringEntity(new ObjectMapper().writeValueAsString(tickets));
			httpPost.setEntity(stringEntity);
			CloseableHttpResponse response = httpClient.execute(httpPost);
			System.out.println("Response Code for micro2: " + response);
			return tickets;
		}

	}




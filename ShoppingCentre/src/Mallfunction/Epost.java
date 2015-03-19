/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mallfunction;

/**
 *
 * @author ChristianWinther
 */
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import static javax.swing.JOptionPane.*;
 
public class Epost {
 
	public static void main(String[] args) {
 
		final String username = "mallfunction.customer.service@gmail.com";
		final String password = "Mallfunction123";
		
		//Reading data from customer service agent
		String spm = showInputDialog("What would you like to know?");
		String emne = showInputDialog("Set the subject");
		String svar = showInputDialog("Write the main text");
		String mottaker = showInputDialog("Which email would you like to send to?");
		
		
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
 
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("mallfunction.customer.service@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(mottaker));
			message.setSubject(emne);
			message.setText("Dear Customer,"
				+ "\n\nThanks for your inquiry. \n\nQuestion asked: " + spm + "\n\nAnswer: " + svar + "\n\nWe wish you a great day. \n\nWith best regards,\nThe Mallfunction Team\nCustomer Service Department");
 
			Transport.send(message);
 
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
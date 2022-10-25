package com.siscondo.controller;

import java.util.Properties;  
import javax.mail.*;  
import javax.mail.internet.*; 

public class EmailController {
    
    //public static void main(String[] args) { 
        
    public void enviaEmail(EmailController email) {
        
        String host="smtp.terra.com.br";  
        final String user="condominio.siscondo@terra.com.br";
        final String password="A3@araujosc";  
          
        String to="anamariasilva.email@gmail.com";
        
         //Get the session object  
         Properties props = new Properties();  
         props.put("mail.smtp.host",host);  
         props.put("mail.smtp.auth", "true");
         props.put("mail.smtp.port", "587"); 
         props.put("mail.debug", "true");         
              
         //getDefaultInstance
         Session session = Session.getInstance(props,  
          new javax.mail.Authenticator() {  
            protected PasswordAuthentication getPasswordAuthentication() {  
          return new PasswordAuthentication(user,password);  
            }  
          });  
        
         //Compose the message  
          try {  
           MimeMessage message = new MimeMessage(session);  
           message.setFrom(new InternetAddress(user));  
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
           message.setSubject("SisCondo");  
           message.setText("Encomenda disponível na mensageria\n\nSisCondo | Grupo Condomínio\ncondominio.siscondo@terra.com.br");  
             
          //send the message  
           Transport.send(message);  
        
           System.out.println("message sent successfully...");  
         
           } catch (MessagingException e) {e.printStackTrace();}  
       }  

}

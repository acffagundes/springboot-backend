package com.ana.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.ana.cursomc.domain.Cliente;
import com.ana.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}

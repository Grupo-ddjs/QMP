class Usuario {

	List<Guardarropa> guardarropas;
	List<Atuendos> sugerencias;
	String mail;
	NotificationService notificationService;
	MailSenderService mailSender;
	
	void recibirSugerencia(Atuendo atuendo){
		sugerencias.add(atuendo);
	}
	
	void notificar(String clima) {
		if (clima == "STORM")
			notificationService.notify("Llueve de arriba para abajo");
		else if (clima == "HAIL")
			notificationService.notify("Guarda el auto que caen piedras");
	}
	
	void enviarMail(String clima) {
		mailSender.send(address,message)
	}

}
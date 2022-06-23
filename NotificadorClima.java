interface NotificadorDeClimas {

	void actualizar(List<String> climas);
	void desuscribirse(Usuario user);
	void suscribirse(Usuario user);

}

class ActualizadorDeSugerencias implements NotificadorDeClimas {}

class NotificadorDeTormena implements NotificadorDeClimas {}

class NotificadorDeGranizo implements NotificadorDeClimas {}

class Mailer implements NotificadorDeClimas {}
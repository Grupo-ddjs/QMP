class Usuario {

	List<Guardarropa> guardarropas;
	List<Atuendos> sugerencias;
	
	void recibirSugerencia(Atuendo atuendo){
		sugerencias.add(atuendo);
	}

}
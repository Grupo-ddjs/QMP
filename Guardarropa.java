class Guardarropa {

	Criterio criterio; // Entre casa, para salir, etc
	ListaDePrendas prendas;
	ListaDePropuestas propuestas;
	
	ListaDePrendas getPrendas() {
		return this.prendas;
	}
	
	Prenda prendaRandomDe(Categoria unaCategoria, int unaTemperatura) {
		return prendasDisponibles(unaTemperatura).filter(unaPrenda -> unaPrenda.esDeCategoria(unaCategoria)).random(); 
		//El mensaje "random()" te devuelve un item random de la lista
	}
	
	ListaDePrendas prendasDisponibles(int unaTemperatura) {
		return prendas.filter(unaPrenda -> unaPrenda.aptaParaTemperatura(unaTemperatura)).random());
	}
  
	Atuendo generarSugerencia() { // Punto 2 de entrega 4
		return new Atuendo(prendaRandomDe(PARTE_SUPERIOR), prendaRandomDe(PARTE_INFERIOR), prendaRandomDe(CALZADO), prendaRandomDe(ACCESORIOS));
	}
	
	void agregarPrenda(Prenda prenda) {
		prendas.add(prenda)
	}
	
	void quitarPrenda(Prenda prenda) {
		prendas.quitar(prenda)
	}
	
	void aceptarPropuesta(Propuesta unaPropuesta) {
		unaPropuesta.aceptar(this);
		unaPropuesta.estado = Estado.ACEPTADA;
	}
	
	void deshacerPropuesta(Propuesta unaPropuesta) {
		if (unaPropuesta.estado == Estado.ACEPTADA) {
			unaPropuesta.aceptar(this);
		}
	}
	
	void recibirPropuesta(Propuesta unaPropuesta) {
		propuestas.add(unaPropuesta);
	}

}



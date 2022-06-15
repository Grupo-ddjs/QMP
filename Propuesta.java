
public abstract Propuesta {
	Estado estado;
	abstract void confirmar(Guardarropa unGuardarropa);
	abstract void deshacer(Guardarropa unGuardarropa);
	
}

class Agregar extends Propuesta {
	Prenda unaPrenda;
	
	void confirmar(Guardarropa unGuardarropa) {
		unGuardarropa.agregarPrenda(unaPrenda);
	}
	
	void deshacer(Guardarropa unGuardarropa) {
		unGuardarropa.quitarPrenda(unaPrenda);
	}

}

class Quitar extends Propuesta {
	Prenda unaPrenda;
	
	void confirmar(Guardarropa unGuardarropa) {
		unGuardarropa.quitarPrenda(unaPrenda);
	}

	void deshacer(Guardarropa unGuardarropa) {
		unGuardarropa.agregarPrenda(unaPrenda);
	}

}
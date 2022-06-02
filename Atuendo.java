class Atuendo {
	
	ListaDePrendas prendas;
	
	Atuendo(Prenda prenda1, Prenda prenda2, Prenda prenda3, Prenda prenda4) {
		this.agregarPrenda(prenda1);
		this.agregarPrenda(prenda2);
		this.agregarPrenda(prenda3);
		this.agregarPrenda(prenda4);
	}
	
	void agregarPrenda(Prenda unaPrenda) {
		prendas.add(unaPrenda);
	}
	
}
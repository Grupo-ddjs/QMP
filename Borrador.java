class Borrador{
    // ... demás atributos y métodos

    public void especificarTipo(TipoPrenda){
	this.prenda = tipoPrenda;
    }
    public Prenda crearPrenda(){
	 return new Prenda(this.tipo,this.material,...);
    }

}

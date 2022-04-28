class Uniforme {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;
	)
}

interface Costurero {
    public Prenda fabricarParteSuperior()
    public Prenda fabricarParteInferior()
    public Prenda fabricarCalzado()
	public Uniforme fabricar() 
}

class CostureroSanJuan extends Costurero {
	public Prenda fabricarParteSuperior() // Retorna chomba verde pique
    public Prenda fabricarParteInferior() // Retorna pantalon de acetato gris
    public Prenda fabricarCalzado() // Retorna zapatillas blancas
	public Uniforme fabricar() // Arma uniforme con los tres de arriba
	
} 

class CostureroJohnson extends Costurero {
	public Prenda fabricarParteSuperior() //Retorna camisa blanca
    public Prenda fabricarParteInferior() //Retorna pantalon de vestir negro
    public Prenda fabricarCalzado() // Retorna zapatos negros
	public Uniforme fabricar() // Arma uniforme con los tres de arriba
}

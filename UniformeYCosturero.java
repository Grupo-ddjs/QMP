class Uniforme {
    Prenda prendaSuperior;
    Prenda prendaInferior;
    Prenda calzado;

     public Uniforme fabricar(Costurero costurero)
       return Uniforme(
          costurero.fabricarParteSuperior(),
          costurero.fabricarParteInferior(),
          costurero.fabricarCalzado()
	)
}

interface Costurero {
    public Prenda fabricarParteSuperior()
    public Prenda fabricarParteInferior()
    public Prenda fabricarCalzado()
}

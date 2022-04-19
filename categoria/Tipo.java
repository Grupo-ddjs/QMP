package categoria;
import java.util.List;

//Categoria, al ser algo que no va a tener comportamiento y 
enum Categoria{
  PARTE_SUPERIOR, 
  PARTE_INFERIOR, 
  CALZADO, 
  ACCESORIOS
}

/* Alternativa 1: Me parece la mejor de las dos, ya que una vez instanciado el tipo no se va a poder cambiar, Así que solo restaria crear las
                  instancias VALIDAS de tipos de prenda para asignarselas a estas ultimas*/

public class Tipo{
  public Categoria categoria; // Guarda la categoria a la que pertenece el tipo

   public Tipo(Categoria categoria){
      this.categoria = categoria;
}
}

/* Alternativa 2: Al resolverlo de esta manera habría que crear una validación en prenda que defina si es o no un tipo valido en conjunto con su Categoria, siendo cohesiva
                  pero perdiendo simplicidad, dado a que hay que hacer validaciones, que encima cada vez que se cree un tipo nuevo hay que rearmar toda la logica del programa  */
enum Tipo{
  ZAPATILLAS, 
  OJOTAS, 
  REMERA_MANGA_CORTA, 
  REMERA_MANGA_LARGA
}





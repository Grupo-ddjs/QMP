import java.util.List; // import just the List interface
import java.util.ArrayList; // import just the ArrayList class

/* Esta clase va a tener un array con las prendas que la componen y se va a instanciar con la ropa del guardarropa
     con lo que pida el usuario en un futuro en base a los criterios que va a recibir  */

public class Atuendo {
    public List prendas = new ArrayList();
    List<Criterio> criterios; // sirven para guardar que criterios se utilizaron o se pueden utilizar para generar esta prenda, sin setters ni getters

    public Atuendo(List prendas) throws Exception{
        this.prendas = prendas;

        if(prendas.length <= 1 && prendas.map(prenda -> {prenda.categoria();}).removeduplicates < prendas.length) // si se crea un atuendo, tiene que tener mas de una prenda, sino es una prenda y también tiene que tener distintas categorias de prendas, para cumplir con lo que pide el cliente
            throw new Exception("Atuendo invalido");
    }

}

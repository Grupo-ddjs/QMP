import java.time.*;
import java.util.List; // import just the List interface
import categoria.Tipo;
import java.util.ArrayList; // import just the ArrayList class

public class Prenda {
    Tipo tipo;
    String material;
    String colorP;
    String colorS;

    public Prenda(Tipo tipo,String material,String colorP,String colorS) throws Exception {
        this.tipo = tipo;
        this.material = material;
        this.colorP = colorP;
        this.colorS = colorS;

        if (material == null || colorP == null || tipo == null)
            throw new Exception("Prenda invalida");

    }

    public String tipoDePrenda() {
        return this.tipo.tipo;
    }

    public Categoria categoria(){ // Para saber la categoria de la prenda
        return this.tipo.categoria();
    }

}
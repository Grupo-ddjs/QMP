import java.time.*;
import java.util.List; // import just the List interface
import categoria.Tipo;
import java.util.ArrayList; // import just the ArrayList class

public class Prenda {
    Tipo tipo;
    Material material;
    String colorP;
    String colorS;
	int vecesUsada = 0;
	boolean enLavado;

    public Prenda(Tipo tipo,Material material,String colorP,String colorS) throws Exception {
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
	
	public void usar() {
		vecesUsada++;
	}
	
	public boolean estaSucia() {
		return vecesUsada > 1;
	}
	
	public boolean estaPercudida() {
		return vecesUsada > 4;
	}
	
	public void lavar() {
		if (!estaPercudida()) {
			vecesUsada = 0;
			this.enLavado = true;
		}
	}
	
	public void sacarDeLavarropa() {
		this.enLavado = false; // Aun no sabemos como se termina de lavar porque la consigna no lo dice.
	}
	
	

}


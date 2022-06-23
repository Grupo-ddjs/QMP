public interface ServicioMeteorologico {
   int consultarTemperatura(String direccion);
   public List<String> obtenerAlertas(String ciudad);
}

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
	private AccuWeatherAPI api;
	private String direccion;
	private LocalDateTime proximaExpiracion;
	private int ultimaRespuesta;

  
	public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, String direccion, LocalDateTime proximaExpiracion) { 
		this.api = api;                
		this.proximaExpiracion = proximaExpiracion;  
		this.direccion = direccion;
	}
  
  
	public int consultarTemperatura() {
		if (this.ultimaRespuesta == null || this.expiro()) {
		  this.ultimaRespuesta = consultarApi();
		  this.proximaExpiracion = LocalDateTime.now().plus(this.proximaExpiracion); 
		}
		return this.ultimaRespuesta;
	}
	
  
	private int consultarApi(String direccion) {
		return this.api.getWeather(direccion).get(0).get("Temperature");
	}
  
	private boolean expiro() {
		return !proximaExpiracion.isAfter(DateTime.now);
	} 
}

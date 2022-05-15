Enum CriterioDeTemperatura{
haceFrio,
haceCalor,
estaHumedo,
...masCriterios
}

Class GuardaRopa implements BuilderConSugerencia{
  atributo atuendos;
  
  metodo sugerirAtuendo(sugerencias){
   atuendos.add(this.crearAtuendo(sugerencias))
  }
}

Class Sugerencia{
  atributo criterio; 
  atributo prenda; // puede ser de tipo accesorio 
  
}


interface BuilderConSugerencia{
    method Sugerencia generarSugerencia();
    metodo crearAtuendo(sugerencias);
//   respetando el patron de builder delegamos el armado de sugerencias resptando los criterios de esta ultima
//   La validacion de que se vista completamente esta en crear atuendo
}

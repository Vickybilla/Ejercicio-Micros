import java.util.ArrayList;
import java.util.List;

public class Micro {
    private Integer cantidadDePersonasSentadas;
    private Integer cantidadDePersonasParadas;
    private Integer volumen;
    private List <Pasajero> pasajeros = new ArrayList<>();

    public Micro (Integer cantidadDePersonasParadas, Integer cantidadDePersonasSentadas, Integer volumen){
        this.cantidadDePersonasParadas= cantidadDePersonasParadas;
        this.cantidadDePersonasSentadas=cantidadDePersonasSentadas;
        this.volumen=volumen;
    }

    public Boolean sePuedeSubir (Pasajero pasajero){
      return  this.tenesLugar()&&pasajero.aceptaSubir(this);
    }
    public  Boolean tenesLugar() {
        return this.cantidadDePersonasEnElMicro() < this.capacidadTotal();
    }
    //Devuelve la cantidad de elementos (pasajeros) de la coleccion de pasajeros
    // que estan subidos al micro en un momento dado

    public Integer cantidadDePersonasEnElMicro(){
        return pasajeros.size();

}

    public Boolean tenesLugaresParaSentarse(){
        return this.cantidadDePersonasEnElMicro()<this.cantidadDePersonasSentadas;
        //Tienen lugar sentado si la cantidad de personas en el micro es menor a la cantidad de lugares para sentarse.
        // asumimos que la gente por defecto prefiere sentarse antes que ir parada
    }

    public Boolean tenesXLugaresLibres(Integer x){
        return this.lugaresLibres()>=x;
    }


    public Integer lugaresLibres(){
        return this.capacidadTotal()-this.cantidadDePersonasEnElMicro();
    }

    public Integer capacidadTotal(){
        return cantidadDePersonasParadas+ this.cantidadDePersonasSentadas;
    }


    public Integer getVolumen() {
        return volumen;
    }
    public void subaASuCriterio(Pasajero pasajero){
        if (this.tenesLugar()&&pasajero.aceptaSubir(this))
        pasajeros.add(pasajero);

    }

    public void subiSiPodesA(Pasajero unPasajero) {
        if (!this.sePuedeSubir(unPasajero))
            throw new NoSePudoSubirPasajeroException("El pasajero no se puede subir a este micro");
        pasajeros.add(unPasajero);
    }
    public void subaASuCriterio2(Pasajero unpasajero){
        if (this.sePuedeSubir(unpasajero))pasajeros.add(unpasajero);

    }

    /**
     * Punto 3:
     * Bajar a una persona de un micro. Si no se puede, tira un error.
     */
    public void bajaA(Pasajero unaPersona) {
        if (pasajeros.isEmpty()) throw new RuntimeException("No hay nadie en el micro para bajar");
        pasajeros.remove(unaPersona);
    }

    /**
     * Punto 4:
     * Preguntarle al micro quien fue el primero en subir, null si está vacío.
     * Como la colección conserva el orden de inserción, podemos simplemente pedir el primero.
     */
    public Pasajero quienSubioPrimero() {
        try {
            return pasajeros.get(0);
            //el método get() de ArrayList tira una excepción (IndexOutOfBoundsException) si la colección está vacía...
        } catch (IndexOutOfBoundsException iobe) {
            return null;
        }
    }

}

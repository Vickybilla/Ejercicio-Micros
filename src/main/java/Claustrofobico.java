public class Claustrofobico implements Pasajero {

    public Boolean aceptaSubir(Micro unMicro){
        return unMicro.getVolumen()>120;
    }
}

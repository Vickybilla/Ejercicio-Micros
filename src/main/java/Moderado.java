public class Moderado implements Pasajero {
    private Integer x;
    public Boolean aceptaSubir(Micro elmicro){
        return elmicro.tenesXLugaresLibres(x);

    }

}

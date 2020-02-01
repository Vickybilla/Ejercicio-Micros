public class Obsecuente implements Pasajero{
    private Pasajero jefe;

    public Boolean aceptaSubir(Micro elmicro){
        return this.getJefe().aceptaSubir(elmicro);
    }

    public Pasajero getJefe() {
        return jefe;
    }

    public void setJefe(Pasajero jefe) {
        this.jefe = jefe;
    }
}

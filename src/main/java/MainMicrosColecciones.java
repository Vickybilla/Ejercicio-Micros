public class MainMicrosColecciones {
    public static void main (String [] args){

        // en el constructor del Micro es (cantidadPersonasParadas, cantidaddePersonasSentadas,volumen)


        Micro elrapido= new Micro (20,20,200);

        Claustrofobico jonasa= new Claustrofobico();
        Claustrofobico milton=new Claustrofobico();
        //puede ser una clase del interface pasajero

        Moderado pepe=new Moderado();
        Moderado carlos=new Moderado();

        Obsecuente gustavo=new Obsecuente();
        gustavo.setJefe(jonasa);
        Fiaca papaya=new Fiaca();
        Fiaca mushu= new Fiaca();
        Obsecuente laura=new Obsecuente();
        laura.setJefe(papaya);





        elrapido.sePuedeSubir(jonasa);
        elrapido.subaASuCriterio(jonasa);
        elrapido.subaASuCriterio(gustavo);
        elrapido.cantidadDePersonasEnElMicro();

        elrapido.subaASuCriterio2(mushu);
        elrapido.subaASuCriterio2(laura);
        elrapido.subaASuCriterio2(papaya);

        System.out.println(elrapido.cantidadDePersonasEnElMicro());


        Micro flechabus= new Micro(3,3,110);



        //elrapido.podesSubirA(jonasa);


    }
}

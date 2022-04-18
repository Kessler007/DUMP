
public class Reserva {
        Integer Hora;
        String Fecha;
        Integer Minuto;
    public Reserva(String Fecha){
       
        int H = (int)(Math.random()*10+1);
        int M = (int)(Math.random()*60+1);
        this.Hora=H;
        this.Minuto=M;
        this.Fecha=Fecha;
    }
    void MostrarReserva(){
        System.out.println("El pedido se realizo a "+this.Hora+":"+this.Minuto+" Hr");
        System.out.println("La fecha en la que se realizo el pedido fue "+this.Fecha);
    }
}

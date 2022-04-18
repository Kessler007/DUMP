public class Ruta {
    String Start;
    String END;
    String Tiempo;

    public Ruta(String Start, String END, String Tiempo) {
        this.Start = Start;
        this.END = END;
        this.Tiempo = Tiempo;
    }

    void MostrarRuta() {
        System.out.println("Ubicacion del Restaurante: " + this.Start);
        System.out.println("Ubicaion del Usuario: " + this.END);
        System.out.println("Tiempo Estimado: " + this.Tiempo);
    }
}

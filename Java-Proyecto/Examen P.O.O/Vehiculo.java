public class Vehiculo {
    String Tipo;
    String Matricula;
    String License;
    String Conductor;
    String Cargamento;

    public Vehiculo(String Tipo, String Matricula, String License, String Conductor, String Cargamenro) {
        this.Tipo = Tipo;
        this.Matricula = Matricula;
        this.License = License;
        this.Conductor = Conductor;
        this.Cargamento = Cargamenro;
    }

    void MostrarVehiculo() {
        System.out.println("Tipo de Vhiculo: " + this.Tipo);
        System.out.println("Matricula: " + this.Matricula);
        System.out.println("License: " + this.License);
        System.out.println("Conductor: " + this.Conductor);
        System.out.println("Cargamento: " + this.Cargamento);
    }
}

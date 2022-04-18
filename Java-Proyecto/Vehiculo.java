
public class Vehiculo {

    String Tipo;
    String Matricula;
    String License;
    String Conductor;
    String Cargamento;
    
    public Vehiculo(String Tipo,
    String Matricula,
    String License,
    String Conductor,
    String Cargamento){
        this.Tipo=Tipo;
        this.Matricula=Matricula;
        this.License=License;
        this.Conductor=Conductor;
        this.Cargamento=Cargamento;
    }
    void MostrarVehiculo(){
        System.out.println("Tipo de Vehiculo: "+this.Tipo);
        System.out.println("Matricula: "+this.Matricula);
        System.out.println("Licencia: "+this.License);
        System.out.println("Conductor: "+this.Conductor);
        System.out.println("Cargmrnto: "+this.Cargamento);
    }
}
public class Conductor extends Account{
    String Licencia;
    String Vehiculo;
    public Conductor(Integer ID, String Nombre, Integer Number_Phone, String Email, String Password, String licencia,String Vehiculo){
        this.ID = ID;
        this.Nombre = Nombre;
        this.Number_Phone = Number_Phone;
        this.Email = Email;
        this.Password = Password;
        this.Licencia = licencia;
        this.Vehiculo = Vehiculo;

    }
    void MostrarConductor(){
        System.out.println("ID: "+this.ID);
        System.out.println("Nombre: "+this.Nombre);
        System.out.println("Numero de Telefono: " + this.Number_Phone);
        System.out.println("Email: " + this.Email);
        System.out.println("Password: " + this.Password);
        System.out.println("Licencia: "+this.Licencia);
        System.out.println("Vehiculo. "+this.Vehiculo);
    }
}

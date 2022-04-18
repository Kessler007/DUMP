public class Conductor extends Account {
    String licencia;

    public Conductor(Integer ID, String Nombre, Integer Number_Phone, String Email, String Password, String licencia) {
        super(ID, Nombre, Number_Phone, Email, Password);
        this.licencia = licencia;
    }

    void MostrarConductor() {
        System.out.println("ID: " + this.ID);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Numero de Telefono: " + this.Number_Phone);
        System.out.println("Email: " + this.Email);
        System.out.println("Password: " + this.Password);
        System.out.println("Licencia: " + this.licencia);
    }
}

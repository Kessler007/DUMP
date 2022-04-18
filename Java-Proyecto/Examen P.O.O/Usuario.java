public class Usuario extends Account {

    String Ubicacion;
    Integer Codigo_postal;

    public Usuario(Integer ID, String Nombre, Integer Number_Phone, String Email, String Password, String Ubicacion,
            Integer Codigo_postal) {
        super(ID, Nombre, Number_Phone, Email, Password);
        this.Ubicacion = Ubicacion;
        this.Codigo_postal = Codigo_postal;
    }

    void MostrarUsuario() {
        System.out.println("ID: " + this.ID);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Numero de Telefono: " + this.Number_Phone);
        System.out.println("Email: " + this.Email);
        System.out.println("Password: " + this.Password);
        System.out.println("Ubicacion: " + this.Ubicacion);
        System.out.println("Codigo Postal: " + this.Codigo_postal);

    }
}

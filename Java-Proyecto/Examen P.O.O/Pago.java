public class Pago {
    Integer ID;
    String Nombre;
    Integer Number_Phone;
    String Pay;

    public Pago(Integer ID, String Nombre, Integer Number_Phone, String Pay) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Number_Phone = Number_Phone;
        this.Pay = Pay;

    }

    void MostrarPayment() {
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + this.Nombre);
        System.out.println("Numero de telefono: " + this.Number_Phone);
        System.out.println("Costo Total: " + this.Pay);
    }

}

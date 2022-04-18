public class Pedido {
    String Pedido;
    Integer Numero_Pedidos;
    String Nombre_Pedidos;
    String Direccion;
    String Restaurante;

    public Pedido(String Pedido, Integer Numerro_Pedidos, String Nombre_Pedidos, String Direcion, String Restaurante) {
        this.Nombre_Pedidos = Nombre_Pedidos;
        this.Numero_Pedidos = Numerro_Pedidos;
        this.Pedido = Pedido;
        this.Restaurante = Restaurante;
        this.Direccion = Direcion;
    }

    void MostrarPedido() {
        System.out.println("Tipo Pedido: " + this.Pedido);
        System.out.println("Cantidad de productos: " + this.Numero_Pedidos);
        System.out.println("Nombre de Pedido: " + this.Nombre_Pedidos);
        System.out.println("Direcion del Restaurante: " + this.Direccion);
        System.out.println("Nombre del Restaurante: " + this.Restaurante);
    }
}

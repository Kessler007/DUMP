public class Main {
        public static void main(String[] args) {

                System.out.println();
                System.out.println("Usuario");
                System.out.println();

                Usuario usuario = new Usuario(13623325, "Daniel Alejandro Mollinedo Ureña", 75978317,
                                "Dni8978@mgmail.com", "QWERTY", "Circunvalacion", 452);
                usuario.MostrarUsuario();

                System.out.println();
                System.out.println("Conductor");
                System.out.println();
                Conductor conductor = new Conductor(15324585, "Mario", 78984532, "Mrio1532", "POIUY", "1545DFA");
                conductor.MostrarConductor();

                System.out.println();
                System.out.println("Pedido");
                System.out.println();
                Pedido tipo_Pedido = new Pedido("Comida", 3, "Cuarto Pollo,Porcion de Papa,Solo Medio",
                                "Av. San Martín #160", "Pollos Kingdom");
                tipo_Pedido.MostrarPedido();

                System.out.println();
                System.out.println("Pago");
                System.out.println();
                Pago payment = new Pago(13623325, "Daniel Alejandro Mollinedo Ureña", 75978317, "70.Bs");
                payment.MostrarPayment();

                System.out.println();
                System.out.println("Vehiculo");
                System.out.println();
                Vehiculo vehiculo = new Vehiculo("Motocicleta", "1645GVD", "15654879", "Mario",
                                "Cuarto Pollo,Porcion de Papa,Solo Medio");
                vehiculo.MostrarVehiculo();

                System.out.println();
                System.out.println("Ruta");
                System.out.println();
                Ruta ruta = new Ruta("Av. San Martín #160", "Circunvalacion #452", "45 min");
                ruta.MostrarRuta();
        }
}

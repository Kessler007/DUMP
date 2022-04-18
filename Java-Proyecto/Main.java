import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        
        System.out.println();
        System.out.println("Ingresar datos del usuario");
        System.out.println();
        Usuario usuario=new Usuario("Molle-Molle",100);
       
        Conductor conductor= new Conductor(13623325, "Mario Valdez", 78946532,"Mario21@gmail.com", "qwerty", "13546895", "Motocicleta");
       
        System.out.println();
        System.out.println("Pedido");
        System.out.println();
        Scanner num=new Scanner(System.in);
        int n;
       
        Reserva reserva=new Reserva("13/08/20");
        
        Vehiculo vehiculo=new Vehiculo("Motocileta", "4056RZD", "Tipo B", "Mario Valdez", "Comestible");

        System.out.println("Todos los datos son: ");
        System.out.println();
        System.out.println("Usuario");
        System.out.println();
        usuario.MostrarUsuario();
        System.out.println();
        System.out.println("Conductor");
        System.out.println();
        conductor.MostrarConductor();
        System.out.println();
        System.out.println("Ingresar el pedido");
        System.out.println();
        System.out.println("Elija \n 1.-Almacen \n 2.-Restaurante");
        n=num.nextInt();
        System.out.println();
        System.out.println("Su Pedido:");
        switch (n) {
            case 1:
                Almasenaje almasenaje=new Almasenaje();
                almasenaje.MostrarAmacenaje();
                
            break;
            case 2:
                Restaurante restaurante=new Restaurante();
                restaurante.MostrarResaurante(); 
            break;
        }
        Pago pago=new Pago();
        System.out.println();
        System.out.println("Vehiculo");
        System.out.println();
        vehiculo.MostrarVehiculo();
        System.out.println();
        System.out.println("Pago");
        System.out.println();
        pago.MostrarPago();
        System.out.println();
        System.out.println("Reserva");
        System.out.println();
        reserva.MostrarReserva();
        System.out.println("Ruta");
        System.out.println();
        Ruta ruta=new Ruta("Molle-Molle Nro.100"," 10 de febrero/Simon lopez ","  Av. San Martín 150 entre Heroínas y Colombia ");
        if (n==1) {
           ruta.MostrarStar();
           ruta.Mostrarend();
        }
        if (n==2) {
            ruta.MostrarStar2();
            ruta.Mostrarend();
        }

    }
}
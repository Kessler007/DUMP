import java.util.Scanner;

public class Almasenaje extends Pedido{
    String Nombre_del_Lugar="";
    int opcion;
    String Producto;
    double total;
    

    public Almasenaje(){
        Scanner zz=new Scanner(System.in);
        Scanner text=new Scanner(System.in);

        System.out.println("El menu es: \n1.-Verduras: Tomate 2 bs ,Cebolla 2 bs ,Pepino 2 bs ,Lechuga 2 bs \n2.-Frutas Platano,Manzana,Papaya,Uva \n3.-Lacteos: Pil,Pura Vida");
        opcion=zz.nextInt();
        if (opcion==1) {
            System.out.println("Ingesar Verdura (debe escribir el nombre de una verdura)");
            Producto=text.nextLine();
            System.out.println("Deve ingresar Cantidad (Numeros)");
            numero_de_pedido=zz.nextInt();

            nombre_de_pedido=Producto;
            tipo_de_pedido="Verduras";
            total=numero_de_pedido*2;
            Direccion="Simon Lopez ";
            Nombre_del_Lugar="Mercado 10 de Febrero";
        }
        if (opcion==2) {
            Double a=2.5;
            System.out.println("Ingresar Fruta");
            Producto=text.nextLine();
            System.out.println("Deve ingresar Cantidad (Numeros)");
            numero_de_pedido=zz.nextInt();
            nombre_de_pedido=Producto;
            tipo_de_pedido="Verduras";
            total=numero_de_pedido*a;
            Direccion="Simon Lopez ";
            Nombre_del_Lugar="Mercado 10 de Febrero";
        }
        if (opcion==3) {
            Double a=5.50;
            System.out.println("Ingresar Fruta");
            Producto=text.nextLine();
            System.out.println("Deve ingresar Cantidad (Numeros)");
            numero_de_pedido=zz.nextInt();
            nombre_de_pedido=Producto;
            tipo_de_pedido="Verduras";
            total=numero_de_pedido*2;
            Direccion="Simon Lopez ";
            Nombre_del_Lugar="Mercado 10 de Febrero";
        }
    }
    void MostrarAmacenaje(){
        System.out.println("El tipo de Pedido es: "+tipo_de_pedido);
        System.out.println("El numero de Pedido es: "+Producto+" El total es: "+total);
        System.out.println("Nombre del pedido: "+nombre_de_pedido);
        System.out.println("Direccion del Almasenaje : "+Direccion);
        System.out.println("Nombre del lugar: "+Nombre_del_Lugar);

    }
}

import java.util.Scanner;

public class Restaurante extends Pedido {
    int menu;
    int total;
    String Nombre_Del_Restaurante="";

    public Restaurante(){
        Scanner zz=new Scanner(System.in);
        Scanner num=new Scanner(System.in);
        System.out.println("------Menu------\n1.-Cuarto Pollo 26 bs\n2.-Medio Pollo 44 bs \n3.-Queen Menu 31 bs \n4.-King Menu 49 bs");
        menu=num.nextInt();
        if (menu==1) {
            tipo_de_pedido="Comida";
            System.out.println("Ingresar cuantos pedira");
            numero_de_pedido=zz.nextInt();
            total=numero_de_pedido*26;
            nombre_de_pedido="Cuarto Pollo 26 bs";
            Direccion="Av. San Martín 150 entre Heroínas y Colombia";
            Nombre_Del_Restaurante="Chinken's Kingdom";
        }
        if (menu==2) {
            tipo_de_pedido="Comida";
            System.out.println("Ingresar cuantos pedira");
            numero_de_pedido=zz.nextInt();
            total=numero_de_pedido*44;
            nombre_de_pedido="Medio Pollo 44 bs";
            Direccion="Av. San Martín 150 entre Heroínas y Colombia";
            Nombre_Del_Restaurante="Chinken's Kingdom";
        }
        if (menu==3) {
            tipo_de_pedido="Comida";
            System.out.println("Ingresar cuantos pedira");
            numero_de_pedido=zz.nextInt();
            total=numero_de_pedido*31;
            nombre_de_pedido="Queen Menu 31 bs";
            Direccion="Av. San Martín 150 entre Heroínas y Colombia";
            Nombre_Del_Restaurante="Chinken's Kingdom";
        }
        if (menu==4) {
            tipo_de_pedido="Comida";
            System.out.println("Ingresar cuantos pedira");
            numero_de_pedido=zz.nextInt();
            total=numero_de_pedido*49;
            nombre_de_pedido="King Menu 49 bs";
            Direccion="Av. San Martín 150 entre Heroínas y Colombia";
            Nombre_Del_Restaurante="Chinken's Kingdom";
        }
    }
    void MostrarResaurante(){
        System.out.println("El tipo de pedido es: "+tipo_de_pedido);
        System.out.println("El numero de pedido es: "+numero_de_pedido+" El Total a Pagar es: "+total);
        System.out.println("Nombre del Pedido: "+nombre_de_pedido);
        System.out.println("Direccion del Restaurant: "+Direccion);
        System.out.println("Nombre del Restaurante: "+Nombre_Del_Restaurante);
        
    }
}


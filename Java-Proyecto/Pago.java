import java.util.Scanner;

public class Pago{
    String Pay="";
    int z;
    public Pago(){
        Scanner w=new Scanner(System.in);
        System.out.println("¿Como realizara el pago \n1.-Efectivo \n2.-Tarjeta?");
        z=w.nextInt();
        switch (z) {
            case 1:
                Pay=" Efectivo ";
            break;
            case 2:
                Pay=" Tarjeta ";
            break;
        }
    }
    void MostrarPago(){
        System.out.println("El pago sera por: "+this.Pay);
    }
}

import java.util.Scanner;

public class Usuario extends Account {
    String Ubicacion;
    Integer Codigo_Postal;

    public Usuario(String Ubicacion,Integer Codigo_Postal){
        Scanner num=new Scanner(System.in);
        Scanner text=new Scanner(System.in);
        System.out.println("Ingersar ID");
        this.ID=num.nextInt();
        System.out.println("Ingersar Nombre");
        this.Nombre=text.nextLine();
        System.out.println("Ingresar Numero de telefono");
        this.Number_Phone=num.nextInt();
        System.out.println("Ingresar Email");
        this.Email=text.nextLine();
        System.out.println("Ingresar Password");
        this.Password=text.nextLine();
       
    }
    
    void MostrarUsuario(){
        System.out.println("ID: "+this.ID);
        System.out.println("Nombre: "+this.Nombre);
        System.out.println("Numero de Telefono: " + this.Number_Phone);
        System.out.println("Email: " + this.Email);
        System.out.println("Password: " + this.Password);
        System.out.println("Ubicacion: " + this.Ubicacion);
        System.out.println("Codigo Postal: " + this.Codigo_Postal);
    }
}

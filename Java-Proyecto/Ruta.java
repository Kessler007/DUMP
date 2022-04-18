public class Ruta {
    String Star;
    String Star2;
    String end;

    public Ruta(String end,String Star,
    String Star2){
        this.Star=Star;
        this.Star2=Star2;
        this.end=end;
    }
    void MostrarStar(){
        System.out.println("Ruta de Inicio: "+this.Star);
       
    }
    void MostrarStar2(){
        System.out.println("Ruta de Inicio: "+this.Star2);
       
    }
    void Mostrarend(){
        System.out.println("Ruta Final: "+this.end);
    }
    
}
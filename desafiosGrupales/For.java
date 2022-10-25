import java.io.Console;

public class For {
    public static void main(String[] args) {
        Console console = System.console();
        int personas = Integer.parseInt(console.readLine("Ingresa cuantas personas se pesaran: ")); // ingresa la cantidad de personas
        for(int i = 0 ; i<personas;i++){
            int planeta = Integer.parseInt((console.readLine("Ingrese 1 si desea Marte o 2 si desea Luna:  ")));
            switch(planeta){
                case 1:
                Double peso_dou = Double.parseDouble(console.readLine("Ingrese el peso que desea convertir: "));
                //Funcion de peso del nico sobre marte
                Double peso_marte = (peso_dou / 9.81) * 3.711 ;
                System.out.println("El peso en marte es : " + peso_marte);
                break;
    
                case 2:
                Double peso_dou2 = Double.parseDouble(console.readLine("Ingrese el peso que desea convertir: "));
                //Funcion de peso del nico sobre luna
                Double peso_luna = (peso_dou2 / 9.81) * 1.622;
                System.out.println("El peso en la luna es: " + peso_luna);
                break;
    
                default:
                System.out.println("No seleccionaste un planeta");

        }
    }
    System.out.println("******************************");
   System.out.println("Haz finalizado el programa"); 
}

    
}

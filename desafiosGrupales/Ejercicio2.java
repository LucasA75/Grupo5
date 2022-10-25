import java.io.Console;

public class Ejercicio2 {
    public static void main(String[] args) { // se puede escribir main y te hara toda esta linea
        //Precio general 7 euros 
        //mayor a 60 descuento de 55
        //menor a 5 60
        //hacer un while que cuando se alcanze el cupo de salas se salga
        Console console = System.console();
        int precioGeneral = 7; // variable que no cambiara es constante
        int cupoSalas = 8; // variable que por el momento no es necesario que cambie
        int cantidadDeEntradasVendidas = 0; // variable contador
        while(cantidadDeEntradasVendidas<cupoSalas){ //mientras la cantidad de entradas vendi sea menor al cupo de salas 
            int entradas = Integer.parseInt(console.readLine("Ingrese cuantas personas entraran al cine: ")); // pide al usuario cuantas personas entraran al cine
                cantidadDeEntradasVendidas = entradas + cantidadDeEntradasVendidas; // ESTA ES LA QUE NOS FALTO :( = dice que al contador le suma la cantidad de entradas 
                System.out.println("La cantidad de entradas vendidas hasta el momento son: " +cantidadDeEntradasVendidas);
                System.out.println("El cantidad maxima de sillas es: " + cupoSalas);
                System.out.println("Las personas que entraran al cine son: "+ entradas);
                    while(entradas>0){ //mientras entradas sea mayor a cero
                        int edad = Integer.parseInt(console.readLine("Ingrese su edad: "));
                            if (edad <= 5 && edad >0){
                                System.out.println("Eres menor a 5 años por lo que tienes un descuento del 60%!!!");
                                System.out.println("El precio de tu entrada es: ");
                                System.out.println( precioGeneral - Math.round((precioGeneral * 0.60)) + " Euros"); // esto redondea el valor .... aunque en este caso no es util XD
                            }else if(edad >= 60){
                                System.out.println("Eres mayor de 60 años por lo que tienes un descuento del 50%!!!");
                                System.out.println("El precio de tu entrada es: ");
                                System.out.println(precioGeneral - (precioGeneral * 0.50) + " Euros");
                            }else{
                                System.out.println("El precio de tu entrada es: ");
                                System.out.println(precioGeneral + "Euros");
                            }
                            entradas--; //le resto 1 a entradas
                    } 
            }
            System.out.println("************************");
            System.out.println("Se vendieron todas las entradas :(");
        } 
}

//Se puede utilizar alt + shift + a , seleccionando anteriormente todo lo que necesitamos para poder comentarlo de inmediato
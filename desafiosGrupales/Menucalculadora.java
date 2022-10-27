import java.io.Console;

public class Menucalculadora {

    static String Suma (int num1, int num2){
        int resultado =  0;
        resultado = num1+num2;
        
        return "El resultado de la suma es " + resultado;

    }

    static String Resta (int num1, int num2){
        int resultado1 =  0;
        resultado1 = num1-num2;
        
        return "El resultado de la resta es " + resultado1;

    }

    static String Multiplica (int num1, int num2){
        int resultado2 =  0;
        resultado2 = num1*num2;
                
        return "El resultado es de la multipliación es " + resultado2;
        


    }

    static String Divide (int num1, int num2){
        float resultado3 = 0.00f;
        float num1f = num1;
        float num2f = num2;
                
        if (num2f <0 || num2f>0){
            resultado3 = num1f/num2f;
            return "El resultado de la división es " + resultado3;
            
        }else{
            return "La división no se puede hacer";
        }


    }


    public static void main(String[] args) {
        Console console = System.console();

        boolean verificador = true;

        System.out.println("*****Bienvenido*****");

        while(verificador==true){

        int opcion = Integer.parseInt(console.readLine("Ingrese 1 para sumar, 2 para restar, 3 para multiplicar,  4 para dividir y  5 para salir del menú: "));


        switch(opcion){
            case 1 :
            int num1 = Integer.parseInt(console.readLine("Ingrese el primer número: "));
            int num2 = Integer.parseInt(console.readLine("Ingrese el segundo número: "));
            System.out.println(Suma(num1,num2));
            break;

            case 2 : 
            int num1r = Integer.parseInt(console.readLine("Ingrese el primer número: "));
            int num2r = Integer.parseInt(console.readLine("Ingrese el segundo número: "));
            System.out.println(Resta(num1r,num2r));
            break;

            case 3 : 
            int num1m = Integer.parseInt(console.readLine("Ingrese el primer número: "));
            int num2m = Integer.parseInt(console.readLine("Ingrese el segundo número: "));
            System.out.println(Multiplica(num1m,num2m));
            break;

            case 4 : 
            int num1d = Integer.parseInt(console.readLine("Ingrese el primer número: "));
            int num2d = Integer.parseInt(console.readLine("Ingrese el segundo número: "));
            System.out.println(Divide(num1d,num2d));
            break;

            case 5 : 
            verificador=false;
            System.out.println("******Haz finalizado el programa******");
            break;

            default:

            System.out.println("Ingresa una opción correcta");



        }
        
    }
}
}
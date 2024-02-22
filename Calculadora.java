import java.util.Scanner;

public class calculadora {

    public class operaciones {
        public static double suma(double n1,double n2) {
        
            return n1+n2;
        }
        public static double resta(double n1,double n2) {
        
            return n1 - n2;
        }
        public static double multiplcacion(double n1,double n2) {
        
            return n1*n2;
        }
        public static double division(double n1,double n2) {
        
            return n1/n2;
        }
    }

    public static void main(String[] args) {
        Scanner escanea = new Scanner(System.in);
        char d;
        Double a;
        Double b;
        Integer c;

        do{
            System.out.print("Ingrese el numero 1: ");
            a = escanea.nextDouble();

            System.out.print("Ingrese el numero 2: ");
            b = escanea.nextDouble();

            System.out.println("Ingresa el numero de la opcion que deseas");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.print("Que operacion deseas?: ");
            c = escanea.nextInt();

            if (c == 1){
               System.out.println("La suma de esos numeros fue: " + operaciones.suma(a, b));
            } else if (c == 2){
                System.out.println("La resta de esos numeros fue: " + operaciones.resta(a, b));
            } else if (c == 3){
                System.out.println("La multiplicacion de esos numeros fue: " + operaciones.multiplcacion(a, b));
            } else if (c == 4){
                if (b == 0) {
                    System.out.println("No puedes dividir dentro de 0");
                } else {
                    System.out.println("La division de esos numeros fue: " + operaciones.division(a, b));
                }
                
            } 
            System.out.println("Desea Continuar? s/n");
            d = escanea.next().charAt(0);
        }while(d != 'n');
        escanea.close();
    }
}

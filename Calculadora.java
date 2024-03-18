import java.util.Scanner;
public class Calculadora {

    public static float sumar(float num1, float num2){
        return num1 + num2;
    }
    public static float restar(float num1, float num2){
        return num1 - num2;
    }
    public static float multiplicar(float num1, float num2){
        return num1 * num2;
    }
    public static float dividir(float num1, float num2){
        return num1 / num2;
    }


    public static void main(String[] args) {
        int op1;
        float operador1, operador2;
        Scanner op = new Scanner(System.in);
        int dato1 = 0;
        do{
            System.out.println("Bienvenido: ");
            System.out.println("1. sumar: ");
            System.out.println("2. restar: ");
            System.out.println("3. multiplicar: ");
            System.out.println("4. dividir: ");
            System.out.println("5. salir: ");
            System.out.println("Su opcion es: ");
            dato1 = op.nextInt();

            switch (dato1) {
                case 1:
                    System.out.println("Ingrese dato 1: ");
                    operador1 = op.nextFloat();
                    System.out.println("Ingrese dato 2: ");
                    operador2 = op.nextFloat();
                    System.out.println("La suma es: " + sumar(operador1, operador2));
                    break;
                case 2:
                    System.out.println("Ingrese dato 1: ");
                    operador1 = op.nextFloat();
                    System.out.println("Ingrese dato 2: ");
                    operador2 = op.nextFloat();
                    System.out.println("La diferencia es: " + restar(operador1, operador2));
                    break;
                case 3:
                    System.out.println("Ingrese dato 1: ");
                    operador1 = op.nextFloat();
                    System.out.println("Ingrese dato 2: ");
                    operador2 = op.nextFloat();
                    System.out.println("El producto es: " + multiplicar(operador1, operador2));
                    break;
                case 4:
                    System.out.println("Ingrese dato 1: ");
                    operador1 = op.nextFloat();
                    System.out.println("Ingrese dato 2: ");
                    operador2 = op.nextFloat();
                    System.out.println("El total de la division es: " + dividir(operador1, operador2));
                    break;
                case 5:
                    System.out.println("Saliendo... ");
                    break;
                case 6:
                    System.out.println("No valido");
                    break;
            }
            
        }while(dato1 != 5);
    }
}

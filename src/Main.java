import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static double suma(double n1, double n2) {
        return n1 + n2;
    }
    public static double resta(double n1, double n2) {
        return n1 - n2;
    }
    public static double multiplicacion(double n1, double n2) {
        return n1 * n2;
    }
    public static double division(double n1, double n2) throws Exception{
        if (n2 == 0 || n1 == 0) {
        throw new Exception("No se puede dividir por 0");
        }
        return n1 / n2;
    }
    public static double raizCuadrada(double n1) throws RaizCuadradaException {
        if (n1 >= 0) {
            return Math.sqrt(n1);
        }
        throw new RaizCuadradaException("El caracter ingresado no es valido");
    }

    public static double potenciaDeDosNumeros(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    public static double exceptionDivision(double n1, double n2) throws DivisionException{
        try {
            return division(n1, n2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero");

            throw new DivisionException(e.getMessage());
        }
    }


public static void main(String[] args) throws DivisionException {


    Scanner datos = new Scanner(System.in);

    int opcion;
    double n1=0,n2=0;


    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Raíz Cuadrada");
    System.out.println("6. Potencia de dos números");
    System.out.println("Ingrese el número de operación que desea ejecutar: ");
    opcion = datos.nextInt();

    if (opcion != 5) {
        try {
            System.out.println("Ingrese el primer número: ");
            n1 = datos.nextDouble();
            System.out.println("Ingrese el segundo número");
            n2 = datos.nextDouble();
        } catch (Exception e) {
            System.out.println("Debe ingresar un valor valido: " + e);
        }

    }
    else {
        try {
            System.out.println("Ingrese el número: ");
            n1 = datos.nextDouble();
        } catch (Exception e){
            System.out.println("Debe ingresar un valor valido: " + e);
        }

    }


    if (opcion == 1) {
        System.out.println("la suma es: " + suma(n1, n2));
    } else if (opcion == 2) {
        System.out.println("la resta es: " + resta(n1, n2));
    } else if (opcion == 3) {
        System.out.println("la multiplicación es: " + multiplicacion(n1, n2));
    } else if (opcion == 4) {
        System.out.println("la división es: " + exceptionDivision(n1,n2));
    } else if (opcion == 5) {
        try {
            System.out.println("la raíz cuadrada es: " + raizCuadrada(n1));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    } else if (opcion == 6) {
        System.out.println("la potencia es: " + potenciaDeDosNumeros(n1, n2));

    } else {
        System.out.println("Ingreso una opcion de operación no valida");
    }
    }
}
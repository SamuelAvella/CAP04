public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introduzca el valor de a: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el valor de b: ");
        double b = Double.parseDouble(System.console().readLine());
        if (a==0) {
            System.out.print("Esta ecuación no tiene solución");
        } else {
            System.out.print("La solución es x: "+(-b/a));
        }
    }
}

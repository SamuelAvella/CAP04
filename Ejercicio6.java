public class Ejercicio6 {
    public static void main(String[] args) {
        double g = 9.81;
        System.out.print("Escriba la altura en metros desde la que quieras calcular el tiempo en el que cae un objeto x: ");
        double h = Double.parseDouble(System.console().readLine());
        double t = Math.sqrt(2*h/g);
        System.out.printf("El objeto tardara en caer %.2f segundos",t);
    }
}

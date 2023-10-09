public class Ejercicio4 {
    public static void main(String[] args) {
        int sueldo;
        System.out.print("Escribe las horas que trabajas en la semana: ");
        int horas = Integer.parseInt(System.console().readLine());
        if (horas < 40) {
            sueldo = 40 * 12;
        } else {
            sueldo = (40 * 12)+((horas-40)*16);
        }
        System.out.println("Su sueldo semanal sera igual a: "+sueldo+" euros.");
    }
}

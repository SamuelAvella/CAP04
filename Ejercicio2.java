public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la hora del día: ");
        Double hora = Double.parseDouble(System.console().readLine());
        Math.round(hora);
        if (hora>=6&&hora<=12) {
            System.out.println("Buenos días");
        } else {
            if (hora>=13&&hora<=20) {
                System.out.println("Buenas tardes");
            } else {
                System.out.println("Buenas noches");
            }
        }
    }
}

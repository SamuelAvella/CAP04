public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.print("Vamos a ver cual es su signo del zodiaco, primero introduce el nº de tu mes de nacimiento: ");
        int mes = Integer.parseInt(System.console().readLine());
        System.out.print("Ahora introduzca el día en el que nacio: ");
        int dia = Integer.parseInt(System.console().readLine());
        switch (mes) {
            case 1:
                if (dia<=19) {
                    System.out.println("Tu signo es Capricornio");
                } else {
                    System.out.println("Tu signo es Acuario");
                }
                break;
            case 2:
                if (dia<=18) {
                    System.out.println("Tu signo es Acuario");
                } else {
                    System.out.println("Tu signo es Piscis");
                }
                break;
            case 3:
                if (dia<=20) {
                    System.out.println("Tu signo es Piscis");
                } else {
                    System.out.println("Tu signo es Aries");
                }
                break;
            case 4:
                if (dia<=19) {
                    System.out.println("Tu signo es Aries");
                } else {
                    System.out.println("Tu signo es Tauro");
                }
                break;
            case 5:
                if (dia<=20) {
                    System.out.println("Tu signo es Tauro");
                } else {
                    System.out.println("Tu signo es Géminis");
                }
                break;
            case 6:
                if (dia<=20) {
                    System.out.println("Tu signo es Géminis");
                } else {
                    System.out.println("Tu signo es Cáncer");
                }
                break;
            case 7:
                if (dia<=22) {
                    System.out.println("Tu signo es Cáncer");
                } else {
                    System.out.println("Tu signo es Leo");
                }
                break;
            case 8:
                if (dia<=22) {
                    System.out.println("Tu signo es Leo");
                } else {
                    System.out.println("Tu signo es Virgo");
                }
                break;
            case 9:
                if (dia<=22) {
                    System.out.println("Tu signo es Virgo");
                } else {
                    System.out.println("Tu signo es Libra");
                }
                break;
            case 10:
                if (dia<=22) {
                    System.out.println("Tu signo es Libra");
                } else {
                    System.out.println("Tu signo es Escorpio");
                }
                break;
            case 11:
                if (dia<=21) {
                    System.out.println("Tu signo es Escorpio");
                } else {
                    System.out.println("Tu signo es Sagitario");
                }
                break;
            case 12:
                if (dia<=21) {
                    System.out.println("Tu signo es Sagitario");
                } else {
                    System.out.println("Tu signo es Capricornio");
                }
                break;
        }
    }
}

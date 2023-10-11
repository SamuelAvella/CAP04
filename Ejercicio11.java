import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dígame la hora y minuto en el que se encuentra separado por espacio y en formato de 24h: ");
        int hora = sc.nextInt();
        int minuto = sc.nextInt();
        System.out.printf("Desde las %d:%02d, quedan %d segundos para medianoche.\n",hora,minuto,(86400-(hora*3600+minuto*60)));
        sc.close();
    }
}

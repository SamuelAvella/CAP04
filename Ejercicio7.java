import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor escriba tres notas de examenes separadas por espacios: ");
        double primera = sc.nextDouble();
        double segunda = sc.nextDouble();
        double tercera = sc.nextDouble();
        System.out.printf("La media de %.2f %.2f y %.2f es: %.2f\n",primera,segunda,tercera,(primera+segunda+tercera)/3);
        sc.close();
    }
}

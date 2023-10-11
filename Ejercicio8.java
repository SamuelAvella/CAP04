import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor escriba tres notas de examenes separadas por espacios: ");
        double primera = sc.nextDouble();
        double segunda = sc.nextDouble();
        double tercera = sc.nextDouble();
        double media = (primera+segunda+tercera)/3;
        if (media>9) {
            System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, sobresaliente.\n",primera,segunda,tercera,media);
        } else {
            if (media<=7&media>=8) {
                System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, notable.\n",primera,segunda,tercera,media);
            } else {
                if (media>=6&media<7) {
                    System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, bien.\n",primera,segunda,tercera,media);
                } else {
                    if (media>=5&media<6) {
                        System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, suficiente.\n",primera,segunda,tercera,media);
                    } else {
                        System.out.printf("La media de %.2f %.2f y %.2f es %.2f, es decir, insuficiente.\n",primera,segunda,tercera,media);
                    }
                }
            }
        }
        sc.close();
    }
}

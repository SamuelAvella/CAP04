public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entre 1 y 7, estos incluidos: ");
        int dia = Integer.parseInt(System.console().readLine());
        switch(dia){
            case 1:{
                System.out.print("Este número corresponde con el Lunes");
                break;
            }
            case 2:{
                System.out.print("Este número corresponde con el Martes");
                break;
            }
            case 3:{
                System.out.print("Este número corresponde con el Miércoles");
                break;
            }
            case 4:{
                System.out.print("Este número corresponde con el Jueves");
                break;
            }
            case 5:{
                System.out.print("Este número corresponde con el Viernes");
                break;
            }
            case 6:{
                System.out.print("Este número corresponde con el Sábado");
                break;
            }
            case 7:{
                System.out.print("Este número corresponde con el Domingo");
                break;
            }
        }
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un día de la semana: ");
        String dia = (System.console().readLine());
        dia.toLowerCase();
        switch(dia){
            case "lunes":{
                System.out.print("A primera hora toca Programación");
                break;
            }
            case "martes":{
                System.out.print("A primera hora toca Lenguaje de Marcas");
                break;
            }
            case "miercoles":{
                System.out.print("A primera hora toca Lenguaje de Marcas");
                break;
            }
            case "jueves":{
                System.out.print("A primera hora toca Programación");
                break;
            }
            case "viernes":{
                System.out.print("A primera hora toca Formación y Orientación Laboral");
                break;
            }
        }
    }
}

import java .util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Declaramos nuestro objeto tipo scanner para leer la entrada del usuario.

        Scanner scanner = new Scanner(System.in);

        //Solicitamos el usuario que ingrese un numero entero positivo

        System.out.print("Ingese un número entero positivo : ");

        int limite = scanner.nextInt();

        // Verificamos que el numero asignado sea positivo

        if (limite <= 0){
            System.out.println("Por favor ingrese un número  entero positivo:  ");

        }else {

            // Usamos un ciclo for para encontrar e imprimir los numero pares

            for (int i = 1 ; i <= limite; i++){

                if (i  %2 == 0){

                    System.out.print(i+"");
                }
            }
        }

        //Cerramos el objeto Scanner






    }
}
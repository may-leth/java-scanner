import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner dataCollector = new Scanner(System.in);
        System.out.println("Hola, soy un Data Collector, rellenemos este formulario de registro");

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña
        System.out.println("¿Cuál es tu nombre?");
        String name = dataCollector.nextLine();
        System.out.println();

        System.out.println("¿Cuál es tu apellido?");
        String surname = dataCollector.nextLine();
        System.out.println();

        System.out.println("¿Cuál es tu nombre de usuario?");
        String userName = dataCollector.nextLine();
        System.out.println();

        System.out.println("Ultima pregunta, ¿cual será tu contraseña?");
        String password = dataCollector.nextLine();
        System.out.println();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println("Hola " + name + " " + surname + ", tu nombre de usuario es " + userName + " y tu contraseña es " + password + ", gracias por registrarte.");

        dataCollector.close();
    }
}
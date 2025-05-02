import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner
        Scanner femBot = new Scanner(System.in);
        System.out.println("Hola, ¿Cómo te llamas?");

        //Recoge el dato
        String name = femBot.nextLine();
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println();
        System.out.println("Hola " + name + "! Soy FemBot. ¿De qué ciudad eres?");

        //Recoge el dato
        String location = femBot.nextLine();
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println();

        System.out.println("He escuchado que " + location + " es un encanto. Yo nací en Oracle city.");
        System.out.println("\n¿Cuántos años tienes?");

        //Recoge el dato
        byte age = femBot.nextByte();
        femBot.nextLine();
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("Entonces me dices que tienes " + age + " años. Yo tengo 400 años.");
        System.out.println("Eso quiere decir que soy " + (400/(int)age) + " veces más vieja que tu.");
        System.out.println("Basta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");

        //Recoge el dato
        String language = femBot.nextLine();
        //Añade una nueva línea.
        System.out.println();
        System.out.println(language + ", ¡Eso es excelente! Mucho gusto haber hablado contigo " + name + ", ¡Hablamos luego!");

        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner
        femBot.close();
    }
}

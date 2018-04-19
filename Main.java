import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static Vector enterVector(){

        return new Vector(in.nextDouble(), in.nextDouble(), in.nextDouble());


    }

    public static void main(String[] args){

        while (true) {

            System.out.println("Введите команду");
            String command = in.next();

            if (command.equals("exit")) {
                break;
            }

            System.out.println("Введите координаты");
            Vector vector1 = enterVector();
            System.out.println("v1=" + vector1.toString());


            if (command.equals("length")){

                Double res = vector1.findLengthOfVector();
                System.out.println("Ответ: " + res.toString());
            }

            else {
                Vector vector2 = enterVector();
                System.out.println("v2=" + vector2.toString());

                if (command.equals("add")) {

                    Vector res = vector1.add(vector2);
                    System.out.println("Ответ: " + res.toString());
                }

                if (command.equals("sub")) {
                    Vector res = vector1.subtract(vector2);
                    System.out.println("Ответ: " + res.toString());
                }

                if (command.equals("mult")) {
                    Double res = vector1.scalarToMultiply(vector2);
                    System.out.println("Ответ: " + res.toString());
                }
            }



        }

    }
}

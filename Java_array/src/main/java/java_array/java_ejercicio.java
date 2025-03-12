package java_array;

import java.util.Scanner;

public class Java_ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Java_array gestor = new Java_array();
        int opcion;

        do {
            System.out.println("Menu de alimentos DaNi:");
            System.out.println("1. Crear alimento");
            System.out.println("2. Actualizar alimento");
            System.out.println("3. Eliminar alimento");
            System.out.println("4. Visualizar alimentos");
            System.out.println("5. Finalizar");
            System.out.print("Elige una opcion: ");
            System.out.print(" ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del alimento: ");
                    String nuevoAlimento = scanner.nextLine();
                    gestor.agregarAlimento(nuevoAlimento);
                    break;
                case 2:
                    System.out.print("Posicion a actualizar: ");
                    int posicion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo nombre del alimento: ");
                    String alimentoNuevo = scanner.nextLine();
                    gestor.actualizarAlimento(posicion, alimentoNuevo);
                    break;
                case 3:
                    System.out.print("Posicion a eliminar: ");
                    int eliminarPos = scanner.nextInt();
                    gestor.eliminarAlimento(eliminarPos);
                    break;
                case 4:
                    gestor.mostrarAlimentos();
                    break;
                case 5:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opcion invalida intenta de nuevo por favor");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

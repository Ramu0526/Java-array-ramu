package java_array;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_array {
    private ArrayList<String> listaAlimentos;
    private String[] alimentosFijos = {"Manzana", "Pera", "Banana", "Fresa"};

    public Java_array() {
        this.listaAlimentos = new ArrayList<>(Arrays.asList(alimentosFijos));
    }

    public void agregarAlimento(String alimento) {
        listaAlimentos.add(alimento);
        System.out.println("Alimento agregado con exito");
    }

    public void actualizarAlimento(int index, String nuevoNombre) {
        if (index >= 0 && index < listaAlimentos.size()) {
            listaAlimentos.set(index, nuevoNombre);
            System.out.println("Alimento actualizado");
        } else {
            System.out.println("Numero invalido a actualizar");
        }
    }

    public void eliminarAlimento(int index) {
        if (index >= 0 && index < listaAlimentos.size()) {
            listaAlimentos.remove(index);
            System.out.println("Alimento eliminado");
        } else {
            System.out.println("Numero invalido a eliminar");
        }
    }

    public void mostrarAlimentos() {
        System.out.println("Lista de alimentos: ");
        for (int i = 0; i < listaAlimentos.size(); i++) {
            System.out.println(i + ". " + listaAlimentos.get(i));
        }
    }

}

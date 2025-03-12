package java_array;
import java.util.Collections;
import java.util.ArrayList;

public class Lista {
    ArrayList<String> objlista;
    public Lista(){
        this.objlista = new ArrayList<>();
        this.objlista.add("gogogo");
        this.objlista.add("gigigi");
        this.objlista.add("gagaga");
        this.objlista.add("gegege");
        this.objlista.add("gugugu");
    }
    
    public void mostrarCliente(){
        for(String datito:this.objlista){
            System.out.println("Usuario : " + datito);
        }
    }

    public void Remover(){
        this.objlista.remove(2);
         System.out.println("Lista después de eliminar: " + this.objlista);
    }
    
    public void Limpiar(){
        this.objlista.clear();
        System.out.println("Lista vacia: " + this.objlista);
    }
    
    public void Tamaño(){
        System.out.println("Tamaño de la lista: " + this.objlista.size());
    }

    public void Actualizar(){
        this.objlista.set(1,"quesogogogo");
        System.out.println("Lista después de actualizar: " + this.objlista);
    }    
    
    public void Obtener(){
        System.out.println("Lista después de actualizar: " + this.objlista.get(0));
    }
    
    public void Contener(){
        if(this.objlista.contains("gogogo")){
            System.out.println("Efectivamente, si está gogogo en la list");
        }
    }
    
    public void validarContenido(){
       if(this.objlista.isEmpty()){
           System.out.println("Vacia");
       }else{
           System.out.println("Llena");
       }
    }
    
    public void Ordenar(){
        Collections.sort(this.objlista);
        System.out.println("lista ordenada : "+ this.objlista);
    }
}
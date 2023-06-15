/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.ejemploestructuralistas;
import java.util.Arrays;

/**
 *
 * @author casa
 */
public class EjemploEstructuraListas {

    public static void main(String[] args) {

        System.out.println("Colas y Pilas implementacion generica");
        
        // Instaciamiento de las clases ColaTarea
        ColaTareas<String> colaTareas = new ColaTareas<>();
        ColaTareas<Integer> colaTareasInt = new ColaTareas<>();
        ColaTareas<int[]> colaTareasArregloEnteros = new ColaTareas<>();
        ColaTareas<String[]> colaTareasArregloString = new ColaTareas<>();
        
        // Instaciamiento de las clases PilaTarea
        PilaTareas<Integer> pilaTareas = new PilaTareas<>();
        PilaTareas<ColaTareas> pilaTareasDeColas = new PilaTareas<>();

        
        // Inserccion de tareas a la cola mediante los objetos
        colaTareas.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTareas.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTareas.agregarTarea(new Tarea(33, "Tarea 33"));
        
        colaTareasInt.agregarTarea(new Tarea(3, 3));
        colaTareasInt.agregarTarea(new Tarea(4, 4));
        colaTareasInt.agregarTarea(new Tarea(55, 55));
        
        colaTareasArregloEnteros.agregarTarea(new Tarea(5, new int[]{212,21,2}));
        colaTareasArregloEnteros.agregarTarea(new Tarea(6, new int[]{213,12,1}));
        colaTareasArregloEnteros.agregarTarea(new Tarea(77, new int[]{400,10,4}));
        
        colaTareasArregloString.agregarTarea(new Tarea(7, new String[]{"a","b","c"}));
        colaTareasArregloString.agregarTarea(new Tarea(8, new String[]{"d","e","f"}));
        colaTareasArregloString.agregarTarea(new Tarea(99, new String[]{"g","h","i"}));

       
        //  Inserccion de tareas a la pila mediante los objetos
        pilaTareas.agregarTarea(new Tarea(9,9));
        pilaTareas.agregarTarea(new Tarea(10,10));
        pilaTareas.agregarTarea(new Tarea(11,11));
        
        pilaTareasDeColas.agregarTarea(new Tarea(12, colaTareas));
        pilaTareasDeColas.agregarTarea(new Tarea(13, colaTareasInt));
        pilaTareasDeColas.agregarTarea(new Tarea(14, colaTareasArregloEnteros));
        
        // Procesamiento de las tareas de la Cola<String> mediante un bucle while
        while(!colaTareas.estaVacia()) {
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();
            System.out.println("Procesando tarea de la cola: \n\t Sale --> " + tareaProcesada.getId() + " - " + tareaProcesada.getAtributo());
        }
        
        System.out.println("\n __________________________________________ \n");
        
        // 
        while(!colaTareasInt.estaVacia()) {
            Tarea<Integer> tareaProcesada = colaTareasInt.procesarTarea();
            System.out.println("Procesando tarea de la cola Int: \n\t Sale --> " + tareaProcesada.getId() + " - " + tareaProcesada.getAtributo());
        }        
        
        System.out.println("\n __________________________________________ \n");
        
        // 
        while(!colaTareasArregloEnteros.estaVacia()) {
            Tarea<int []> tareaProcesada = colaTareasArregloEnteros.procesarTarea();
            System.out.println("Procesando tarea de la cola Enteros: \n\t Sale --> " + tareaProcesada.getId() + " - " + Arrays.toString(tareaProcesada.getAtributo()));
        }        
        
        System.out.println("\n __________________________________________ \n");
        
        // 
        while(!colaTareasArregloString.estaVacia()) {
            Tarea<String []> tareaProcesada = colaTareasArregloString.procesarTarea();
            System.out.println("Procesando tarea de la cola Arreglos String: \n\t Sale --> " + tareaProcesada.getId() + " - " + Arrays.toString(tareaProcesada.getAtributo()));
        }        
        
        System.out.println("\n __________________________________________ \n");
        
        // 
        while(!pilaTareas.estaVacia()) {
            Tarea<Integer> tareaProcesada = pilaTareas.procesarTarea();
            System.out.println("Procesando tarea de la pila: \n\t Sale --> " + tareaProcesada.getId() + " - " + tareaProcesada.getAtributo());
        }
        
        System.out.println("\n __________________________________________ \n");
        
        // 
                
        while (!pilaTareasDeColas.estaVacia()) {
            Tarea<ColaTareas> colaTarea = pilaTareasDeColas.procesarTarea();
            while (!colaTarea.getAtributo().estaVacia()) {
                Tarea<?> tareaProcesada = colaTarea.getAtributo().procesarTarea();
                Object atributo = tareaProcesada.getAtributo();
                if (atributo instanceof int[]) {
                    int[] arreglo = (int[]) atributo;
                    for (int i = 0; i < arreglo.length; i++) {
                        System.out.println("Procesando tarea de la pila: \n\t Sale--> " + tareaProcesada.getId() + " - " + arreglo[i]);
                    }
                } else {
                    System.out.println("Procesando tarea de la pila: \n\t Sale--> " + tareaProcesada.getId() + " - " + atributo);
                }
            }
        }
    }
    
    //public void procesarTareaCola(Tarea<ColaTareas> pilaTareasDeColas){
    //        while (!colaTarea.getAtributo().estaVacia()) {
    //        Tarea<?> tareaProcesada = colaTarea.getAtributo().procesarTarea();
    //        Object atributo = tareaProcesada.getAtributo();
    //        if (atributo instanceof int[]) {
    //            int[] arreglo = (int[]) atributo;
    //            for (int i = 0; i < arreglo.length; i++) {
    //                System.out.println("Procesando tarea de la pila: \n\t Sale--> " + tareaProcesada.getId() + " - " + arreglo[i]);
    //            }
    //        } else if (atributo instanceof String[]) {
    //            String[] arreglo = (String[]) atributo;
    //            for (int i = 0; i < arreglo.length; i++) {
    //                System.out.println("Procesando tarea de la pila: \n\t Sale--> " + tareaProcesada.getId() + " - " + arreglo[i]);
    //            }
    //        } else {
    //            System.out.println("Procesando tarea de la pila: \n\t Sale--> " + tareaProcesada.toString());
    //        }
    //    }
    //}
}
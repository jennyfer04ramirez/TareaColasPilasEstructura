/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemploestructuralistas;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author casa
 */
public class ColaTareas<T> {
    // Atirbutos de la clase
    private Queue<Tarea<T>> colaTarea;
    // Constructor
    public ColaTareas() {
        colaTarea = new LinkedList<>();
    }
    // Getter y Setter 
    public Queue<Tarea<T>> getColaTarea() {
        return colaTarea;
    }

    public void setColaTarea(Queue<Tarea<T>> colaTarea) {
        this.colaTarea = colaTarea;
    }
    
    public void agregarTarea(Tarea<T> tarea){
        colaTarea.offer(tarea);
    }
    
    public Tarea<T> procesarTarea(){
        Tarea<T> tareaProcesada = colaTarea.poll();
        return tareaProcesada;
        // Manera mas rapida
        // return colaTarea.poll();
    }
    
    public boolean estaVacia() {
        return colaTarea.isEmpty();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemploestructuralistas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author casa
 */
public class PilaTareas<T> {
    // Atirbutos de la clase
    private Stack<Tarea<T>> pilaTarea;
    // Constructor
    public PilaTareas() {
        pilaTarea = new Stack<>();
    }
    // Getter y Setter 
    public Stack<Tarea<T>> getColaTarea() {
        return pilaTarea;
    }

    public void setColaTarea(Stack<Tarea<T>> colaTarea) {
        this.pilaTarea = colaTarea;
    }
    
    public void agregarTarea(Tarea<T> tarea){
        pilaTarea.push(tarea);
    }
    
    public Tarea<T> procesarTarea(){
        Tarea<T> tareaProcesada = pilaTarea.pop();
        return tareaProcesada;
        // Manera mas rapida
        // return pilaTarea.pop();
    }
    
    public boolean estaVacia() {
        return pilaTarea.isEmpty();
    }

    @Override
    public String toString() {
        return "PilaTareas{" + "pilaTarea=" + pilaTarea + '}';
    }
    
    
}

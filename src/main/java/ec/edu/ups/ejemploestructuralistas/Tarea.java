/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemploestructuralistas;

/**
 *
 * @author casa
 */
public class Tarea <T> {
    // Atirbutos de la clase
    private int id;
    private T atributo;
    // Constructor
    public Tarea(int id, T atributo) {
        this.id = id;
        this.atributo = atributo;
    }
    // Getter y Setter 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getAtributo() {
        return atributo;
    }

    public void setAtributo(T atributo) {
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", atributo=" + atributo + '}';
    }
}
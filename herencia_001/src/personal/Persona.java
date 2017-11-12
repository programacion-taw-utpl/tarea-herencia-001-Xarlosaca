/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author JRecords
 */
public class Persona {

    private String nombres;
    private String apellidos;
    private int edad;
    private int cedula;

    public Persona(String n, String ap, int edad, int ci) {
        establecerNombres(n);
        establecerApellidos(ap);
        establecerEdad(edad);
        establecerCedula(ci);
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public String obtenerNombre() {
        return nombres;
    }

    public void establecerApellidos(String ap) {
        apellidos = ap;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public void establecerEdad(int ed) {
        edad = ed;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerCedula(int ci) {
        cedula = ci;
    }

    public int obtenerDedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n\t%s"
                + " %s\n"
                + "\t%s Años \n"
                + "\tCI: %s\n",
                obtenerNombre(), obtenerApellidos(), obtenerEdad(), obtenerDedula());
        return cadena;
    }
}

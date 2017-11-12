/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laempresa;

import personal.Trabajador;

/**
 *
 * @author JRecords
 */
public class Empresa {

    private String nombre;
    private String siglas;
    private String ciudad;
    private Trabajador[] trabajadores;

    public Empresa(String n_e, String s, String c, Trabajador[] tr) {
        establecerNombre_e(n_e);
        establecerSiglas(s);
        establecerCiudad(c);
        establecerTrabajadores(tr);
    }

    public void establecerNombre_e(String n_e) {
        nombre = n_e;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerSiglas(String s) {
        siglas = s;
    }

    public String obtenerSiglas() {
        return siglas;
    }
    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
    public void establecerTrabajadores(Trabajador[] tr) {
        trabajadores = tr;
    }

    public Trabajador[] obtenerTrabajadores() {        
        return trabajadores;
    }

    @Override
    public String toString() {
        String trabajadores = "";
        Trabajador[] A = obtenerTrabajadores();
        for (int i = 0; i < A.length; i++) {
            trabajadores = String.format("%s%s", trabajadores, A[i]);
        }
        String cadena = String.format("EMPRESA: %s\n"
                + "SIGLAS: %s\n"
                + "CIUDAD: %s\n"
                +"LISTA DE TRABAJADORES:\n"
                + "%s",
                obtenerNombre(),obtenerSiglas(),obtenerCiudad(), trabajadores);
        return cadena;
    }
}

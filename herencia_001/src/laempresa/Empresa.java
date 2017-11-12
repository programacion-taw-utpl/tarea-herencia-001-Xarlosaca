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
    protected Trabajador[] trabajadores;

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

    @Override
    public String toString() {
        String cadena = String.format("EMPRESA: %s\n"
                + "SIGLAS: %s\n"
                + "CIUDAD: %s",
                obtenerNombre(), obtenerSiglas(), obtenerCiudad());
        return cadena;
    }
}

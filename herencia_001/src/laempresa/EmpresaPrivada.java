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
public class EmpresaPrivada extends Empresa {

    private double ventas_mesuales_fijo;
    private int numero_sucursales;

    public EmpresaPrivada(String n_e, String s, String c, int vm, int ns, Trabajador[] tr) {
        super(n_e, s, c, tr);
        establecerVentas_m(vm);
        establecerNumero_sucursales(ns);
    }

    public void establecerVentas_m(int mv) {
        ventas_mesuales_fijo = mv;
    }

    public double obtenerVentas_m() {
        return ventas_mesuales_fijo;
    }

    public void establecerNumero_sucursales(int ns) {
        numero_sucursales = ns;
    }

    public int obtenerNumero_sucursales() {
        return numero_sucursales;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n"
                + "VENTAS: $ %.2f\n"
                + "SUCURSALES: %s\n",
                super.toString(), obtenerVentas_m(), obtenerNumero_sucursales());
        return cadena;
    }
}

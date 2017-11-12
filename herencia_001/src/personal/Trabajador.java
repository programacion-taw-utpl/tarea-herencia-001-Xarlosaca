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
public class Trabajador extends Persona {

    private int costo_seguro;
    private int horas_trabajadas;
    private int costo_por_hora;

    public Trabajador(String n, String ap, int edad, int ci, int cs, int ht, int ch) {
        super(n, ap, edad, ci);
        establecerCosto_seguro(cs);
        establecerHoras_trabajadas(ht);
        establecerCosto_hora(ch);
    }

    public void establecerCosto_seguro(int cs) {
        costo_seguro = cs;
    }

    public int obtenerCosto_seguro() {
        return costo_seguro;
    }

    public void establecerHoras_trabajadas(int ht) {
        horas_trabajadas = ht;
    }

    public int obtenerHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void establecerCosto_hora(int ch) {
        costo_por_hora = ch;
    }

    public int obtenerCosto_hora() {
        return costo_por_hora;
    }

    public double obtener_sueldo() {
        double sueldo;
        sueldo = (obtenerHoras_trabajadas() * obtenerCosto_hora() + obtenerCosto_seguro());
        return sueldo;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s" + "\tSEGURO: $ %s\n"
                + "\tHORAS TRABAJADAS: %s\n"
                + "\tVALOR POR HORA: $ %.2s\n"
                + "\tSUELDO: $ %.2f\n",
                super.toString(), obtenerCosto_seguro(), obtenerHoras_trabajadas(), obtenerCosto_hora(), obtener_sueldo());
        return cadena;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_001;

import laempresa.EmpresaPrivada;
import personal.Trabajador;

/**
 *
 * @author JRecords
 */
public class Herencia_001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Trabajador t1 = new Trabajador("Ana Luisa", "Velez Alcivar", 30, 12903939, 100, 40, 10);
        Trabajador t2 = new Trabajador("Mario Anibal", "Vela Narvaez", 35, 212889, 100, 50, 10);
        Trabajador[] trab = {t1, t2};
        EmpresaPrivada ep = new EmpresaPrivada("Soluciones Software", "SS's", "Loja", 200000, 12, trab);
        System.out.println(ep);
    }

}

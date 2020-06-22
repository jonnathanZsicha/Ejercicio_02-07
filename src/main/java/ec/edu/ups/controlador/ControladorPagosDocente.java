/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.pagos.ReciboDePago2;
import java.util.Date;

/**
 *
 * @author claum
 */
public class ControladorPagosDocente {
    ReciboDePago2 reciboDePago;

    public ControladorPagosDocente() {
        this.reciboDePago = new ReciboDePago2();
    }
    
    public Date calcularMensual(Date fechaUltimoPago){
        return null;
    }
    
    
}

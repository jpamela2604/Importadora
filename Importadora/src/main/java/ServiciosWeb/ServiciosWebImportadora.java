/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosWeb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Pamela
 */
@WebService(serviceName = "ServiciosWebImportadora")
public class ServiciosWebImportadora {

    /**
     * This is a sample web service operation
     */
    /*@WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }*/
    
    @WebMethod(operationName = "validar_Sesion")
    public Boolean validar_Sesion(@WebParam(name = "username") String username,@WebParam(name = "password") String password) {
        Boolean respuesta = false;
        if (username=="sa"&&password=="1234")
        {
            respuesta=true;
        }
        return respuesta;
    }
    
    @WebMethod(operationName = "crear_Cuenta")
    public Boolean crear_Cuenta(@WebParam(name = "nombre") String nombre,
            @WebParam(name = "username") String username,
            @WebParam(name = "password") String password,
            @WebParam(name = "no_Tarjeta") String no_Tarjeta) 
    {
        Boolean respuesta = false;
        return respuesta;
    }
    
    @WebMethod(operationName = "solicitar_Catalogo_Vehiculos")
    public String solicitar_Catalogo_Vehiculos() {
        String listado_Vehiculos="";
        
        return listado_Vehiculos;
    }
    
    @WebMethod(operationName = "cotizar_Vehiculo")
    public String cotizar_Vehiculo(@WebParam(name = "linea") String linea,@WebParam(name = "modelo") String modelo) {
        String listado_Cotizaciones ="";        
        return listado_Cotizaciones;
    }
    
     @WebMethod(operationName = "comprar_Vehículo")
    public String comprar_Vehículo(@WebParam(name = "id_Cliente") Integer id_Cliente,
            @WebParam(name = "no_Tarjeta") String no_Tarjeta,
            @WebParam(name = "id_Vehiculo") Integer id_Vehiculo
    ) {
        String respuesta="";
        return respuesta;
    }
}

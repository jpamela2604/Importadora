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
    public String validar_Sesion(@WebParam(name = "username") String username,@WebParam(name = "password") String password) {
        Boolean respuesta = false;
        if (username=="sa"&&password=="1234")
        {
            respuesta=true;
        }
        String salidajson = "{\"respuesta\" : \"" + respuesta + "\"}";
        return salidajson;
    }
    
    @WebMethod(operationName = "crear_Cuenta")
    public String crear_Cuenta(@WebParam(name = "nombre") String nombre,
            @WebParam(name = "username") String username,
            @WebParam(name = "password") String password,
            @WebParam(name = "no_Tarjeta") String no_Tarjeta) 
    {   //hacer validacion de numero de tarjeta
        // verificar que no existe ese username
        
        Boolean respuesta = false;
        String salidajson = "{\"respuesta\" : \"" + respuesta + "\"}";
        return salidajson;
    }
    
    @WebMethod(operationName = "solicitar_Catalogo_Vehiculos")
    public String solicitar_Catalogo_Vehiculos() {
        String id_Vehiculo="-1";
        String marca="-1";
        String linea="-1";
        String modelo="-1";
        
        String salidajson = "{\"vehiculos\" : [{\"id_Vehiculo\" : " + id_Vehiculo + ",\"marcar\" : \"" + marca + "\",\"linea\" : \"" + linea + "\", \"modelo\" : \"" + modelo + "\"}]";
        return salidajson;
    }
    
    @WebMethod(operationName = "cotizar_Vehiculo")
    public String cotizar_Vehiculo(@WebParam(name = "id_Vehiculo") Integer id_Vehiculo,
            @WebParam(name = "marca") String marca,
            @WebParam(name = "linea") String linea,
            @WebParam(name = "modelo") String modelo) {
        double precio_Vehiculo= -1.0;
        double precio_Envio=-1.0;
        double impuesto_Sat=-1.0;
        double impuesto_Aduana=-1.0;
        double iva=-1.0;
        double isr=-1.0;
        
        String salidajson = "{ \"precio_Vehiculo\" : "+precio_Vehiculo+", \"precio_Envio\": "+precio_Envio+", \"impuesto_Sat\": "+impuesto_Sat+", \"impuesto_Aduana\" : "+impuesto_Aduana+", \"iva\" : "+iva+", \"isr\": "+isr+"}";
        return salidajson;
        
    }
    
     @WebMethod(operationName = "comprar_Vehículo")
    public String comprar_Vehículo(@WebParam(name = "id_Cliente") Integer id_Cliente,
            @WebParam(name = "no_Tarjeta") String no_Tarjeta,
            @WebParam(name = "id_Vehiculo") Integer id_Vehiculo,
            @WebParam(name = "precio_Vehiculo") double precio_Vehiculo,
            @WebParam(name = "precio_Envio") double precio_Envio,
            @WebParam(name = "impuesto_Sat") double impuesto_Sat,            
            @WebParam(name = "impuesto_Aduana") double impuesto_Aduana,
            @WebParam(name = "iva") double iva,
            @WebParam(name = "isr") double isr,
            @WebParam(name = "pais_Origen ") String pais_Origen,
            @WebParam(name = "pais_Destino  ") String pais_Destino 
    ) {
        String A="A";
        Integer noFac=-1;
        String salidajson="{\"serie\" : \""+A+"\",\"numero_Factura\" : \""+noFac+"\" }";
        
        return salidajson;
    }
}

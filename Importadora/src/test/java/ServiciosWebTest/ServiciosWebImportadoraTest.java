/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosWebTest;

import ServiciosWeb.ServiciosWebImportadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pamela
 */
public class ServiciosWebImportadoraTest {
    
     ServiciosWebImportadora request;
    public ServiciosWebImportadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        request = new ServiciosWebImportadora();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test  
     public void prueba_servicio_validar_Sesion(){
         boolean r =  this.request.validar_Sesion("sa", "1234");
         assertEquals(true,r);
     }
     
     @Test  
     public void prueba_servicio_crear_Cuenta(){
         boolean r =  this.request.crear_Cuenta("Pamela Palacios", "pam_pam", "pam123", "125-9632-524");
         assertEquals(false,r);
     }
     
     @Test  
     public void prueba_servicio_solicitar_Catalogo_Vehiculos(){
         String r =  this.request.solicitar_Catalogo_Vehiculos();
         assertEquals("",r);
     }
     @Test  
     public void prueba_servicio_cotizar_Vehiculo(){
         //linea/modelo
         String r =  this.request.cotizar_Vehiculo("C320", "2004");
         assertEquals("",r);
     }
     @Test  
     public void prueba_servicio_comprar_Vehículo(){
         String r =  this.request.comprar_Vehículo(25, "125-9632-524", 75);
         assertEquals("",r);
     }
}

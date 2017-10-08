/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosWebTestFuncional;

import com.eviware.soapui.tools.SoapUITestCaseRunner;
import org.junit.Test;

/**
 *
 * @author Pamela
 */
public class PruebaFuncional {
    

    @Test
	public void shouldExecuteAllTestCases() throws Exception{
		// given
		SoapUITestCaseRunner runner = new SoapUITestCaseRunner();
                String path="C:\\Users\\Pamela\\Desktop\\prueba\\ejemplo-soapui-project.xml";
        	//runner.setProjectFile("/home/chris/SoapUI_Projects/www-banco-com-soapui-project.xml");
                runner.setProjectFile(path);
        	//runner.setProjectProperties(properties);
        	runner.run();
	}
}

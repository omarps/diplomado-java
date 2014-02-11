/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio01a;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Omar
 */
public class Ejercicio01a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection(
                "jdbc:mysql://localhost/jasperreports", 
                "hibernate1", "hibernate1");
        
        InputStream report1 = Ejercicio01a.class.getClassLoader()
                .getResourceAsStream("report1.jasper");
        JasperReport reporte = 
                (JasperReport) JRLoader.loadObject(
                        report1);
        JasperPrint jasperPrint = 
                JasperFillManager.fillReport(
                        reporte, 
                        null, 
                        conexion);
        JRExporter exporter = new JRPdfExporter();
        exporter.setParameter(
                JRExporterParameter.JASPER_PRINT, jasperPrint);
        exporter.setParameter(
                JRExporterParameter.OUTPUT_FILE, 
                new File("reportePDF.pdf"));
        exporter.exportReport();
    }
    
}

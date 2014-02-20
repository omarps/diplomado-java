/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

/**
 *
 * @author Omar
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ParticipantesDataSource datasource
                = new ParticipantesDataSource();
        for (int i = 0; i < 10; i++) {
            Participante p = new Participante(
                    i, "Participante" + i,
                    "Usuario" + i, "Password" + i,
                    "Comentarios para " + i
            );
            p.setPuntos(i);
            datasource.addParticipante(p);
        }
        
        InputStream reporte2 = Ejercicio02.class
                .getClassLoader().getResourceAsStream(
                        "report2.jasper");
        Map<String, Object> params = new HashMap<>();
        params.put("titulo", "El Titulo del Reporte <<<<<");
        params.put("autor", "OmarPS<<<<<");
        JasperPrint jasperPrint = 
                JasperFillManager.fillReport(
                        reporte2, 
                        params,
                        datasource);
        JRExporter exporter = new JRPdfExporter();
        exporter.setParameter(
                JRExporterParameter.JASPER_PRINT, 
                jasperPrint);
        exporter.setParameter(
                JRExporterParameter.OUTPUT_FILE, 
                new File("reporte2PDF.pdf"));
        exporter.exportReport();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Omar
 */
public class ParticipantesDataSource implements JRDataSource {
    
    private List<Participante> participanteList = 
            new ArrayList<Participante>();
    private int index = -1;

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;
        
        if ("nombre".equals(jrf.getName())) {
            valor = participanteList
                    .get(index).getNombre();
        } else if ("username".equals(jrf.getName())) {
            valor = participanteList
                    .get(index).getUsername();
        } else if ("password".equals(jrf.getName())) {
            valor = participanteList
                    .get(index).getPassword();
        } else if ("comentarios".equals(jrf.getName())) {
            valor = participanteList
                    .get(index).getComentarios();
        } else if ("puntos".equals(jrf.getName())) {
            valor = participanteList
                    .get(index).getPuntos();
        }
        
        return valor;
    }

    @Override
    public boolean next() throws JRException {
        return ++index < participanteList.size();
    }
    
    public void addParticipante(Participante participante) {
        participanteList.add(participante);
    }
    
}

package com.armandoDev.negocio;

import com.armandoDev.entity.ParticipanteTipoEntity;
import com.armandoDev.exception.ErroException;
import com.armandoDev.filter.ParticipanteTipoFilter;
import com.armandoDev.service.ParticipanteTipoService;
import java.util.List;

public class ParticipanteTipoBO {
    
    public List<ParticipanteTipoEntity> getTipoParticipante(ParticipanteTipoFilter filter) throws ErroException {        
        
        try {
            
            return new ParticipanteTipoService().buscar(filter);
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ErroException(e.getMessage());
        }
        
    }
    
    public void salvarTipoParticipante(ParticipanteTipoEntity entity) throws ErroException  {
        
        try {
            
            new ParticipanteTipoService().salvar(entity);
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ErroException(e.getMessage());
        }
        
    }
    
}

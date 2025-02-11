package com.armandoDev.negocio;

import com.armandoDev.entity.ParticipanteTipoEntity;
import com.armandoDev.service.ParticipanteTipoService;
import java.util.List;

public class ParticipanteTipoBO {
    
    public List<ParticipanteTipoEntity> getTipoParticipante() throws Exception {        
        return new ParticipanteTipoService().get();
    }
    
    public void save(ParticipanteTipoEntity entity) throws Exception {
        new ParticipanteTipoService().save(entity);
    }
    
}

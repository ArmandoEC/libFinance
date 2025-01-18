package com.armandoDev.negocio;

import com.armandoDev.entity.TipoParticipanteEntity;
import com.armandoDev.service.TipoParticipanteService;
import java.util.List;

public class TipoParticipanteBO {
    
    public List<TipoParticipanteEntity> getTipoParticipante() throws Exception {        
        return new TipoParticipanteService().get();
    }
    
    public void save(TipoParticipanteEntity entity) throws Exception {
        new TipoParticipanteService().save(entity);
    }
    
}

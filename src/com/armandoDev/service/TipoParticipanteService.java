package com.armandoDev.service;

import com.armandoDev.entity.TipoParticipanteEntity;
import com.armandoDev.util.connectionFactory.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class TipoParticipanteService {
    
    public void save(TipoParticipanteEntity entity) throws Exception {

        EntityManager manager = ConnectionFactory.getConnection();
        ConnectionFactory.begin();
        manager.merge(entity);
        ConnectionFactory.commit();
        manager = null;

    }
    
    public List<TipoParticipanteEntity> get() throws Exception {
        
        EntityManager manager = ConnectionFactory.getConnection();
        StringBuilder sql = new StringBuilder();
        
        sql.append("select tp from TipoParticipanteEntity tp");
        
        TypedQuery<TipoParticipanteEntity> query = manager.createQuery(sql.toString(), TipoParticipanteEntity.class);
        
        List<TipoParticipanteEntity> list = query.getResultList();

        manager = null;
        return list;
        
    }
    
}

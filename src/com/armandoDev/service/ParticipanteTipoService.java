package com.armandoDev.service;

import com.armandoDev.entity.ParticipanteTipoEntity;
import com.armandoDev.filter.ParticipanteTipoFilter;
import com.armandoDev.util.connectionFactory.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.commons.lang.StringUtils;

public class ParticipanteTipoService {
    
    public void salvar(ParticipanteTipoEntity entity) throws Exception {

        EntityManager manager = ConnectionFactory.getConnection();
        ConnectionFactory.begin();
        manager.merge(entity);
        ConnectionFactory.commit();
        manager = null;

    }
    
    public List<ParticipanteTipoEntity> buscar(ParticipanteTipoFilter filter) throws Exception {
        
        EntityManager manager = ConnectionFactory.getConnection();
        StringBuilder sql = new StringBuilder();
        
        sql.append("select tp from TipoParticipanteEntity tp \n");
        sql.append("where tp.codigo != null \n");
        
        if (filter.getCodigo() != null) sql.append("and tp.codigo = :p1 \n");
        if (StringUtils.isNotBlank(filter.getNome())) sql.append("and tp.nome = :p2 \n");
        
        TypedQuery<ParticipanteTipoEntity> query = manager.createQuery(sql.toString(), ParticipanteTipoEntity.class);
        
        if (filter.getCodigo() != null) query.setParameter("p1", filter.getCodigo());
        if (StringUtils.isNotBlank(filter.getNome())) query.setParameter("p2", filter.getNome());
        
        List<ParticipanteTipoEntity> list = query.getResultList();

        manager = null;
        return list;
        
    }
    
}

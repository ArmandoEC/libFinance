package util.connectionFactory;

import java.sql.Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnectionFactory {

	private static EntityManagerFactory factory;
    private static EntityManager manager = null;
    private static EntityTransaction transaction;
    private static Connection conexao;
		
    public static EntityManager getConnection() {   

		if (factory == null || !factory.isOpen()) {
			factory = Persistence.createEntityManagerFactory("libFinance");
		}
        
        if(manager == null || !manager.isOpen()){
            manager = factory.createEntityManager();
        }
        
        manager.clear();
        transaction = manager.getTransaction();
        
        return manager;
        
    }
    
}

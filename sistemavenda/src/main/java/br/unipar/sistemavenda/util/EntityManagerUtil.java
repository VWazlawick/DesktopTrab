package br.unipar.sistemavenda.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {
    
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public static EntityManagerFactory getEntityManagerFactory(){
        if (emf==null) {
            emf = Persistence.createEntityManagerFactory("postgres");
            System.out.println("Conexão aberta");
        }
        return emf;
    }
    
    public static void closeEntityManangerFactory(){
        if (emf != null){
            emf.close();
            System.out.println("Conexão fechada");
        }
    }
    
    public static EntityManager getMananger(){
        if (em == null) {
            em = emf.createEntityManager();
            System.out.println("Entity mananger aberta");
        }
        return em;
    }
}

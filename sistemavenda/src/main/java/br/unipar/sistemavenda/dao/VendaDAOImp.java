/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.sistemavenda.dao;

import br.unipar.sistemavenda.model.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

/**
 *
 * @author victo
 */
public class VendaDAOImp implements VendaDAO{

    private EntityManager em;

    public VendaDAOImp(EntityManager em) {
        this.em = em;
    }
    
    
    @Override
    public Venda insert(Venda venda) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(venda);
        transaction.commit();
        //em.close();
        
        System.out.println("Venda realizada com sucesso!");
        return venda;
    }

    @Override
    public Venda update(Venda venda) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(venda);
        transaction.commit();
        em.close();
        
        System.out.println("Venda atualizada com sucesso!");
        return venda;
    }

    @Override
    public Boolean delete(Venda venda) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(venda);
            transaction.commit();
            em.close();

            System.out.println("Venda atualizada com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Venda atualizada com sucesso");
            return false;
        }
    }

    @Override
    public Venda findById(Integer id) {
        return em.find(Venda.class, id);
    }

    @Override
    public List<Venda> findAll() {
        return em.createQuery("SELECT v FROM venda v", Venda.class).getResultList();
    }
    
}

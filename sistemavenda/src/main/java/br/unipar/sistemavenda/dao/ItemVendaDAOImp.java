/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.sistemavenda.dao;

import br.unipar.sistemavenda.model.ItemVenda;
import br.unipar.sistemavenda.model.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

/**
 *
 * @author victo
 */
public class ItemVendaDAOImp implements ItemVendaDAO{
    
    private EntityManager em;

    public ItemVendaDAOImp(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public ItemVenda insert(ItemVenda itemVenda) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(itemVenda);
        transaction.commit();
        em.close();
        
        System.out.println("ItemVenda cadastrado com sucesso!");
        return itemVenda;
    }

    @Override
    public ItemVenda update(ItemVenda itemVenda) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(itemVenda);
        transaction.commit();
        em.close();
        
        System.out.println("ItemVenda atualizado com sucesso!");
        return itemVenda;
    }

    @Override
    public Boolean delete(ItemVenda itemVenda) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(itemVenda);
            transaction.commit();
            em.close();

            System.out.println("ItemVenda excluido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("ItemVenda atualizado com sucesso!");
            return false;
        }
    }

    @Override
    public List<ItemVenda> findAll() {
        return em.createQuery("SELECET iv from ItemVenda iv", ItemVenda.class).getResultList();
    }
    
}

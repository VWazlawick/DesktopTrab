/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.sistemavenda.dao;

import br.unipar.sistemavenda.model.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

/**
 *
 * @author victo
 */
public class ProdutoDAOImp implements ProdutoDAO{

    private EntityManager em;

    public ProdutoDAOImp(EntityManager em) {
        this.em = em;
    }
    
    
    @Override
    public Produto insert(Produto produto) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(produto);
        transaction.commit();
        em.close();
        
        System.out.println("Produto cadastrado com sucesso!");
        return produto;
    }

    @Override
    public Produto update(Produto produto) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(produto);
        transaction.commit();
        em.close();
        
        System.out.println("Produto atualizado com sucesso!");
        return produto;}

    @Override
    public Boolean delete(Produto produto) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(produto);
            transaction.commit();
            em.close();

            System.out.println("Produto atualizado com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Produto atualizado com sucesso!");
            return false;
        }
    }

    @Override
    public Produto findById(Integer id) {
        return em.find(Produto.class, id);
    }

    @Override
    public List<Produto> findAll() {
    return em.createQuery("SELECET p from Produto p", Produto.class).getResultList();
    }
    
}

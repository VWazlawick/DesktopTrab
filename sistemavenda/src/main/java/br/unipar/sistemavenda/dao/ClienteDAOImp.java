/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.sistemavenda.dao;


import br.unipar.sistemavenda.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;

/**
 *
 * @author victo
 */
public class ClienteDAOImp implements ClienteDAO {

    private EntityManager em;

    public ClienteDAOImp(EntityManager em) {
        this.em = em;
    }
    
    
    @Override
    public Cliente insert(Cliente cliente) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(cliente);
        transaction.commit();
        em.close();
    
        System.out.println("Cliente salvo com sucesso!");
        return cliente;
    }

    @Override
    public Cliente update(Cliente cliente) {
    
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(cliente);
        transaction.commit();
        em.close();
    
        System.out.println("Cliente atualizado com sucesso!");
        return cliente;}

    @Override
    public Boolean delete(Cliente cliente) {
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(cliente);
            transaction.commit();
            em.close();
            
            System.out.println("Cliente removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Cliente atualizado com sucesso!");
            return false;
        }
    }

    @Override
    public Cliente findById(Integer id) {
        return em.find(Cliente.class, id);
    }

    @Override
    public List<Cliente> findAll() {
        return em.createQuery("SELECT c FROM Cliente c",
                Cliente.class).getResultList();}
    
    @Override
    public List<Cliente> findCliente(String nmCliente){
        return em.createQuery("SELECT c FROM Cliente c WHERE c.nmCliente LIKE :nmCliente", 
                Cliente.class).setParameter("nmCliente","%" + nmCliente + "%").getResultList();
    }
}

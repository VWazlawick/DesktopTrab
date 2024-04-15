/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.sistemavenda.dao;

import br.unipar.sistemavenda.model.Cliente;
import java.util.List;

/**
 *
 * @author victo
 */
public interface ClienteDAO {
    Cliente insert(Cliente cliente);
    Cliente update(Cliente cliente);
    Boolean delete(Cliente cliente);
    
    Cliente findById(Integer id); 
    List<Cliente> findAll();
    List<Cliente> findCliente(String nmCliente);
}

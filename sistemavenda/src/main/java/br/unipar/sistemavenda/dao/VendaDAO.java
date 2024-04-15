/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.sistemavenda.dao;

import br.unipar.sistemavenda.model.Venda;
import java.util.List;

/**
 *
 * @author victo
 */
public interface VendaDAO {
    Venda insert(Venda venda);
    Venda update(Venda venda);
    Boolean delete(Venda venda);
    
    Venda findById(Integer id); 
    List<Venda> findAll();
}

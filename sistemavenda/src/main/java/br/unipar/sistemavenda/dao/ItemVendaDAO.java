/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.sistemavenda.dao;

import br.unipar.sistemavenda.model.ItemVenda;
import java.util.List;

/**
 *
 * @author victo
 */
public interface ItemVendaDAO {
    ItemVenda insert(ItemVenda itemVenda);
    ItemVenda update(ItemVenda itemVenda);
    Boolean delete(ItemVenda itemVenda);

    List<ItemVenda> findAll();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.sistemavenda.dao;

import br.unipar.sistemavenda.model.Produto;
import java.util.List;

/**
 *
 * @author victo
 */
public interface ProdutoDAO {
    Produto insert(Produto produto);
    Produto update(Produto produto);
    Boolean delete(Produto produto);
    
    Produto findById(Integer id); 
    List<Produto> findAll();
    List<Produto> findProduto(String dsProduto);
}

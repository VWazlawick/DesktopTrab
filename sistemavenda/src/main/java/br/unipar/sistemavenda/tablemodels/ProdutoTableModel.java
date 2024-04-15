/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.sistemavenda.tablemodels;

import br.unipar.sistemavenda.model.Produto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victo
 */
public class ProdutoTableModel extends DefaultTableModel{

    public ProdutoTableModel() {
        this.addColumn("Descrição");
    }
    
    public ProdutoTableModel(List<Produto> lista){
        this();
        
        for(Produto produto: lista){
            this.addRow(new String[] {
                produto.getDescricao()
            });
        }
    }
    
}

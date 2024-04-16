/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.sistemavenda.tablemodels;

import br.unipar.sistemavenda.model.Cliente;
import br.unipar.sistemavenda.model.ItemVenda;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victo
 */
public class ItemVendaTableModel extends DefaultTableModel{

    public ItemVendaTableModel() {
        this.addColumn("Produto:");
        this.addColumn("Quantidade:");
        this.addColumn("Valor Unitário:");
        this.addColumn("Desconto:");
        this.addColumn("Valor Total:");
    }
    
    public ItemVendaTableModel(List<ItemVenda> lista){
        this();
        
        for(ItemVenda itemVenda : lista){
            this.addRow(new String[] {
                itemVenda.getProduto().getDescricao(),
                String.valueOf(itemVenda.getQtd()),
                String.valueOf(itemVenda.getVlUnit()),
                String.valueOf(itemVenda.getDescUnit()),
                String.valueOf(itemVenda.getVlTotal())
        });
        }
    }
    
    public ItemVenda getSelectedItem(JTable table, List<ItemVenda> itens){
        int itemSelecionado = table.getSelectedRow();
        
        if(itemSelecionado!=-1){
            return itens.get(itemSelecionado);
        }else{
            return null;
        }
    }
}

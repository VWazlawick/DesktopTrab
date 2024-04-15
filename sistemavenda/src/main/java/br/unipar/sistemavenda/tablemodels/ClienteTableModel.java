/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.sistemavenda.tablemodels;

import br.unipar.sistemavenda.model.Cliente;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author victo
 */
public class ClienteTableModel extends DefaultTableModel{

    public ClienteTableModel() {
        this.addColumn("Nome");
        this.addColumn("CPF");
        this.addColumn("Telefone");
    }
    
    public ClienteTableModel(List<Cliente> lista){
        this();
        
        for(Cliente cliente : lista){
            this.addRow(new String[] {
                cliente.getNmCliente(),
                cliente.getCpf(),
                cliente.getTelefone()
            });
        }
    }
    
    public Cliente getSelectedItem(JTable table, List<Cliente> clientes){
        int itemSelecionado = table.getSelectedRow();
        
        if(itemSelecionado!=-1){
            return clientes.get(itemSelecionado);
        }else{
            return null;
        }
    }
   
    
}

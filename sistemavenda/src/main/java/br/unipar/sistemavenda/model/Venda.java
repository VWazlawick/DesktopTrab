package br.unipar.sistemavenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Venda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double valorTotal;
    private double descontoTotal;
    private int qtdItens;
    
    @ManyToOne
    private Cliente cliente;
    
    @OneToMany(mappedBy = "venda")
    private List<ItemVenda> itensVenda;
    
    public Venda() {
    }

    public Venda(int id, double valorTotal, double descontoTotal, int qtdItens, Cliente cliente, List<ItemVenda> itensVenda) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.descontoTotal = descontoTotal;
        this.qtdItens = qtdItens;
        this.cliente = cliente;
        this.itensVenda = itensVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getDescontoTotal() {
        return descontoTotal;
    }

    public void setDescontoTotal(double descontoTotal) {
        this.descontoTotal = descontoTotal;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }
    
}

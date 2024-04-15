
package br.unipar.sistemavenda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class ItemVenda {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int qtd;
    private double vlUnit;
    private double vlTotal;
    private double descUnit;
    
    @ManyToOne
    private Produto produto;
    
    @ManyToOne
    private Venda venda;

    public ItemVenda() {
    }

    public ItemVenda(Produto produto, Venda venda, int qtd, double vlUnit, double vlTotal, double descUnit) {
        this.produto = produto;
        this.venda = venda;
        this.qtd = qtd;
        this.vlUnit = vlUnit;
        this.vlTotal = vlTotal;
        this.descUnit = descUnit;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getVlUnit() {
        return vlUnit;
    }

    public void setVlUnit(double vlUnit) {
        this.vlUnit = vlUnit;
    }

    public double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(double vlTotal) {
        this.vlTotal = vlTotal;
    }

    public double getDescUnit() {
        return descUnit;
    }

    public void setDescUnit(double descUnit) {
        this.descUnit = descUnit;
    }
    
    
}

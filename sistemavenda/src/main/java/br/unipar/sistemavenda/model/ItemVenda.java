/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.sistemavenda.model;

import jakarta.persistence.Entity;

/**
 *
 * @author victo
 */
//@Entity
public class ItemVenda {
    private Produto produto;
    private Venda venda;
    private int qtd;
    private double vlUnit;
    private double vlTotal;
    private double descUnit;

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

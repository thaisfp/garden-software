/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import control.FuncoesUteis;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author thais
 */

@Entity
public class Venda implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idVenda;
    
    @Temporal (value = TemporalType.DATE)
    private Date data;
        
    private String formaPag;
    private double valorTotalVenda;
    private String hora;
    
    @ManyToOne
    @JoinColumn (name = "idCliente")
    private Cliente cliente;
    
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable (name = "Venda_TServ", 
                 joinColumns = {@JoinColumn (name = "idVenda")},
                 inverseJoinColumns = {@JoinColumn (name = "idTipoServico")}
                )
    private List<TipoServico> tipoServico =  new ArrayList<>();
    
    public Venda() {
    }

    //Sem Id
    public Venda(Date data, String hora, String formaPag, double valorTotalVenda, Cliente cliente, List<TipoServico> tipoServico) {
        this.data = data;
        this.formaPag = formaPag;
        this.valorTotalVenda = valorTotalVenda;
        this.cliente = cliente;
        this.tipoServico = tipoServico;
        this.hora = hora;
    }

    //Com Id

    public Venda(int idVenda, Date data, String hora, String formaPag, double valorTotalVenda, Cliente cliente, List<TipoServico> tipoServico) {
        this.idVenda = idVenda;
        this.data = data;
        this.formaPag = formaPag;
        this.valorTotalVenda = valorTotalVenda;
        this.cliente = cliente;
        this.tipoServico = tipoServico;
        this.hora = hora;
    }
    

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDtNascFormatada() throws ParseException {
        return FuncoesUteis.dateToStr(data);
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFormaPag() {
        return formaPag;
    }

    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<TipoServico> getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(List<TipoServico> tipoServico) {
        this.tipoServico = tipoServico;
    }

    @Override
    public String toString() {
        return "" + tipoServico + ',';
    }

}

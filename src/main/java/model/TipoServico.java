/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author thais
 */

@Entity
public class TipoServico implements Serializable{
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idTipoServico;
    
    private String nome;
    private double valor;
          
    @ManyToMany (fetch = FetchType.LAZY)
    @JoinTable (name = "Venda_TServ", 
                 joinColumns = {@JoinColumn (name = "idTipoServico")},
                 inverseJoinColumns = {@JoinColumn (name = "idVenda")}
                )
    private List<Venda> vendas = new ArrayList<>();

    public TipoServico(){    
    }
    
    //Sem Id
    public TipoServico(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    //Com Id
    public TipoServico(int idTipoServico, String nome, double valor) {
        this.idTipoServico = idTipoServico;
        this.nome = nome;
        this.valor = valor;
    }

    public int getIdTipoServico() {
        return idTipoServico;
    }

    public void setIdTipoServico(int idTipoServico) {
        this.idTipoServico = idTipoServico;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome ;
    }
    
    
    
}

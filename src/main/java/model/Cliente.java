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
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

/**
 *
 * @author thais
 */

@Entity
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idCliente;
    
    @Column (name="nomeCliente", nullable = false)
    private String nome;
    
    @Temporal (value = TemporalType.DATE)
    @Column (name = "dataNascimento")
    private Date dtNasc;
    
    @Column (unique = true, length = 14, updatable = false, nullable = false)
    private String cpf;
    
//  Relacionamento N ... 1
    @ManyToOne
    @JoinColumn (name = "idCidade")
    private Cidade cid;
    
// Relacionamento 1..N
    @OneToMany ( mappedBy = "cliente" , fetch = FetchType.LAZY)
    private List<Venda> venda = new ArrayList<>();
    
//  Relacionamento 1 para 1
    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Endereco endereco;
    
    @Column (length = 11, nullable = false)
    private String telPrimario;
    
    @Column (length = 11)
    private String telSecundario;
    
    public Cliente(){
    }
    
//  SEM ID
    public Cliente(String nome, Date dtNasc, String cpf, String rua, String bairro, 
                    String complemento, String num, String cep,String telPrimario, 
                    String telSecundario, Cidade cid) {
        
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
        this.endereco = new Endereco(rua, bairro, complemento, num, cep);
        this.endereco.setCliente(this);
        this.cid = cid;
        this.telPrimario = telPrimario;
        this.telSecundario = telSecundario;
    }   

//  COM ID
    public Cliente(int idCliente, String nome, Date dtNasc, String cpf, String rua, 
                    String bairro, String complemento, String num, String cep, 
                    String telPrimario, String telSecundario, Cidade cid) {
        
        this.idCliente = idCliente;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
        this.endereco = new Endereco(idCliente, rua, bairro, complemento, num, cep);
        this.cid = cid;
        this.telPrimario = telPrimario;
        this.telSecundario = telSecundario;
    }  

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNascFormatada() throws ParseException {
        return FuncoesUteis.dateToStr(dtNasc);
    }
    
    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelPrimario() {
        return telPrimario;
    }

    public void setTelPrimario(String telPrimario) {
        this.telPrimario = telPrimario;
    }

    public String getTelSecundario() {
        return telSecundario;
    }

    public void setTelSecundario(String telSecundario) {
        this.telSecundario = telSecundario;
    } 

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }

    public Cidade getCidade() {
        return cid;
    }

    public void setCidade(Cidade cidade) {
        this.cid = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

 
    
    
}

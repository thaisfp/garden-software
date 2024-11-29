/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 *
 * @author thais
 */

@Entity
public class Endereco implements Serializable{
    
    @Id
    private int idEndereco;
    
    private String rua;
    private String bairro;
    private String complemento;
    private String numero;
    private String cidade;
    
 
    @OneToOne
    @MapsId
    @JoinColumn(name = "idEndereco")
    private Cliente cliente;
    
    @Column (length = 9)
    private String cep;   

    public Endereco(){    
    }
    
    public Endereco(String rua, String bairro, String Complemento, String numero, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = Complemento;
        this.numero = numero;
        this.cep = cep;
        this.cidade = "";
    }

    public Endereco(int idEndereco, String rua, String bairro, String Complemento, String numero, String cep) {
        this.idEndereco = idEndereco;
        this.rua = rua;
        this.bairro = bairro;
        this.complemento = Complemento;
        this.numero = numero;
        this.cep = cep;
        this.cidade = "";
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
 
    

    
}

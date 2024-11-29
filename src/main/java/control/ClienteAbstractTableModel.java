/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.Cliente;

/**
 *
 * @author thais
 */
public class ClienteAbstractTableModel extends AbstractTableModel{
    private List<Cliente> listaItens = new ArrayList();

    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
        

    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Nome", "CPF", "Dt. Nasc", "Bairro", "Cidade", "Telefone 1"};        
        return nomesColunas[column];        
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Cliente item = listaItens.get(rowIndex);
        switch (columnIndex) {
            case 0: return item.getNome();
            case 1: return item.getCpf();
            case 2: return item.getDtNasc();
            case 3: return item.getEndereco().getBairro();
            case 4: return item.getCidade();
            case 5: return item.getTelPrimario();
            default: return null;
        }
    }
    
    public void mostrarNaTabela(){
        
        for(int i = 0; i <= listaItens.size(); i++){
            for(int j = 0; j <= 6; j++){
                getValueAt(i, j);
            }
        }   
    }
    
    public void adicionar (Cliente item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
        mostrarNaTabela();
        
    }
    
    public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }

    public Cliente getCliente(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Cliente> novaLista) {
        
        if ( novaLista.isEmpty()) {
            if ( !listaItens.isEmpty() ) {
                listaItens.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            listaItens = novaLista;
            fireTableRowsInserted( 0, listaItens.size() - 1);
        }
                
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.TipoServico;

/**
 *
 * @author thais
 */
public class ServicoVendaAbstractTableModel extends AbstractTableModel{
     private List <TipoServico> listaItens = new ArrayList();
    
    @Override
    public int getRowCount() {
        return listaItens.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int column) {
        String nomesColunas[] = {"Serviço", "Valor"};
        return nomesColunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TipoServico item = listaItens.get(rowIndex);
        
        switch (columnIndex){
            case 0: return item.getNome();
            case 1: return item.getValor();
            default: return null;
        }
    }
    
    public void adicionar(TipoServico item){
        listaItens.add(item);
        fireTableRowsInserted(listaItens.size() - 1, listaItens.size() - 1);
    }
    
    public void remover(int indice) {
        listaItens.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
    
    public TipoServico getServico(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<TipoServico> novaLista){
        if(novaLista == null){
            listaItens.clear();
            fireTableRowsDeleted(0, 0);
        } else {
            listaItens = novaLista;
            fireTableRowsInserted(0, listaItens.size() - 1);
        }
    }

    public List<TipoServico> getList() {
        return listaItens;
    }
}

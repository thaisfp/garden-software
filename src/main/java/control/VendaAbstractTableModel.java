/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;
import model.Venda;

/**
 *
 * @author thais
 */
public class VendaAbstractTableModel extends AbstractTableModel{
    private List<Venda> listaItens = new ArrayList();

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
        String nomesColunas[] = {"Cliente", "Data", "Hora", "Servico", "Forma Pag.", "Valor Total"};        
        return nomesColunas[column];        
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Venda item = listaItens.get(rowIndex);
        switch (columnIndex) {
            case 0: return item.getCliente().getNome();
            case 1: return item.getData();
            case 2: return item.getHora();
            case 3: return item.getTipoServico();
            case 4: return item.getFormaPag();
            case 5: return item.getValorTotalVenda();
            default: return null;
        }
    }
    
    public void adicionar (Venda item) {
        listaItens.add(item);
        fireTableRowsInserted( listaItens.size() - 1, listaItens.size() - 1 );
        
    }
    
    public void remover (int indice) {        
        listaItens.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }

    public Venda getVenda(int linha) {
        return listaItens.get(linha);
    }
    
    public void setLista(List<Venda> novaLista) {
        
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

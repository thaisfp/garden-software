/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import model.TipoServico;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author thais
 */
public class TipoServicoDAO extends GenericDAO{
    private List<TipoServico> pesquisar(String pesq, int tipo ) throws HibernateException  {
        List<TipoServico> lista = new ArrayList();
        
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(TipoServico.class);
            Root tabela = consulta.from(TipoServico.class);
            
            Predicate restricoes = null;
            switch(tipo) {
                case 1: restricoes = builder.like(tabela.get("nome"), pesq+"%");
                        break;                                       
            }            

            consulta.where(restricoes);
                   
            lista = sessao.createQuery(consulta).getResultList();
                                             

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
        

        return lista;   
        
    }
    
    public List<TipoServico> pesquisarPorNome (String pesq) throws HibernateException {
        return pesquisar(pesq,1);
        
    }

}

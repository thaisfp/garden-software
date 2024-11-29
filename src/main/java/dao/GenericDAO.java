/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author thais
 */
public class GenericDAO {
    
    public void inserir(Object obj) throws HibernateException{
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.save(obj);
            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException erro) {
            if(sessao != null){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
    
     public void alterar(Object obj) throws HibernateException {
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.update(obj);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
     }
     
     public void excluir(Object obj) throws HibernateException {
        Session sessao = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            sessao.delete(obj);

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
    }
     
    public List listar (Class classe) throws HibernateException{
        Session sessao = null;
        List lista = null;
        
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            //OPERAÇÕES
            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(classe);
            consulta.from(classe);
            lista = sessao.createQuery(consulta).getResultList();            

            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return lista;
    }
    
     public Object get(Class classe, int id) throws HibernateException {
        Session sessao = null;
        Object objReturn = null;
        try   {
          sessao = ConexaoHibernate.getSessionFactory().openSession();
          sessao.getTransaction().begin();

          objReturn = sessao.get(classe, id );

          sessao.getTransaction().commit();
          sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return objReturn;

    }
     
    public Object load(Class classe, int id) throws HibernateException {
        Session sessao = null;
        Object objReturn = null;
        try   {
          sessao = ConexaoHibernate.getSessionFactory().openSession();
          sessao.getTransaction().begin();

          objReturn = sessao.load(classe, id );
          objReturn.toString();

          sessao.getTransaction().commit();
          sessao.close();
        } catch ( HibernateException ex) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return objReturn;

    }
}

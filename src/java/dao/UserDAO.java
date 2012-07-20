/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo
 */
public class UserDAO {
    Session sessao = HibernateUtil.getSessionFactory().getCurrentSession(); //pega a sessao e cria a conexão
    
    public void CadastrarUser(User usuario){
        
        try{
           Transaction t = sessao.beginTransaction();   
           sessao.saveOrUpdate(usuario);
           t.commit();
           sessao.close();
           
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
       
      
        }
    }
    
}

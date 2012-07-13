/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.User;
import org.hibernate.Session;

/**
 *
 * @author Danilo
 */
public class UserDAO {
    Session sessao = HibernateUtil.getSessionFactory().getCurrentSession(); //pega a sessao e cria a conexão
    
    public void CadastrarUser(User usuario){
        
        try{
            
           sessao.save(usuario);
           sessao.beginTransaction().commit();
           sessao.close();
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}

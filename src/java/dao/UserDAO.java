/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Danilo
 */
public class UserDAO {

    Session sessao = HibernateUtil.getSessionFactory().getCurrentSession(); //pega a sessao e cria a conexão

    /**
     *
     * @author Danilo Cadastrar usuario
     */
    public void CadastrarUser(User usuario) {

        try {
            Transaction t = sessao.beginTransaction();
            sessao.saveOrUpdate(usuario);
            t.commit();
            //sessao.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());


        }
    }

    /**
     *
     * @author Danilo Update de user
     */
    public void atualizarUsuario(User usuario) {
        
        try{
            Transaction t = sessao.beginTransaction();
            sessao.update(usuario);
            t.commit();
            sessao.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    }
    
    /**
     *
     * @author Danilo carrega user
     */
      public User carregarUser(Long idUser) {  
        User usuarioCarregado = (User) sessao.get(User.class, idUser);  
        return usuarioCarregado;  
  
    }  
    
     /**
     *
     * @author Danilo BuscaLogin user
     */ 
      
      public User buscaLogin(String usuario, String password){
          
          try{
               Transaction t = sessao.beginTransaction();
               Criteria criteria = sessao.createCriteria(User.class);
               criteria.add(org.hibernate.criterion.Restrictions.eq("user", usuario));
               criteria.add(org.hibernate.criterion.Restrictions.eq("senha", password));
               return (User) criteria.list().get(0);
          }catch(Exception e){
               System.out.println(e.getMessage());
               return null;
          }
          
      }
   
      
      public User buscaUser(String usuario){
          try{
             // Transaction t = sessao.beginTransaction();
              Criteria criteria = sessao.createCriteria(User.class);
              criteria.add(org.hibernate.criterion.Restrictions.eq("user", usuario));
              return (User) criteria.list().get(0);
          }catch (Exception e){
              
          System.out.println(e.getMessage());
          return null;
               
                }
            }
     }


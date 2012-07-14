/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import dao.UserDAO;
import model.User;

/**
 *
 * @author Danilo
 */
public class CadastrarUserAction extends ActionSupport implements ModelDriven<User> {
    User user = new User();
    UserDAO userDAO = new UserDAO();
    private  String nome;
    private String password;
    private String usuario;
    private String email;
    private boolean retorno;
    
    public String cadastrarUser(){
        try{
                        
            user.setEmail(this.getEmail());
            user.setNome(this.getNome());
            user.setSenha(this.getPassword());
            user.setUser(this.getUsuario());
            
            retorno = userDAO.CadastrarUser(user);
           
            return "sucessoCadastroUser";
            /* if (retorno){
            return "sucessoCadastroUser";
            }else{
              return "erroCadastroUser";  
            } */
        }catch(Exception e){
                       
            System.out.print(e);
            return "erroCadastroUser";
        }
        
       }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    @Override
    public User getModel() {
       return user;
    }
    
    
    
}

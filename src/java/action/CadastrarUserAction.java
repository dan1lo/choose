///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package action;
//
//import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.ModelDriven;
//import dao.UserDAO;
//import model.User;
//
///**
// *
// * @author Danilo
// */
//public class CadastrarUserAction extends ActionSupport implements ModelDriven<User> {
//    User user = new User();
//    UserDAO userDAO = new UserDAO();
//    private String password;
//    private String usuario;
//    private String nomeCompleto;
//    private String mail;
//   
//
//    public String cadastrarUser(){
//        try{
//                        
//            user.setEmail(mail);
//            user.setNome(nomeCompleto);
//            user.setSenha(password);
//            user.setUser(usuario);     
//            userDAO.CadastrarUser(user);
//            return "sucessoCadastroUser";
//            
//        }catch(Exception e){
//                       
//            System.out.print(e);
//            return "erroCadastroUser";
//        }
//        
//       }
//    
//
//      public String getMail() {
//        return mail;
//    }
//
//    public void setMail(String mail) {
//        this.mail = mail;
//    }
//
//    public String getNomeCompleto() {
//        return nomeCompleto;
//    }
//
//    public void setNomeCompleto(String nomeCompleto) {
//        this.nomeCompleto = nomeCompleto;
//    }  
//    
//    @Override
//    public User getModel() {
//       return user;
//    }
//
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(String usuario) {
//        this.usuario = usuario;
//    }
//    
//    
//    
//}

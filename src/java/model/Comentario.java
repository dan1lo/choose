package model;
// Generated 31/07/2012 21:45:50 by Hibernate Tools 3.2.1.GA



/**
 * Comentario generated by hbm2java
 */
public class Comentario  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private String email;
     private String comentario;
     private int idCarro;

    public Comentario() {
    }

	
    public Comentario(String nome, String comentario, int idCarro) {
        this.nome = nome;
        this.comentario = comentario;
        this.idCarro = idCarro;
    }
    public Comentario(String nome, String email, String comentario, int idCarro) {
       this.nome = nome;
       this.email = email;
       this.comentario = comentario;
       this.idCarro = idCarro;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public int getIdCarro() {
        return this.idCarro;
    }
    
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }




}



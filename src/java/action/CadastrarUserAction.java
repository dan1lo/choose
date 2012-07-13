/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import model.User;

/**
 *
 * @author Danilo
 */
public class CadastrarUserAction extends ActionSupport implements ModelDriven<User> {

    @Override
    public User getModel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}

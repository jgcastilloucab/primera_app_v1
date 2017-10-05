package edu.ucab.controller;

import edu.ucab.dao.UserDao;
import edu.ucab.model.User;
import java.util.Optional;

/**
 *
 * @author jgcastillo
 */
public class LoginController {

    private UserDao userDao;

    public LoginController() {
        this.userDao = new UserDao();
    }

    public boolean checkUsr(String user, String psw) {
        if (user != null && (!user.equals("Indique su usuario")
                || !user.isEmpty())) {
            Optional<User> optUsr = userDao.getUser(user);
            if (optUsr.isPresent()) {
                User usr = optUsr.get();
                if (user.equalsIgnoreCase(usr.getUser())
                        && psw.equals(usr.getPassword())) {
                    Context.getInstance().getContext().put("user", usr);
                    return true;
                }
            }
        }
        return false;
    }
    
}

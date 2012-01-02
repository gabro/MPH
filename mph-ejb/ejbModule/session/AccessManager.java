package session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import local.AccessManagerLocal;

import org.jboss.ejb3.annotation.RemoteBinding;

import util.LoginToken;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

import exceptions.LoginException;

/**
 * Session Bean implementation class AccessManager
 */
@Stateless
@RemoteBinding(jndiBinding = "AccessManagerRemote")
public class AccessManager implements AccessManagerLocal {

	private EntityManager manager;
	
    /**
     * Default constructor. 
     */
    public AccessManager() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public LoginToken login(String username, String password)
			throws LoginException {
		// TODO Auto-generated method stub
		User user = manager.find(User.class, username);
		
		if (user == null) {
			
		}
		return null;
	}

	@Override
	public void logout(LoginToken token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean checkUserLogin(LoginToken token) {
		// TODO Auto-generated method stub
		return null;
	}

}

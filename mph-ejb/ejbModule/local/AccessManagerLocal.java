package local;

import javax.ejb.Local;

import util.LoginToken;
import exceptions.LoginException;

/**
 * @author Gabriele
 *
 */
@Local
public interface AccessManagerLocal {
	/**
	 * Logs the user in
	 * @param username the username of the user
	 * @param password the password of the user
	 * @return a unique LoginToken needed to call authenticated methods
	 * @throws LoginException generic login exception (e.g. login info not valid)
	 */
	LoginToken login(String username, String password) throws LoginException;
	
	/**
	 * Ends the session for the user identified by the token
	 * @param token a valid token for the user
	 */
	void logout(LoginToken token);
	
	/**
	 * Checks the validity of the token
	 * @param token
	 * @return
	 */
	Boolean checkUserLogin(LoginToken token);
}

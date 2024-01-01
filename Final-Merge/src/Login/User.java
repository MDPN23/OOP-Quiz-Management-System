/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Mikail
 */
public abstract class User {
    private String email;
    private String username;
    private String password;
    private boolean isLoggedIn;

    public User(String email, String username, String password, boolean isLoggedIn) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
    }
    
    public abstract void login(String username, String password);
    public abstract void logout();

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }
    
    public boolean isIsLoggedIn() {
        return isLoggedIn;
    }
}

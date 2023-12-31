package org.panda.tech.security.user;

/**
 * 用户名密码
 */
public class UsernamePassword {

    private String username;
    private String password;

    public UsernamePassword() {
    }

    public UsernamePassword(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

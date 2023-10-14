package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min = 5, max = 15)
    private String username;
    @Email
    private String email;
    // Verify Password
    @NotBlank
    @Size(min = 6)
    private String password;
    @NotNull(message = "Passwords do not match!")
    @NotBlank
    @Size(min = 6)
    private String verifyPassword;
    public User(){

    }
    // Pass Password

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }
    public String getVerifyPassword(){
        return verifyPassword;
    }
    // Set Verify Password

    // Check Password
    private void checkPassword(){
        if (!this.password.equals(this.verifyPassword)){
            this.verifyPassword = null;
        }
    }

}

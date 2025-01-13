package com.user.model;

public class User {
    private int id;            // Unique identifier for the user
    private String name;       // Full name of the user
    private String email;      // Email address of the user
    private String password;   // Password for authentication
    private String role;       // Role of the user, e.g., "Admin" or "User"

    // Default Constructor
    public User() {
    }

    // Parameterized Constructor
    public User(int id, String name, String email, String password, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Overriding toString() for debugging and logging
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    // Utility method to check if the user is an admin
    public boolean isAdmin() {
        return "Admin".equalsIgnoreCase(this.role);
    }
}

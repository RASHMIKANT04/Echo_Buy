package com.example.echobuy;

public class User {
        private String username;
        private String email;
        private String password;

        // Constructor
        public User(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password = password;
        }

        // Getters for user properties


        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }
    }


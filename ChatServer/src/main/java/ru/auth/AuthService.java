package ru.auth;


public interface AuthService {
    void start();
    void stop();
    String getUsernameByLoginPass(String login, String pass);
}

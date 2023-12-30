/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pengguna;

import java.util.*;
import tugas.besar.pkg2_subcatalist.*;


/**
 *
 * @author Mikail
 */
public class Mahasiswa extends User{
    private int nim;
    private ArrayList<Quiz> listQuiz;

    public Mahasiswa(int nim, String email, String username, String password, boolean isLoggedIn) {
        super(email, username, password, isLoggedIn);
        this.nim = nim;
    }

    @Override
    public void login(String username, String password) {
        if (username.equals(getUsername()) && password.equals(getPassword())) {
            setIsLoggedIn(true);
        } else {
            setIsLoggedIn(false);
        }
    }

    @Override
    public void logout() {
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttest;

import javax.swing.JFrame;

public class ClientTest {

    public static void main(String[] args) {
        
        Client chappy;
        chappy = new Client("127.0.0.1");
        chappy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chappy.startRunning();
    }    
}

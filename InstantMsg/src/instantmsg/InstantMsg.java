/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instantmsg;

import javax.swing.JFrame;

public class InstantMsg {

    public static void main(String[] args) {
        
        Server sam = new Server();
        sam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sam.startRunning();
    }
    
}

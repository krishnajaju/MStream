/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mstream;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

/**
 *
 * @author adithya
 */
public class listen implements Runnable{
    ServerSocket x;
    String mrl;
    listen(ServerSocket x,String mrl){
        this.x = x;
        this.mrl = mrl;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                Socket sock = x.accept();
                DataOutputStream dout = new DataOutputStream(sock.getOutputStream());
                dout.writeUTF(mrl);
            } catch (IOException ex) {
                
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oasis.sev;

import theadServer.EchoServer;

/**
 *
 * @author Ricardo Marcano
 */
public class OasisSev {

    
    public static void main(String[] args) {
        new Server().run();
        new EchoServer().run();
    }
    
}

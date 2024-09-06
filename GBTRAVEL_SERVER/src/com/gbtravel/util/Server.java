/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gbtravel.util;

import com.gbtravel.service.AgencyService;
import com.gbtravel.service.PassengerService;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hnjej
 */
public class Server {
    public static void main(String[] args) {
        try {
            Registry registy=LocateRegistry.createRegistry(6555);
            registy.rebind("agencyService", new AgencyService());
            registy.rebind("passengerService", new PassengerService());
            
            System.out.println("Server started...");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

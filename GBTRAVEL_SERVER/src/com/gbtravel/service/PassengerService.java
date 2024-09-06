/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gbtravel.service;

import com.gbtravel.dao.PassengerDAO;
import com.gbtravel.model.Passenger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author hnjej
 */
public class PassengerService extends UnicastRemoteObject implements PassengerServiceInterface {

    public PassengerService() throws RemoteException {
        super();
    }

    @Override
    public void savePassenger(Passenger passenger) throws RemoteException {
        PassengerDAO dao = new PassengerDAO();
        dao.savePassenger(passenger);
    }

}

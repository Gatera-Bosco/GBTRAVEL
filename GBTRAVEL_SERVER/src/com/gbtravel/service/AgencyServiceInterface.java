/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gbtravel.service;

import com.gbtravel.model.Agency;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hnjej
 */
public interface AgencyServiceInterface extends Remote{
    public void saveAgency(Agency agency) throws RemoteException;
    public void updateAgency(Agency agency) throws RemoteException;
}
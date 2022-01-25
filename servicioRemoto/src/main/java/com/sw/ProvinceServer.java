/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sw;

/**
 *
 * @author eusebioajas
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
 
/**
 * Server
 * 
 */
public class ProvinceServer {
 
  public static void main(String[] args) {
    try {
      //Create and get reference to rmi registry
      Registry registry = LocateRegistry.createRegistry(1099);
 
      //Instantiate server object
      ProvinceObject po = new ProvinceObject();
 
      //Register server object
      registry.rebind("Province", po);
      System.out.println("ProvinceServer is created!!!");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
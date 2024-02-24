/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientsingle;

/**
 *
 * @author OMAR HC
 */
public class Singleton {
    private static Singleton pSingleton;  //null
    private Singleton(){}
    public static Singleton getInstance(){
        if (pSingleton==null)
            pSingleton = new Singleton();
    return pSingleton;
    }
}

//ctrl+shiff+c
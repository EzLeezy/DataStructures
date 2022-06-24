/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.dynamicarray;

/**
 *
 * @author leecampbell
 */
public class DynamicArray {

    public static void main(String[] args) {
        Array ar =new Array();
        
        //DynamicArr ar = new DynamicArr();
        ar.add(20);
        ar.add(50);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(6);
        ar.add(5);
        ar.add(10);
        ar.add(11);
        ar.add(22);
        ar.add(55);
        ar.add(33);
        ar.add(44);
        ar.add(88);


        System.out.println("Size : " + ar.size());

        System.out.println(ar.toString());
        //Size : 15
        //[ 20, 50, 1, 2, 3, 4, 6, 5, 10, 11, 22, 55, 33, 44, 88 ] 
        
        
        ar.add(99);
        ar.add(77);
        
        System.out.println(ar.toString()); //[ 20, 50, 1, 2, 3, 4, 6, 5, 10, 11, 22, 55, 33, 44, 88, 99, 77 ] - over limit set of 16

        
        System.out.println(ar.get(0)); //20
        
        System.out.println(ar.indexOf(99)); //15
        System.out.println(ar.indexOf(77)); //16
       
        
        ar.add(66);
        System.out.println(ar.toString());   
    
        
         ar.add(20);
        ar.add(50);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(6);
        ar.add(5);
        ar.add(10);
        ar.add(11);
        ar.add(22);
        ar.add(55);
        ar.add(33);
        ar.add(44);
        ar.add(88);
       
        ar.add(20);
        ar.add(50);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(6);
        ar.add(5);
        ar.add(10);
        ar.add(11);
        ar.add(22);
        ar.add(55);
        ar.add(33);
        ar.add(44);
        ar.add(88);
        
        System.out.println(ar.size()); //48
        System.out.println(ar.toString());
        //  [ 20, 50, 1, 2, 3, 4, 6, 5, 10, 11, 22, 55, 33, 44, 88, 99, 77, 66, 20, 50, 1, 2, 3, 4, 
        //      6, 5, 10, 11, 22, 55, 33, 44, 88, 20, 50, 1, 2, 3, 4, 6, 5, 10, 11, 22, 55, 33, 44, 88 ] 
    }
}

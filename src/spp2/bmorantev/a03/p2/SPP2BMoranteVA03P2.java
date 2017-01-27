/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmorantev.a03.p2;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class SPP2BMoranteVA03P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double n;
    Scanner sc=new Scanner (System.in);
    //Ingresar exponente
        System.out.println("x=");
        int x=sc.nextInt();
        n= Math.pow(2,x);
        System.out.println("n= "+n);
    }
    
}

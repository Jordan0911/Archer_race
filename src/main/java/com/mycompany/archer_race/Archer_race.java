/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.archer_race;

/**
 *
 * @author colombo.jordan
 */
public class Archer_race {

    public static void main(String[] args) {
        
        Archer n1=new Archer("number one");
        Archer n2=new Archer("number two");
        for(int i=0;i<5;i++){
            n1.Shoot(i);
            n2.Shoot(i);
        }
        if(n1.Final_score()>n2.Final_score()){
            System.out.println(n1.GetName()+" won!");
        }
        else if(n1.Final_score()<n2.Final_score()){
            System.out.println(n2.GetName()+" won!");
        }
        else{
         System.out.println(" the archers have tied");   
        }
    }
}

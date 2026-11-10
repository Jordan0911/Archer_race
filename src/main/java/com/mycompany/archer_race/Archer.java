/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.archer_race;
import java.util.Random;

/**
 *
 * @author colombo.jordan
 */
public class Archer {
 Random l=new Random();
 private String name;

 private int[] score_per_shot=new int[5];

    public Archer(String name) {
        this.name = name;
      
    }
    void Shoot(int current_shot){
        int n=0;
        n=l.nextInt(1,11);
        score_per_shot[current_shot-1]=n;
        
    }
    int Final_score(){
        int d=0,result=0,to_be_deleted=0;
        for(int s=0;s<3;s++){   
            
            for(int i=0;i<5;i++){
                
                if(d<score_per_shot[i]){
                    d=score_per_shot[i];
                    to_be_deleted=i;
                }       
            }
            
            result+=d;
            score_per_shot[to_be_deleted]=0;
            to_be_deleted=0;
            d=0;
        }
        return result;
    }
    String GetName(){
        return name;
    }
    
}

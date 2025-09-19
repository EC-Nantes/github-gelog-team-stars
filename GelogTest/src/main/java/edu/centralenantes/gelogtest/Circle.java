/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.gelogtest;

/**
 *
 * @author srodr
 */
public class Circle {
    private int rayon;

    public Circle(int rayon) {
        this.rayon = rayon;
    }
    
    public Circle(){
        this.rayon = 0;
    };
    
    public Circle(Circle c){
        this.rayon = c.rayon;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
    
    
    public float perimetre(){
        float reponse = 0;
        reponse = (float) (Math.PI*2 *this.rayon);
        return reponse;
    }
    
    
}

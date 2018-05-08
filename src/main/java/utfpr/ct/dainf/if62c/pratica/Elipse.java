/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

public class Elipse implements FiguraComEixos {
    public double r;
    public double s;
    
    public Elipse(double r, double s){
        this.r=r;
        this.s=s;
    }

   
    @Override
    public double getArea() {
    return Math.PI*r*s;
    
}
    @Override
    public double getPerimetro(){
        return Math.PI*(3*(r+s) - Math.sqrt( (3*r+s)*(r+3*s)));
    }

    @Override
     public String getNome(){
        return "Elipse";
    }
    
    @Override
    public double getEixoMaior(){
        return r > r ? r : s;
    }
    
    @Override
    public double getEixoMenor(){
        return r < s ? r : s;
    }
}

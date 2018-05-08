/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

public class Pratica42 {

    public static void main(String[] args) {
        Elipse e = new Elipse(4.0, 3.0);
        System.out.println("Elipse de eixo 4 e 3");
        System.out.println("Area:" + e.getArea());
        System.out.println("Perimetro:" + e.getPerimetro());

        System.out.println();

        Circulo c = new Circulo(5.0);
        System.out.println("Circulo de raio 5");
        System.out.println("Area:" + c.getArea());
        System.out.println("Perimetro:" + c.getPerimetro());
    }
}

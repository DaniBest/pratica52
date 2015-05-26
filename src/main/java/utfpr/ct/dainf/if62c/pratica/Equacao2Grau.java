/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author DANIEL
 * @param <T>
 */
public class Equacao2Grau<T extends Number> {
    
    private T a;
    private T b;
    private T c;

    public Equacao2Grau(T a, T b, T c) {
        if(a.doubleValue() == 0) {
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    public T getC() {
        return c;
    }
    
    public void setA(T a) {
        if(a.doubleValue() == 0) {
            throw new RuntimeException("Coeficiente a não pode ser zero");
        }
        this.a = a;
    }
    
    public void setB(T b) {
        this.b = b;
    }
    
    public void setC(T c) {
        this.c = c;
    }
    
    public double getRaiz1() {
        if((Math.pow(b.doubleValue(), 2)-4*a.doubleValue()*c.doubleValue())<0) {
            throw new RuntimeException("Equação não tem solução real");
        }
        return (-b.doubleValue()-Math.sqrt(Math.pow(b.doubleValue(), 2)-4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue());
    } 
    
    public double getRaiz2() {
        if((Math.pow(b.doubleValue(), 2)-4*a.doubleValue()*c.doubleValue())<0) {
            throw new RuntimeException("Equação não tem solução real");
        }
        return (-b.doubleValue()+Math.sqrt(Math.pow(b.doubleValue(), 2)-4*a.doubleValue()*c.doubleValue()))/(2*a.doubleValue());
    }
    
}

package poo.model.impl;

import poo.model.Figura;
import poo.model.param.ParamTriangulo;

public class Triangulo extends ParamTriangulo implements Figura {
    
    public double calcularPerimetro() {
        return this.ladoA + this.ladoB + this.ladoC;
    }
    
    public double calcularArea() {
        return this.base * this.altura / 2.0D;
    }
}

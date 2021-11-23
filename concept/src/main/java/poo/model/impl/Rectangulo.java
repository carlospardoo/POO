package poo.model.impl;

import poo.model.Figura;
import poo.model.param.ParamBaseH;

public class Rectangulo extends ParamBaseH implements Figura {
    public double calcularPerimetro() {
        return 2.0D * (this.base + this.altura);
    }
    
    public double calcularArea() {
        return this.base * this.altura;
    }
}

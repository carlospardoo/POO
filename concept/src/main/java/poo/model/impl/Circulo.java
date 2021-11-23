package poo.model.impl;

import poo.model.Figura;
import poo.model.param.ParamRadio;

public class Circulo extends ParamRadio implements Figura {
    
    public static final double PI = 3.1416D;
  
    public double calcularPerimetro() {
      return 6.2832D * this.radio;
    }
    
    public double calcularArea() {
      return 3.1416D * Math.pow(this.radio, 2.0D);
    }
}

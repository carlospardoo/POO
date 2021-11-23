package poo.model.param;

public abstract class ParamTriangulo extends ParamBaseH {

    protected double ladoA;
    
    protected double ladoB;
    
    protected double ladoC;
    
    public final double getLadoA() {
        return this.ladoA;
    }
    
    public final void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    
    public final double getLadoB() {
        return this.ladoB;
    }
    
    public final void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    
    public final double getLadoC() {
        return this.ladoC;
    }
    
    public final void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
}

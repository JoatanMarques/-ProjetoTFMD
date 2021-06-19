public class Operações extends Comodos{
    private double m2;
    private double resultado;

    public double getM2() {
        return this.m2;
    }

    private void setM2() {
        this.m2 = getComprimento() * getLargura();
    }

    public double getResultado() {
        return this.resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    private void contas(){
        setResultado(this.m2 * getValor());
    }
}

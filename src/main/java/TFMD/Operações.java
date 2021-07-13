package TFMD;
public class Operações extends Comodos{
    private double m2;
    private double resultado;

    public Operações(double largura, double comprimento, double valor) {
        setM2();
        setLargura(largura);
        setComprimento(comprimento);
        setValor(valor);
    }

    public double getM2() {
        return this.m2;
    }

    private void setM2() {
        this.m2 = getLargura()*getComprimento();
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

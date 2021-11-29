public class Telefone {
    private int ddd;
    private String numero;
    private char tipo;
    private boolean preferencial;
    private String contato;

    public Telefone(int ddd, String numero, char tipo, boolean preferencial, String contato) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
        this.preferencial = preferencial;
        this.contato = contato;
    }

    public Telefone() {

    }
}

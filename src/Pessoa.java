public abstract class Pessoa {
    private String nome;
    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' ;
    }
}

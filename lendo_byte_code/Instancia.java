
public class Instancia {

    public Double somar(Double a, Double b) {
        return a + b;
    }
    private String nome;

    public Integer adicionarVariavel(Integer a, Integer b) {
        Integer c = a + b;
        return c;
    }

    public String getString() {
        return nome;
    }

    public String nomeCompleto(String sobreNome) {
        return nome.concat(sobreNome);
    }
}

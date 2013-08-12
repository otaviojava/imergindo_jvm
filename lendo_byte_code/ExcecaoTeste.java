
public class ExcecaoTeste {

    public int test() throws Exception {
        return 101293;
    }

    public int dentroTry(int a, int b) {

        try {
            return a + b;
        } catch (Exception e) {

            return 0;
        }

    }

    public void tempoExecucao(int a, int b) {
        throw new RuntimeException();
    }
}


public class SincronimoTeste {

    void testeando(String f) {
        synchronized (f) {
            algo();
        };
    }

    public void algo() {
        int a = 4;
    }
}

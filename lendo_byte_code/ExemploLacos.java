
public class ExemploLacos {

    public void exemploFor() {
        int i;
        for (i = 0; i < 100; i++) {
            ;
        }

    }

    public void exemploWhile() {
        int i = 0;
        while (i < 100) {
            i++;
        }
    }

    public int switchesDistante(int escolha) {
        switch (escolha) {
            case 4:
                return 0;
            case -3:
                return 1;
            case 2:
                return 2;
            default:
                return -1;
        }

    }

    public int switches(int escolha) {
        switch (escolha) {
            case 0:
            case 3:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return -1;
        }


    }
}

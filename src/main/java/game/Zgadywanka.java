package game;

public class Zgadywanka {
    Gracz p1;
    Gracz p2;
    Gracz p3;

    public void rozpocznijGre() {
        p1 = new Gracz();
        p2 = new Gracz();
        p3 = new Gracz();

        int typp1 = 0;
        int typp2 = 0;
        int typp3 = 0;

        boolean p1odgadl = false;
        boolean p2odgadl = false;
        boolean p3odgadl = false;

        int liczbaOdgadywana = (int) (Math.random() *10);
        System.out.println("Myslę o liczbie z zakresu 0-9....");

        while (true) {
            System.out.println("Należy wytypować liczbę: " + liczbaOdgadywana);

            p1.zgaduj();
            p2.zgaduj();
            p3.zgaduj();
        }
    }
}

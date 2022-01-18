package colectii;

import beans.Tren;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
import javax.swing.JList;
import obspattern.SubiectTren;
import obspattern.TrenListener;

public class ColectieTrenuri implements SubiectTren {

    private ArrayList<Tren> trenuri = new ArrayList<Tren>();
    private static ColectieTrenuri singleton = null;

    private ColectieTrenuri() {
    }

    public static ColectieTrenuri getInstance() {
        if (singleton == null) {
            singleton = new ColectieTrenuri();
        }
        return singleton;
    }

    public void adaugaTren(Tren tren) {
        trenuri.add(tren);
        notifica1();
    }

    public void stergeTren(Tren tren) {
        trenuri.remove(tren);

        notifica1();
    }

    public void modificaTren(Tren tren) {

        trenuri.stream();
        notifica1();
    }

    public ArrayList<Tren> getTrenuri() {
        return trenuri;
    }

    @Override
    public void addTrenListener(TrenListener tl) {
        obs.add(tl);
    }

    @Override
    public void notifica1() {
        for (TrenListener tl : obs) {
            tl.trenModificat();
        }
    }
}

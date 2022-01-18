package obspattern;

import java.util.ArrayList;

public interface SubiectTren {

    ArrayList<TrenListener> obs = new ArrayList<TrenListener>();

    public void addTrenListener(TrenListener tl);

    public void notifica1();
}

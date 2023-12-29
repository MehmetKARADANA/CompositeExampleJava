import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Yonetici y1 = new Yonetici("Mehmet");
        Tasarimci t1 = new Tasarimci("Ezel");
        Gelistirici g1 = new Gelistirici("Eyşan");
        Gelistirici g2 = new Gelistirici("Tefo");

        Ekip e1 = new Ekip(y1);
        e1.ekle(t1);
        e1.ekle(g1);
        e1.ekle(g2);
        e1.bilgiGoster();

        Yonetici y2 = new Yonetici("Holt");
        Tasarimci t2 = new Tasarimci("Peralta");
        Gelistirici g12 = new Gelistirici("Santiago");
        Gelistirici g22 = new Gelistirici("Boyle");

        Ekip e2 = new Ekip(y2);
        e2.ekle(t2);
        e2.ekle(g2);
        e2.ekle(g22);
        e2.bilgiGoster();
    }
}

abstract class Personel {
    private String name;

    /*protected Personel() {
    }*/

    protected Personel(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bilgiGoster() {
    }
}

class Ekip extends Personel {
    private Personel personel;
    private List<Personel> personelList;

    public Ekip(Personel personel) {
        super(personel.getName());
        setPersonel(personel);
        setPersonelList(new ArrayList<>());
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public void setPersonelList(List<Personel> personelList) {
        this.personelList = personelList;
    }

    public void ekle(Personel p) {
        personelList.add(p);
    }

    public void sil(Personel p) {
        personelList.remove(p);
    }

    public void bilgiGoster() {
        System.out.println("Isim: " + getName());

        for (Personel p : personelList) {
            System.out.println("-->Isim: " + p.getName());
        }
        System.out.println("***********");
    }
}

class Yonetici extends Personel {
    public Yonetici(String name) {
        super(name);
    }

    public void bilgiGoster() {
        System.out.println("İsim: " + getName());
    }
}

class Gelistirici extends Personel {
    public Gelistirici(String name) {
        super(name);
    }

    public void bilgiGoster() {
        System.out.println("İsim: " + getName());
    }
}

class Tasarimci extends Personel {
    public Tasarimci(String name) {
        super(name);
    }

    public void bilgiGoster() {
        System.out.println("İsim: " + getName());
    }
}

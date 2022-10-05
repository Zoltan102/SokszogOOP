package hu.petrik.sokszogoop;

import java.util.*;

public class Sokszogek {
    private List<Sokszog> sokszogek;

    public Sokszogek() {
        this.sokszogek = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < rnd.nextInt(100); i++) {
            int a = rnd.nextInt(3);
            switch (a) {
                case 0:
                    Haromszog h = new Haromszog();
                    sokszogek.add(h);
                    break;
                case 1:
                    Paralelogramma p = new Paralelogramma();
                    sokszogek.add(p);
                    break;
                case 2:
                    Hatszog hat = new Hatszog();
                    sokszogek.add(hat);
                    break;
            }
        }
    }

    public double osszKerulet() {
        double sum = 0;
        for (Sokszog s : sokszogek) {
            sum += s.getKerulet();
        }
        return sum;
    }

    public double osszTerulet() {
        double sum = 0;
        for (Sokszog s : sokszogek) {
            sum += s.getTerulet();
        }
        return sum;
    }

    public int maxTerulet() {
        double maxTerulet = sokszogek.get(0).getTerulet();
        int index = 0;
        for (int i = 1; i < sokszogek.size(); i++) {
            if (sokszogek.get(i).getTerulet() > maxTerulet) {
                index = i;
                maxTerulet = sokszogek.get(i).getTerulet();
            }
        }
        return index + 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator var = this.sokszogek.iterator();
        while (var.hasNext()) {
            Sokszog s = (Sokszog) var.next();
            sb.append(s.toString()).append(System.lineSeparator());
        }
        sb.append(String.format("Össz. kerület: %f Össz. terület: %f Legnagyobb területű: %d", osszKerulet(), osszTerulet(), maxTerulet()));
        return sb.toString();
    }
}

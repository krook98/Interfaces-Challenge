import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable{
    private String name;
    private int hp;
    private int level;

    public Monsters(String name, int hp, int level) {
        this.name = name;
        this.hp = hp;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hp); //making hp a String
        values.add(2, "" + this.level);
        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if((savedValues != null) && (savedValues.size() > 0)) {
            this.name = savedValues.get(0);
            this.hp = Integer.parseInt(savedValues.get(1));
            this.level = Integer.parseInt(savedValues.get(2));
        }

    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                '}';
    }
}

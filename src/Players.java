import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable {
    private String name;
    private int hp;
    private String weapon;

    public Players(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.weapon = "Basic sword";
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hp); //making hp a String
        values.add(2, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if((savedValues != null) && (savedValues.size() > 0)) {
            this.name = savedValues.get(0);
            this.hp = Integer.parseInt(savedValues.get(1));
            this.weapon = savedValues.get(2);
        }

    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}

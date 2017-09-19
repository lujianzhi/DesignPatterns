import java.util.List;

/**
 * Created by Ian.Lu on 2017/2/6.
 * Project : DesignPatterns
 */
public class Entity {
    private String name;

    private List<Entity> subs;

    public Entity(String name, List<Entity> subs) {
        this.name = name;
        this.subs = subs;
    }

    public Entity(String name) {
        this.name = name;
    }

    public List<Entity> getSubs() {
        return subs;
    }

    public void setSubs(List<Entity> subs) {
        this.subs = subs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", subs=" + subs +
                '}' + "\n";
    }
}

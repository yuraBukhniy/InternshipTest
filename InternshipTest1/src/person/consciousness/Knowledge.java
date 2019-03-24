package person.consciousness;

public class Knowledge {
    int level;
    public static final int AVG_LEVEL = 50; //порогове значення рівня знань

    public Knowledge(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

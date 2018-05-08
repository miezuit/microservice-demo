package demo.application.command;

public class ProvisionHeroCommand {
    private String name;
    private Integer power;
    private Integer life;

    public ProvisionHeroCommand(String name, Integer power, Integer life) {
        this.name = name;
        this.power = power;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getLife() {
        return life;
    }
}

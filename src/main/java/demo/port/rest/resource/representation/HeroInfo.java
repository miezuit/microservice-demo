package demo.port.rest.resource.representation;


import demo.domain.Hero;

public class HeroInfo {
    private String name;
    private Integer power;
    private Integer life;

    public HeroInfo(String name, Integer power, Integer life) {
        this.name = name;
        this.power = power;
        this.life = life;
    }

    public static HeroInfo fromHero(Hero hero) {
        if (hero == null) {
            return null;
        }
        return new HeroInfo(
                hero.getName(),
                hero.getPower(),
                hero.getLife()
        );
    }
}

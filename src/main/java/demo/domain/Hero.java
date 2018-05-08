package demo.domain;

import demo.domain.common.DomainEntity;
import javax.persistence.Entity;

@Entity
public class Hero extends DomainEntity {
    private String name;
    private Integer power;
    private Integer life;

    public Hero() {
    }

    public Hero(String name, Integer power, Integer life) {
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

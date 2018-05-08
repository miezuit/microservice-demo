package demo.domain.repository;

import demo.domain.Hero;

import java.util.List;

public interface HeroRepository {

    Hero save(Hero hero);

    Hero findById(Long id);

    Hero findFirstByName(String name);
}

package demo.infrastructure.persistence.jpa.repository;

import demo.domain.Hero;
import demo.domain.repository.HeroRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaHeroRepository extends JpaRepository<Hero,Long>, HeroRepository {
}

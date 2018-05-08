package demo.application;

import demo.application.command.ProvisionHeroCommand;
import demo.domain.Hero;
import demo.domain.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvisioningApplicationService {

    private final HeroRepository heroRepository;

    @Autowired
    public ProvisioningApplicationService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public void provisionHero(ProvisionHeroCommand command) {
        Hero hero = new Hero(command.getName(), command.getPower(), command.getLife());

        heroRepository.save(hero);
    }

    public Hero findHeroByName(String name) {
        return heroRepository.findFirstByName(name);
    }

}

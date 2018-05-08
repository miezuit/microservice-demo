package demo.port.rest.controller;

import demo.application.ProvisioningApplicationService;
import demo.application.command.ProvisionHeroCommand;
import demo.domain.Hero;
import demo.port.rest.resource.representation.HeroInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hero")
public class ProvisioningController {

    private final ProvisioningApplicationService provisioningService;

    @Autowired
    public ProvisioningController(ProvisioningApplicationService provisioningService) {
        this.provisioningService = provisioningService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void provisionHero(@RequestBody ProvisionHeroCommand command) {
        provisioningService.provisionHero(command);
    }

    @RequestMapping(path = "/named/{name}", method = RequestMethod.GET)
    public HeroInfo findHeroName(@PathVariable String name) {
        return HeroInfo.fromHero(provisioningService.findHeroByName(name));
    }
}

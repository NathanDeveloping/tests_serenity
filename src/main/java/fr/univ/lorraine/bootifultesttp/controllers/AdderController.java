package fr.univ.lorraine.bootifultesttp.controllers;

import fr.univ.lorraine.bootifultesttp.services.AdderService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value="/adder", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class AdderController {

    private AdderService adderService;

    public AdderController(AdderService adderService) {
        this.adderService = adderService;
    }

    @GetMapping("/current")
    public int currentNum() {
        return this.adderService.getNum();
    }

    @PostMapping
    public int add(@RequestParam int num) {
        return adderService.add(num);
    }
}

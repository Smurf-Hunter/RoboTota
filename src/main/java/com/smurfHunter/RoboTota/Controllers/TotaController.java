package com.smurfHunter.RoboTota.Controllers;

import com.smurfHunter.RoboTota.Model.Tota;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TotaController {

    @GetMapping("/{word}")
    public Tota repeat(@PathVariable String word){
        return new Tota(word);
    }

}

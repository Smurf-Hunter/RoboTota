package com.smurfHunter.RoboTota.Controllers;

import com.smurfHunter.RoboTota.Model.Tota;
import org.springframework.web.bind.annotation.*;

@RestController
public class TotaController {

    @PostMapping("/")
    public Tota repeat(@RequestBody Tota tota){

        return tota;

    }

}

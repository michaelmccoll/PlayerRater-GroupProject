package PlayerRater.PlayerRater.controllers;

import PlayerRater.PlayerRater.models.Player;
import PlayerRater.PlayerRater.repositories.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    PlayerRepository playerRepository;


}

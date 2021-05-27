package PlayerRater.PlayerRater.controllers;

import PlayerRater.PlayerRater.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {

    @Autowired
    MatchRepository matchRepository;


}

package pro.tynan.Music_Organizer.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/music")
@CrossOrigin
public class MusicController {

    private final MusicRepository repository;
}

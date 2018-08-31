package cl.zenta.example.graphql.speakers.controllers;

import cl.zenta.example.graphql.speakers.entities.Speaker;
import cl.zenta.example.graphql.speakers.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpeakerController {


    @Autowired
    private SpeakerRepository repo;

    @RequestMapping(method = RequestMethod.GET, value="/speakers")
    public Iterable<Speaker> findAll( ){
        Iterable<Speaker> listPos = repo.findAll();
        return listPos;
    }

    @RequestMapping(method = RequestMethod.GET , value="/speakers/{id}")
    public Speaker findById(@PathVariable("id") Integer id ){
        return repo.findById(id).get();
    }


    @RequestMapping(method = RequestMethod.POST, value="/speakers" )
    public void save( @RequestBody Speaker pos){
        repo.save(pos);
    }

    @RequestMapping(method = RequestMethod.PUT , value="/speakers/{id}")
    public void update( @PathVariable("id") Integer id , Speaker pos){
    }

    @RequestMapping(method = RequestMethod.DELETE , value="/speakers/{id}")
    public void delete( @PathVariable("id") Integer id ){
        Speaker ob = new Speaker();
        ob.setId(id);
        repo.delete(ob);
    }

}

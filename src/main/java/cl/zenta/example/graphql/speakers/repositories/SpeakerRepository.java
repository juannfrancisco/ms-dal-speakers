package cl.zenta.example.graphql.speakers.repositories;

import cl.zenta.example.graphql.speakers.entities.Speaker;
import org.springframework.data.repository.CrudRepository;

public interface SpeakerRepository extends CrudRepository<Speaker, Integer> {
}

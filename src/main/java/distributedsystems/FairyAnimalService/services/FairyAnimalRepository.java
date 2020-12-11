package distributedsystems.FairyAnimalService.services;


import distributedsystems.FairyAnimalService.model.FairyAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FairyAnimalRepository extends JpaRepository <FairyAnimal, UUID > {
    FairyAnimal findByName(String name);
    FairyAnimal findByFairyAnimalId(UUID id);
}

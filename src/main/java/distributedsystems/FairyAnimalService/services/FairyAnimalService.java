package distributedsystems.FairyAnimalService.services;

import distributedsystems.FairyAnimalService.model.FairyAnimal;

import java.util.List;
import java.util.UUID;

public interface FairyAnimalService {
    FairyAnimal addFairyAnimal(FairyAnimal FairyAnimal);

    List<FairyAnimal> getAll();

    FairyAnimal getById(UUID id);

    FairyAnimal getByName(String name);

    void deleteFairyAnimalById(UUID id);
}

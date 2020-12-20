package distributedsystems.FairyAnimalService.api;
import distributedsystems.FairyAnimalService.model.FairyAnimal;
import distributedsystems.FairyAnimalService.services.FairyAnimalService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fairyAnimal")
@AllArgsConstructor
@NoArgsConstructor
public class FairyAnimalRestController {

    @Autowired
    private FairyAnimalService FairyAnimalService;

    @PostMapping
    public FairyAnimal createFairyAnimal(@RequestBody FairyAnimal FairyAnimal) {
        return FairyAnimalService.addFairyAnimal(FairyAnimal);
    }

    @GetMapping
    public List<FairyAnimal> getAllFairyAnimals() {
        return FairyAnimalService.getAll();
    }

    @GetMapping(path = "{id}")
    public FairyAnimal getFairyAnimalById(@PathVariable(value = "id") UUID id) {
        FairyAnimal FairyAnimal = FairyAnimalService.getById(id);
        return FairyAnimal;
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Void> deleteFairyAnimal(@PathVariable(value = "id") UUID id)  {
        FairyAnimalService.deleteFairyAnimalById(id);
        return ResponseEntity.noContent().build();
    }

}

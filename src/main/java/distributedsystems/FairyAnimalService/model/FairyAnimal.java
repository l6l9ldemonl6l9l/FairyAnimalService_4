package distributedsystems.FairyAnimalService.model;

import distributedsystems.FairyAnimalService.FairyAnimalRequest;
import distributedsystems.FairyAnimalService.FairyAnimalResponse;
import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@EnableAutoConfiguration
@Entity
@Data
public final class FairyAnimal{
    @Id
    private UUID id;
    @Column(unique = true)
    private String name;
    private int energy;
    private int sizeMind;


    public FairyAnimal() {
        id = UUID.randomUUID();
    }

    public FairyAnimal(UUID id, String name,int energy, int sizeMind) {
        this.id = id;
        this.name = name;
        this.energy = energy;
        this.sizeMind=sizeMind;
    }

    public static FairyAnimal fromFairyAnimalRequest(FairyAnimalRequest FairyAnimalRequest) {
        return new FairyAnimal(UUID.randomUUID(),
                FairyAnimalRequest.getName(),
                FairyAnimalRequest.getEnergy(),
                FairyAnimalRequest.getSizeMind());
    }

    public FairyAnimalResponse toFairyAnimalResponse() {
        return FairyAnimalResponse.newBuilder().
                setId(id.toString()).
                setName(name).
                setEnergy(energy).
                setSizeMind(sizeMind).
                build();
    }

}

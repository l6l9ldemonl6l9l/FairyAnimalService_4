package distributedsystems.FairyAnimalService.api;

import distributedsystems.FairyAnimal.*;
import distributedsystems.FairyAnimalService.model.FairyAnimal;
import distributedsystems.FairyAnimalService.services.FairyAnimalService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@GRpcService
public class FairyAnimalGrpcController extends FairyAnimalServiceGrpc.FairyAnimalServiceImplBase {

    @Autowired
    private FairyAnimalService FairyAnimalService;

    @Override
    public void all(AllFairyAnimalRequest request, StreamObserver<AllFairyAnimalResponse> responseObserver) {
        List<FairyAnimal> animals = FairyAnimalService.getAll();
        List<FairyAnimalResponse> convertedAnimals = animals.stream().
                map(FairyAnimal::toFairyAnimalResponse).
                collect(Collectors.toList());
        AllFairyAnimalResponse response = AllFairyAnimalResponse.newBuilder().
                addAllFairyAnimal(convertedAnimals).
                build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

    @Override
    public void add(FairyAnimalRequest request, StreamObserver<FairyAnimalResponse> responseObserver) {
        FairyAnimal fairyAnimal = FairyAnimalService.addFairyAnimal(FairyAnimal.fromFairyAnimalRequest(request));
        responseObserver.onNext(fairyAnimal.toFairyAnimalResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void byId(FairyAnimalByIdRequest request, StreamObserver<FairyAnimalResponse> responseObserver) {
        FairyAnimal FairyAnimal = FairyAnimalService.getById(UUID.fromString(request.getId()));
        responseObserver.onNext(FairyAnimal.toFairyAnimalResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void byName(FairyAnimalByNameRequest request, StreamObserver<FairyAnimalResponse> responseObserver) {
        FairyAnimal FairyAnimal = FairyAnimalService.getByName(request.getName());
        responseObserver.onNext(FairyAnimal.toFairyAnimalResponse());
        responseObserver.onCompleted();
    }

    @Override
    public void delete(FairyAnimalByIdRequest request, StreamObserver<DeleteFairyAnimalResponse> responseObserver) {
        FairyAnimalService.deleteFairyAnimalById(UUID.fromString(request.getId()));
        responseObserver.onNext(DeleteFairyAnimalResponse.newBuilder().build());
        responseObserver.onCompleted();
    }
}

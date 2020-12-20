package distributedsystems.FairyAnimal;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.0)",
    comments = "Source: FairyAnimal.proto")
public final class FairyAnimalServiceGrpc {

  private FairyAnimalServiceGrpc() {}

  public static final String SERVICE_NAME = "distributedsystems.FairyAnimal.FairyAnimalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.AllFairyAnimalRequest,
      distributedsystems.FairyAnimal.AllFairyAnimalResponse> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "all",
      requestType = distributedsystems.FairyAnimal.AllFairyAnimalRequest.class,
      responseType = distributedsystems.FairyAnimal.AllFairyAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.AllFairyAnimalRequest,
      distributedsystems.FairyAnimal.AllFairyAnimalResponse> getAllMethod() {
    io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.AllFairyAnimalRequest, distributedsystems.FairyAnimal.AllFairyAnimalResponse> getAllMethod;
    if ((getAllMethod = FairyAnimalServiceGrpc.getAllMethod) == null) {
      synchronized (FairyAnimalServiceGrpc.class) {
        if ((getAllMethod = FairyAnimalServiceGrpc.getAllMethod) == null) {
          FairyAnimalServiceGrpc.getAllMethod = getAllMethod =
              io.grpc.MethodDescriptor.<distributedsystems.FairyAnimal.AllFairyAnimalRequest, distributedsystems.FairyAnimal.AllFairyAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.AllFairyAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.AllFairyAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FairyAnimalServiceMethodDescriptorSupplier("all"))
              .build();
        }
      }
    }
    return getAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalRequest,
      distributedsystems.FairyAnimal.FairyAnimalResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = distributedsystems.FairyAnimal.FairyAnimalRequest.class,
      responseType = distributedsystems.FairyAnimal.FairyAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalRequest,
      distributedsystems.FairyAnimal.FairyAnimalResponse> getAddMethod() {
    io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalRequest, distributedsystems.FairyAnimal.FairyAnimalResponse> getAddMethod;
    if ((getAddMethod = FairyAnimalServiceGrpc.getAddMethod) == null) {
      synchronized (FairyAnimalServiceGrpc.class) {
        if ((getAddMethod = FairyAnimalServiceGrpc.getAddMethod) == null) {
          FairyAnimalServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<distributedsystems.FairyAnimal.FairyAnimalRequest, distributedsystems.FairyAnimal.FairyAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.FairyAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.FairyAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FairyAnimalServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalByIdRequest,
      distributedsystems.FairyAnimal.FairyAnimalResponse> getByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byId",
      requestType = distributedsystems.FairyAnimal.FairyAnimalByIdRequest.class,
      responseType = distributedsystems.FairyAnimal.FairyAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalByIdRequest,
      distributedsystems.FairyAnimal.FairyAnimalResponse> getByIdMethod() {
    io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalByIdRequest, distributedsystems.FairyAnimal.FairyAnimalResponse> getByIdMethod;
    if ((getByIdMethod = FairyAnimalServiceGrpc.getByIdMethod) == null) {
      synchronized (FairyAnimalServiceGrpc.class) {
        if ((getByIdMethod = FairyAnimalServiceGrpc.getByIdMethod) == null) {
          FairyAnimalServiceGrpc.getByIdMethod = getByIdMethod =
              io.grpc.MethodDescriptor.<distributedsystems.FairyAnimal.FairyAnimalByIdRequest, distributedsystems.FairyAnimal.FairyAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.FairyAnimalByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.FairyAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FairyAnimalServiceMethodDescriptorSupplier("byId"))
              .build();
        }
      }
    }
    return getByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalByNameRequest,
      distributedsystems.FairyAnimal.FairyAnimalResponse> getByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byName",
      requestType = distributedsystems.FairyAnimal.FairyAnimalByNameRequest.class,
      responseType = distributedsystems.FairyAnimal.FairyAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalByNameRequest,
      distributedsystems.FairyAnimal.FairyAnimalResponse> getByNameMethod() {
    io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalByNameRequest, distributedsystems.FairyAnimal.FairyAnimalResponse> getByNameMethod;
    if ((getByNameMethod = FairyAnimalServiceGrpc.getByNameMethod) == null) {
      synchronized (FairyAnimalServiceGrpc.class) {
        if ((getByNameMethod = FairyAnimalServiceGrpc.getByNameMethod) == null) {
          FairyAnimalServiceGrpc.getByNameMethod = getByNameMethod =
              io.grpc.MethodDescriptor.<distributedsystems.FairyAnimal.FairyAnimalByNameRequest, distributedsystems.FairyAnimal.FairyAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.FairyAnimalByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.FairyAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FairyAnimalServiceMethodDescriptorSupplier("byName"))
              .build();
        }
      }
    }
    return getByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalByIdRequest,
      distributedsystems.FairyAnimal.DeleteFairyAnimalResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = distributedsystems.FairyAnimal.FairyAnimalByIdRequest.class,
      responseType = distributedsystems.FairyAnimal.DeleteFairyAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalByIdRequest,
      distributedsystems.FairyAnimal.DeleteFairyAnimalResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<distributedsystems.FairyAnimal.FairyAnimalByIdRequest, distributedsystems.FairyAnimal.DeleteFairyAnimalResponse> getDeleteMethod;
    if ((getDeleteMethod = FairyAnimalServiceGrpc.getDeleteMethod) == null) {
      synchronized (FairyAnimalServiceGrpc.class) {
        if ((getDeleteMethod = FairyAnimalServiceGrpc.getDeleteMethod) == null) {
          FairyAnimalServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<distributedsystems.FairyAnimal.FairyAnimalByIdRequest, distributedsystems.FairyAnimal.DeleteFairyAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.FairyAnimalByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  distributedsystems.FairyAnimal.DeleteFairyAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FairyAnimalServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FairyAnimalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FairyAnimalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FairyAnimalServiceStub>() {
        @java.lang.Override
        public FairyAnimalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FairyAnimalServiceStub(channel, callOptions);
        }
      };
    return FairyAnimalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FairyAnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FairyAnimalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FairyAnimalServiceBlockingStub>() {
        @java.lang.Override
        public FairyAnimalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FairyAnimalServiceBlockingStub(channel, callOptions);
        }
      };
    return FairyAnimalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FairyAnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FairyAnimalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FairyAnimalServiceFutureStub>() {
        @java.lang.Override
        public FairyAnimalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FairyAnimalServiceFutureStub(channel, callOptions);
        }
      };
    return FairyAnimalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FairyAnimalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void all(distributedsystems.FairyAnimal.AllFairyAnimalRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.AllFairyAnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    /**
     */
    public void add(distributedsystems.FairyAnimal.FairyAnimalRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.FairyAnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void byId(distributedsystems.FairyAnimal.FairyAnimalByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.FairyAnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByIdMethod(), responseObserver);
    }

    /**
     */
    public void byName(distributedsystems.FairyAnimal.FairyAnimalByNameRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.FairyAnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByNameMethod(), responseObserver);
    }

    /**
     */
    public void delete(distributedsystems.FairyAnimal.FairyAnimalByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.DeleteFairyAnimalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.FairyAnimal.AllFairyAnimalRequest,
                distributedsystems.FairyAnimal.AllFairyAnimalResponse>(
                  this, METHODID_ALL)))
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.FairyAnimal.FairyAnimalRequest,
                distributedsystems.FairyAnimal.FairyAnimalResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.FairyAnimal.FairyAnimalByIdRequest,
                distributedsystems.FairyAnimal.FairyAnimalResponse>(
                  this, METHODID_BY_ID)))
          .addMethod(
            getByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.FairyAnimal.FairyAnimalByNameRequest,
                distributedsystems.FairyAnimal.FairyAnimalResponse>(
                  this, METHODID_BY_NAME)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                distributedsystems.FairyAnimal.FairyAnimalByIdRequest,
                distributedsystems.FairyAnimal.DeleteFairyAnimalResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class FairyAnimalServiceStub extends io.grpc.stub.AbstractAsyncStub<FairyAnimalServiceStub> {
    private FairyAnimalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FairyAnimalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FairyAnimalServiceStub(channel, callOptions);
    }

    /**
     */
    public void all(distributedsystems.FairyAnimal.AllFairyAnimalRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.AllFairyAnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(distributedsystems.FairyAnimal.FairyAnimalRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.FairyAnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byId(distributedsystems.FairyAnimal.FairyAnimalByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.FairyAnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byName(distributedsystems.FairyAnimal.FairyAnimalByNameRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.FairyAnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(distributedsystems.FairyAnimal.FairyAnimalByIdRequest request,
        io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.DeleteFairyAnimalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FairyAnimalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FairyAnimalServiceBlockingStub> {
    private FairyAnimalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FairyAnimalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FairyAnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public distributedsystems.FairyAnimal.AllFairyAnimalResponse all(distributedsystems.FairyAnimal.AllFairyAnimalRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.FairyAnimal.FairyAnimalResponse add(distributedsystems.FairyAnimal.FairyAnimalRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.FairyAnimal.FairyAnimalResponse byId(distributedsystems.FairyAnimal.FairyAnimalByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.FairyAnimal.FairyAnimalResponse byName(distributedsystems.FairyAnimal.FairyAnimalByNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public distributedsystems.FairyAnimal.DeleteFairyAnimalResponse delete(distributedsystems.FairyAnimal.FairyAnimalByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FairyAnimalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FairyAnimalServiceFutureStub> {
    private FairyAnimalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FairyAnimalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FairyAnimalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.FairyAnimal.AllFairyAnimalResponse> all(
        distributedsystems.FairyAnimal.AllFairyAnimalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.FairyAnimal.FairyAnimalResponse> add(
        distributedsystems.FairyAnimal.FairyAnimalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.FairyAnimal.FairyAnimalResponse> byId(
        distributedsystems.FairyAnimal.FairyAnimalByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.FairyAnimal.FairyAnimalResponse> byName(
        distributedsystems.FairyAnimal.FairyAnimalByNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<distributedsystems.FairyAnimal.DeleteFairyAnimalResponse> delete(
        distributedsystems.FairyAnimal.FairyAnimalByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL = 0;
  private static final int METHODID_ADD = 1;
  private static final int METHODID_BY_ID = 2;
  private static final int METHODID_BY_NAME = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FairyAnimalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FairyAnimalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL:
          serviceImpl.all((distributedsystems.FairyAnimal.AllFairyAnimalRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.AllFairyAnimalResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((distributedsystems.FairyAnimal.FairyAnimalRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.FairyAnimalResponse>) responseObserver);
          break;
        case METHODID_BY_ID:
          serviceImpl.byId((distributedsystems.FairyAnimal.FairyAnimalByIdRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.FairyAnimalResponse>) responseObserver);
          break;
        case METHODID_BY_NAME:
          serviceImpl.byName((distributedsystems.FairyAnimal.FairyAnimalByNameRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.FairyAnimalResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((distributedsystems.FairyAnimal.FairyAnimalByIdRequest) request,
              (io.grpc.stub.StreamObserver<distributedsystems.FairyAnimal.DeleteFairyAnimalResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FairyAnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FairyAnimalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return distributedsystems.FairyAnimal.FairyAnimal.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FairyAnimalService");
    }
  }

  private static final class FairyAnimalServiceFileDescriptorSupplier
      extends FairyAnimalServiceBaseDescriptorSupplier {
    FairyAnimalServiceFileDescriptorSupplier() {}
  }

  private static final class FairyAnimalServiceMethodDescriptorSupplier
      extends FairyAnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FairyAnimalServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FairyAnimalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FairyAnimalServiceFileDescriptorSupplier())
              .addMethod(getAllMethod())
              .addMethod(getAddMethod())
              .addMethod(getByIdMethod())
              .addMethod(getByNameMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}

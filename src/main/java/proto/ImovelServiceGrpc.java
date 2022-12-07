package proto;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Imovel.proto")
public final class ImovelServiceGrpc {

  private ImovelServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.ImovelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.CreateImovelRequest,
      proto.CreateImovelResponse> getCreateImovelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateImovel",
      requestType = proto.CreateImovelRequest.class,
      responseType = proto.CreateImovelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.CreateImovelRequest,
      proto.CreateImovelResponse> getCreateImovelMethod() {
    io.grpc.MethodDescriptor<proto.CreateImovelRequest, proto.CreateImovelResponse> getCreateImovelMethod;
    if ((getCreateImovelMethod = ImovelServiceGrpc.getCreateImovelMethod) == null) {
      synchronized (ImovelServiceGrpc.class) {
        if ((getCreateImovelMethod = ImovelServiceGrpc.getCreateImovelMethod) == null) {
          ImovelServiceGrpc.getCreateImovelMethod = getCreateImovelMethod = 
              io.grpc.MethodDescriptor.<proto.CreateImovelRequest, proto.CreateImovelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ImovelService", "CreateImovel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.CreateImovelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.CreateImovelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImovelServiceMethodDescriptorSupplier("CreateImovel"))
                  .build();
          }
        }
     }
     return getCreateImovelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.DeleteImovelRequest,
      proto.DeleteImovelResponse> getDeleteImovelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteImovel",
      requestType = proto.DeleteImovelRequest.class,
      responseType = proto.DeleteImovelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.DeleteImovelRequest,
      proto.DeleteImovelResponse> getDeleteImovelMethod() {
    io.grpc.MethodDescriptor<proto.DeleteImovelRequest, proto.DeleteImovelResponse> getDeleteImovelMethod;
    if ((getDeleteImovelMethod = ImovelServiceGrpc.getDeleteImovelMethod) == null) {
      synchronized (ImovelServiceGrpc.class) {
        if ((getDeleteImovelMethod = ImovelServiceGrpc.getDeleteImovelMethod) == null) {
          ImovelServiceGrpc.getDeleteImovelMethod = getDeleteImovelMethod = 
              io.grpc.MethodDescriptor.<proto.DeleteImovelRequest, proto.DeleteImovelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ImovelService", "DeleteImovel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DeleteImovelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.DeleteImovelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImovelServiceMethodDescriptorSupplier("DeleteImovel"))
                  .build();
          }
        }
     }
     return getDeleteImovelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.GetImovelRequest,
      proto.GetImovelResponse> getGetImovelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImovel",
      requestType = proto.GetImovelRequest.class,
      responseType = proto.GetImovelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.GetImovelRequest,
      proto.GetImovelResponse> getGetImovelMethod() {
    io.grpc.MethodDescriptor<proto.GetImovelRequest, proto.GetImovelResponse> getGetImovelMethod;
    if ((getGetImovelMethod = ImovelServiceGrpc.getGetImovelMethod) == null) {
      synchronized (ImovelServiceGrpc.class) {
        if ((getGetImovelMethod = ImovelServiceGrpc.getGetImovelMethod) == null) {
          ImovelServiceGrpc.getGetImovelMethod = getGetImovelMethod = 
              io.grpc.MethodDescriptor.<proto.GetImovelRequest, proto.GetImovelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ImovelService", "GetImovel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetImovelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetImovelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImovelServiceMethodDescriptorSupplier("GetImovel"))
                  .build();
          }
        }
     }
     return getGetImovelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.GetImovelByTituloRequest,
      proto.GetImovelByTituloResponse> getGetImovelByTituloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImovelByTitulo",
      requestType = proto.GetImovelByTituloRequest.class,
      responseType = proto.GetImovelByTituloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.GetImovelByTituloRequest,
      proto.GetImovelByTituloResponse> getGetImovelByTituloMethod() {
    io.grpc.MethodDescriptor<proto.GetImovelByTituloRequest, proto.GetImovelByTituloResponse> getGetImovelByTituloMethod;
    if ((getGetImovelByTituloMethod = ImovelServiceGrpc.getGetImovelByTituloMethod) == null) {
      synchronized (ImovelServiceGrpc.class) {
        if ((getGetImovelByTituloMethod = ImovelServiceGrpc.getGetImovelByTituloMethod) == null) {
          ImovelServiceGrpc.getGetImovelByTituloMethod = getGetImovelByTituloMethod = 
              io.grpc.MethodDescriptor.<proto.GetImovelByTituloRequest, proto.GetImovelByTituloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ImovelService", "GetImovelByTitulo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetImovelByTituloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetImovelByTituloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImovelServiceMethodDescriptorSupplier("GetImovelByTitulo"))
                  .build();
          }
        }
     }
     return getGetImovelByTituloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.GetImovelByEnderecoRequest,
      proto.GetImovelByEnderecoResponse> getGetImovelByEnderecoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImovelByEndereco",
      requestType = proto.GetImovelByEnderecoRequest.class,
      responseType = proto.GetImovelByEnderecoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.GetImovelByEnderecoRequest,
      proto.GetImovelByEnderecoResponse> getGetImovelByEnderecoMethod() {
    io.grpc.MethodDescriptor<proto.GetImovelByEnderecoRequest, proto.GetImovelByEnderecoResponse> getGetImovelByEnderecoMethod;
    if ((getGetImovelByEnderecoMethod = ImovelServiceGrpc.getGetImovelByEnderecoMethod) == null) {
      synchronized (ImovelServiceGrpc.class) {
        if ((getGetImovelByEnderecoMethod = ImovelServiceGrpc.getGetImovelByEnderecoMethod) == null) {
          ImovelServiceGrpc.getGetImovelByEnderecoMethod = getGetImovelByEnderecoMethod = 
              io.grpc.MethodDescriptor.<proto.GetImovelByEnderecoRequest, proto.GetImovelByEnderecoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ImovelService", "GetImovelByEndereco"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetImovelByEnderecoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GetImovelByEnderecoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImovelServiceMethodDescriptorSupplier("GetImovelByEndereco"))
                  .build();
          }
        }
     }
     return getGetImovelByEnderecoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.ListImovelRequest,
      proto.ListImovelResponse> getListImovelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListImovel",
      requestType = proto.ListImovelRequest.class,
      responseType = proto.ListImovelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.ListImovelRequest,
      proto.ListImovelResponse> getListImovelMethod() {
    io.grpc.MethodDescriptor<proto.ListImovelRequest, proto.ListImovelResponse> getListImovelMethod;
    if ((getListImovelMethod = ImovelServiceGrpc.getListImovelMethod) == null) {
      synchronized (ImovelServiceGrpc.class) {
        if ((getListImovelMethod = ImovelServiceGrpc.getListImovelMethod) == null) {
          ImovelServiceGrpc.getListImovelMethod = getListImovelMethod = 
              io.grpc.MethodDescriptor.<proto.ListImovelRequest, proto.ListImovelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ImovelService", "ListImovel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ListImovelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.ListImovelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImovelServiceMethodDescriptorSupplier("ListImovel"))
                  .build();
          }
        }
     }
     return getListImovelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImovelServiceStub newStub(io.grpc.Channel channel) {
    return new ImovelServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImovelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImovelServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImovelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImovelServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImovelServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createImovel(proto.CreateImovelRequest request,
        io.grpc.stub.StreamObserver<proto.CreateImovelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateImovelMethod(), responseObserver);
    }

    /**
     */
    public void deleteImovel(proto.DeleteImovelRequest request,
        io.grpc.stub.StreamObserver<proto.DeleteImovelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteImovelMethod(), responseObserver);
    }

    /**
     */
    public void getImovel(proto.GetImovelRequest request,
        io.grpc.stub.StreamObserver<proto.GetImovelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImovelMethod(), responseObserver);
    }

    /**
     */
    public void getImovelByTitulo(proto.GetImovelByTituloRequest request,
        io.grpc.stub.StreamObserver<proto.GetImovelByTituloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImovelByTituloMethod(), responseObserver);
    }

    /**
     */
    public void getImovelByEndereco(proto.GetImovelByEnderecoRequest request,
        io.grpc.stub.StreamObserver<proto.GetImovelByEnderecoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImovelByEnderecoMethod(), responseObserver);
    }

    /**
     */
    public void listImovel(proto.ListImovelRequest request,
        io.grpc.stub.StreamObserver<proto.ListImovelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListImovelMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateImovelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.CreateImovelRequest,
                proto.CreateImovelResponse>(
                  this, METHODID_CREATE_IMOVEL)))
          .addMethod(
            getDeleteImovelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.DeleteImovelRequest,
                proto.DeleteImovelResponse>(
                  this, METHODID_DELETE_IMOVEL)))
          .addMethod(
            getGetImovelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.GetImovelRequest,
                proto.GetImovelResponse>(
                  this, METHODID_GET_IMOVEL)))
          .addMethod(
            getGetImovelByTituloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.GetImovelByTituloRequest,
                proto.GetImovelByTituloResponse>(
                  this, METHODID_GET_IMOVEL_BY_TITULO)))
          .addMethod(
            getGetImovelByEnderecoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.GetImovelByEnderecoRequest,
                proto.GetImovelByEnderecoResponse>(
                  this, METHODID_GET_IMOVEL_BY_ENDERECO)))
          .addMethod(
            getListImovelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.ListImovelRequest,
                proto.ListImovelResponse>(
                  this, METHODID_LIST_IMOVEL)))
          .build();
    }
  }

  /**
   */
  public static final class ImovelServiceStub extends io.grpc.stub.AbstractStub<ImovelServiceStub> {
    private ImovelServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImovelServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImovelServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImovelServiceStub(channel, callOptions);
    }

    /**
     */
    public void createImovel(proto.CreateImovelRequest request,
        io.grpc.stub.StreamObserver<proto.CreateImovelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateImovelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteImovel(proto.DeleteImovelRequest request,
        io.grpc.stub.StreamObserver<proto.DeleteImovelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteImovelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImovel(proto.GetImovelRequest request,
        io.grpc.stub.StreamObserver<proto.GetImovelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImovelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImovelByTitulo(proto.GetImovelByTituloRequest request,
        io.grpc.stub.StreamObserver<proto.GetImovelByTituloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImovelByTituloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImovelByEndereco(proto.GetImovelByEnderecoRequest request,
        io.grpc.stub.StreamObserver<proto.GetImovelByEnderecoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImovelByEnderecoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listImovel(proto.ListImovelRequest request,
        io.grpc.stub.StreamObserver<proto.ListImovelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListImovelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImovelServiceBlockingStub extends io.grpc.stub.AbstractStub<ImovelServiceBlockingStub> {
    private ImovelServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImovelServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImovelServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImovelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.CreateImovelResponse createImovel(proto.CreateImovelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateImovelMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.DeleteImovelResponse deleteImovel(proto.DeleteImovelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteImovelMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.GetImovelResponse getImovel(proto.GetImovelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetImovelMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.GetImovelByTituloResponse getImovelByTitulo(proto.GetImovelByTituloRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetImovelByTituloMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.GetImovelByEnderecoResponse getImovelByEndereco(proto.GetImovelByEnderecoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetImovelByEnderecoMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.ListImovelResponse listImovel(proto.ListImovelRequest request) {
      return blockingUnaryCall(
          getChannel(), getListImovelMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImovelServiceFutureStub extends io.grpc.stub.AbstractStub<ImovelServiceFutureStub> {
    private ImovelServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImovelServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImovelServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImovelServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.CreateImovelResponse> createImovel(
        proto.CreateImovelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateImovelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.DeleteImovelResponse> deleteImovel(
        proto.DeleteImovelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteImovelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.GetImovelResponse> getImovel(
        proto.GetImovelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImovelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.GetImovelByTituloResponse> getImovelByTitulo(
        proto.GetImovelByTituloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImovelByTituloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.GetImovelByEnderecoResponse> getImovelByEndereco(
        proto.GetImovelByEnderecoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImovelByEnderecoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.ListImovelResponse> listImovel(
        proto.ListImovelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListImovelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_IMOVEL = 0;
  private static final int METHODID_DELETE_IMOVEL = 1;
  private static final int METHODID_GET_IMOVEL = 2;
  private static final int METHODID_GET_IMOVEL_BY_TITULO = 3;
  private static final int METHODID_GET_IMOVEL_BY_ENDERECO = 4;
  private static final int METHODID_LIST_IMOVEL = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImovelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImovelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_IMOVEL:
          serviceImpl.createImovel((proto.CreateImovelRequest) request,
              (io.grpc.stub.StreamObserver<proto.CreateImovelResponse>) responseObserver);
          break;
        case METHODID_DELETE_IMOVEL:
          serviceImpl.deleteImovel((proto.DeleteImovelRequest) request,
              (io.grpc.stub.StreamObserver<proto.DeleteImovelResponse>) responseObserver);
          break;
        case METHODID_GET_IMOVEL:
          serviceImpl.getImovel((proto.GetImovelRequest) request,
              (io.grpc.stub.StreamObserver<proto.GetImovelResponse>) responseObserver);
          break;
        case METHODID_GET_IMOVEL_BY_TITULO:
          serviceImpl.getImovelByTitulo((proto.GetImovelByTituloRequest) request,
              (io.grpc.stub.StreamObserver<proto.GetImovelByTituloResponse>) responseObserver);
          break;
        case METHODID_GET_IMOVEL_BY_ENDERECO:
          serviceImpl.getImovelByEndereco((proto.GetImovelByEnderecoRequest) request,
              (io.grpc.stub.StreamObserver<proto.GetImovelByEnderecoResponse>) responseObserver);
          break;
        case METHODID_LIST_IMOVEL:
          serviceImpl.listImovel((proto.ListImovelRequest) request,
              (io.grpc.stub.StreamObserver<proto.ListImovelResponse>) responseObserver);
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

  private static abstract class ImovelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImovelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ImovelOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImovelService");
    }
  }

  private static final class ImovelServiceFileDescriptorSupplier
      extends ImovelServiceBaseDescriptorSupplier {
    ImovelServiceFileDescriptorSupplier() {}
  }

  private static final class ImovelServiceMethodDescriptorSupplier
      extends ImovelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImovelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImovelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImovelServiceFileDescriptorSupplier())
              .addMethod(getCreateImovelMethod())
              .addMethod(getDeleteImovelMethod())
              .addMethod(getGetImovelMethod())
              .addMethod(getGetImovelByTituloMethod())
              .addMethod(getGetImovelByEnderecoMethod())
              .addMethod(getListImovelMethod())
              .build();
        }
      }
    }
    return result;
  }
}

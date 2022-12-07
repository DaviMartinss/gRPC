package server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import proto.CreateImovelRequest;
import proto.CreateImovelResponse;
import proto.DeleteImovelRequest;
import proto.DeleteImovelResponse;
import proto.GetImovelByEnderecoRequest;
import proto.GetImovelByEnderecoResponse;
import proto.GetImovelByPrecoRequest;
import proto.GetImovelByPrecoResponse;
import proto.GetImovelByTituloRequest;
import proto.GetImovelByTituloResponse;
import proto.GetImovelRequest;
import proto.GetImovelResponse;
import proto.ListImovelRequest;
import proto.ListImovelResponse;
import proto.UpdateImovelRequest;
import proto.UpdateImovelResponse;
import proto.Imovel;
import proto.ImovelServiceGrpc;

public class ImovelServiceImpl extends ImovelServiceGrpc.ImovelServiceImplBase {
 
    private Map<Integer, Imovel> imovelMap = new HashMap<Integer, Imovel>();
    private int i = 1;
 
    @Override
    public void createImovel(CreateImovelRequest request, StreamObserver<CreateImovelResponse> responseObserver) {
        System.out.println("Creating Imovel");
        Imovel imovel = request.getImovel();
 
        imovel = imovel.toBuilder().setId(i)
        							.setTitulo(request.getImovel().getTitulo())
        							.setEndereco(request.getImovel().getEndereco())
        							.setTipo(request.getImovel().getTipo())
        							.setNumQuartos(request.getImovel().getNumQuartos())
        							.setNumGaragem(request.getImovel().getNumGaragem())
        							.setAreaConstruida(request.getImovel().getAreaConstruida())
        							.setAreaTerreno(request.getImovel().getAreaTerreno())
        							.setPreco(request.getImovel().getPreco())
        							.build();
 
        CreateImovelResponse response = CreateImovelResponse.newBuilder().setImovel(imovel).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
 
        imovelMap.put(i, imovel);
        i++;
    }
    
    @Override
    public void updateImovel(UpdateImovelRequest request, StreamObserver<UpdateImovelResponse> responseObserver) {
        System.out.println("updateImovel");
        
        if (imovelMap.containsKey(request.getImovel().getId())) {
            imovelMap.put(request.getImovel().getId(), request.getImovel());
            
            Imovel imovel = imovelMap.get(request.getImovel().getId());
            
            System.out.println(imovel);
            
            UpdateImovelResponse response = UpdateImovelResponse.newBuilder().setImovel(imovel).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } else {
            System.out.println("Imovel não encontrado");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
 
    }
 
    @Override
    public void deleteImovel(DeleteImovelRequest request, StreamObserver<DeleteImovelResponse> responseObserver) {
        if (imovelMap.containsKey(request.getImovelId())) {
            imovelMap.remove(request.getImovelId());
            System.out.println("Imovel was deleted");
            responseObserver.onNext(DeleteImovelResponse.newBuilder().setImovelId(request.getImovelId()).build());
            responseObserver.onCompleted();
        } else {
            System.out.println("Imovel not found");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
    }
 
    @Override
    public void getImovel(GetImovelRequest request, StreamObserver<GetImovelResponse> responseObserver) {
        System.out.println("Get imovel");
        if (imovelMap.containsKey(request.getImovelId())) {
            Imovel imovel = imovelMap.get(request.getImovelId());
            GetImovelResponse response = GetImovelResponse.newBuilder().setImovel(imovel).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } else {
            System.out.println("Imovel not found");
            responseObserver.onError(Status.NOT_FOUND.asRuntimeException());
        }
 
    }
    
    @Override
    public void getImovelByTitulo(GetImovelByTituloRequest request, StreamObserver<GetImovelByTituloResponse> responseObserver) {
        System.out.println("getImovelByTitulo");
        
        List<Imovel> imovelMapAUX = imovelMap
        								.entrySet()
        								.stream()
        								.filter(e -> e.getValue().getTitulo().equals(request.getTitulo()))
        								.map(Map.Entry::getValue)
        								.toList();
            		
            System.out.println(imovelMapAUX);
            
            GetImovelByTituloResponse response = GetImovelByTituloResponse.newBuilder()
            															.addAllImovel(imovelMapAUX)
            															.build(); 
            responseObserver.onNext(response);
            responseObserver.onCompleted();
 
    }
    
    @Override
    public void getImovelByEndereco(GetImovelByEnderecoRequest request, StreamObserver<GetImovelByEnderecoResponse> responseObserver) {
        System.out.println("getImovelByEndereco");
        List<Imovel> imovelMapAUX = imovelMap
        								.entrySet()
        								.stream()
        								.filter(e -> e.getValue().getEndereco().toLowerCase().contains(request.getEndereco().toLowerCase()))
        								.map(Map.Entry::getValue)
        								.toList();
            									
            System.out.println(imovelMapAUX);
            
            GetImovelByEnderecoResponse response = GetImovelByEnderecoResponse.newBuilder()
            																.addAllImovel(imovelMapAUX)
            																.build(); 
            responseObserver.onNext(response);
            responseObserver.onCompleted();
 
    }
    
    @Override
    public void getImovelByPreco(GetImovelByPrecoRequest request, StreamObserver<GetImovelByPrecoResponse> responseObserver) {
        System.out.println("getImovelByPreco");
        
        List<Imovel> imovelMapAUX = imovelMap
        								.entrySet()
        								.stream()
        								.filter(e -> 
        										e.getValue().getPreco() >= request.getPrecoInicial()
        										&&
        										e.getValue().getPreco() <= request.getPrecoFinal())
        								.map(Map.Entry::getValue)
        								.toList();
            									
            System.out.println(imovelMapAUX);
            
            GetImovelByPrecoResponse response = GetImovelByPrecoResponse.newBuilder()
            															.addAllImovel(imovelMapAUX)
            															.build(); 
            responseObserver.onNext(response);
            responseObserver.onCompleted();
 
    }
    
    @Override
    public void listImovel(ListImovelRequest request, StreamObserver<ListImovelResponse> responseObserver) {
        System.out.println("List imovels");
        ListImovelResponse response = ListImovelResponse.newBuilder().addAllImovel(imovelMap.values()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
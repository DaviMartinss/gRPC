package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.CreateImovelRequest;
import proto.CreateImovelResponse;
import proto.DeleteImovelRequest;
import proto.DeleteImovelResponse;
import proto.GetImovelByTituloRequest;
import proto.GetImovelByTituloResponse;
import proto.GetImovelRequest;
import proto.GetImovelResponse;
import proto.ListImovelRequest;
import proto.ListImovelResponse;
import proto.Imovel;
import proto.ImovelServiceGrpc;

public class ImovelClient {
	public static void main(String[] args) {
        ImovelClient main = new ImovelClient();
        main.run();
    }
 
    private void run() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        ImovelServiceGrpc.ImovelServiceBlockingStub imovelClient = ImovelServiceGrpc.newBlockingStub(channel);
 
        // CREATE IMOVEL
        Imovel imovel = Imovel.newBuilder()
        		.setTitulo("TESTE TITULO 123")
        		.setEndereco("TESTE ENDERECO")
        		.setTipo("TESTE CASA")
        		.setNumQuartos(4)
        		.setNumGaragem(2)
        		.setAreaConstruida(4.5f)
        		.setAreaTerreno(6.8f)
        		.setPreco(500.69f)
        		.build();
        CreateImovelResponse createImovelResponse = imovelClient
                .createImovel(CreateImovelRequest.newBuilder().setImovel(imovel).build());
        System.out.println(createImovelResponse.toString());
 
        int imovelId = createImovelResponse.getImovel().getId();
        
        // Get IMOVEL
        GetImovelResponse getImovelResponse = imovelClient.getImovel(GetImovelRequest.newBuilder().setImovelId(imovelId).build());
        System.out.println(getImovelResponse.getImovel());
        
        // FIND BY TÍTULO
        GetImovelByTituloResponse getImovelByTituloResponse = imovelClient.getImovelByTitulo(
        		GetImovelByTituloRequest.newBuilder().setTitulo("TESTE TITULO 123").build());
        System.out.println("FIND BY TÍTULO");
        System.out.println(getImovelByTituloResponse.getImovelList());
        
        
         //DELETE IMOVEL
        //DeleteImovelResponse deleteImovelResponse = imovelClient
         //       .deleteImovel(DeleteImovelRequest.newBuilder().setImovelId(imovelId).build());
        //System.out.println(deleteImovelResponse.getImovelId());
 
        // LIST IMOVEIS
        ListImovelResponse listImovelResponse = imovelClient.listImovel(ListImovelRequest.newBuilder().build());
        System.out.println(listImovelResponse.getImovelList());
        
        channel.shutdown();
    }
}

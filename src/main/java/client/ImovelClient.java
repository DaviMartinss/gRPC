package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.CreateImovelRequest;
import proto.CreateImovelResponse;
import proto.GetImovelByEnderecoRequest;
import proto.GetImovelByEnderecoResponse;
import proto.GetImovelByPrecoRequest;
import proto.GetImovelByPrecoResponse;
import proto.GetImovelByTituloRequest;
import proto.GetImovelByTituloResponse;
import proto.GetImovelRequest;
import proto.GetImovelResponse;
import proto.Imovel;
import proto.ImovelServiceGrpc;
import proto.ListImovelRequest;
import proto.ListImovelResponse;
import proto.UpdateImovelRequest;
import proto.UpdateImovelResponse;

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
        		.setPreco(5.5f)
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
        		GetImovelByTituloRequest.newBuilder().setTitulo("davi").build());
        System.out.println("\n-------------------FIND BY TÍTULO-------------------\n");
        System.out.println(getImovelByTituloResponse.getImovelList());


        // FIND BY ENDEREÇO
        GetImovelByEnderecoResponse getImovelByEnderecoResponse = imovelClient.getImovelByEndereco(
        		GetImovelByEnderecoRequest.newBuilder().setEndereco("co").build());
        System.out.println("\n-------------------FIND BY ENDEREÇO-------------------\n");
       	 System.out.println(getImovelByEnderecoResponse.getImovelList());


        // FIND BY PRECO
        GetImovelByPrecoResponse getImovelByPrecoResponse = imovelClient.getImovelByPreco(
        		GetImovelByPrecoRequest.newBuilder().setPrecoInicial(7f)
        											.setPrecoFinal(9f)
        											.build());
        System.out.println("\n-------------------FIND BY PREÇO-------------------\n");
        System.out.println(getImovelByPrecoResponse.getImovelList());

        //UPDATE IMOVEL
        Imovel imovelUp = Imovel.newBuilder()
        		.setId(1)
        		.setTitulo("TESTE update TITULO 123")
        		.setEndereco("TESTE ENDERECO")
        		.setTipo("TESTE CASA")
        		.setNumQuartos(4)
        		.setNumGaragem(2)
        		.setAreaConstruida(4.5f)
        		.setAreaTerreno(6.8f)
        		.setPreco(5.5f)
        		.build();
        UpdateImovelResponse updateImovelResponse = imovelClient
                .updateImovel(UpdateImovelRequest.newBuilder().setImovel(imovelUp).build());
        System.out.println("\n-------------------UPDATE IMOVEL-------------------\n");
        System.out.println(updateImovelResponse.getImovel());


         //DELETE IMOVEL
        //DeleteImovelResponse deleteImovelResponse = imovelClient
         //       .deleteImovel(DeleteImovelRequest.newBuilder().setImovelId(imovelId).build());
        //System.out.println(deleteImovelResponse.getImovelId());

        // LIST IMOVEIS
        ListImovelResponse listImovelResponse = imovelClient.listImovel(ListImovelRequest.newBuilder().build());
        System.out.println("\n-------------------LIST IMOVEIS-------------------\n");
        System.out.println(listImovelResponse.getImovelList());

        channel.shutdown();
    }
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Imovel.proto

package proto;

public final class ImovelOuterClass {
  private ImovelOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Imovel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Imovel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_CreateImovelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_CreateImovelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_CreateImovelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_CreateImovelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_DeleteImovelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_DeleteImovelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_DeleteImovelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_DeleteImovelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetImovelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetImovelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetImovelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetImovelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetImovelByTituloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetImovelByTituloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_GetImovelByTituloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_GetImovelByTituloResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ListImovelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ListImovelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ListImovelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ListImovelResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Imovel.proto\022\005proto\"\254\001\n\006Imovel\022\n\n\002id\030\001" +
      " \001(\005\022\016\n\006titulo\030\002 \001(\t\022\020\n\010endereco\030\003 \001(\t\022\014" +
      "\n\004tipo\030\004 \001(\t\022\023\n\013num_quartos\030\005 \001(\005\022\023\n\013num" +
      "_garagem\030\006 \001(\005\022\027\n\017area_construida\030\007 \001(\002\022" +
      "\024\n\014area_terreno\030\010 \001(\002\022\r\n\005preco\030\t \001(\002\"4\n\023" +
      "CreateImovelRequest\022\035\n\006imovel\030\001 \001(\0132\r.pr" +
      "oto.Imovel\"5\n\024CreateImovelResponse\022\035\n\006im" +
      "ovel\030\001 \001(\0132\r.proto.Imovel\"\'\n\023DeleteImove" +
      "lRequest\022\020\n\010imovelId\030\001 \001(\005\"(\n\024DeleteImov" +
      "elResponse\022\020\n\010imovelId\030\001 \001(\005\"$\n\020GetImove" +
      "lRequest\022\020\n\010imovelId\030\001 \001(\005\"2\n\021GetImovelR" +
      "esponse\022\035\n\006imovel\030\001 \001(\0132\r.proto.Imovel\"*" +
      "\n\030GetImovelByTituloRequest\022\016\n\006titulo\030\002 \001" +
      "(\t\":\n\031GetImovelByTituloResponse\022\035\n\006imove" +
      "l\030\001 \003(\0132\r.proto.Imovel\"\023\n\021ListImovelRequ" +
      "est\"3\n\022ListImovelResponse\022\035\n\006imovel\030\001 \003(" +
      "\0132\r.proto.Imovel2\374\002\n\rImovelService\022G\n\014Cr" +
      "eateImovel\022\032.proto.CreateImovelRequest\032\033" +
      ".proto.CreateImovelResponse\022G\n\014DeleteImo" +
      "vel\022\032.proto.DeleteImovelRequest\032\033.proto." +
      "DeleteImovelResponse\022>\n\tGetImovel\022\027.prot" +
      "o.GetImovelRequest\032\030.proto.GetImovelResp" +
      "onse\022V\n\021GetImovelByTitulo\022\037.proto.GetImo" +
      "velByTituloRequest\032 .proto.GetImovelByTi" +
      "tuloResponse\022A\n\nListImovel\022\030.proto.ListI" +
      "movelRequest\032\031.proto.ListImovelResponseB" +
      "\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proto_Imovel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_Imovel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Imovel_descriptor,
        new java.lang.String[] { "Id", "Titulo", "Endereco", "Tipo", "NumQuartos", "NumGaragem", "AreaConstruida", "AreaTerreno", "Preco", });
    internal_static_proto_CreateImovelRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_CreateImovelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_CreateImovelRequest_descriptor,
        new java.lang.String[] { "Imovel", });
    internal_static_proto_CreateImovelResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_CreateImovelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_CreateImovelResponse_descriptor,
        new java.lang.String[] { "Imovel", });
    internal_static_proto_DeleteImovelRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_DeleteImovelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_DeleteImovelRequest_descriptor,
        new java.lang.String[] { "ImovelId", });
    internal_static_proto_DeleteImovelResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_proto_DeleteImovelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_DeleteImovelResponse_descriptor,
        new java.lang.String[] { "ImovelId", });
    internal_static_proto_GetImovelRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_proto_GetImovelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetImovelRequest_descriptor,
        new java.lang.String[] { "ImovelId", });
    internal_static_proto_GetImovelResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_proto_GetImovelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetImovelResponse_descriptor,
        new java.lang.String[] { "Imovel", });
    internal_static_proto_GetImovelByTituloRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_proto_GetImovelByTituloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetImovelByTituloRequest_descriptor,
        new java.lang.String[] { "Titulo", });
    internal_static_proto_GetImovelByTituloResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_proto_GetImovelByTituloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_GetImovelByTituloResponse_descriptor,
        new java.lang.String[] { "Imovel", });
    internal_static_proto_ListImovelRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_proto_ListImovelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ListImovelRequest_descriptor,
        new java.lang.String[] { });
    internal_static_proto_ListImovelResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_proto_ListImovelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ListImovelResponse_descriptor,
        new java.lang.String[] { "Imovel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
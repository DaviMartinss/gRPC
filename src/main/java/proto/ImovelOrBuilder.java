// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Imovel.proto

package proto;

public interface ImovelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Imovel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   */
  int getId();

  /**
   * <code>string titulo = 2;</code>
   */
  java.lang.String getTitulo();
  /**
   * <code>string titulo = 2;</code>
   */
  com.google.protobuf.ByteString
      getTituloBytes();

  /**
   * <code>string endereco = 3;</code>
   */
  java.lang.String getEndereco();
  /**
   * <code>string endereco = 3;</code>
   */
  com.google.protobuf.ByteString
      getEnderecoBytes();

  /**
   * <code>string tipo = 4;</code>
   */
  java.lang.String getTipo();
  /**
   * <code>string tipo = 4;</code>
   */
  com.google.protobuf.ByteString
      getTipoBytes();

  /**
   * <code>int32 num_quartos = 5;</code>
   */
  int getNumQuartos();

  /**
   * <code>int32 num_garagem = 6;</code>
   */
  int getNumGaragem();

  /**
   * <code>float area_construida = 7;</code>
   */
  float getAreaConstruida();

  /**
   * <code>float area_terreno = 8;</code>
   */
  float getAreaTerreno();

  /**
   * <code>float preco = 9;</code>
   */
  float getPreco();
}

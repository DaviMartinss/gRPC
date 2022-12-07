// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Imovel.proto

package proto;

/**
 * Protobuf type {@code proto.Imovel}
 */
public  final class Imovel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Imovel)
    ImovelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Imovel.newBuilder() to construct.
  private Imovel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Imovel() {
    id_ = 0;
    titulo_ = "";
    endereco_ = "";
    tipo_ = "";
    numQuartos_ = 0;
    numGaragem_ = 0;
    areaConstruida_ = 0F;
    areaTerreno_ = 0F;
    preco_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Imovel(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            titulo_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            endereco_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            tipo_ = s;
            break;
          }
          case 40: {

            numQuartos_ = input.readInt32();
            break;
          }
          case 48: {

            numGaragem_ = input.readInt32();
            break;
          }
          case 61: {

            areaConstruida_ = input.readFloat();
            break;
          }
          case 69: {

            areaTerreno_ = input.readFloat();
            break;
          }
          case 77: {

            preco_ = input.readFloat();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.ImovelOuterClass.internal_static_proto_Imovel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.ImovelOuterClass.internal_static_proto_Imovel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.Imovel.class, proto.Imovel.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int TITULO_FIELD_NUMBER = 2;
  private volatile java.lang.Object titulo_;
  /**
   * <code>string titulo = 2;</code>
   */
  public java.lang.String getTitulo() {
    java.lang.Object ref = titulo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      titulo_ = s;
      return s;
    }
  }
  /**
   * <code>string titulo = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTituloBytes() {
    java.lang.Object ref = titulo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      titulo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDERECO_FIELD_NUMBER = 3;
  private volatile java.lang.Object endereco_;
  /**
   * <code>string endereco = 3;</code>
   */
  public java.lang.String getEndereco() {
    java.lang.Object ref = endereco_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endereco_ = s;
      return s;
    }
  }
  /**
   * <code>string endereco = 3;</code>
   */
  public com.google.protobuf.ByteString
      getEnderecoBytes() {
    java.lang.Object ref = endereco_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endereco_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIPO_FIELD_NUMBER = 4;
  private volatile java.lang.Object tipo_;
  /**
   * <code>string tipo = 4;</code>
   */
  public java.lang.String getTipo() {
    java.lang.Object ref = tipo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tipo_ = s;
      return s;
    }
  }
  /**
   * <code>string tipo = 4;</code>
   */
  public com.google.protobuf.ByteString
      getTipoBytes() {
    java.lang.Object ref = tipo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tipo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUM_QUARTOS_FIELD_NUMBER = 5;
  private int numQuartos_;
  /**
   * <code>int32 num_quartos = 5;</code>
   */
  public int getNumQuartos() {
    return numQuartos_;
  }

  public static final int NUM_GARAGEM_FIELD_NUMBER = 6;
  private int numGaragem_;
  /**
   * <code>int32 num_garagem = 6;</code>
   */
  public int getNumGaragem() {
    return numGaragem_;
  }

  public static final int AREA_CONSTRUIDA_FIELD_NUMBER = 7;
  private float areaConstruida_;
  /**
   * <code>float area_construida = 7;</code>
   */
  public float getAreaConstruida() {
    return areaConstruida_;
  }

  public static final int AREA_TERRENO_FIELD_NUMBER = 8;
  private float areaTerreno_;
  /**
   * <code>float area_terreno = 8;</code>
   */
  public float getAreaTerreno() {
    return areaTerreno_;
  }

  public static final int PRECO_FIELD_NUMBER = 9;
  private float preco_;
  /**
   * <code>float preco = 9;</code>
   */
  public float getPreco() {
    return preco_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getTituloBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, titulo_);
    }
    if (!getEnderecoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, endereco_);
    }
    if (!getTipoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, tipo_);
    }
    if (numQuartos_ != 0) {
      output.writeInt32(5, numQuartos_);
    }
    if (numGaragem_ != 0) {
      output.writeInt32(6, numGaragem_);
    }
    if (areaConstruida_ != 0F) {
      output.writeFloat(7, areaConstruida_);
    }
    if (areaTerreno_ != 0F) {
      output.writeFloat(8, areaTerreno_);
    }
    if (preco_ != 0F) {
      output.writeFloat(9, preco_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getTituloBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, titulo_);
    }
    if (!getEnderecoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, endereco_);
    }
    if (!getTipoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, tipo_);
    }
    if (numQuartos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, numQuartos_);
    }
    if (numGaragem_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, numGaragem_);
    }
    if (areaConstruida_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, areaConstruida_);
    }
    if (areaTerreno_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(8, areaTerreno_);
    }
    if (preco_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(9, preco_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof proto.Imovel)) {
      return super.equals(obj);
    }
    proto.Imovel other = (proto.Imovel) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getTitulo()
        .equals(other.getTitulo());
    result = result && getEndereco()
        .equals(other.getEndereco());
    result = result && getTipo()
        .equals(other.getTipo());
    result = result && (getNumQuartos()
        == other.getNumQuartos());
    result = result && (getNumGaragem()
        == other.getNumGaragem());
    result = result && (
        java.lang.Float.floatToIntBits(getAreaConstruida())
        == java.lang.Float.floatToIntBits(
            other.getAreaConstruida()));
    result = result && (
        java.lang.Float.floatToIntBits(getAreaTerreno())
        == java.lang.Float.floatToIntBits(
            other.getAreaTerreno()));
    result = result && (
        java.lang.Float.floatToIntBits(getPreco())
        == java.lang.Float.floatToIntBits(
            other.getPreco()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + TITULO_FIELD_NUMBER;
    hash = (53 * hash) + getTitulo().hashCode();
    hash = (37 * hash) + ENDERECO_FIELD_NUMBER;
    hash = (53 * hash) + getEndereco().hashCode();
    hash = (37 * hash) + TIPO_FIELD_NUMBER;
    hash = (53 * hash) + getTipo().hashCode();
    hash = (37 * hash) + NUM_QUARTOS_FIELD_NUMBER;
    hash = (53 * hash) + getNumQuartos();
    hash = (37 * hash) + NUM_GARAGEM_FIELD_NUMBER;
    hash = (53 * hash) + getNumGaragem();
    hash = (37 * hash) + AREA_CONSTRUIDA_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAreaConstruida());
    hash = (37 * hash) + AREA_TERRENO_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAreaTerreno());
    hash = (37 * hash) + PRECO_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPreco());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.Imovel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Imovel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Imovel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Imovel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Imovel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.Imovel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.Imovel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Imovel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Imovel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.Imovel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.Imovel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.Imovel parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.Imovel prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.Imovel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Imovel)
      proto.ImovelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.ImovelOuterClass.internal_static_proto_Imovel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.ImovelOuterClass.internal_static_proto_Imovel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.Imovel.class, proto.Imovel.Builder.class);
    }

    // Construct using proto.Imovel.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      titulo_ = "";

      endereco_ = "";

      tipo_ = "";

      numQuartos_ = 0;

      numGaragem_ = 0;

      areaConstruida_ = 0F;

      areaTerreno_ = 0F;

      preco_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.ImovelOuterClass.internal_static_proto_Imovel_descriptor;
    }

    @java.lang.Override
    public proto.Imovel getDefaultInstanceForType() {
      return proto.Imovel.getDefaultInstance();
    }

    @java.lang.Override
    public proto.Imovel build() {
      proto.Imovel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.Imovel buildPartial() {
      proto.Imovel result = new proto.Imovel(this);
      result.id_ = id_;
      result.titulo_ = titulo_;
      result.endereco_ = endereco_;
      result.tipo_ = tipo_;
      result.numQuartos_ = numQuartos_;
      result.numGaragem_ = numGaragem_;
      result.areaConstruida_ = areaConstruida_;
      result.areaTerreno_ = areaTerreno_;
      result.preco_ = preco_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof proto.Imovel) {
        return mergeFrom((proto.Imovel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.Imovel other) {
      if (other == proto.Imovel.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getTitulo().isEmpty()) {
        titulo_ = other.titulo_;
        onChanged();
      }
      if (!other.getEndereco().isEmpty()) {
        endereco_ = other.endereco_;
        onChanged();
      }
      if (!other.getTipo().isEmpty()) {
        tipo_ = other.tipo_;
        onChanged();
      }
      if (other.getNumQuartos() != 0) {
        setNumQuartos(other.getNumQuartos());
      }
      if (other.getNumGaragem() != 0) {
        setNumGaragem(other.getNumGaragem());
      }
      if (other.getAreaConstruida() != 0F) {
        setAreaConstruida(other.getAreaConstruida());
      }
      if (other.getAreaTerreno() != 0F) {
        setAreaTerreno(other.getAreaTerreno());
      }
      if (other.getPreco() != 0F) {
        setPreco(other.getPreco());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      proto.Imovel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.Imovel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object titulo_ = "";
    /**
     * <code>string titulo = 2;</code>
     */
    public java.lang.String getTitulo() {
      java.lang.Object ref = titulo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        titulo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string titulo = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTituloBytes() {
      java.lang.Object ref = titulo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        titulo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string titulo = 2;</code>
     */
    public Builder setTitulo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      titulo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string titulo = 2;</code>
     */
    public Builder clearTitulo() {
      
      titulo_ = getDefaultInstance().getTitulo();
      onChanged();
      return this;
    }
    /**
     * <code>string titulo = 2;</code>
     */
    public Builder setTituloBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      titulo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endereco_ = "";
    /**
     * <code>string endereco = 3;</code>
     */
    public java.lang.String getEndereco() {
      java.lang.Object ref = endereco_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endereco_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string endereco = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEnderecoBytes() {
      java.lang.Object ref = endereco_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endereco_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string endereco = 3;</code>
     */
    public Builder setEndereco(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endereco_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string endereco = 3;</code>
     */
    public Builder clearEndereco() {
      
      endereco_ = getDefaultInstance().getEndereco();
      onChanged();
      return this;
    }
    /**
     * <code>string endereco = 3;</code>
     */
    public Builder setEnderecoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endereco_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tipo_ = "";
    /**
     * <code>string tipo = 4;</code>
     */
    public java.lang.String getTipo() {
      java.lang.Object ref = tipo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tipo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tipo = 4;</code>
     */
    public com.google.protobuf.ByteString
        getTipoBytes() {
      java.lang.Object ref = tipo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tipo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tipo = 4;</code>
     */
    public Builder setTipo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tipo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tipo = 4;</code>
     */
    public Builder clearTipo() {
      
      tipo_ = getDefaultInstance().getTipo();
      onChanged();
      return this;
    }
    /**
     * <code>string tipo = 4;</code>
     */
    public Builder setTipoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tipo_ = value;
      onChanged();
      return this;
    }

    private int numQuartos_ ;
    /**
     * <code>int32 num_quartos = 5;</code>
     */
    public int getNumQuartos() {
      return numQuartos_;
    }
    /**
     * <code>int32 num_quartos = 5;</code>
     */
    public Builder setNumQuartos(int value) {
      
      numQuartos_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_quartos = 5;</code>
     */
    public Builder clearNumQuartos() {
      
      numQuartos_ = 0;
      onChanged();
      return this;
    }

    private int numGaragem_ ;
    /**
     * <code>int32 num_garagem = 6;</code>
     */
    public int getNumGaragem() {
      return numGaragem_;
    }
    /**
     * <code>int32 num_garagem = 6;</code>
     */
    public Builder setNumGaragem(int value) {
      
      numGaragem_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_garagem = 6;</code>
     */
    public Builder clearNumGaragem() {
      
      numGaragem_ = 0;
      onChanged();
      return this;
    }

    private float areaConstruida_ ;
    /**
     * <code>float area_construida = 7;</code>
     */
    public float getAreaConstruida() {
      return areaConstruida_;
    }
    /**
     * <code>float area_construida = 7;</code>
     */
    public Builder setAreaConstruida(float value) {
      
      areaConstruida_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float area_construida = 7;</code>
     */
    public Builder clearAreaConstruida() {
      
      areaConstruida_ = 0F;
      onChanged();
      return this;
    }

    private float areaTerreno_ ;
    /**
     * <code>float area_terreno = 8;</code>
     */
    public float getAreaTerreno() {
      return areaTerreno_;
    }
    /**
     * <code>float area_terreno = 8;</code>
     */
    public Builder setAreaTerreno(float value) {
      
      areaTerreno_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float area_terreno = 8;</code>
     */
    public Builder clearAreaTerreno() {
      
      areaTerreno_ = 0F;
      onChanged();
      return this;
    }

    private float preco_ ;
    /**
     * <code>float preco = 9;</code>
     */
    public float getPreco() {
      return preco_;
    }
    /**
     * <code>float preco = 9;</code>
     */
    public Builder setPreco(float value) {
      
      preco_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float preco = 9;</code>
     */
    public Builder clearPreco() {
      
      preco_ = 0F;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.Imovel)
  }

  // @@protoc_insertion_point(class_scope:proto.Imovel)
  private static final proto.Imovel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.Imovel();
  }

  public static proto.Imovel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Imovel>
      PARSER = new com.google.protobuf.AbstractParser<Imovel>() {
    @java.lang.Override
    public Imovel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Imovel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Imovel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Imovel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.Imovel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


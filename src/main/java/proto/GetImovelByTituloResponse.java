// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Imovel.proto

package proto;

/**
 * Protobuf type {@code proto.GetImovelByTituloResponse}
 */
public  final class GetImovelByTituloResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.GetImovelByTituloResponse)
    GetImovelByTituloResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetImovelByTituloResponse.newBuilder() to construct.
  private GetImovelByTituloResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetImovelByTituloResponse() {
    imovel_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetImovelByTituloResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              imovel_ = new java.util.ArrayList<proto.Imovel>();
              mutable_bitField0_ |= 0x00000001;
            }
            imovel_.add(
                input.readMessage(proto.Imovel.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        imovel_ = java.util.Collections.unmodifiableList(imovel_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.ImovelOuterClass.internal_static_proto_GetImovelByTituloResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.ImovelOuterClass.internal_static_proto_GetImovelByTituloResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.GetImovelByTituloResponse.class, proto.GetImovelByTituloResponse.Builder.class);
  }

  public static final int IMOVEL_FIELD_NUMBER = 1;
  private java.util.List<proto.Imovel> imovel_;
  /**
   * <code>repeated .proto.Imovel imovel = 1;</code>
   */
  public java.util.List<proto.Imovel> getImovelList() {
    return imovel_;
  }
  /**
   * <code>repeated .proto.Imovel imovel = 1;</code>
   */
  public java.util.List<? extends proto.ImovelOrBuilder> 
      getImovelOrBuilderList() {
    return imovel_;
  }
  /**
   * <code>repeated .proto.Imovel imovel = 1;</code>
   */
  public int getImovelCount() {
    return imovel_.size();
  }
  /**
   * <code>repeated .proto.Imovel imovel = 1;</code>
   */
  public proto.Imovel getImovel(int index) {
    return imovel_.get(index);
  }
  /**
   * <code>repeated .proto.Imovel imovel = 1;</code>
   */
  public proto.ImovelOrBuilder getImovelOrBuilder(
      int index) {
    return imovel_.get(index);
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
    for (int i = 0; i < imovel_.size(); i++) {
      output.writeMessage(1, imovel_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < imovel_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, imovel_.get(i));
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
    if (!(obj instanceof proto.GetImovelByTituloResponse)) {
      return super.equals(obj);
    }
    proto.GetImovelByTituloResponse other = (proto.GetImovelByTituloResponse) obj;

    boolean result = true;
    result = result && getImovelList()
        .equals(other.getImovelList());
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
    if (getImovelCount() > 0) {
      hash = (37 * hash) + IMOVEL_FIELD_NUMBER;
      hash = (53 * hash) + getImovelList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.GetImovelByTituloResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GetImovelByTituloResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GetImovelByTituloResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GetImovelByTituloResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GetImovelByTituloResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.GetImovelByTituloResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.GetImovelByTituloResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GetImovelByTituloResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GetImovelByTituloResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.GetImovelByTituloResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.GetImovelByTituloResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.GetImovelByTituloResponse parseFrom(
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
  public static Builder newBuilder(proto.GetImovelByTituloResponse prototype) {
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
   * Protobuf type {@code proto.GetImovelByTituloResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.GetImovelByTituloResponse)
      proto.GetImovelByTituloResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.ImovelOuterClass.internal_static_proto_GetImovelByTituloResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.ImovelOuterClass.internal_static_proto_GetImovelByTituloResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.GetImovelByTituloResponse.class, proto.GetImovelByTituloResponse.Builder.class);
    }

    // Construct using proto.GetImovelByTituloResponse.newBuilder()
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
        getImovelFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (imovelBuilder_ == null) {
        imovel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        imovelBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.ImovelOuterClass.internal_static_proto_GetImovelByTituloResponse_descriptor;
    }

    @java.lang.Override
    public proto.GetImovelByTituloResponse getDefaultInstanceForType() {
      return proto.GetImovelByTituloResponse.getDefaultInstance();
    }

    @java.lang.Override
    public proto.GetImovelByTituloResponse build() {
      proto.GetImovelByTituloResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.GetImovelByTituloResponse buildPartial() {
      proto.GetImovelByTituloResponse result = new proto.GetImovelByTituloResponse(this);
      int from_bitField0_ = bitField0_;
      if (imovelBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          imovel_ = java.util.Collections.unmodifiableList(imovel_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.imovel_ = imovel_;
      } else {
        result.imovel_ = imovelBuilder_.build();
      }
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
      if (other instanceof proto.GetImovelByTituloResponse) {
        return mergeFrom((proto.GetImovelByTituloResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.GetImovelByTituloResponse other) {
      if (other == proto.GetImovelByTituloResponse.getDefaultInstance()) return this;
      if (imovelBuilder_ == null) {
        if (!other.imovel_.isEmpty()) {
          if (imovel_.isEmpty()) {
            imovel_ = other.imovel_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureImovelIsMutable();
            imovel_.addAll(other.imovel_);
          }
          onChanged();
        }
      } else {
        if (!other.imovel_.isEmpty()) {
          if (imovelBuilder_.isEmpty()) {
            imovelBuilder_.dispose();
            imovelBuilder_ = null;
            imovel_ = other.imovel_;
            bitField0_ = (bitField0_ & ~0x00000001);
            imovelBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getImovelFieldBuilder() : null;
          } else {
            imovelBuilder_.addAllMessages(other.imovel_);
          }
        }
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
      proto.GetImovelByTituloResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.GetImovelByTituloResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto.Imovel> imovel_ =
      java.util.Collections.emptyList();
    private void ensureImovelIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        imovel_ = new java.util.ArrayList<proto.Imovel>(imovel_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Imovel, proto.Imovel.Builder, proto.ImovelOrBuilder> imovelBuilder_;

    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public java.util.List<proto.Imovel> getImovelList() {
      if (imovelBuilder_ == null) {
        return java.util.Collections.unmodifiableList(imovel_);
      } else {
        return imovelBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public int getImovelCount() {
      if (imovelBuilder_ == null) {
        return imovel_.size();
      } else {
        return imovelBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public proto.Imovel getImovel(int index) {
      if (imovelBuilder_ == null) {
        return imovel_.get(index);
      } else {
        return imovelBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public Builder setImovel(
        int index, proto.Imovel value) {
      if (imovelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImovelIsMutable();
        imovel_.set(index, value);
        onChanged();
      } else {
        imovelBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public Builder setImovel(
        int index, proto.Imovel.Builder builderForValue) {
      if (imovelBuilder_ == null) {
        ensureImovelIsMutable();
        imovel_.set(index, builderForValue.build());
        onChanged();
      } else {
        imovelBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public Builder addImovel(proto.Imovel value) {
      if (imovelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImovelIsMutable();
        imovel_.add(value);
        onChanged();
      } else {
        imovelBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public Builder addImovel(
        int index, proto.Imovel value) {
      if (imovelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureImovelIsMutable();
        imovel_.add(index, value);
        onChanged();
      } else {
        imovelBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public Builder addImovel(
        proto.Imovel.Builder builderForValue) {
      if (imovelBuilder_ == null) {
        ensureImovelIsMutable();
        imovel_.add(builderForValue.build());
        onChanged();
      } else {
        imovelBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public Builder addImovel(
        int index, proto.Imovel.Builder builderForValue) {
      if (imovelBuilder_ == null) {
        ensureImovelIsMutable();
        imovel_.add(index, builderForValue.build());
        onChanged();
      } else {
        imovelBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public Builder addAllImovel(
        java.lang.Iterable<? extends proto.Imovel> values) {
      if (imovelBuilder_ == null) {
        ensureImovelIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, imovel_);
        onChanged();
      } else {
        imovelBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public Builder clearImovel() {
      if (imovelBuilder_ == null) {
        imovel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        imovelBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public Builder removeImovel(int index) {
      if (imovelBuilder_ == null) {
        ensureImovelIsMutable();
        imovel_.remove(index);
        onChanged();
      } else {
        imovelBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public proto.Imovel.Builder getImovelBuilder(
        int index) {
      return getImovelFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public proto.ImovelOrBuilder getImovelOrBuilder(
        int index) {
      if (imovelBuilder_ == null) {
        return imovel_.get(index);  } else {
        return imovelBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public java.util.List<? extends proto.ImovelOrBuilder> 
         getImovelOrBuilderList() {
      if (imovelBuilder_ != null) {
        return imovelBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(imovel_);
      }
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public proto.Imovel.Builder addImovelBuilder() {
      return getImovelFieldBuilder().addBuilder(
          proto.Imovel.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public proto.Imovel.Builder addImovelBuilder(
        int index) {
      return getImovelFieldBuilder().addBuilder(
          index, proto.Imovel.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Imovel imovel = 1;</code>
     */
    public java.util.List<proto.Imovel.Builder> 
         getImovelBuilderList() {
      return getImovelFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Imovel, proto.Imovel.Builder, proto.ImovelOrBuilder> 
        getImovelFieldBuilder() {
      if (imovelBuilder_ == null) {
        imovelBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Imovel, proto.Imovel.Builder, proto.ImovelOrBuilder>(
                imovel_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        imovel_ = null;
      }
      return imovelBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.GetImovelByTituloResponse)
  }

  // @@protoc_insertion_point(class_scope:proto.GetImovelByTituloResponse)
  private static final proto.GetImovelByTituloResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.GetImovelByTituloResponse();
  }

  public static proto.GetImovelByTituloResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetImovelByTituloResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetImovelByTituloResponse>() {
    @java.lang.Override
    public GetImovelByTituloResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetImovelByTituloResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetImovelByTituloResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetImovelByTituloResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.GetImovelByTituloResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


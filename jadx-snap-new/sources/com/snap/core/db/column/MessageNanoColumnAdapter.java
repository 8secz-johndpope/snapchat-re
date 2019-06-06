package com.snap.core.db.column;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import defpackage.ainu;

public class MessageNanoColumnAdapter<T extends MessageNano> implements ainu<T, byte[]> {
    private final String callerTag;
    private final ProtoFactory<T> protoFactory;

    public interface ProtoFactory<T> {
        T create();
    }

    public MessageNanoColumnAdapter(ProtoFactory<T> protoFactory, String str) {
        this.protoFactory = protoFactory;
        this.callerTag = str;
    }

    public T decode(byte[] bArr) {
        try {
            return MessageNano.mergeFrom((MessageNano) this.protoFactory.create(), bArr);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IllegalStateException(e);
        }
    }

    public byte[] encode(T t) {
        return MessageNano.toByteArray(t);
    }
}

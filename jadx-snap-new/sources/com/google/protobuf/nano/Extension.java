package com.google.protobuf.nano;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Extension<M extends ExtendableMessageNano<M>, T> {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    protected final Class<T> clazz;
    protected final boolean repeated;
    public final int tag;
    protected final int type;

    static class PrimitiveExtension<M extends ExtendableMessageNano<M>, T> extends Extension<M, T> {
        private final int nonPackedTag;
        private final int packedTag;

        public PrimitiveExtension(int i, Class<T> cls, int i2, boolean z, int i3, int i4) {
            super(i, cls, i2, z);
            this.nonPackedTag = i3;
            this.packedTag = i4;
        }

        private int computePackedDataSize(Object obj) {
            int length = Array.getLength(obj);
            int i = 0;
            int i2;
            switch (this.type) {
                case 1:
                case 6:
                case 16:
                    length <<= 3;
                    break;
                case 2:
                case 7:
                case 15:
                    length <<= 2;
                    break;
                case 3:
                    i2 = 0;
                    while (i < length) {
                        i2 += CodedOutputByteBufferNano.computeInt64SizeNoTag(Array.getLong(obj, i));
                        i++;
                    }
                    return i2;
                case 4:
                    i2 = 0;
                    while (i < length) {
                        i2 += CodedOutputByteBufferNano.computeUInt64SizeNoTag(Array.getLong(obj, i));
                        i++;
                    }
                    return i2;
                case 5:
                    i2 = 0;
                    while (i < length) {
                        i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(Array.getInt(obj, i));
                        i++;
                    }
                    return i2;
                case 8:
                    break;
                case 13:
                    i2 = 0;
                    while (i < length) {
                        i2 += CodedOutputByteBufferNano.computeUInt32SizeNoTag(Array.getInt(obj, i));
                        i++;
                    }
                    return i2;
                case 14:
                    i2 = 0;
                    while (i < length) {
                        i2 += CodedOutputByteBufferNano.computeEnumSizeNoTag(Array.getInt(obj, i));
                        i++;
                    }
                    return i2;
                case 17:
                    i2 = 0;
                    while (i < length) {
                        i2 += CodedOutputByteBufferNano.computeSInt32SizeNoTag(Array.getInt(obj, i));
                        i++;
                    }
                    return i2;
                case 18:
                    i2 = 0;
                    while (i < length) {
                        i2 += CodedOutputByteBufferNano.computeSInt64SizeNoTag(Array.getLong(obj, i));
                        i++;
                    }
                    return i2;
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unexpected non-packable type ");
                    stringBuilder.append(this.type);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            return length;
        }

        /* Access modifiers changed, original: protected */
        public int computeRepeatedSerializedSize(Object obj) {
            if (this.tag == this.nonPackedTag) {
                return super.computeRepeatedSerializedSize(obj);
            }
            if (this.tag == this.packedTag) {
                int computePackedDataSize = computePackedDataSize(obj);
                return (computePackedDataSize + CodedOutputByteBufferNano.computeRawVarint32Size(computePackedDataSize)) + CodedOutputByteBufferNano.computeRawVarint32Size(this.tag);
            }
            StringBuilder stringBuilder = new StringBuilder("Unexpected repeated extension tag ");
            stringBuilder.append(this.tag);
            stringBuilder.append(", unequal to both non-packed variant ");
            stringBuilder.append(this.nonPackedTag);
            stringBuilder.append(" and packed variant ");
            stringBuilder.append(this.packedTag);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /* Access modifiers changed, original: protected|final */
        public final int computeSingularSerializedSize(Object obj) {
            int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
            switch (this.type) {
                case 1:
                    return CodedOutputByteBufferNano.computeDoubleSize(tagFieldNumber, ((Double) obj).doubleValue());
                case 2:
                    return CodedOutputByteBufferNano.computeFloatSize(tagFieldNumber, ((Float) obj).floatValue());
                case 3:
                    return CodedOutputByteBufferNano.computeInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 4:
                    return CodedOutputByteBufferNano.computeUInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 5:
                    return CodedOutputByteBufferNano.computeInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 6:
                    return CodedOutputByteBufferNano.computeFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 7:
                    return CodedOutputByteBufferNano.computeFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 8:
                    return CodedOutputByteBufferNano.computeBoolSize(tagFieldNumber, ((Boolean) obj).booleanValue());
                case 9:
                    return CodedOutputByteBufferNano.computeStringSize(tagFieldNumber, (String) obj);
                case 12:
                    return CodedOutputByteBufferNano.computeBytesSize(tagFieldNumber, (byte[]) obj);
                case 13:
                    return CodedOutputByteBufferNano.computeUInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 14:
                    return CodedOutputByteBufferNano.computeEnumSize(tagFieldNumber, ((Integer) obj).intValue());
                case 15:
                    return CodedOutputByteBufferNano.computeSFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 16:
                    return CodedOutputByteBufferNano.computeSFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 17:
                    return CodedOutputByteBufferNano.computeSInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 18:
                    return CodedOutputByteBufferNano.computeSInt64Size(tagFieldNumber, ((Long) obj).longValue());
                default:
                    StringBuilder stringBuilder = new StringBuilder("Unknown type ");
                    stringBuilder.append(this.type);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        /* Access modifiers changed, original: protected */
        public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
            try {
                return codedInputByteBufferNano.readPrimitiveField(this.type);
            } catch (IOException e) {
                throw new IllegalArgumentException("Error reading extension field", e);
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0039 in {3, 9, 10, 13} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        protected void readDataInto(com.google.protobuf.nano.UnknownFieldData r3, java.util.List<java.lang.Object> r4) {
            /*
            r2 = this;
            r0 = r3.tag;
            r1 = r2.nonPackedTag;
            if (r0 != r1) goto L_0x0014;
            r3 = r3.bytes;
            r3 = com.google.protobuf.nano.CodedInputByteBufferNano.newInstance(r3);
            r3 = r2.readData(r3);
            r4.add(r3);
            return;
            r3 = r3.bytes;
            r3 = com.google.protobuf.nano.CodedInputByteBufferNano.newInstance(r3);
            r0 = r3.readRawVarint32();	 Catch:{ IOException -> 0x0030 }
            r3.pushLimit(r0);	 Catch:{ IOException -> 0x0030 }
            r0 = r3.isAtEnd();
            if (r0 != 0) goto L_0x002f;
            r0 = r2.readData(r3);
            r4.add(r0);
            goto L_0x0021;
            return;
            r3 = move-exception;
            r4 = new java.lang.IllegalArgumentException;
            r0 = "Error reading extension field";
            r4.<init>(r0, r3);
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.Extension$PrimitiveExtension.readDataInto(com.google.protobuf.nano.UnknownFieldData, java.util.List):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:60:0x0125 in {3, 12, 13, 15, 16, 18, 19, 21, 22, 24, 25, 27, 28, 30, 31, 33, 34, 36, 37, 39, 40, 42, 43, 45, 46, 48, 49, 51, 52, 54, 57, 59} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        protected void writeRepeatedData(java.lang.Object r6, com.google.protobuf.nano.CodedOutputByteBufferNano r7) {
            /*
            r5 = this;
            r0 = r5.tag;
            r1 = r5.nonPackedTag;
            if (r0 != r1) goto L_0x000a;
            super.writeRepeatedData(r6, r7);
            return;
            r0 = r5.tag;
            r1 = r5.packedTag;
            if (r0 != r1) goto L_0x00fb;
            r0 = java.lang.reflect.Array.getLength(r6);
            r1 = r5.computePackedDataSize(r6);
            r2 = r5.tag;	 Catch:{ IOException -> 0x00f4 }
            r7.writeRawVarint32(r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeRawVarint32(r1);	 Catch:{ IOException -> 0x00f4 }
            r1 = r5.type;	 Catch:{ IOException -> 0x00f4 }
            r2 = 0;	 Catch:{ IOException -> 0x00f4 }
            switch(r1) {
                case 1: goto L_0x00d3;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00ac;
                case 5: goto L_0x009f;
                case 6: goto L_0x0092;
                case 7: goto L_0x0085;
                case 8: goto L_0x0078;
                case 9: goto L_0x0026;
                case 10: goto L_0x0026;
                case 11: goto L_0x0026;
                case 12: goto L_0x0026;
                case 13: goto L_0x006b;
                case 14: goto L_0x005e;
                case 15: goto L_0x0051;
                case 16: goto L_0x0044;
                case 17: goto L_0x0037;
                case 18: goto L_0x002a;
                default: goto L_0x0026;
            };	 Catch:{ IOException -> 0x00f4 }
            r6 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x00e0;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x0036;	 Catch:{ IOException -> 0x00f4 }
            r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeSInt64NoTag(r3);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x002a;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x0043;	 Catch:{ IOException -> 0x00f4 }
            r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeSInt32NoTag(r1);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x0037;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x0050;	 Catch:{ IOException -> 0x00f4 }
            r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeSFixed64NoTag(r3);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x0044;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x005d;	 Catch:{ IOException -> 0x00f4 }
            r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeSFixed32NoTag(r1);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x0051;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x006a;	 Catch:{ IOException -> 0x00f4 }
            r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeEnumNoTag(r1);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x005e;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x0077;	 Catch:{ IOException -> 0x00f4 }
            r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeUInt32NoTag(r1);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x006b;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x0084;	 Catch:{ IOException -> 0x00f4 }
            r1 = java.lang.reflect.Array.getBoolean(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeBoolNoTag(r1);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x0078;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x0091;	 Catch:{ IOException -> 0x00f4 }
            r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeFixed32NoTag(r1);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x0085;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x009e;	 Catch:{ IOException -> 0x00f4 }
            r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeFixed64NoTag(r3);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x0092;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x00ab;	 Catch:{ IOException -> 0x00f4 }
            r1 = java.lang.reflect.Array.getInt(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeInt32NoTag(r1);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x009f;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x00b8;	 Catch:{ IOException -> 0x00f4 }
            r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeUInt64NoTag(r3);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x00ac;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x00c5;	 Catch:{ IOException -> 0x00f4 }
            r3 = java.lang.reflect.Array.getLong(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeInt64NoTag(r3);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x00b9;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x00d2;	 Catch:{ IOException -> 0x00f4 }
            r1 = java.lang.reflect.Array.getFloat(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeFloatNoTag(r1);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x00c6;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            if (r2 >= r0) goto L_0x00df;	 Catch:{ IOException -> 0x00f4 }
            r3 = java.lang.reflect.Array.getDouble(r6, r2);	 Catch:{ IOException -> 0x00f4 }
            r7.writeDoubleNoTag(r3);	 Catch:{ IOException -> 0x00f4 }
            r2 = r2 + 1;	 Catch:{ IOException -> 0x00f4 }
            goto L_0x00d3;	 Catch:{ IOException -> 0x00f4 }
            return;	 Catch:{ IOException -> 0x00f4 }
            r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00f4 }
            r0 = "Unpackable type ";	 Catch:{ IOException -> 0x00f4 }
            r7.<init>(r0);	 Catch:{ IOException -> 0x00f4 }
            r0 = r5.type;	 Catch:{ IOException -> 0x00f4 }
            r7.append(r0);	 Catch:{ IOException -> 0x00f4 }
            r7 = r7.toString();	 Catch:{ IOException -> 0x00f4 }
            r6.<init>(r7);	 Catch:{ IOException -> 0x00f4 }
            throw r6;	 Catch:{ IOException -> 0x00f4 }
            r6 = move-exception;
            r7 = new java.lang.IllegalStateException;
            r7.<init>(r6);
            throw r7;
            r6 = new java.lang.IllegalArgumentException;
            r7 = new java.lang.StringBuilder;
            r0 = "Unexpected repeated extension tag ";
            r7.<init>(r0);
            r0 = r5.tag;
            r7.append(r0);
            r0 = ", unequal to both non-packed variant ";
            r7.append(r0);
            r0 = r5.nonPackedTag;
            r7.append(r0);
            r0 = " and packed variant ";
            r7.append(r0);
            r0 = r5.packedTag;
            r7.append(r0);
            r7 = r7.toString();
            r6.<init>(r7);
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.Extension$PrimitiveExtension.writeRepeatedData(java.lang.Object, com.google.protobuf.nano.CodedOutputByteBufferNano):void");
        }

        /* Access modifiers changed, original: protected|final */
        public final void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                switch (this.type) {
                    case 1:
                        codedOutputByteBufferNano.writeDoubleNoTag(((Double) obj).doubleValue());
                        return;
                    case 2:
                        codedOutputByteBufferNano.writeFloatNoTag(((Float) obj).floatValue());
                        return;
                    case 3:
                        codedOutputByteBufferNano.writeInt64NoTag(((Long) obj).longValue());
                        return;
                    case 4:
                        codedOutputByteBufferNano.writeUInt64NoTag(((Long) obj).longValue());
                        return;
                    case 5:
                        codedOutputByteBufferNano.writeInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 6:
                        codedOutputByteBufferNano.writeFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 7:
                        codedOutputByteBufferNano.writeFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 8:
                        codedOutputByteBufferNano.writeBoolNoTag(((Boolean) obj).booleanValue());
                        return;
                    case 9:
                        codedOutputByteBufferNano.writeStringNoTag((String) obj);
                        return;
                    case 12:
                        codedOutputByteBufferNano.writeBytesNoTag((byte[]) obj);
                        return;
                    case 13:
                        codedOutputByteBufferNano.writeUInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 14:
                        codedOutputByteBufferNano.writeEnumNoTag(((Integer) obj).intValue());
                        return;
                    case 15:
                        codedOutputByteBufferNano.writeSFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 16:
                        codedOutputByteBufferNano.writeSFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 17:
                        codedOutputByteBufferNano.writeSInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 18:
                        codedOutputByteBufferNano.writeSInt64NoTag(((Long) obj).longValue());
                        return;
                    default:
                        StringBuilder stringBuilder = new StringBuilder("Unknown type ");
                        stringBuilder.append(this.type);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    private Extension(int i, Class<T> cls, int i2, boolean z) {
        this.type = i;
        this.clazz = cls;
        this.tag = i2;
        this.repeated = z;
    }

    @Deprecated
    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int i, Class<T> cls, int i2) {
        return new Extension(i, cls, i2, false);
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T> createMessageTyped(int i, Class<T> cls, long j) {
        return new Extension(i, cls, (int) j, false);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createPrimitiveTyped(int i, Class<T> cls, long j) {
        return new PrimitiveExtension(i, cls, (int) j, false, 0, 0);
    }

    public static <M extends ExtendableMessageNano<M>, T extends MessageNano> Extension<M, T[]> createRepeatedMessageTyped(int i, Class<T[]> cls, long j) {
        return new Extension(i, cls, (int) j, true);
    }

    public static <M extends ExtendableMessageNano<M>, T> Extension<M, T> createRepeatedPrimitiveTyped(int i, Class<T> cls, long j, long j2, long j3) {
        return new PrimitiveExtension(i, cls, (int) j, true, (int) j2, (int) j3);
    }

    private T getRepeatedValueFrom(List<UnknownFieldData> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            UnknownFieldData unknownFieldData = (UnknownFieldData) list.get(i);
            if (unknownFieldData.bytes.length != 0) {
                readDataInto(unknownFieldData, arrayList);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        Class cls = this.clazz;
        Object cast = cls.cast(Array.newInstance(cls.getComponentType(), size));
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(cast, i2, arrayList.get(i2));
        }
        return cast;
    }

    private T getSingularValueFrom(List<UnknownFieldData> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.clazz.cast(readData(CodedInputByteBufferNano.newInstance(((UnknownFieldData) list.get(list.size() - 1)).bytes)));
    }

    /* Access modifiers changed, original: protected */
    public int computeRepeatedSerializedSize(Object obj) {
        int length = Array.getLength(obj);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (Array.get(obj, i2) != null) {
                i += computeSingularSerializedSize(Array.get(obj, i2));
            }
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public int computeSerializedSize(Object obj) {
        return this.repeated ? computeRepeatedSerializedSize(obj) : computeSingularSerializedSize(obj);
    }

    /* Access modifiers changed, original: protected */
    public int computeSingularSerializedSize(Object obj) {
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
        int i = this.type;
        if (i == 10) {
            return CodedOutputByteBufferNano.computeGroupSize(tagFieldNumber, (MessageNano) obj);
        }
        if (i == 11) {
            return CodedOutputByteBufferNano.computeMessageSize(tagFieldNumber, (MessageNano) obj);
        }
        StringBuilder stringBuilder = new StringBuilder("Unknown type ");
        stringBuilder.append(this.type);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final T getValueFrom(List<UnknownFieldData> list) {
        return list == null ? null : this.repeated ? getRepeatedValueFrom(list) : getSingularValueFrom(list);
    }

    /* Access modifiers changed, original: protected */
    public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
        String str = "Error creating instance of class ";
        Class componentType = this.repeated ? this.clazz.getComponentType() : this.clazz;
        try {
            int i = this.type;
            MessageNano messageNano;
            if (i == 10) {
                messageNano = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readGroup(messageNano, WireFormatNano.getTagFieldNumber(this.tag));
                return messageNano;
            } else if (i == 11) {
                messageNano = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readMessage(messageNano);
                return messageNano;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unknown type ");
                stringBuilder.append(this.type);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (InstantiationException e) {
            throw new IllegalArgumentException(str.concat(String.valueOf(componentType)), e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(str.concat(String.valueOf(componentType)), e2);
        } catch (IOException e3) {
            throw new IllegalArgumentException("Error reading extension field", e3);
        }
    }

    /* Access modifiers changed, original: protected */
    public void readDataInto(UnknownFieldData unknownFieldData, List<Object> list) {
        list.add(readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
    }

    /* Access modifiers changed, original: protected */
    public void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (obj2 != null) {
                writeSingularData(obj2, codedOutputByteBufferNano);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        try {
            codedOutputByteBufferNano.writeRawVarint32(this.tag);
            int i = this.type;
            if (i == 10) {
                MessageNano messageNano = (MessageNano) obj;
                i = WireFormatNano.getTagFieldNumber(this.tag);
                codedOutputByteBufferNano.writeGroupNoTag(messageNano);
                codedOutputByteBufferNano.writeTag(i, 4);
            } else if (i == 11) {
                codedOutputByteBufferNano.writeMessageNoTag((MessageNano) obj);
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unknown type ");
                stringBuilder.append(this.type);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void writeTo(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.repeated) {
            writeRepeatedData(obj, codedOutputByteBufferNano);
        } else {
            writeSingularData(obj, codedOutputByteBufferNano);
        }
    }
}

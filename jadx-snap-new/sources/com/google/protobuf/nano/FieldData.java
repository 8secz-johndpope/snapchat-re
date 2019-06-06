package com.google.protobuf.nano;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FieldData implements Cloneable {
    private Extension<?, ?> cachedExtension;
    private List<UnknownFieldData> unknownFieldData;
    private Object value;

    FieldData() {
        this.unknownFieldData = new ArrayList();
    }

    <T> FieldData(Extension<?, T> extension, T t) {
        this.cachedExtension = extension;
        this.value = t;
    }

    private byte[] toByteArray() {
        byte[] bArr = new byte[computeSerializedSize()];
        writeTo(CodedOutputByteBufferNano.newInstance(bArr));
        return bArr;
    }

    /* Access modifiers changed, original: 0000 */
    public void addUnknownField(UnknownFieldData unknownFieldData) {
        this.unknownFieldData.add(unknownFieldData);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:47:0x00cd in {4, 5, 10, 11, 14, 20, 23, 26, 29, 32, 35, 42, 43, 46} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final com.google.protobuf.nano.FieldData clone() {
        /*
        r5 = this;
        r0 = new com.google.protobuf.nano.FieldData;
        r0.<init>();
        r1 = r5.cachedExtension;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r0.cachedExtension = r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.unknownFieldData;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 != 0) goto L_0x0011;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = 0;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r0.unknownFieldData = r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        goto L_0x0018;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r0.unknownFieldData;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r2 = r5.unknownFieldData;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1.addAll(r2);	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x00c5;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1 instanceof com.google.protobuf.nano.MessageNano;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x002e;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = (com.google.protobuf.nano.MessageNano) r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r0.value = r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        goto L_0x00c5;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1 instanceof byte[];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x003d;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = (byte[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        goto L_0x002a;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1 instanceof byte[][];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r2 = 0;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x005d;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = (byte[][]) r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r3 = r1.length;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r3 = new byte[r3][];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r0.value = r3;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r4 = r1.length;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r2 >= r4) goto L_0x00c5;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r4 = r1[r2];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r4 = r4.clone();	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r4 = (byte[]) r4;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r3[r2] = r4;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r2 = r2 + 1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        goto L_0x004d;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1 instanceof boolean[];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x006c;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = (boolean[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        goto L_0x002a;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1 instanceof int[];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x007b;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = (int[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        goto L_0x002a;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1 instanceof long[];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x008a;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = (long[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        goto L_0x002a;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1 instanceof float[];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x0099;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = (float[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        goto L_0x002a;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1 instanceof double[];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x00a8;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = (double[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        goto L_0x002a;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r1 instanceof com.google.protobuf.nano.MessageNano[];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r1 == 0) goto L_0x00c5;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r1 = (com.google.protobuf.nano.MessageNano[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r3 = r1.length;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r3 = new com.google.protobuf.nano.MessageNano[r3];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r0.value = r3;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r4 = r1.length;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        if (r2 >= r4) goto L_0x00c5;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r4 = r1[r2];	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r4 = r4.clone();	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r3[r2] = r4;	 Catch:{ CloneNotSupportedException -> 0x00c6 }
        r2 = r2 + 1;
        goto L_0x00b7;
        return r0;
        r0 = move-exception;
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.FieldData.clone():com.google.protobuf.nano.FieldData");
    }

    /* Access modifiers changed, original: 0000 */
    public int computeSerializedSize() {
        Object obj = this.value;
        if (obj != null) {
            return this.cachedExtension.computeSerializedSize(obj);
        }
        int i = 0;
        for (UnknownFieldData computeSerializedSize : this.unknownFieldData) {
            i += computeSerializedSize.computeSerializedSize();
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldData)) {
            return false;
        }
        FieldData fieldData = (FieldData) obj;
        if (this.value == null || fieldData.value == null) {
            List list = this.unknownFieldData;
            if (list != null) {
                List list2 = fieldData.unknownFieldData;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(toByteArray(), fieldData.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        Extension extension = this.cachedExtension;
        if (extension != fieldData.cachedExtension) {
            return false;
        }
        if (!extension.clazz.isArray()) {
            return this.value.equals(fieldData.value);
        }
        Object obj2 = this.value;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) fieldData.value) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) fieldData.value) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) fieldData.value) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) fieldData.value) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) fieldData.value) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) fieldData.value) : Arrays.deepEquals((Object[]) obj2, (Object[]) fieldData.value);
    }

    /* Access modifiers changed, original: 0000 */
    public UnknownFieldData getUnknownField(int i) {
        List list = this.unknownFieldData;
        return (list != null && i < list.size()) ? (UnknownFieldData) this.unknownFieldData.get(i) : null;
    }

    /* Access modifiers changed, original: 0000 */
    public int getUnknownFieldSize() {
        List list = this.unknownFieldData;
        return list == null ? 0 : list.size();
    }

    /* Access modifiers changed, original: 0000 */
    public <T> T getValue(Extension<?, T> extension) {
        if (this.value == null) {
            this.cachedExtension = extension;
            this.value = extension.getValueFrom(this.unknownFieldData);
            this.unknownFieldData = null;
        } else if (this.cachedExtension != extension) {
            throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
        }
        return this.value;
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public <T> void setValue(Extension<?, T> extension, T t) {
        this.cachedExtension = extension;
        this.value = t;
        this.unknownFieldData = null;
    }

    /* Access modifiers changed, original: 0000 */
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Object obj = this.value;
        if (obj != null) {
            this.cachedExtension.writeTo(obj, codedOutputByteBufferNano);
            return;
        }
        for (UnknownFieldData writeTo : this.unknownFieldData) {
            writeTo.writeTo(codedOutputByteBufferNano);
        }
    }
}

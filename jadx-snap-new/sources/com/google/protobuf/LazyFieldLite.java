package com.google.protobuf;

public class LazyFieldLite {
    private static final ExtensionRegistryLite EMPTY_REGISTRY = ExtensionRegistryLite.getEmptyRegistry();
    private ByteString delayedBytes;
    private ExtensionRegistryLite extensionRegistry;
    private volatile ByteString memoizedBytes;
    protected volatile MessageLite value;

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        checkArguments(extensionRegistryLite, byteString);
        this.extensionRegistry = extensionRegistryLite;
        this.delayedBytes = byteString;
    }

    private static void checkArguments(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        if (extensionRegistryLite == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        } else if (byteString == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static LazyFieldLite fromValue(MessageLite messageLite) {
        LazyFieldLite lazyFieldLite = new LazyFieldLite();
        lazyFieldLite.setValue(messageLite);
        return lazyFieldLite;
    }

    private static MessageLite mergeValueAndBytes(MessageLite messageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        try {
            messageLite = messageLite.toBuilder().mergeFrom(byteString, extensionRegistryLite).build();
            return messageLite;
        } catch (InvalidProtocolBufferException unused) {
            return messageLite;
        }
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    /* JADX WARNING: Missing block: B:7:0x0010, code skipped:
            if (r0 != com.google.protobuf.ByteString.EMPTY) goto L_0x0013;
     */
    public boolean containsDefaultInstance() {
        /*
        r2 = this;
        r0 = r2.memoizedBytes;
        r1 = com.google.protobuf.ByteString.EMPTY;
        if (r0 == r1) goto L_0x0015;
    L_0x0006:
        r0 = r2.value;
        if (r0 != 0) goto L_0x0013;
    L_0x000a:
        r0 = r2.delayedBytes;
        if (r0 == 0) goto L_0x0015;
    L_0x000e:
        r1 = com.google.protobuf.ByteString.EMPTY;
        if (r0 != r1) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r0 = 0;
        return r0;
    L_0x0015:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyFieldLite.containsDefaultInstance():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0035 in {2, 8, 12, 13, 15, 17, 19, 22} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    protected void ensureInitialized(com.google.protobuf.MessageLite r4) {
        /*
        r3 = this;
        r0 = r3.value;
        if (r0 == 0) goto L_0x0005;
        return;
        monitor-enter(r3);
        r0 = r3.value;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x000c;	 Catch:{ all -> 0x0032 }
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        return;
        r0 = r3.delayedBytes;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        if (r0 == 0) goto L_0x0025;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r0 = r4.getParserForType();	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r1 = r3.delayedBytes;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r2 = r3.extensionRegistry;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r0 = r0.parseFrom(r1, r2);	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r0 = (com.google.protobuf.MessageLite) r0;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r3.value = r0;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r0 = r3.delayedBytes;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r3.memoizedBytes = r0;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        goto L_0x0030;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r3.value = r4;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        r0 = com.google.protobuf.ByteString.EMPTY;	 Catch:{ InvalidProtocolBufferException -> 0x002a }
        goto L_0x0022;
    L_0x002a:
        r3.value = r4;	 Catch:{ all -> 0x0032 }
        r4 = com.google.protobuf.ByteString.EMPTY;	 Catch:{ all -> 0x0032 }
        r3.memoizedBytes = r4;	 Catch:{ all -> 0x0032 }
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        return;	 Catch:{ all -> 0x0032 }
        r4 = move-exception;	 Catch:{ all -> 0x0032 }
        monitor-exit(r3);	 Catch:{ all -> 0x0032 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyFieldLite.ensureInitialized(com.google.protobuf.MessageLite):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.value;
        MessageLite messageLite2 = lazyFieldLite.value;
        return (messageLite == null && messageLite2 == null) ? toByteString().equals(lazyFieldLite.toByteString()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.getValue(messageLite.getDefaultInstanceForType())) : getValue(messageLite2.getDefaultInstanceForType()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        ByteString byteString = this.delayedBytes;
        return byteString != null ? byteString.size() : this.value != null ? this.value.getSerializedSize() : 0;
    }

    public MessageLite getValue(MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(LazyFieldLite lazyFieldLite) {
        if (!lazyFieldLite.containsDefaultInstance()) {
            if (containsDefaultInstance()) {
                set(lazyFieldLite);
                return;
            }
            if (this.extensionRegistry == null) {
                this.extensionRegistry = lazyFieldLite.extensionRegistry;
            }
            ByteString byteString = this.delayedBytes;
            if (byteString != null) {
                ByteString byteString2 = lazyFieldLite.delayedBytes;
                if (byteString2 != null) {
                    this.delayedBytes = byteString.concat(byteString2);
                    return;
                }
            }
            if (this.value == null && lazyFieldLite.value != null) {
                setValue(mergeValueAndBytes(lazyFieldLite.value, this.delayedBytes, this.extensionRegistry));
            } else if (this.value != null && lazyFieldLite.value == null) {
                setValue(mergeValueAndBytes(this.value, lazyFieldLite.delayedBytes, lazyFieldLite.extensionRegistry));
            } else if (lazyFieldLite.extensionRegistry != null) {
                setValue(mergeValueAndBytes(this.value, lazyFieldLite.toByteString(), lazyFieldLite.extensionRegistry));
            } else if (this.extensionRegistry != null) {
                setValue(mergeValueAndBytes(lazyFieldLite.value, toByteString(), this.extensionRegistry));
            } else {
                setValue(mergeValueAndBytes(this.value, lazyFieldLite.toByteString(), EMPTY_REGISTRY));
            }
        }
    }

    public void mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ByteString readBytes;
        if (containsDefaultInstance()) {
            readBytes = codedInputStream.readBytes();
        } else {
            if (this.extensionRegistry == null) {
                this.extensionRegistry = extensionRegistryLite;
            }
            ByteString byteString = this.delayedBytes;
            if (byteString != null) {
                readBytes = byteString.concat(codedInputStream.readBytes());
                extensionRegistryLite = this.extensionRegistry;
            } else {
                try {
                    setValue(this.value.toBuilder().mergeFrom(codedInputStream, extensionRegistryLite).build());
                } catch (InvalidProtocolBufferException unused) {
                }
                return;
            }
        }
        setByteString(readBytes, extensionRegistryLite);
    }

    public void set(LazyFieldLite lazyFieldLite) {
        this.delayedBytes = lazyFieldLite.delayedBytes;
        this.value = lazyFieldLite.value;
        this.memoizedBytes = lazyFieldLite.memoizedBytes;
        ExtensionRegistryLite extensionRegistryLite = lazyFieldLite.extensionRegistry;
        if (extensionRegistryLite != null) {
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public void setByteString(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        checkArguments(extensionRegistryLite, byteString);
        this.delayedBytes = byteString;
        this.extensionRegistry = extensionRegistryLite;
        this.value = null;
        this.memoizedBytes = null;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = messageLite;
        return messageLite2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x002c in {3, 6, 13, 16, 18, 21, 24} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public com.google.protobuf.ByteString toByteString() {
        /*
        r1 = this;
        r0 = r1.memoizedBytes;
        if (r0 == 0) goto L_0x0007;
        r0 = r1.memoizedBytes;
        return r0;
        r0 = r1.delayedBytes;
        if (r0 == 0) goto L_0x000c;
        return r0;
        monitor-enter(r1);
        r0 = r1.memoizedBytes;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0015;	 Catch:{ all -> 0x0029 }
        r0 = r1.memoizedBytes;	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        return r0;	 Catch:{ all -> 0x0029 }
        r0 = r1.value;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x001e;	 Catch:{ all -> 0x0029 }
        r0 = com.google.protobuf.ByteString.EMPTY;	 Catch:{ all -> 0x0029 }
        r1.memoizedBytes = r0;	 Catch:{ all -> 0x0029 }
        goto L_0x0025;	 Catch:{ all -> 0x0029 }
        r0 = r1.value;	 Catch:{ all -> 0x0029 }
        r0 = r0.toByteString();	 Catch:{ all -> 0x0029 }
        goto L_0x001b;	 Catch:{ all -> 0x0029 }
        r0 = r1.memoizedBytes;	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        return r0;	 Catch:{ all -> 0x0029 }
        r0 = move-exception;	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.LazyFieldLite.toByteString():com.google.protobuf.ByteString");
    }
}

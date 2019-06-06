package com.google.ar.core;

import android.graphics.Rect;
import defpackage.ax;
import defpackage.caf;
import java.nio.ByteBuffer;

public class ArImage extends ax {
    private final long a;

    class a extends defpackage.ax.a {
        private final long a;
        private final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public final ByteBuffer getBuffer() {
            return ArImage.this.nativeGetBuffer(this.a, this.b).asReadOnlyBuffer();
        }

        public final int getPixelStride() {
            int nativeGetPixelStride = ArImage.this.nativeGetPixelStride(this.a, this.b);
            if (nativeGetPixelStride != -1) {
                return nativeGetPixelStride;
            }
            throw new caf("Unknown error in ArImage.Plane.getPixelStride().");
        }

        public final int getRowStride() {
            int nativeGetRowStride = ArImage.this.nativeGetRowStride(this.a, this.b);
            if (nativeGetRowStride != -1) {
                return nativeGetRowStride;
            }
            throw new caf("Unknown error in ArImage.Plane.getRowStride().");
        }
    }

    private native void nativeClose(long j);

    private native int nativeGetFormat(long j);

    private native int nativeGetHeight(long j);

    private native int nativeGetNumberOfPlanes(long j);

    private native long nativeGetTimestamp(long j);

    private native int nativeGetWidth(long j);

    public void close() {
        nativeClose(this.a);
    }

    public Rect getCropRect() {
        throw new UnsupportedOperationException("Crop rect is unknown in this image.");
    }

    public int getFormat() {
        int nativeGetFormat = nativeGetFormat(this.a);
        if (nativeGetFormat != -1) {
            return nativeGetFormat;
        }
        throw new caf("Unknown error in ArImage.getFormat().");
    }

    public int getHeight() {
        int nativeGetHeight = nativeGetHeight(this.a);
        if (nativeGetHeight != -1) {
            return nativeGetHeight;
        }
        throw new caf("Unknown error in ArImage.getHeight().");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:8:0x0023 in {4, 5, 7} preds:[]
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
    public android.media.Image.Plane[] getPlanes() {
        /*
        r6 = this;
        r0 = r6.a;
        r0 = r6.nativeGetNumberOfPlanes(r0);
        r1 = -1;
        if (r0 == r1) goto L_0x001b;
        r1 = new com.google.ar.core.ArImage.a[r0];
        r2 = 0;
        if (r2 >= r0) goto L_0x001a;
        r3 = new com.google.ar.core.ArImage$a;
        r4 = r6.a;
        r3.<init>(r4, r2);
        r1[r2] = r3;
        r2 = r2 + 1;
        goto L_0x000c;
        return r1;
        r0 = new caf;
        r1 = "Unknown error in ArImage.getPlanes().";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.ArImage.getPlanes():android.media.Image$Plane[]");
    }

    public long getTimestamp() {
        long nativeGetTimestamp = nativeGetTimestamp(this.a);
        if (nativeGetTimestamp != -1) {
            return nativeGetTimestamp;
        }
        throw new caf("Unknown error in ArImage.getTimestamp().");
    }

    public int getWidth() {
        int nativeGetWidth = nativeGetWidth(this.a);
        if (nativeGetWidth != -1) {
            return nativeGetWidth;
        }
        throw new caf("Unknown error in ArImage.getWidth().");
    }

    public native ByteBuffer nativeGetBuffer(long j, int i);

    public native int nativeGetPixelStride(long j, int i);

    public native int nativeGetRowStride(long j, int i);

    public void setCropRect(Rect rect) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }

    public void setTimestamp(long j) {
        throw new UnsupportedOperationException("This is a read-only image.");
    }
}

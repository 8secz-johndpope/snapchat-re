package org.jcodec.movtool;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.common.io.SeekableByteChannel;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.DataRefBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class Flattern {
    public List<ProgressListener> listeners = new ArrayList();

    public interface ProgressListener {
        void trigger(int i);
    }

    private int calcProgress(int i, int i2, int i3) {
        i = (i2 * 100) / i;
        if (i3 >= i) {
            return i3;
        }
        for (ProgressListener trigger : this.listeners) {
            trigger.trigger(i);
        }
        return i;
    }

    private int calcSpaceReq(MovieBox movieBox) {
        TrakBox[] tracks = movieBox.getTracks();
        int i = 0;
        for (TrakBox stco : tracks) {
            ChunkOffsetsBox stco2 = stco.getStco();
            if (stco2 != null) {
                i += stco2.getChunkOffsets().length << 2;
            }
        }
        return i;
    }

    private void writeHeader(Header header, SeekableByteChannel seekableByteChannel) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        header.write(allocate);
        allocate.flip();
        seekableByteChannel.write(allocate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0016  */
    public void flattern(org.jcodec.containers.mp4.MP4Util.Movie r1, java.io.File r2) {
        /*
        r0 = this;
        org.jcodec.platform.Platform.deleteFile(r2);
        r2 = org.jcodec.common.io.NIOUtils.writableChannel(r2);	 Catch:{ all -> 0x0012 }
        r0.flatternChannel(r1, r2);	 Catch:{ all -> 0x0010 }
        if (r2 == 0) goto L_0x000f;
    L_0x000c:
        r2.close();
    L_0x000f:
        return;
    L_0x0010:
        r1 = move-exception;
        goto L_0x0014;
    L_0x0012:
        r1 = move-exception;
        r2 = 0;
    L_0x0014:
        if (r2 == 0) goto L_0x0019;
    L_0x0016:
        r2.close();
    L_0x0019:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.Flattern.flattern(org.jcodec.containers.mp4.MP4Util$Movie, java.io.File):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x0167 in {7, 8, 17, 19, 20, 21, 22, 25, 29, 33, 35, 37} preds:[]
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
    public void flatternChannel(org.jcodec.containers.mp4.MP4Util.Movie r23, org.jcodec.common.io.SeekableByteChannel r24) {
        /*
        r22 = this;
        r0 = r22;
        r1 = r23;
        r2 = r24;
        r23.getFtyp();
        r3 = r23.getMoov();
        r4 = r3.isPureRefMovie();
        if (r4 == 0) goto L_0x015f;
        r4 = 0;
        r2.setPosition(r4);
        org.jcodec.containers.mp4.MP4Util.writeFullMovie(r2, r1);
        r6 = r0.calcSpaceReq(r3);
        r6 = java.nio.ByteBuffer.allocate(r6);
        r2.write(r6);
        r6 = r24.position();
        r8 = 4294967297; // 0x100000001 float:1.4E-45 double:2.1219957915E-314;
        r10 = "mdat";
        r8 = org.jcodec.containers.mp4.boxes.Header.createHeader(r10, r8);
        r0.writeHeader(r8, r2);
        r8 = r0.getInputs(r3);
        r9 = r3.getTracks();
        r11 = r9.length;
        r11 = new org.jcodec.containers.mp4.ChunkReader[r11];
        r12 = r9.length;
        r12 = new org.jcodec.containers.mp4.ChunkWriter[r12];
        r13 = r9.length;
        r13 = new org.jcodec.containers.mp4.Chunk[r13];
        r14 = r9.length;
        r14 = new long[r14];
        r4 = 0;
        r15 = 0;
        r5 = r9.length;
        if (r15 >= r5) goto L_0x0090;
        r5 = new org.jcodec.containers.mp4.ChunkReader;
        r16 = r10;
        r10 = r9[r15];
        r5.<init>(r10);
        r11[r15] = r5;
        r5 = r11[r15];
        r5 = r5.size();
        r4 = r4 + r5;
        r5 = new org.jcodec.containers.mp4.ChunkWriter;
        r10 = r9[r15];
        r17 = r4;
        r4 = r8[r15];
        r5.<init>(r10, r4, r2);
        r12[r15] = r5;
        r4 = r11[r15];
        r4 = r4.next();
        r13[r15] = r4;
        r4 = r9[r15];
        r4 = r4.isVideo();
        if (r4 == 0) goto L_0x0089;
        r4 = r3.getTimescale();
        r4 = r4 * 2;
        r4 = (long) r4;
        r14[r15] = r4;
        r15 = r15 + 1;
        r10 = r16;
        r4 = r17;
        goto L_0x004e;
        r16 = r10;
        r5 = 0;
        r8 = 0;
        r10 = -1;
        r15 = 0;
        r1 = r11.length;
        if (r15 >= r1) goto L_0x00ec;
        r1 = r13[r15];
        if (r1 == 0) goto L_0x00db;
        r1 = -1;
        if (r10 != r1) goto L_0x00a7;
        r19 = r6;
        r18 = r8;
        r21 = r9;
        goto L_0x00d9;
        r1 = r13[r15];
        r1 = r1.getStartTv();
        r18 = r9[r15];
        r19 = r6;
        r6 = r18.getTimescale();
        r6 = (long) r6;
        r1 = r3.rescale(r1, r6);
        r6 = r14[r15];
        r1 = r1 + r6;
        r6 = r13[r10];
        r6 = r6.getStartTv();
        r18 = r9[r10];
        r21 = r9;
        r9 = r18.getTimescale();
        r18 = r8;
        r8 = (long) r9;
        r6 = r3.rescale(r6, r8);
        r8 = r14[r10];
        r6 = r6 + r8;
        r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r8 >= 0) goto L_0x00e1;
        r10 = r15;
        goto L_0x00e1;
        r19 = r6;
        r18 = r8;
        r21 = r9;
        r15 = r15 + 1;
        r2 = r24;
        r8 = r18;
        r6 = r19;
        r9 = r21;
        goto L_0x0096;
        r19 = r6;
        r18 = r8;
        r21 = r9;
        r1 = -1;
        if (r10 == r1) goto L_0x0115;
        r1 = r12[r10];
        r2 = r13[r10];
        r1.write(r2);
        r1 = r11[r10];
        r1 = r1.next();
        r13[r10] = r1;
        r5 = r5 + 1;
        r1 = r18;
        r8 = r0.calcProgress(r4, r5, r1);
        r1 = r23;
        r2 = r24;
        r6 = r19;
        r9 = r21;
        goto L_0x0094;
        r1 = r21;
        r2 = 0;
        r3 = r1.length;
        if (r2 >= r3) goto L_0x0123;
        r3 = r12[r2];
        r3.apply();
        r2 = r2 + 1;
        goto L_0x0118;
        r1 = r24.position();
        r1 = r1 - r19;
        r3 = r24;
        r4 = 0;
        r3.setPosition(r4);
        r6 = r23;
        org.jcodec.containers.mp4.MP4Util.writeFullMovie(r3, r6);
        r6 = r24.position();
        r6 = r19 - r6;
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r8 < 0) goto L_0x0157;
        r4 = "free";
        r4 = org.jcodec.containers.mp4.boxes.Header.createHeader(r4, r6);
        r0.writeHeader(r4, r3);
        r4 = r19;
        r3.setPosition(r4);
        r4 = r16;
        r1 = org.jcodec.containers.mp4.boxes.Header.createHeader(r4, r1);
        r0.writeHeader(r1, r3);
        return;
        r1 = new java.lang.RuntimeException;
        r2 = "Not enough space to write the header";
        r1.<init>(r2);
        throw r1;
        r1 = new java.lang.IllegalArgumentException;
        r2 = "movie should be reference";
        r1.<init>(r2);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.Flattern.flatternChannel(org.jcodec.containers.mp4.MP4Util$Movie, org.jcodec.common.io.SeekableByteChannel):void");
    }

    /* Access modifiers changed, original: protected */
    public SeekableByteChannel[][] getInputs(MovieBox movieBox) {
        TrakBox[] tracks = movieBox.getTracks();
        SeekableByteChannel[][] seekableByteChannelArr = new SeekableByteChannel[tracks.length][];
        int i = 0;
        while (i < tracks.length) {
            DataRefBox dataRefBox = (DataRefBox) NodeBox.findFirstPath(tracks[i], DataRefBox.class, Box.path("mdia.minf.dinf.dref"));
            if (dataRefBox != null) {
                List boxes = dataRefBox.getBoxes();
                SeekableByteChannel[] seekableByteChannelArr2 = new SeekableByteChannel[boxes.size()];
                SeekableByteChannel[] seekableByteChannelArr3 = new SeekableByteChannel[boxes.size()];
                for (int i2 = 0; i2 < seekableByteChannelArr2.length; i2++) {
                    seekableByteChannelArr3[i2] = resolveDataRef((Box) boxes.get(i2));
                }
                seekableByteChannelArr[i] = seekableByteChannelArr3;
                i++;
            } else {
                throw new RuntimeException("No data references");
            }
        }
        return seekableByteChannelArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0062 in {4, 6, 8, 13, 15, 17} preds:[]
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
    public org.jcodec.common.io.SeekableByteChannel resolveDataRef(org.jcodec.containers.mp4.boxes.Box r3) {
        /*
        r2 = this;
        r0 = r3 instanceof org.jcodec.containers.mp4.boxes.UrlBox;
        if (r0 == 0) goto L_0x0029;
        r3 = (org.jcodec.containers.mp4.boxes.UrlBox) r3;
        r3 = r3.getUrl();
        r0 = "file://";
        r0 = r3.startsWith(r0);
        if (r0 == 0) goto L_0x0021;
        r0 = new java.io.File;
        r1 = 7;
        r3 = r3.substring(r1);
        r0.<init>(r3);
        r3 = org.jcodec.common.io.NIOUtils.readableChannel(r0);
        return r3;
        r3 = new java.lang.RuntimeException;
        r0 = "Only file:// urls are supported in data reference";
        r3.<init>(r0);
        throw r3;
        r0 = r3 instanceof org.jcodec.containers.mp4.boxes.AliasBox;
        if (r0 == 0) goto L_0x0043;
        r3 = (org.jcodec.containers.mp4.boxes.AliasBox) r3;
        r3 = r3.getUnixPath();
        if (r3 == 0) goto L_0x003b;
        r0 = new java.io.File;
        r0.<init>(r3);
        goto L_0x001c;
        r3 = new java.lang.RuntimeException;
        r0 = "Could not resolve alias";
        r3.<init>(r0);
        throw r3;
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.getHeader();
        r3 = r3.getFourcc();
        r1.append(r3);
        r3 = " dataref type is not supported";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.Flattern.resolveDataRef(org.jcodec.containers.mp4.boxes.Box):org.jcodec.common.io.SeekableByteChannel");
    }
}

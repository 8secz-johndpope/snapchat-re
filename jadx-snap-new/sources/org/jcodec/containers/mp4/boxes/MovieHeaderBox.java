package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.containers.mp4.TimeUtil;

public class MovieHeaderBox extends FullBox {
    private long created;
    private long duration;
    private int[] matrix;
    private long modified;
    private int nextTrackId;
    private float rate;
    private int timescale;
    private float volume;

    public MovieHeaderBox(Header header) {
        super(header);
    }

    public static MovieHeaderBox createMovieHeaderBox(int i, long j, float f, float f2, long j2, long j3, int[] iArr, int i2) {
        MovieHeaderBox movieHeaderBox = new MovieHeaderBox(new Header(fourcc()));
        movieHeaderBox.timescale = i;
        movieHeaderBox.duration = j;
        movieHeaderBox.rate = f;
        movieHeaderBox.volume = f2;
        movieHeaderBox.created = j2;
        movieHeaderBox.modified = j3;
        movieHeaderBox.matrix = iArr;
        movieHeaderBox.nextTrackId = i2;
        return movieHeaderBox;
    }

    public static String fourcc() {
        return com.coremedia.iso.boxes.MovieHeaderBox.TYPE;
    }

    private int[] readMatrix(ByteBuffer byteBuffer) {
        int[] iArr = new int[9];
        for (int i = 0; i < 9; i++) {
            iArr[i] = byteBuffer.getInt();
        }
        return iArr;
    }

    private float readRate(ByteBuffer byteBuffer) {
        return ((float) byteBuffer.getInt()) / 65536.0f;
    }

    private float readVolume(ByteBuffer byteBuffer) {
        return ((float) byteBuffer.getShort()) / 256.0f;
    }

    private void writeFixed1616(ByteBuffer byteBuffer, float f) {
        double d = (double) f;
        Double.isNaN(d);
        byteBuffer.putInt((int) (d * 65536.0d));
    }

    private void writeFixed88(ByteBuffer byteBuffer, float f) {
        double d = (double) f;
        Double.isNaN(d);
        byteBuffer.putShort((short) ((int) (d * 256.0d)));
    }

    private void writeMatrix(ByteBuffer byteBuffer) {
        int i;
        for (i = 0; i < Math.min(9, this.matrix.length); i++) {
            byteBuffer.putInt(this.matrix[i]);
        }
        for (i = Math.min(9, this.matrix.length); i < 9; i++) {
            byteBuffer.putInt(0);
        }
    }

    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(TimeUtil.toMovTime(this.created));
        byteBuffer.putInt(TimeUtil.toMovTime(this.modified));
        byteBuffer.putInt(this.timescale);
        byteBuffer.putInt((int) this.duration);
        writeFixed1616(byteBuffer, this.rate);
        writeFixed88(byteBuffer, this.volume);
        byteBuffer.put(new byte[10]);
        writeMatrix(byteBuffer);
        byteBuffer.put(new byte[24]);
        byteBuffer.putInt(this.nextTrackId);
    }

    public int estimateSize() {
        return 144;
    }

    public long getCreated() {
        return this.created;
    }

    public long getDuration() {
        return this.duration;
    }

    public int[] getMatrix() {
        return this.matrix;
    }

    public long getModified() {
        return this.modified;
    }

    public int getNextTrackId() {
        return this.nextTrackId;
    }

    public float getRate() {
        return this.rate;
    }

    public int getTimescale() {
        return this.timescale;
    }

    public float getVolume() {
        return this.volume;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x007a in {2, 6, 8, 10} preds:[]
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
    public void parse(java.nio.ByteBuffer r3) {
        /*
        r2 = this;
        super.parse(r3);
        r0 = r2.version;
        if (r0 != 0) goto L_0x0029;
        r0 = r3.getInt();
        r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r0);
        r2.created = r0;
        r0 = r3.getInt();
        r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r0);
        r2.modified = r0;
        r0 = r3.getInt();
        r2.timescale = r0;
        r0 = r3.getInt();
        r0 = (long) r0;
        r2.duration = r0;
        goto L_0x004f;
        r0 = r2.version;
        r1 = 1;
        if (r0 != r1) goto L_0x0072;
        r0 = r3.getLong();
        r1 = (int) r0;
        r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r1);
        r2.created = r0;
        r0 = r3.getLong();
        r1 = (int) r0;
        r0 = org.jcodec.containers.mp4.TimeUtil.fromMovTime(r1);
        r2.modified = r0;
        r0 = r3.getInt();
        r2.timescale = r0;
        r0 = r3.getLong();
        goto L_0x0026;
        r0 = r2.readRate(r3);
        r2.rate = r0;
        r0 = r2.readVolume(r3);
        r2.volume = r0;
        r0 = 10;
        org.jcodec.common.io.NIOUtils.skip(r3, r0);
        r0 = r2.readMatrix(r3);
        r2.matrix = r0;
        r0 = 24;
        org.jcodec.common.io.NIOUtils.skip(r3, r0);
        r3 = r3.getInt();
        r2.nextTrackId = r3;
        return;
        r3 = new java.lang.RuntimeException;
        r0 = "Unsupported version";
        r3.<init>(r0);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.boxes.MovieHeaderBox.parse(java.nio.ByteBuffer):void");
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setNextTrackId(int i) {
        this.nextTrackId = i;
    }

    public void setTimescale(int i) {
        this.timescale = i;
    }
}

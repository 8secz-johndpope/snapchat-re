package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.containers.mp4.TimeUtil;

public class MediaHeaderBox extends FullBox {
    private long created;
    private long duration;
    private int language;
    private long modified;
    private int quality;
    private int timescale;

    public MediaHeaderBox(Header header) {
        super(header);
    }

    public static MediaHeaderBox createMediaHeaderBox(int i, long j, int i2, long j2, long j3, int i3) {
        MediaHeaderBox mediaHeaderBox = new MediaHeaderBox(new Header(fourcc()));
        mediaHeaderBox.timescale = i;
        mediaHeaderBox.duration = j;
        mediaHeaderBox.language = i2;
        mediaHeaderBox.created = j2;
        mediaHeaderBox.modified = j3;
        mediaHeaderBox.quality = i3;
        return mediaHeaderBox;
    }

    public static String fourcc() {
        return com.coremedia.iso.boxes.MediaHeaderBox.TYPE;
    }

    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(TimeUtil.toMovTime(this.created));
        byteBuffer.putInt(TimeUtil.toMovTime(this.modified));
        byteBuffer.putInt(this.timescale);
        byteBuffer.putInt((int) this.duration);
        byteBuffer.putShort((short) this.language);
        byteBuffer.putShort((short) this.quality);
    }

    public int estimateSize() {
        return 32;
    }

    public long getCreated() {
        return this.created;
    }

    public long getDuration() {
        return this.duration;
    }

    public int getLanguage() {
        return this.language;
    }

    public long getModified() {
        return this.modified;
    }

    public int getQuality() {
        return this.quality;
    }

    public int getTimescale() {
        return this.timescale;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x0057 in {2, 4, 7, 9} preds:[]
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
        r3 = r3.getInt();
        r0 = (long) r3;
        r2.duration = r0;
        return;
        r0 = r2.version;
        r1 = 1;
        if (r0 != r1) goto L_0x004f;
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
        r3 = new java.lang.RuntimeException;
        r0 = "Unsupported version";
        r3.<init>(r0);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.boxes.MediaHeaderBox.parse(java.nio.ByteBuffer):void");
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setTimescale(int i) {
        this.timescale = i;
    }
}

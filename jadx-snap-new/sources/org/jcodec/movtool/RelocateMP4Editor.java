package org.jcodec.movtool;

import com.coremedia.iso.boxes.MovieBox;
import java.io.File;
import java.nio.ByteBuffer;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.io.SeekableByteChannel;
import org.jcodec.containers.mp4.BoxFactory;
import org.jcodec.containers.mp4.BoxUtil;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.MP4Util.Atom;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Header;

public class RelocateMP4Editor {
    private ByteBuffer fetchBox(SeekableByteChannel seekableByteChannel, Atom atom) {
        seekableByteChannel.setPosition(atom.getOffset());
        return NIOUtils.fetchFromChannel(seekableByteChannel, (int) atom.getHeader().getSize());
    }

    private Atom getMoov(SeekableByteChannel seekableByteChannel) {
        for (Atom atom : MP4Util.getRootAtoms(seekableByteChannel)) {
            if (MovieBox.TYPE.equals(atom.getHeader().getFourcc())) {
                return atom;
            }
        }
        return null;
    }

    private Box parseBox(ByteBuffer byteBuffer) {
        return BoxUtil.parseBox(byteBuffer, Header.read(byteBuffer), BoxFactory.getDefault());
    }

    public void modifyOrRelocate(File file, MP4Edit mP4Edit) {
        if (!new InplaceMP4Editor().modify(file, mP4Edit)) {
            relocate(file, mP4Edit);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x005e in {5, 7, 10, 12, 14, 16} preds:[]
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
    public void relocate(java.io.File r7, org.jcodec.movtool.MP4Edit r8) {
        /*
        r6 = this;
        r7 = org.jcodec.common.io.NIOUtils.rwChannel(r7);	 Catch:{ all -> 0x0058 }
        r0 = r6.getMoov(r7);	 Catch:{ all -> 0x0056 }
        r1 = r6.fetchBox(r7, r0);	 Catch:{ all -> 0x0056 }
        r1 = r6.parseBox(r1);	 Catch:{ all -> 0x0056 }
        r1 = (org.jcodec.containers.mp4.boxes.MovieBox) r1;	 Catch:{ all -> 0x0056 }
        r8.apply(r1);	 Catch:{ all -> 0x0056 }
        r2 = r0.getOffset();	 Catch:{ all -> 0x0056 }
        r8 = r0.getHeader();	 Catch:{ all -> 0x0056 }
        r4 = r8.getSize();	 Catch:{ all -> 0x0056 }
        r2 = r2 + r4;	 Catch:{ all -> 0x0056 }
        r4 = r7.size();	 Catch:{ all -> 0x0056 }
        r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ all -> 0x0056 }
        if (r8 >= 0) goto L_0x004a;	 Catch:{ all -> 0x0056 }
        r8 = "Relocating movie header to the end of the file.";	 Catch:{ all -> 0x0056 }
        org.jcodec.common.logging.Logger.info(r8);	 Catch:{ all -> 0x0056 }
        r2 = r0.getOffset();	 Catch:{ all -> 0x0056 }
        r4 = 4;	 Catch:{ all -> 0x0056 }
        r2 = r2 + r4;	 Catch:{ all -> 0x0056 }
        r7.setPosition(r2);	 Catch:{ all -> 0x0056 }
        r8 = org.jcodec.containers.mp4.boxes.Header.FOURCC_FREE;	 Catch:{ all -> 0x0056 }
        r8 = java.nio.ByteBuffer.wrap(r8);	 Catch:{ all -> 0x0056 }
        r7.write(r8);	 Catch:{ all -> 0x0056 }
        r2 = r7.size();	 Catch:{ all -> 0x0056 }
        r7.setPosition(r2);	 Catch:{ all -> 0x0056 }
        goto L_0x004f;	 Catch:{ all -> 0x0056 }
        r2 = r0.getOffset();	 Catch:{ all -> 0x0056 }
        goto L_0x0046;	 Catch:{ all -> 0x0056 }
        org.jcodec.containers.mp4.MP4Util.writeMovie(r7, r1);	 Catch:{ all -> 0x0056 }
        org.jcodec.common.io.NIOUtils.closeQuietly(r7);
        return;
        r8 = move-exception;
        goto L_0x005a;
        r8 = move-exception;
        r7 = 0;
        org.jcodec.common.io.NIOUtils.closeQuietly(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.RelocateMP4Editor.relocate(java.io.File, org.jcodec.movtool.MP4Edit):void");
    }
}

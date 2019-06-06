package org.jcodec.movtool;

import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.jcodec.common.Assert;
import org.jcodec.common.Tuple;
import org.jcodec.common.Tuple._2;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.io.SeekableByteChannel;
import org.jcodec.containers.mp4.BoxFactory;
import org.jcodec.containers.mp4.BoxUtil;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.MP4Util.Atom;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.MovieFragmentBox;

public class InplaceMP4Editor {
    private List<_2<Atom, ByteBuffer>> doTheFix(SeekableByteChannel seekableByteChannel, MP4Edit mP4Edit) {
        Atom moov = getMoov(seekableByteChannel);
        Assert.assertNotNull(moov);
        ByteBuffer fetchBox = fetchBox(seekableByteChannel, moov);
        MovieBox movieBox = (MovieBox) parseBox(fetchBox);
        LinkedList linkedList = new LinkedList();
        if (BoxUtil.containsBox(movieBox, MovieExtendsBox.TYPE)) {
            LinkedList<_2> linkedList2 = new LinkedList();
            for (Atom atom : getFragments(seekableByteChannel)) {
                ByteBuffer fetchBox2 = fetchBox(seekableByteChannel, atom);
                linkedList.add(Tuple._2(atom, fetchBox2));
                MovieFragmentBox movieFragmentBox = (MovieFragmentBox) parseBox(fetchBox2);
                movieFragmentBox.setMovie(movieBox);
                linkedList2.add(Tuple._2(fetchBox2, movieFragmentBox));
            }
            mP4Edit.applyToFragment(movieBox, (MovieFragmentBox[]) Tuple._2_project1(linkedList2).toArray(new MovieFragmentBox[0]));
            for (_2 _2 : linkedList2) {
                if (!rewriteBox((ByteBuffer) _2.v0, (Box) _2.v1)) {
                    return null;
                }
            }
        }
        mP4Edit.apply(movieBox);
        if (!rewriteBox(fetchBox, movieBox)) {
            return null;
        }
        linkedList.add(Tuple._2(moov, fetchBox));
        return linkedList;
    }

    private ByteBuffer fetchBox(SeekableByteChannel seekableByteChannel, Atom atom) {
        seekableByteChannel.setPosition(atom.getOffset());
        return NIOUtils.fetchFromChannel(seekableByteChannel, (int) atom.getHeader().getSize());
    }

    private List<Atom> getFragments(SeekableByteChannel seekableByteChannel) {
        LinkedList linkedList = new LinkedList();
        for (Atom atom : MP4Util.getRootAtoms(seekableByteChannel)) {
            if (com.coremedia.iso.boxes.fragment.MovieFragmentBox.TYPE.equals(atom.getHeader().getFourcc())) {
                linkedList.add(atom);
            }
        }
        return linkedList;
    }

    private Atom getMoov(SeekableByteChannel seekableByteChannel) {
        for (Atom atom : MP4Util.getRootAtoms(seekableByteChannel)) {
            if (com.coremedia.iso.boxes.MovieBox.TYPE.equals(atom.getHeader().getFourcc())) {
                return atom;
            }
        }
        return null;
    }

    private Box parseBox(ByteBuffer byteBuffer) {
        return BoxUtil.parseBox(byteBuffer, Header.read(byteBuffer), BoxFactory.getDefault());
    }

    private void replaceBox(SeekableByteChannel seekableByteChannel, Atom atom, ByteBuffer byteBuffer) {
        seekableByteChannel.setPosition(atom.getOffset());
        seekableByteChannel.write(byteBuffer);
    }

    private boolean rewriteBox(ByteBuffer byteBuffer, Box box) {
        try {
            byteBuffer.clear();
            box.write(byteBuffer);
            if (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() < 8) {
                    return false;
                }
                byteBuffer.putInt(byteBuffer.remaining());
                byteBuffer.put(new byte[]{(byte) 102, (byte) 114, (byte) 101, (byte) 101});
            }
            byteBuffer.flip();
            return true;
        } catch (BufferOverflowException unused) {
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0038 in {6, 12, 14, 16, 18, 20} preds:[]
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
    public boolean modify(java.io.File r3, org.jcodec.movtool.MP4Edit r4) {
        /*
        r2 = this;
        r3 = org.jcodec.common.io.NIOUtils.rwChannel(r3);	 Catch:{ all -> 0x0032 }
        r4 = r2.doTheFix(r3, r4);	 Catch:{ all -> 0x0030 }
        if (r4 != 0) goto L_0x000f;
        org.jcodec.common.io.NIOUtils.closeQuietly(r3);
        r3 = 0;
        return r3;
        r4 = r4.iterator();	 Catch:{ all -> 0x0030 }
        r0 = r4.hasNext();	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x002b;	 Catch:{ all -> 0x0030 }
        r0 = r4.next();	 Catch:{ all -> 0x0030 }
        r0 = (org.jcodec.common.Tuple._2) r0;	 Catch:{ all -> 0x0030 }
        r1 = r0.v0;	 Catch:{ all -> 0x0030 }
        r1 = (org.jcodec.containers.mp4.MP4Util.Atom) r1;	 Catch:{ all -> 0x0030 }
        r0 = r0.v1;	 Catch:{ all -> 0x0030 }
        r0 = (java.nio.ByteBuffer) r0;	 Catch:{ all -> 0x0030 }
        r2.replaceBox(r3, r1, r0);	 Catch:{ all -> 0x0030 }
        goto L_0x0013;
        org.jcodec.common.io.NIOUtils.closeQuietly(r3);
        r3 = 1;
        return r3;
        r4 = move-exception;
        goto L_0x0034;
        r4 = move-exception;
        r3 = 0;
        org.jcodec.common.io.NIOUtils.closeQuietly(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.InplaceMP4Editor.modify(java.io.File, org.jcodec.movtool.MP4Edit):boolean");
    }
}

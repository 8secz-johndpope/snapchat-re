package org.jcodec.containers.mp4;

import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jcodec.common.Codec;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.io.SeekableByteChannel;
import org.jcodec.common.logging.Logger;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.FileTypeBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class MP4Util {
    private static Map<Codec, String> codecMapping;

    public static class Atom {
        private Header header;
        private long offset;

        public Atom(Header header, long j) {
            this.header = header;
            this.offset = j;
        }

        public Header getHeader() {
            return this.header;
        }

        public long getOffset() {
            return this.offset;
        }

        public Box parseBox(SeekableByteChannel seekableByteChannel) {
            seekableByteChannel.setPosition(this.offset + this.header.headerSize());
            return BoxUtil.parseBox(NIOUtils.fetchFromChannel(seekableByteChannel, (int) this.header.getBodySize()), this.header, BoxFactory.getDefault());
        }
    }

    public static class Movie {
        private FileTypeBox ftyp;
        private MovieBox moov;

        public Movie(FileTypeBox fileTypeBox, MovieBox movieBox) {
            this.ftyp = fileTypeBox;
            this.moov = movieBox;
        }

        public FileTypeBox getFtyp() {
            return this.ftyp;
        }

        public MovieBox getMoov() {
            return this.moov;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        codecMapping = hashMap;
        hashMap.put(Codec.MPEG2, "m2v1");
        codecMapping.put(Codec.H264, VisualSampleEntry.TYPE3);
        codecMapping.put(Codec.J2K, "mjp2");
    }

    public static Movie createRefFullMovie(SeekableByteChannel seekableByteChannel, String str) {
        Movie parseFullMovieChannel = parseFullMovieChannel(seekableByteChannel);
        TrakBox[] tracks = parseFullMovieChannel.moov.getTracks();
        for (TrakBox dataRef : tracks) {
            dataRef.setDataRef(str);
        }
        return parseFullMovieChannel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    public static org.jcodec.containers.mp4.MP4Util.Movie createRefFullMovieFromFile(java.io.File r3) {
        /*
        r0 = org.jcodec.common.io.NIOUtils.readableChannel(r3);	 Catch:{ all -> 0x0022 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0020 }
        r2 = "file://";
        r1.<init>(r2);	 Catch:{ all -> 0x0020 }
        r3 = r3.getCanonicalPath();	 Catch:{ all -> 0x0020 }
        r1.append(r3);	 Catch:{ all -> 0x0020 }
        r3 = r1.toString();	 Catch:{ all -> 0x0020 }
        r3 = createRefFullMovie(r0, r3);	 Catch:{ all -> 0x0020 }
        if (r0 == 0) goto L_0x001f;
    L_0x001c:
        r0.close();
    L_0x001f:
        return r3;
    L_0x0020:
        r3 = move-exception;
        goto L_0x0024;
    L_0x0022:
        r3 = move-exception;
        r0 = 0;
    L_0x0024:
        if (r0 == 0) goto L_0x0029;
    L_0x0026:
        r0.close();
    L_0x0029:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.MP4Util.createRefFullMovieFromFile(java.io.File):org.jcodec.containers.mp4.MP4Util$Movie");
    }

    public static void doWriteFullMovieToChannel(SeekableByteChannel seekableByteChannel, Movie movie, int i) {
        int estimateMoovBoxSize = estimateMoovBoxSize(movie.getMoov()) + i;
        StringBuilder stringBuilder = new StringBuilder("Using ");
        stringBuilder.append(estimateMoovBoxSize);
        stringBuilder.append(" bytes for MOOV box");
        Logger.debug(stringBuilder.toString());
        ByteBuffer allocate = ByteBuffer.allocate(estimateMoovBoxSize + 128);
        movie.getFtyp().write(allocate);
        movie.getMoov().write(allocate);
        allocate.flip();
        seekableByteChannel.write(allocate);
    }

    public static void doWriteMovieToChannel(SeekableByteChannel seekableByteChannel, MovieBox movieBox, int i) {
        int estimateMoovBoxSize = estimateMoovBoxSize(movieBox) + i;
        StringBuilder stringBuilder = new StringBuilder("Using ");
        stringBuilder.append(estimateMoovBoxSize);
        stringBuilder.append(" bytes for MOOV box");
        Logger.debug(stringBuilder.toString());
        ByteBuffer allocate = ByteBuffer.allocate(estimateMoovBoxSize << 2);
        movieBox.write(allocate);
        allocate.flip();
        seekableByteChannel.write(allocate);
    }

    public static int estimateMoovBoxSize(MovieBox movieBox) {
        return movieBox.estimateSize() + 4096;
    }

    public static List<Atom> getRootAtoms(SeekableByteChannel seekableByteChannel) {
        long j = 0;
        seekableByteChannel.setPosition(0);
        ArrayList arrayList = new ArrayList();
        while (j < seekableByteChannel.size()) {
            seekableByteChannel.setPosition(j);
            Header read = Header.read(NIOUtils.fetchFromChannel(seekableByteChannel, 16));
            if (read == null) {
                break;
            }
            arrayList.add(new Atom(read, j));
            j += read.getSize();
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0014  */
    public static org.jcodec.containers.mp4.MP4Util.Movie parseFullMovie(java.io.File r1) {
        /*
        r1 = org.jcodec.common.io.NIOUtils.readableChannel(r1);	 Catch:{ all -> 0x0010 }
        r0 = parseFullMovieChannel(r1);	 Catch:{ all -> 0x000e }
        if (r1 == 0) goto L_0x000d;
    L_0x000a:
        r1.close();
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = move-exception;
        goto L_0x0012;
    L_0x0010:
        r0 = move-exception;
        r1 = 0;
    L_0x0012:
        if (r1 == 0) goto L_0x0017;
    L_0x0014:
        r1.close();
    L_0x0017:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.MP4Util.parseFullMovie(java.io.File):org.jcodec.containers.mp4.MP4Util$Movie");
    }

    public static Movie parseFullMovieChannel(SeekableByteChannel seekableByteChannel) {
        FileTypeBox fileTypeBox = null;
        for (Atom atom : getRootAtoms(seekableByteChannel)) {
            if (com.coremedia.iso.boxes.FileTypeBox.TYPE.equals(atom.getHeader().getFourcc())) {
                fileTypeBox = (FileTypeBox) atom.parseBox(seekableByteChannel);
            } else {
                if (com.coremedia.iso.boxes.MovieBox.TYPE.equals(atom.getHeader().getFourcc())) {
                    return new Movie(fileTypeBox, (MovieBox) atom.parseBox(seekableByteChannel));
                }
            }
        }
        return null;
    }

    public static void writeFullMovie(SeekableByteChannel seekableByteChannel, Movie movie) {
        doWriteFullMovieToChannel(seekableByteChannel, movie, 0);
    }

    public static void writeMovie(SeekableByteChannel seekableByteChannel, MovieBox movieBox) {
        doWriteMovieToChannel(seekableByteChannel, movieBox, 0);
    }
}

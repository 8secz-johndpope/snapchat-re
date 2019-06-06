package org.jcodec.containers.mp4;

import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.util.Arrays;
import org.jcodec.containers.mp4.boxes.FileTypeBox;

public final class Brand {
    public static final Brand MOV;
    public static final Brand MP4;
    private FileTypeBox ftyp;

    static {
        String str = "qt  ";
        MOV = new Brand(str, RasterSource.DEFAULT_TILE_SIZE, new String[]{str});
        str = "isom";
        MP4 = new Brand(str, RasterSource.DEFAULT_TILE_SIZE, new String[]{str, "iso2", VisualSampleEntry.TYPE3, "mp41"});
    }

    private Brand(String str, int i, String[] strArr) {
        this.ftyp = FileTypeBox.createFileTypeBox(str, i, Arrays.asList(strArr));
    }

    public final FileTypeBox getFileTypeBox() {
        return this.ftyp;
    }
}

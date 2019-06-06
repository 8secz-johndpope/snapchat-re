package defpackage;

import java.util.List;

/* renamed from: tqc */
public abstract class tqc {
    public final ajdx<List<abyi>> a;
    public final aail b;
    public final abll c;
    private final aann d;

    /* renamed from: tqc$a */
    public static final class a extends tqc {
        public a(ajdx<List<abyi>> ajdx, abll abll) {
            akcr.b(ajdx, "previewData");
            super(ajdx, null, null, abll, (byte) 0);
        }
    }

    /* renamed from: tqc$b */
    public static final class b extends tqc {
        public b(ajdx<List<abyi>> ajdx, aail aail, aann aann, abll abll) {
            akcr.b(ajdx, "previewData");
            akcr.b(aail, "directSnapPreviewEvent");
            akcr.b(aann, "geofilterDirectSnapPreviewEvent");
            super(ajdx, aail, aann, abll, (byte) 0);
        }
    }

    private tqc(ajdx<List<abyi>> ajdx, aail aail, aann aann, abll abll) {
        this.a = ajdx;
        this.b = aail;
        this.d = aann;
        this.c = abll;
    }

    public /* synthetic */ tqc(ajdx ajdx, aail aail, aann aann, abll abll, byte b) {
        this(ajdx, aail, aann, abll);
    }
}

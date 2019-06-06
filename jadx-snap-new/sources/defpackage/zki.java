package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.brightcove.player.media.ErrorFields;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zkh.a;

/* renamed from: zki */
public final class zki {
    private static final SparseArray<ajdx<Typeface>> a = new SparseArray();
    private static final SparseArray<Typeface> b = new SparseArray();
    private static final Object c = new Object();

    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            r1 = a;
     */
    /* JADX WARNING: Missing block: B:10:0x0017, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:12:?, code skipped:
            r0 = (defpackage.ajdx) a.get(r4);
     */
    /* JADX WARNING: Missing block: B:13:0x0020, code skipped:
            if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Missing block: B:14:0x0022, code skipped:
            r0 = defpackage.ajdx.c(new defpackage.-$$Lambda$zki$MGzspm5RSuU9YZU96G5j7DSoF_E(r3, r4)).b(r5).a(new defpackage.-$$Lambda$zki$fbrPf_oa9w4VsR4IDPr8cofmurk(r4)).a();
            a.put(r4, r0);
     */
    /* JADX WARNING: Missing block: B:15:0x0041, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:16:0x0042, code skipped:
            return r0;
     */
    public static defpackage.ajdx<android.graphics.Typeface> a(android.content.Context r3, int r4, defpackage.ajdw r5) {
        /*
        r0 = b;
        monitor-enter(r0);
        r1 = b;	 Catch:{ all -> 0x0046 }
        r2 = 0;
        r1 = r1.get(r4, r2);	 Catch:{ all -> 0x0046 }
        r1 = (android.graphics.Typeface) r1;	 Catch:{ all -> 0x0046 }
        if (r1 == 0) goto L_0x0014;
    L_0x000e:
        r3 = defpackage.ajdx.b(r1);	 Catch:{ all -> 0x0046 }
        monitor-exit(r0);	 Catch:{ all -> 0x0046 }
        return r3;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0046 }
        r1 = a;
        monitor-enter(r1);
        r0 = a;	 Catch:{ all -> 0x0043 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0043 }
        r0 = (defpackage.ajdx) r0;	 Catch:{ all -> 0x0043 }
        if (r0 != 0) goto L_0x0041;
    L_0x0022:
        r0 = new -$$Lambda$zki$MGzspm5RSuU9YZU96G5j7DSoF_E;	 Catch:{ all -> 0x0043 }
        r0.<init>(r3, r4);	 Catch:{ all -> 0x0043 }
        r3 = defpackage.ajdx.c(r0);	 Catch:{ all -> 0x0043 }
        r3 = r3.b(r5);	 Catch:{ all -> 0x0043 }
        r5 = new -$$Lambda$zki$fbrPf_oa9w4VsR4IDPr8cofmurk;	 Catch:{ all -> 0x0043 }
        r5.<init>(r4);	 Catch:{ all -> 0x0043 }
        r3 = r3.a(r5);	 Catch:{ all -> 0x0043 }
        r0 = r3.a();	 Catch:{ all -> 0x0043 }
        r3 = a;	 Catch:{ all -> 0x0043 }
        r3.put(r4, r0);	 Catch:{ all -> 0x0043 }
    L_0x0041:
        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
        return r0;
    L_0x0043:
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
        throw r3;
    L_0x0046:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0046 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zki.a(android.content.Context, int, ajdw):ajdx");
    }

    public static ajdx<Typeface> a(Context context, a aVar, ajdw ajdw) {
        return ajdx.c(new -$$Lambda$zki$V4eVU0A9nV80CDKdV9H32FyzZto(context, aVar)).b(ajdw);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:55:0x0065 in {7, 22, 25, 28, 29, 30, 31, 39, 43, 47, 52, 54} preds:[]
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
    public static android.graphics.Typeface a(android.content.Context r2, int r3) {
        /*
        r0 = b;	 Catch:{ all -> 0x0063 }
        monitor-enter(r0);	 Catch:{ all -> 0x0063 }
        r1 = b;	 Catch:{ all -> 0x0060 }
        r1 = r1.get(r3);	 Catch:{ all -> 0x0060 }
        r1 = (android.graphics.Typeface) r1;	 Catch:{ all -> 0x0060 }
        if (r1 == 0) goto L_0x000f;	 Catch:{ all -> 0x0060 }
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        return r1;	 Catch:{ all -> 0x0060 }
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        r0 = c;	 Catch:{ all -> 0x0063 }
        monitor-enter(r0);	 Catch:{ all -> 0x0063 }
        r1 = -2;
        if (r3 == r1) goto L_0x004b;
        if (r3 == 0) goto L_0x0046;
        r1 = 1;
        if (r3 == r1) goto L_0x0041;
        r1 = 2;
        if (r3 == r1) goto L_0x003c;
        r1 = 3;
        if (r3 != r1) goto L_0x002a;
        r1 = defpackage.zkh.a;	 Catch:{ all -> 0x003a }
        r1 = r1.d;	 Catch:{ all -> 0x003a }
        r2 = defpackage.zki.a(r2, r1);	 Catch:{ all -> 0x003a }
        goto L_0x0050;	 Catch:{ all -> 0x003a }
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x003a }
        r1 = "Invalid font: ";	 Catch:{ all -> 0x003a }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x003a }
        r3 = r1.concat(r3);	 Catch:{ all -> 0x003a }
        r2.<init>(r3);	 Catch:{ all -> 0x003a }
        throw r2;	 Catch:{ all -> 0x003a }
        r2 = move-exception;	 Catch:{ all -> 0x003a }
        goto L_0x005e;	 Catch:{ all -> 0x003a }
        r1 = defpackage.zkh.a;	 Catch:{ all -> 0x003a }
        r1 = r1.e;	 Catch:{ all -> 0x003a }
        goto L_0x0025;	 Catch:{ all -> 0x003a }
        r1 = defpackage.zkh.a;	 Catch:{ all -> 0x003a }
        r1 = r1.c;	 Catch:{ all -> 0x003a }
        goto L_0x0025;	 Catch:{ all -> 0x003a }
        r1 = defpackage.zkh.a;	 Catch:{ all -> 0x003a }
        r1 = r1.b;	 Catch:{ all -> 0x003a }
        goto L_0x0025;	 Catch:{ all -> 0x003a }
        r1 = defpackage.zkh.a;	 Catch:{ all -> 0x003a }
        r1 = r1.a;	 Catch:{ all -> 0x003a }
        goto L_0x0025;	 Catch:{ all -> 0x003a }
        monitor-exit(r0);	 Catch:{ all -> 0x003a }
        r0 = b;	 Catch:{ all -> 0x0063 }
        monitor-enter(r0);	 Catch:{ all -> 0x0063 }
        r1 = b;	 Catch:{ all -> 0x005b }
        r1.put(r3, r2);	 Catch:{ all -> 0x005b }
        monitor-exit(r0);	 Catch:{ all -> 0x005b }
        return r2;	 Catch:{ all -> 0x005b }
        r2 = move-exception;	 Catch:{ all -> 0x005b }
        monitor-exit(r0);	 Catch:{ all -> 0x005b }
        throw r2;	 Catch:{ all -> 0x0063 }
        monitor-exit(r0);	 Catch:{ all -> 0x003a }
        throw r2;	 Catch:{ all -> 0x0063 }
        r2 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0060 }
        throw r2;	 Catch:{ all -> 0x0063 }
        r2 = move-exception;
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zki.a(android.content.Context, int):android.graphics.Typeface");
    }

    private static Typeface a(Context context, a aVar) {
        try {
            return hh.a(context, aVar.mResId);
        } catch (NotFoundException e) {
            ((ilv) ((ajwy) zgw.c.b()).get()).c(iot.FONT_NOT_FOUND.a(ErrorFields.MESSAGE, e.getMessage()), 1);
            return Typeface.DEFAULT;
        }
    }

    public static BufferType a(BufferType bufferType) {
        return zki.a() ? bufferType : bufferType == BufferType.EDITABLE ? BufferType.EDITABLE : BufferType.SPANNABLE;
    }

    public static void a(TextView textView, float f) {
        if (f != MapboxConstants.MINIMUM_ZOOM) {
            if (zki.a()) {
                textView.setLetterSpacing(f);
                return;
            }
            textView.setSpannableFactory(new zkg(f));
        }
    }

    private static boolean a() {
        return VERSION.SDK_INT >= 21;
    }

    public static boolean a(int i) {
        boolean z;
        synchronized (b) {
            z = b.get(i, null) != null;
        }
        return z;
    }

    private static /* synthetic */ void b(int i) {
        synchronized (a) {
            a.remove(i);
        }
    }
}

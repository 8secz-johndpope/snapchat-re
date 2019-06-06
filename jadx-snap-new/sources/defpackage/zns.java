package defpackage;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snapchat.android.framework.misc.AppContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zns */
public final class zns {
    public final Context a;
    private final List<CharSequence> b;
    private final List<Object[]> c;

    public /* synthetic */ zns() {
        this((Context) AppContext.get());
    }

    public zns(byte b) {
        this();
    }

    private zns(Context context) {
        this.a = context;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static ForegroundColorSpan a(int i) {
        return new ForegroundColorSpan(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x00c2 in {5, 9, 16, 21, 22, 23, 26, 29} preds:[]
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
    public final android.text.SpannedString a() {
        /*
        r15 = this;
        r0 = "";
        defpackage.in.a(r0);
        r0 = r15.b;	 Catch:{ all -> 0x00bd }
        r0 = (java.lang.Iterable) r0;	 Catch:{ all -> 0x00bd }
        r0 = r0.iterator();	 Catch:{ all -> 0x00bd }
        r1 = 0;	 Catch:{ all -> 0x00bd }
        r2 = 0;	 Catch:{ all -> 0x00bd }
        r3 = r0.hasNext();	 Catch:{ all -> 0x00bd }
        if (r3 == 0) goto L_0x0021;	 Catch:{ all -> 0x00bd }
        r3 = r0.next();	 Catch:{ all -> 0x00bd }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x00bd }
        r3 = r3.length();	 Catch:{ all -> 0x00bd }
        r2 = r2 + r3;	 Catch:{ all -> 0x00bd }
        goto L_0x000f;	 Catch:{ all -> 0x00bd }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00bd }
        r0.<init>(r2);	 Catch:{ all -> 0x00bd }
        r2 = r15.b;	 Catch:{ all -> 0x00bd }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x00bd }
        r2 = r2.iterator();	 Catch:{ all -> 0x00bd }
        r3 = r2.hasNext();	 Catch:{ all -> 0x00bd }
        if (r3 == 0) goto L_0x0042;	 Catch:{ all -> 0x00bd }
        r3 = r2.next();	 Catch:{ all -> 0x00bd }
        r3 = (java.lang.CharSequence) r3;	 Catch:{ all -> 0x00bd }
        r3 = r3.toString();	 Catch:{ all -> 0x00bd }
        r0.append(r3);	 Catch:{ all -> 0x00bd }
        goto L_0x002e;	 Catch:{ all -> 0x00bd }
        r2 = new android.text.SpannableString;	 Catch:{ all -> 0x00bd }
        r0 = (java.lang.CharSequence) r0;	 Catch:{ all -> 0x00bd }
        r2.<init>(r0);	 Catch:{ all -> 0x00bd }
        r0 = r15.b;	 Catch:{ all -> 0x00bd }
        r0 = r0.size();	 Catch:{ all -> 0x00bd }
        r3 = 0;	 Catch:{ all -> 0x00bd }
        r4 = 0;	 Catch:{ all -> 0x00bd }
        if (r3 >= r0) goto L_0x00b2;	 Catch:{ all -> 0x00bd }
        r5 = r15.b;	 Catch:{ all -> 0x00bd }
        r5 = r5.get(r3);	 Catch:{ all -> 0x00bd }
        r5 = (java.lang.CharSequence) r5;	 Catch:{ all -> 0x00bd }
        r6 = r15.c;	 Catch:{ all -> 0x00bd }
        r6 = r6.get(r3);	 Catch:{ all -> 0x00bd }
        r6 = (java.lang.Object[]) r6;	 Catch:{ all -> 0x00bd }
        r7 = r5.length();	 Catch:{ all -> 0x00bd }
        r8 = r5 instanceof android.text.Spanned;	 Catch:{ all -> 0x00bd }
        if (r8 == 0) goto L_0x009c;	 Catch:{ all -> 0x00bd }
        r8 = r5;	 Catch:{ all -> 0x00bd }
        r8 = (android.text.Spanned) r8;	 Catch:{ all -> 0x00bd }
        r9 = java.lang.Object.class;	 Catch:{ all -> 0x00bd }
        r8 = r8.getSpans(r1, r7, r9);	 Catch:{ all -> 0x00bd }
        r9 = "existing";	 Catch:{ all -> 0x00bd }
        defpackage.akcr.a(r8, r9);	 Catch:{ all -> 0x00bd }
        r9 = r8.length;	 Catch:{ all -> 0x00bd }
        r10 = 0;	 Catch:{ all -> 0x00bd }
        if (r10 >= r9) goto L_0x009c;	 Catch:{ all -> 0x00bd }
        r11 = r8[r10];	 Catch:{ all -> 0x00bd }
        r12 = r5;	 Catch:{ all -> 0x00bd }
        r12 = (android.text.Spanned) r12;	 Catch:{ all -> 0x00bd }
        r12 = r12.getSpanStart(r11);	 Catch:{ all -> 0x00bd }
        r12 = r12 + r4;	 Catch:{ all -> 0x00bd }
        r13 = r5;	 Catch:{ all -> 0x00bd }
        r13 = (android.text.Spanned) r13;	 Catch:{ all -> 0x00bd }
        r13 = r13.getSpanEnd(r11);	 Catch:{ all -> 0x00bd }
        r13 = r13 + r4;	 Catch:{ all -> 0x00bd }
        r14 = r5;	 Catch:{ all -> 0x00bd }
        r14 = (android.text.Spanned) r14;	 Catch:{ all -> 0x00bd }
        r14 = r14.getSpanFlags(r11);	 Catch:{ all -> 0x00bd }
        r2.setSpan(r11, r12, r13, r14);	 Catch:{ all -> 0x00bd }
        r10 = r10 + 1;	 Catch:{ all -> 0x00bd }
        goto L_0x007b;	 Catch:{ all -> 0x00bd }
        r5 = r6.length;	 Catch:{ all -> 0x00bd }
        r8 = 0;	 Catch:{ all -> 0x00bd }
        if (r8 >= r5) goto L_0x00ae;	 Catch:{ all -> 0x00bd }
        r9 = r6[r8];	 Catch:{ all -> 0x00bd }
        if (r9 == 0) goto L_0x00ab;	 Catch:{ all -> 0x00bd }
        r10 = r4 + r7;	 Catch:{ all -> 0x00bd }
        r11 = 17;	 Catch:{ all -> 0x00bd }
        r2.setSpan(r9, r4, r10, r11);	 Catch:{ all -> 0x00bd }
        r8 = r8 + 1;	 Catch:{ all -> 0x00bd }
        goto L_0x009e;	 Catch:{ all -> 0x00bd }
        r4 = r4 + r7;	 Catch:{ all -> 0x00bd }
        r3 = r3 + 1;	 Catch:{ all -> 0x00bd }
        goto L_0x0051;	 Catch:{ all -> 0x00bd }
        r0 = new android.text.SpannedString;	 Catch:{ all -> 0x00bd }
        r2 = (java.lang.CharSequence) r2;	 Catch:{ all -> 0x00bd }
        r0.<init>(r2);	 Catch:{ all -> 0x00bd }
        defpackage.in.a();
        return r0;
        r0 = move-exception;
        defpackage.in.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zns.a():android.text.SpannedString");
    }

    public final void a(MetricAffectingSpan metricAffectingSpan) {
        akcr.b(metricAffectingSpan, Tags.SPAN);
        this.b.add(" ");
        this.c.add(new MetricAffectingSpan[]{metricAffectingSpan});
    }

    public final void a(CharSequence charSequence, Object... objArr) {
        akcr.b(charSequence, "text");
        akcr.b(objArr, "spans");
        if ((charSequence.length() > 0 ? 1 : null) != null) {
            this.b.add(charSequence);
            this.c.add(objArr);
        }
    }

    public final MetricAffectingSpan b() {
        Context context = this.a;
        if (context == null) {
            akcr.a();
        }
        return new znt(context, 0);
    }

    public final MetricAffectingSpan c() {
        Context context = this.a;
        if (context == null) {
            akcr.a();
        }
        return new znt(context, 1);
    }
}

package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: abwn */
public final class abwn implements abvv, abwk {
    public String a;
    public abwm b = abwm.FLUSH_LEFT;
    public int c = Integer.MAX_VALUE;
    public boolean d;
    public Float e;
    public final TextPaint f;
    public int g;
    private akbk<Float> h = a.a;
    private List<? extends Layout> i;
    private Constructor<StaticLayout> j;
    private final Map<abqk<CharSequence, TextPaint, Boolean, Integer>, Layout> k;
    private final Map<ajxr<CharSequence, TextPaint, Integer>, Integer> l;

    /* renamed from: abwn$a */
    static final class a extends akcs implements akbk<Float> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(1.0f);
        }
    }

    public abwn() {
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-16777216);
        textPaint.setTextSize(14.0f);
        textPaint.setAntiAlias(true);
        this.f = textPaint;
        this.g = -16777216;
        try {
            Object declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TruncateAt.class, Integer.TYPE, Integer.TYPE});
            akcr.a(declaredConstructor, "result");
            declaredConstructor.setAccessible(true);
            this.j = declaredConstructor;
        } catch (Exception unused) {
        }
        this.k = new ConcurrentHashMap();
        this.l = new ConcurrentHashMap();
    }

    private final int a(CharSequence charSequence, TextPaint textPaint, int i, boolean z) {
        ajxr ajxr = new ajxr(charSequence, textPaint, Integer.valueOf(i));
        if (this.l.containsKey(ajxr)) {
            Object obj = this.l.get(ajxr);
            if (obj == null) {
                akcr.a();
            }
            return ((Number) obj).intValue();
        }
        int length = charSequence.length();
        int i2 = -1;
        if (length >= 0) {
            Layout a;
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (i3 == length || Character.isWhitespace(charSequence.charAt(i3))) {
                    a = a((CharSequence) charSequence.subSequence(0, i3).toString(), textPaint, true, i);
                    if (a.getLineCount() == 1 && a.getEllipsisCount(0) == 0) {
                        i4 = i3;
                    } else {
                        i2 = (i4 == -1 || i3 == length) ? (z || a.getEllipsisCount(0) == 0) ? i4 : a.getEllipsisStart(0) : i3;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
            if (i4 == -1) {
            }
            if (z) {
            }
        }
        this.l.put(ajxr, Integer.valueOf(i2));
        return i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x0162 in {4, 6, 10, 11, 12, 13, 20, 21, 24, 25, 26, 28, 30, 32, 33, 36, 38} preds:[]
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
    private final android.text.Layout a(java.lang.CharSequence r20, android.text.TextPaint r21, boolean r22, int r23) {
        /*
        r19 = this;
        r0 = r19;
        r13 = r20;
        r14 = r21;
        r15 = r22;
        r12 = r23;
        r1 = java.lang.Boolean.valueOf(r22);
        r2 = java.lang.Integer.valueOf(r23);
        r11 = defpackage.abqk.a(r13, r14, r1, r2);
        r1 = r0.k;
        r1 = r1.containsKey(r11);
        if (r1 == 0) goto L_0x002c;
        r1 = r0.k;
        r1 = r1.get(r11);
        if (r1 != 0) goto L_0x0029;
        defpackage.akcr.a();
        r1 = (android.text.Layout) r1;
        return r1;
        r1 = 0;
        r7 = android.text.BoringLayout.isBoring(r13, r14, r1);
        if (r7 == 0) goto L_0x0060;
        if (r15 == 0) goto L_0x004a;
        r3 = r7.width;
        r4 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = 0;
        r8 = 1;
        r9 = android.text.TextUtils.TruncateAt.END;
        r1 = r20;
        r2 = r21;
        r10 = r23;
        r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        goto L_0x005a;
        r3 = r7.width;
        r4 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = 0;
        r8 = 1;
        r1 = r20;
        r2 = r21;
        r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = (android.text.Layout) r1;
        r18 = r11;
        goto L_0x011b;
        r2 = r20.toString();
        r2 = r14.measureText(r2);
        r2 = (int) r2;
        r6 = java.lang.Math.min(r2, r12);
        r2 = r0.j;	 Catch:{ Exception -> 0x00db }
        if (r2 == 0) goto L_0x00d7;	 Catch:{ Exception -> 0x00db }
        r3 = 13;	 Catch:{ Exception -> 0x00db }
        r3 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x00db }
        r4 = 0;	 Catch:{ Exception -> 0x00db }
        r3[r4] = r13;	 Catch:{ Exception -> 0x00db }
        r5 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x00db }
        r7 = 1;	 Catch:{ Exception -> 0x00db }
        r3[r7] = r5;	 Catch:{ Exception -> 0x00db }
        r5 = 2;	 Catch:{ Exception -> 0x00db }
        r8 = r20.length();	 Catch:{ Exception -> 0x00db }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ Exception -> 0x00db }
        r3[r5] = r8;	 Catch:{ Exception -> 0x00db }
        r5 = 3;	 Catch:{ Exception -> 0x00db }
        r3[r5] = r14;	 Catch:{ Exception -> 0x00db }
        r5 = 4;	 Catch:{ Exception -> 0x00db }
        r8 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x00db }
        r3[r5] = r8;	 Catch:{ Exception -> 0x00db }
        r5 = 5;	 Catch:{ Exception -> 0x00db }
        r8 = android.text.Layout.Alignment.ALIGN_NORMAL;	 Catch:{ Exception -> 0x00db }
        r3[r5] = r8;	 Catch:{ Exception -> 0x00db }
        r5 = 6;	 Catch:{ Exception -> 0x00db }
        r8 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;	 Catch:{ Exception -> 0x00db }
        r3[r5] = r8;	 Catch:{ Exception -> 0x00db }
        r5 = 7;	 Catch:{ Exception -> 0x00db }
        r8 = java.lang.Integer.valueOf(r7);	 Catch:{ Exception -> 0x00db }
        r3[r5] = r8;	 Catch:{ Exception -> 0x00db }
        r5 = 8;	 Catch:{ Exception -> 0x00db }
        r8 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x00db }
        r3[r5] = r8;	 Catch:{ Exception -> 0x00db }
        r5 = 9;	 Catch:{ Exception -> 0x00db }
        r8 = java.lang.Boolean.TRUE;	 Catch:{ Exception -> 0x00db }
        r3[r5] = r8;	 Catch:{ Exception -> 0x00db }
        r5 = 10;	 Catch:{ Exception -> 0x00db }
        if (r15 == 0) goto L_0x00ba;	 Catch:{ Exception -> 0x00db }
        r8 = android.text.TextUtils.TruncateAt.END;	 Catch:{ Exception -> 0x00db }
        goto L_0x00bb;	 Catch:{ Exception -> 0x00db }
        r8 = r1;	 Catch:{ Exception -> 0x00db }
        r3[r5] = r8;	 Catch:{ Exception -> 0x00db }
        r5 = 11;	 Catch:{ Exception -> 0x00db }
        if (r15 == 0) goto L_0x00c2;	 Catch:{ Exception -> 0x00db }
        r4 = r12;	 Catch:{ Exception -> 0x00db }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ Exception -> 0x00db }
        r3[r5] = r4;	 Catch:{ Exception -> 0x00db }
        r4 = 12;	 Catch:{ Exception -> 0x00db }
        r5 = java.lang.Integer.valueOf(r7);	 Catch:{ Exception -> 0x00db }
        r3[r4] = r5;	 Catch:{ Exception -> 0x00db }
        r2 = r2.newInstance(r3);	 Catch:{ Exception -> 0x00db }
        r2 = (android.text.StaticLayout) r2;	 Catch:{ Exception -> 0x00db }
        goto L_0x00d8;	 Catch:{ Exception -> 0x00db }
        r2 = r1;	 Catch:{ Exception -> 0x00db }
        r2 = (android.text.Layout) r2;	 Catch:{ Exception -> 0x00db }
        r1 = r2;
        if (r1 != 0) goto L_0x005c;
        if (r15 == 0) goto L_0x0102;
        r16 = new android.text.StaticLayout;
        r3 = 0;
        r4 = r20.length();
        r7 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = 0;
        r10 = 1;
        r17 = android.text.TextUtils.TruncateAt.END;
        r1 = r16;
        r2 = r20;
        r5 = r21;
        r18 = r11;
        r11 = r17;
        r12 = r23;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r16 = (android.text.Layout) r16;
        r1 = r16;
        goto L_0x011b;
        r18 = r11;
        r9 = new android.text.StaticLayout;
        r5 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = 0;
        r10 = 1;
        r1 = r9;
        r2 = r20;
        r3 = r21;
        r4 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r10;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
        r9 = (android.text.Layout) r9;
        r1 = r9;
        if (r1 == 0) goto L_0x012a;
        r2 = r0.k;
        r3 = "layoutKey";
        r4 = r18;
        defpackage.akcr.a(r4, r3);
        r2.put(r4, r1);
        return r1;
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = "TextStrategy: getLayout(";
        r2.<init>(r3);
        r2.append(r13);
        r3 = ", ";
        r2.append(r3);
        r2.append(r14);
        r2.append(r3);
        r2.append(r15);
        r3 = 44;
        r2.append(r3);
        r3 = 32;
        r2.append(r3);
        r3 = r23;
        r2.append(r3);
        r3 = ") cannot find layout";
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        r1 = (java.lang.Throwable) r1;
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwn.a(java.lang.CharSequence, android.text.TextPaint, boolean, int):android.text.Layout");
    }

    public final void a(akbk<Float> akbk) {
        akcr.b(akbk, "<set-?>");
        this.h = akbk;
    }

    /* JADX WARNING: Missing block: B:60:0x0179, code skipped:
            if (r3 != com.looksery.sdk.audio.AudioPlayer.INFINITY_LOOP_COUNT) goto L_0x017e;
     */
    public final void a(android.view.View r25, defpackage.abxs r26, int r27, int r28) {
        /*
        r24 = this;
        r0 = r24;
        r1 = r26;
        r2 = "view";
        r3 = r25;
        defpackage.akcr.b(r3, r2);
        r2 = "returnedDimensions";
        defpackage.akcr.b(r1, r2);
        r2 = r0.a;
        if (r2 != 0) goto L_0x0017;
    L_0x0014:
        defpackage.akcr.a();
    L_0x0017:
        r3 = android.view.View.MeasureSpec.getMode(r27);
        r4 = android.view.View.MeasureSpec.getSize(r27);
        r5 = android.view.View.MeasureSpec.getMode(r28);
        r6 = android.view.View.MeasureSpec.getSize(r28);
        r7 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r3 == r9) goto L_0x0037;
    L_0x0030:
        if (r3 != r8) goto L_0x0033;
    L_0x0032:
        goto L_0x0037;
    L_0x0033:
        r10 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x0038;
    L_0x0037:
        r10 = r4;
    L_0x0038:
        if (r5 == r9) goto L_0x003c;
    L_0x003a:
        if (r5 != r8) goto L_0x003d;
    L_0x003c:
        r7 = r6;
    L_0x003d:
        r2 = (java.lang.CharSequence) r2;
        r5 = r0.f;
        r15 = r0.d;
        r11 = new java.util.ArrayList;
        r11.<init>();
        r14 = r11;
        r14 = (java.util.List) r14;
        r13 = 0;
        r17 = 0;
    L_0x004e:
        r11 = r14.size();
        r18 = 1;
        r11 = r11 + 1;
        r12 = r0.c;
        if (r11 < r12) goto L_0x005c;
    L_0x005a:
        r12 = 1;
        goto L_0x005d;
    L_0x005c:
        r12 = 0;
    L_0x005d:
        r11 = r0.a(r2, r5, r10, r12);
        if (r15 == 0) goto L_0x0068;
    L_0x0063:
        if (r12 == 0) goto L_0x0068;
    L_0x0065:
        r16 = 1;
        goto L_0x006a;
    L_0x0068:
        r16 = 0;
    L_0x006a:
        if (r11 <= 0) goto L_0x0083;
    L_0x006c:
        if (r16 != 0) goto L_0x0083;
    L_0x006e:
        r16 = r2.subSequence(r13, r11);
        r16 = r16.toString();
        r16 = (java.lang.CharSequence) r16;
        r9 = r11;
        r21 = r12;
        r8 = r14;
        r23 = r15;
        r11 = r16;
        r22 = 0;
        goto L_0x00ac;
    L_0x0083:
        if (r16 == 0) goto L_0x00a3;
    L_0x0085:
        if (r11 < 0) goto L_0x00a3;
    L_0x0087:
        r13 = (float) r10;
        r16 = android.text.TextUtils.TruncateAt.END;
        r19 = 0;
        r20 = 0;
        r9 = r11;
        r11 = r2;
        r21 = r12;
        r12 = r5;
        r22 = 0;
        r8 = r14;
        r14 = r16;
        r23 = r15;
        r15 = r19;
        r16 = r20;
        r11 = android.text.TextUtils.ellipsize(r11, r12, r13, r14, r15, r16);
        goto L_0x00ac;
    L_0x00a3:
        r9 = r11;
        r21 = r12;
        r8 = r14;
        r23 = r15;
        r22 = 0;
        r11 = r2;
    L_0x00ac:
        r12 = "currentLine";
        defpackage.akcr.a(r11, r12);
        if (r23 == 0) goto L_0x00b7;
    L_0x00b3:
        if (r21 == 0) goto L_0x00b7;
    L_0x00b5:
        r12 = 1;
        goto L_0x00b8;
    L_0x00b7:
        r12 = 0;
    L_0x00b8:
        r11 = r0.a(r11, r5, r12, r10);
        r8.add(r11);
        r11 = r11.getHeight();
        r11 = r17 + r11;
        r12 = -1;
        if (r9 == r12) goto L_0x00ee;
    L_0x00c8:
        if (r11 > r7) goto L_0x00ee;
    L_0x00ca:
        r12 = r8.size();
        r13 = r0.c;
        if (r12 >= r13) goto L_0x00ee;
    L_0x00d2:
        r9 = r9 + 1;
        r12 = r2.length();
        r2 = r2.subSequence(r9, r12);
        r2 = r2.toString();
        r2 = (java.lang.CharSequence) r2;
        r14 = r8;
        r17 = r11;
        r15 = r23;
        r8 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r13 = 0;
        goto L_0x004e;
    L_0x00ee:
        r14 = r8;
        r14 = (java.lang.Iterable) r14;
        r2 = new java.util.ArrayList;
        r5 = 10;
        r7 = defpackage.ajyn.a(r14, r5);
        r2.<init>(r7);
        r2 = (java.util.Collection) r2;
        r7 = r14.iterator();
    L_0x0102:
        r9 = r7.hasNext();
        if (r9 == 0) goto L_0x011a;
    L_0x0108:
        r9 = r7.next();
        r9 = (android.text.Layout) r9;
        r9 = r9.getWidth();
        r9 = java.lang.Integer.valueOf(r9);
        r2.add(r9);
        goto L_0x0102;
    L_0x011a:
        r2 = (java.util.List) r2;
        r2 = (java.lang.Iterable) r2;
        r2 = defpackage.ajyu.r(r2);
        if (r2 != 0) goto L_0x0127;
    L_0x0124:
        defpackage.akcr.a();
    L_0x0127:
        r2 = (java.lang.Number) r2;
        r2 = r2.intValue();
        r7 = r0.e;
        if (r7 != 0) goto L_0x0161;
    L_0x0131:
        r7 = new java.util.ArrayList;
        r5 = defpackage.ajyn.a(r14, r5);
        r7.<init>(r5);
        r7 = (java.util.Collection) r7;
        r5 = r14.iterator();
    L_0x0140:
        r9 = r5.hasNext();
        if (r9 == 0) goto L_0x0158;
    L_0x0146:
        r9 = r5.next();
        r9 = (android.text.Layout) r9;
        r9 = r9.getHeight();
        r9 = java.lang.Integer.valueOf(r9);
        r7.add(r9);
        goto L_0x0140;
    L_0x0158:
        r7 = (java.util.List) r7;
        r7 = (java.lang.Iterable) r7;
        r5 = defpackage.ajyu.w(r7);
        goto L_0x0171;
    L_0x0161:
        if (r7 != 0) goto L_0x0166;
    L_0x0163:
        defpackage.akcr.a();
    L_0x0166:
        r5 = r7.floatValue();
        r7 = r8.size();
        r7 = (float) r7;
        r5 = r5 * r7;
        r5 = (int) r5;
    L_0x0171:
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r3 == r7) goto L_0x0180;
    L_0x0175:
        if (r3 == 0) goto L_0x017c;
    L_0x0177:
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r3 == r9) goto L_0x0186;
    L_0x017b:
        goto L_0x017e;
    L_0x017c:
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
    L_0x017e:
        r4 = r2;
        goto L_0x0186;
    L_0x0180:
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = java.lang.Math.min(r4, r2);
    L_0x0186:
        r1.a = r4;
        if (r5 == r7) goto L_0x0190;
    L_0x018a:
        if (r5 == 0) goto L_0x018e;
    L_0x018c:
        if (r5 == r9) goto L_0x0194;
    L_0x018e:
        r6 = r5;
        goto L_0x0194;
    L_0x0190:
        r6 = java.lang.Math.min(r6, r5);
    L_0x0194:
        r1.b = r6;
        r0.i = r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwn.a(android.view.View, abxs, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x005c  */
    public final void a(android.view.View r8, android.graphics.Canvas r9, defpackage.abxs r10) {
        /*
        r7 = this;
        r0 = "view";
        defpackage.akcr.b(r8, r0);
        r8 = "canvas";
        defpackage.akcr.b(r9, r8);
        r8 = "dimensions";
        defpackage.akcr.b(r10, r8);
        r8 = r7.f;
        r0 = r7.h;
        r0 = r0.invoke();
        r0 = (java.lang.Number) r0;
        r0 = r0.floatValue();
        r1 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r0 = r0 * r1;
        r0 = (int) r0;
        r1 = r7.g;
        r1 = android.graphics.Color.red(r1);
        r2 = r7.g;
        r2 = android.graphics.Color.green(r2);
        r3 = r7.g;
        r3 = android.graphics.Color.blue(r3);
        r8.setARGB(r0, r1, r2, r3);
        r8 = r7.e;
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 0;
        if (r8 == 0) goto L_0x0057;
    L_0x003d:
        r8 = (java.lang.Number) r8;
        r8 = r8.floatValue();
        r2 = r7.i;
        if (r2 == 0) goto L_0x0057;
    L_0x0047:
        r2 = defpackage.ajyu.f(r2);
        r2 = (android.text.Layout) r2;
        if (r2 == 0) goto L_0x0057;
    L_0x004f:
        r2 = r2.getHeight();
        r2 = (float) r2;
        r8 = r8 - r2;
        r8 = r8 / r0;
        goto L_0x0058;
    L_0x0057:
        r8 = 0;
    L_0x0058:
        r2 = r7.i;
        if (r2 == 0) goto L_0x00bd;
    L_0x005c:
        r2 = (java.lang.Iterable) r2;
        r3 = new java.util.ArrayList;
        r4 = 10;
        r4 = defpackage.ajyn.a(r2, r4);
        r3.<init>(r4);
        r3 = (java.util.Collection) r3;
        r2 = r2.iterator();
    L_0x006f:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x00bc;
    L_0x0075:
        r4 = r2.next();
        r4 = (android.text.Layout) r4;
        r5 = r7.b;
        r6 = defpackage.abwo.a;
        r5 = r5.ordinal();
        r5 = r6[r5];
        r6 = 1;
        if (r5 == r6) goto L_0x009b;
    L_0x0088:
        r6 = 2;
        if (r5 != r6) goto L_0x0095;
    L_0x008b:
        r5 = r10.a;
        r6 = r4.getWidth();
        r5 = r5 - r6;
        r5 = (float) r5;
        r5 = r5 / r0;
        goto L_0x009c;
    L_0x0095:
        r8 = new ajxk;
        r8.<init>();
        throw r8;
    L_0x009b:
        r5 = 0;
    L_0x009c:
        r9.translate(r5, r8);
        r4.draw(r9);
        r5 = -r5;
        r6 = -r8;
        r9.translate(r5, r6);
        r5 = r7.e;
        if (r5 == 0) goto L_0x00b0;
    L_0x00ab:
        r4 = r5.floatValue();
        goto L_0x00b5;
    L_0x00b0:
        r4 = r4.getHeight();
        r4 = (float) r4;
    L_0x00b5:
        r8 = r8 + r4;
        r4 = defpackage.ajxw.a;
        r3.add(r4);
        goto L_0x006f;
    L_0x00bc:
        return;
    L_0x00bd:
        r8 = r7.a;
        if (r8 == 0) goto L_0x00ce;
    L_0x00c1:
        r10 = r7.f;
        r10 = r10.getTextSize();
        r0 = r7.f;
        r0 = (android.graphics.Paint) r0;
        r9.drawText(r8, r1, r10, r0);
    L_0x00ce:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abwn.a(android.view.View, android.graphics.Canvas, abxs):void");
    }

    public final void a(View view, boolean z, int i, int i2, int i3, int i4) {
        akcr.b(view, "view");
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
    }
}

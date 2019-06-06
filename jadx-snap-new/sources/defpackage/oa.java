package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.v7.widget.AppCompatEditText;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: oa */
public final class oa {
    private static final RectF h = new RectF();
    private static ConcurrentHashMap<String, Method> i = new ConcurrentHashMap();
    public int a = 0;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public int[] e = new int[0];
    boolean f = false;
    final Context g;
    private boolean j = false;
    private TextPaint k;
    private final TextView l;

    oa(TextView textView) {
        this.l = textView;
        this.g = this.l.getContext();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0032 in {6, 7, 9, 11} preds:[]
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
    private int a(android.graphics.RectF r6) {
        /*
        r5 = this;
        r0 = r5.e;
        r0 = r0.length;
        if (r0 == 0) goto L_0x002a;
        r1 = 0;
        r0 = r0 + -1;
        r2 = 1;
        r1 = 1;
        r2 = 0;
        if (r1 > r0) goto L_0x0025;
        r2 = r1 + r0;
        r2 = r2 / 2;
        r3 = r5.e;
        r3 = r3[r2];
        r3 = r5.a(r3, r6);
        if (r3 == 0) goto L_0x0021;
        r2 = r2 + 1;
        r4 = r2;
        r2 = r1;
        r1 = r4;
        goto L_0x000b;
        r2 = r2 + -1;
        r0 = r2;
        goto L_0x000b;
        r6 = r5.e;
        r6 = r6[r2];
        return r6;
        r6 = new java.lang.IllegalStateException;
        r0 = "No available text sizes to choose from.";
        r6.<init>(r0);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.a(android.graphics.RectF):int");
    }

    private StaticLayout a(CharSequence charSequence, Alignment alignment, int i) {
        float lineSpacingMultiplier;
        float lineSpacingExtra;
        boolean includeFontPadding;
        if (VERSION.SDK_INT >= 16) {
            lineSpacingMultiplier = this.l.getLineSpacingMultiplier();
            lineSpacingExtra = this.l.getLineSpacingExtra();
            includeFontPadding = this.l.getIncludeFontPadding();
        } else {
            lineSpacingMultiplier = ((Float) oa.a(this.l, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            lineSpacingExtra = ((Float) oa.a(this.l, "getLineSpacingExtra", Float.valueOf(MapboxConstants.MINIMUM_ZOOM))).floatValue();
            includeFontPadding = ((Boolean) oa.a(this.l, "getIncludeFontPadding", Boolean.TRUE)).booleanValue();
        }
        return new StaticLayout(charSequence, this.k, i, alignment, lineSpacingMultiplier, lineSpacingExtra, includeFontPadding);
    }

    private StaticLayout a(CharSequence charSequence, Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) oa.a(this.l, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        Builder hyphenationFrequency = Builder.obtain(charSequence, 0, charSequence.length(), this.k, i).setAlignment(alignment).setLineSpacing(this.l.getLineSpacingExtra(), this.l.getLineSpacingMultiplier()).setIncludePad(this.l.getIncludeFontPadding()).setBreakStrategy(this.l.getBreakStrategy()).setHyphenationFrequency(this.l.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    private static <T> T a(Object obj, String str, T t) {
        try {
            t = oa.a(str).invoke(obj, new Object[0]);
            return t;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Failed to invoke TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), e);
            return t;
        }
    }

    private static Method a(String str) {
        try {
            Method method = (Method) i.get(str);
            if (method == null) {
                method = TextView.class.getDeclaredMethod(str, new Class[0]);
                if (method != null) {
                    method.setAccessible(true);
                    i.put(str, method);
                }
            }
            return method;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Failed to retrieve TextView#");
            stringBuilder.append(str);
            stringBuilder.append("() method");
            Log.w("ACTVAutoSizeHelper", stringBuilder.toString(), e);
            return null;
        }
    }

    private void a(float f) {
        if (f != this.l.getPaint().getTextSize()) {
            this.l.getPaint().setTextSize(f);
            boolean isInLayout = VERSION.SDK_INT >= 18 ? this.l.isInLayout() : false;
            if (this.l.getLayout() != null) {
                this.j = false;
                try {
                    Method a = oa.a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (isInLayout) {
                    this.l.forceLayout();
                } else {
                    this.l.requestLayout();
                }
                this.l.invalidate();
            }
        }
    }

    /* JADX WARNING: Missing block: B:23:0x0086, code skipped:
            return false;
     */
    private boolean a(int r6, android.graphics.RectF r7) {
        /*
        r5 = this;
        r0 = r5.l;
        r0 = r0.getText();
        r1 = r5.l;
        r1 = r1.getTransformationMethod();
        if (r1 == 0) goto L_0x0017;
    L_0x000e:
        r2 = r5.l;
        r1 = r1.getTransformation(r0, r2);
        if (r1 == 0) goto L_0x0017;
    L_0x0016:
        r0 = r1;
    L_0x0017:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 16;
        r3 = -1;
        if (r1 < r2) goto L_0x0025;
    L_0x001e:
        r1 = r5.l;
        r1 = r1.getMaxLines();
        goto L_0x0026;
    L_0x0025:
        r1 = -1;
    L_0x0026:
        r2 = r5.k;
        if (r2 != 0) goto L_0x0032;
    L_0x002a:
        r2 = new android.text.TextPaint;
        r2.<init>();
        r5.k = r2;
        goto L_0x0035;
    L_0x0032:
        r2.reset();
    L_0x0035:
        r2 = r5.k;
        r4 = r5.l;
        r4 = r4.getPaint();
        r2.set(r4);
        r2 = r5.k;
        r6 = (float) r6;
        r2.setTextSize(r6);
        r6 = r5.l;
        r2 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r4 = "getLayoutAlignment";
        r6 = defpackage.oa.a(r6, r4, r2);
        r6 = (android.text.Layout.Alignment) r6;
        r2 = android.os.Build.VERSION.SDK_INT;
        r4 = 23;
        if (r2 < r4) goto L_0x0063;
    L_0x0058:
        r2 = r7.right;
        r2 = java.lang.Math.round(r2);
        r6 = r5.a(r0, r6, r2, r1);
        goto L_0x006d;
    L_0x0063:
        r2 = r7.right;
        r2 = java.lang.Math.round(r2);
        r6 = r5.a(r0, r6, r2);
    L_0x006d:
        r2 = 0;
        r4 = 1;
        if (r1 == r3) goto L_0x0087;
    L_0x0071:
        r3 = r6.getLineCount();
        if (r3 > r1) goto L_0x0086;
    L_0x0077:
        r1 = r6.getLineCount();
        r1 = r1 - r4;
        r1 = r6.getLineEnd(r1);
        r0 = r0.length();
        if (r1 == r0) goto L_0x0087;
    L_0x0086:
        return r2;
    L_0x0087:
        r6 = r6.getHeight();
        r6 = (float) r6;
        r7 = r7.bottom;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 <= 0) goto L_0x0093;
    L_0x0092:
        return r2;
    L_0x0093:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa.a(int, android.graphics.RectF):boolean");
    }

    static int[] a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void f() {
        this.a = 0;
        this.c = -1.0f;
        this.d = -1.0f;
        this.b = -1.0f;
        this.e = new int[0];
        this.j = false;
    }

    /* Access modifiers changed, original: final */
    public final void a(float f, float f2, float f3) {
        String str = "px) is less or equal to (0px)";
        if (f <= MapboxConstants.MINIMUM_ZOOM) {
            StringBuilder stringBuilder = new StringBuilder("Minimum auto-size text size (");
            stringBuilder.append(f);
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (f2 <= f) {
            StringBuilder stringBuilder2 = new StringBuilder("Maximum auto-size text size (");
            stringBuilder2.append(f2);
            stringBuilder2.append("px) is less or equal to minimum auto-size text size (");
            stringBuilder2.append(f);
            stringBuilder2.append("px)");
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else if (f3 > MapboxConstants.MINIMUM_ZOOM) {
            this.a = 1;
            this.c = f;
            this.d = f2;
            this.b = f3;
            this.f = false;
        } else {
            StringBuilder stringBuilder3 = new StringBuilder("The auto-size step granularity (");
            stringBuilder3.append(f3);
            stringBuilder3.append(str);
            throw new IllegalArgumentException(stringBuilder3.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (e()) {
            if (i == 0) {
                f();
            } else if (i == 1) {
                DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
                a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (b()) {
                    c();
                }
            } else {
                throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(i)));
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, float f) {
        Context context = this.g;
        a(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2, int i3, int i4) {
        if (e()) {
            DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
            a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (b()) {
                c();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int[] iArr, int i) {
        if (e()) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.g.getResources().getDisplayMetrics();
                    while (i2 < length) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    }
                }
                this.e = oa.a(iArr2);
                if (!a()) {
                    StringBuilder stringBuilder = new StringBuilder("None of the preset sizes is valid: ");
                    stringBuilder.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.f = false;
            if (b()) {
                c();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        int length = this.e.length;
        this.f = length > 0;
        if (this.f) {
            this.a = 1;
            int[] iArr = this.e;
            this.c = (float) iArr[0];
            this.d = (float) iArr[length - 1];
            this.b = -1.0f;
        }
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        int i = 0;
        if (e() && this.a == 1) {
            if (!this.f || this.e.length == 0) {
                float round = (float) Math.round(this.c);
                int i2 = 1;
                while (Math.round(this.b + round) <= Math.round(this.d)) {
                    i2++;
                    round += this.b;
                }
                int[] iArr = new int[i2];
                float f = this.c;
                while (i < i2) {
                    iArr[i] = Math.round(f);
                    f += this.b;
                    i++;
                }
                this.e = oa.a(iArr);
            }
            this.j = true;
        } else {
            this.j = false;
        }
        return this.j;
    }

    public final void c() {
        if (d()) {
            if (this.j) {
                if (this.l.getMeasuredHeight() > 0 && this.l.getMeasuredWidth() > 0) {
                    int measuredWidth = ((Boolean) oa.a(this.l, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.l.getMeasuredWidth() - this.l.getTotalPaddingLeft()) - this.l.getTotalPaddingRight();
                    int height = (this.l.getHeight() - this.l.getCompoundPaddingBottom()) - this.l.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (h) {
                            h.setEmpty();
                            h.right = (float) measuredWidth;
                            h.bottom = (float) height;
                            float a = (float) a(h);
                            if (a != this.l.getTextSize()) {
                                a(0, a);
                            }
                        }
                    }
                }
                return;
            }
            this.j = true;
        }
    }

    public final boolean d() {
        return e() && this.a != 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean e() {
        return !(this.l instanceof AppCompatEditText);
    }
}

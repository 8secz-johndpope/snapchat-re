package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import com.snapchat.android.R;
import defpackage.lx.a;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: lz */
final class lz {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0047 in {4, 9, 11, 13} preds:[]
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
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
        r0 = android.util.Xml.asAttributeSet(r5);
        r1 = r5.next();
        r2 = 2;
        if (r1 == r2) goto L_0x000e;
        r3 = 1;
        if (r1 != r3) goto L_0x0004;
        if (r1 != r2) goto L_0x003f;
        r1 = r5.getName();
        r2 = "selector";
        r2 = r1.equals(r2);
        if (r2 == 0) goto L_0x0021;
        r4 = defpackage.lz.a(r4, r5, r0, r6);
        return r4;
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r5 = r5.getPositionDescription();
        r6.append(r5);
        r5 = ": invalid color state list tag ";
        r6.append(r5);
        r6.append(r1);
        r5 = r6.toString();
        r4.<init>(r5);
        throw r4;
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "No start tag found";
        r4.<init>(r5);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = new int[20][];
        Object obj2 = new int[20];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            }
            Resources resources2;
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray obtainAttributes;
                int[] iArr = a.m;
                if (theme2 == null) {
                    obtainAttributes = resources.obtainAttributes(attributeSet2, iArr);
                } else {
                    resources2 = resources;
                    obtainAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr, 0, 0);
                }
                int color = obtainAttributes.getColor(0, -65281);
                float f = 1.0f;
                if (obtainAttributes.hasValue(i)) {
                    f = obtainAttributes.getFloat(i, 1.0f);
                } else if (obtainAttributes.hasValue(2)) {
                    f = obtainAttributes.getFloat(2, 1.0f);
                }
                obtainAttributes.recycle();
                next = attributeSet.getAttributeCount();
                int[] iArr2 = new int[next];
                int i3 = 0;
                for (int i4 = 0; i4 < next; i4++) {
                    int attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                    if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha)) {
                        i = i3 + 1;
                        if (!attributeSet2.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i3] = attributeNameResource;
                        i3 = i;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr2, i3);
                next = hj.b(color, Math.round(((float) Color.alpha(color)) * f));
                if (mb.a || i2 <= obj2.length) {
                    int i5 = i2 + 1;
                    if (i5 > obj2.length) {
                        Object obj3 = new int[mb.a(i2)];
                        System.arraycopy(obj2, 0, obj3, 0, i2);
                        obj2 = obj3;
                    }
                    obj2[i2] = next;
                    if (mb.a || i2 <= obj.length) {
                        if (i5 > obj.length) {
                            Object obj4 = (Object[]) Array.newInstance(obj.getClass().getComponentType(), mb.a(i2));
                            System.arraycopy(obj, 0, obj4, 0, i2);
                            obj = obj4;
                        }
                        obj[i2] = trimStateSet;
                        obj = (int[][]) obj;
                        i2 = i5;
                    } else {
                        throw new AssertionError();
                    }
                }
                throw new AssertionError();
            }
            resources2 = resources;
            i = 1;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        System.arraycopy(obj2, 0, iArr3, 0, i2);
        System.arraycopy(obj, 0, iArr4, 0, i2);
        return new ColorStateList(iArr4, iArr3);
    }
}

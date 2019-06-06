package defpackage;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.hk.b;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: df */
public final class df {

    /* renamed from: df$a */
    static class a implements TypeEvaluator<b[]> {
        private b[] a;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0037 in {5, 6, 10, 12, 14} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object evaluate(float r5, java.lang.Object r6, java.lang.Object r7) {
            /*
            r4 = this;
            r6 = (defpackage.hk.b[]) r6;
            r7 = (defpackage.hk.b[]) r7;
            r0 = defpackage.hk.a(r6, r7);
            if (r0 == 0) goto L_0x002f;
            r0 = r4.a;
            if (r0 == 0) goto L_0x0014;
            r0 = defpackage.hk.a(r0, r6);
            if (r0 != 0) goto L_0x001a;
            r0 = defpackage.hk.a(r6);
            r4.a = r0;
            r0 = 0;
            r1 = r6.length;
            if (r0 >= r1) goto L_0x002c;
            r1 = r4.a;
            r1 = r1[r0];
            r2 = r6[r0];
            r3 = r7[r0];
            r1.a(r2, r3, r5);
            r0 = r0 + 1;
            goto L_0x001b;
            r5 = r4.a;
            return r5;
            r5 = new java.lang.IllegalArgumentException;
            r6 = "Can't interpolate between two incompatible pathData";
            r5.<init>(r6);
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.df$a.evaluate(float, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static Animator a(Context context, Resources resources, Theme theme, int i) {
        StringBuilder stringBuilder;
        NotFoundException notFoundException;
        String str = "Can't load animation resource ID #0x";
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator a = df.a(context, resources, theme, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0, 1.0f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a;
        } catch (XmlPullParserException e) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(e2);
            throw notFoundException;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    private static android.animation.Animator a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
        r8 = r19;
        r9 = r20;
        r10 = r21;
        r11 = r23;
        r12 = r21.getDepth();
        r0 = 0;
        r13 = r0;
    L_0x000e:
        r1 = r21.next();
        r2 = 3;
        r14 = 0;
        if (r1 != r2) goto L_0x001c;
    L_0x0016:
        r2 = r21.getDepth();
        if (r2 <= r12) goto L_0x00e0;
    L_0x001c:
        r2 = 1;
        if (r1 == r2) goto L_0x00e0;
    L_0x001f:
        r3 = 2;
        if (r1 != r3) goto L_0x00dc;
    L_0x0022:
        r1 = r21.getName();
        r3 = "objectAnimator";
        r3 = r1.equals(r3);
        if (r3 == 0) goto L_0x0041;
    L_0x002e:
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r22;
        r4 = r25;
        r5 = r21;
        r0 = defpackage.df.a(r0, r1, r2, r3, r4, r5);
    L_0x003e:
        r3 = r18;
        goto L_0x00b4;
    L_0x0041:
        r3 = "animator";
        r3 = r1.equals(r3);
        if (r3 == 0) goto L_0x005b;
    L_0x0049:
        r4 = 0;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r22;
        r5 = r25;
        r6 = r21;
        r0 = defpackage.df.a(r0, r1, r2, r3, r4, r5, r6);
        goto L_0x003e;
    L_0x005b:
        r3 = "set";
        r3 = r1.equals(r3);
        if (r3 == 0) goto L_0x0093;
    L_0x0063:
        r15 = new android.animation.AnimatorSet;
        r15.<init>();
        r0 = defpackage.db.h;
        r7 = r22;
        r6 = defpackage.hi.a(r8, r9, r7, r0);
        r0 = "ordering";
        r16 = defpackage.hi.a(r6, r10, r0, r14, r14);
        r5 = r15;
        r5 = (android.animation.AnimatorSet) r5;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r4 = r22;
        r17 = r6;
        r6 = r16;
        r7 = r25;
        defpackage.df.a(r0, r1, r2, r3, r4, r5, r6, r7);
        r17.recycle();
        r3 = r18;
        r0 = r15;
        goto L_0x00b4;
    L_0x0093:
        r3 = "propertyValuesHolder";
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x009b:
        r1 = android.util.Xml.asAttributeSet(r21);
        r3 = r18;
        r1 = defpackage.df.a(r3, r8, r9, r10, r1);
        if (r1 == 0) goto L_0x00b3;
    L_0x00a7:
        if (r0 == 0) goto L_0x00b3;
    L_0x00a9:
        r4 = r0 instanceof android.animation.ValueAnimator;
        if (r4 == 0) goto L_0x00b3;
    L_0x00ad:
        r4 = r0;
        r4 = (android.animation.ValueAnimator) r4;
        r4.setValues(r1);
    L_0x00b3:
        r14 = 1;
    L_0x00b4:
        if (r11 == 0) goto L_0x000e;
    L_0x00b6:
        if (r14 != 0) goto L_0x000e;
    L_0x00b8:
        if (r13 != 0) goto L_0x00bf;
    L_0x00ba:
        r13 = new java.util.ArrayList;
        r13.<init>();
    L_0x00bf:
        r13.add(r0);
        goto L_0x000e;
    L_0x00c4:
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r2 = "Unknown animator name: ";
        r1.<init>(r2);
        r2 = r21.getName();
        r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00dc:
        r3 = r18;
        goto L_0x000e;
    L_0x00e0:
        if (r11 == 0) goto L_0x0109;
    L_0x00e2:
        if (r13 == 0) goto L_0x0109;
    L_0x00e4:
        r1 = r13.size();
        r1 = new android.animation.Animator[r1];
        r2 = r13.iterator();
    L_0x00ee:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0100;
    L_0x00f4:
        r3 = r2.next();
        r3 = (android.animation.Animator) r3;
        r4 = r14 + 1;
        r1[r14] = r3;
        r14 = r4;
        goto L_0x00ee;
    L_0x0100:
        if (r24 != 0) goto L_0x0106;
    L_0x0102:
        r11.playTogether(r1);
        goto L_0x0109;
    L_0x0106:
        r11.playSequentially(r1);
    L_0x0109:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    private static ObjectAnimator a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ValueAnimator objectAnimator = new ObjectAnimator();
        df.a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i, int i2, int i3, String str) {
        TypedValue peekValue = typedArray.peekValue(i2);
        Object obj = peekValue != null ? 1 : null;
        int i4 = obj != null ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        Object obj2 = peekValue2 != null ? 1 : null;
        int i5 = obj2 != null ? peekValue2.type : 0;
        if (i == 4) {
            i = ((obj == null || !df.a(i4)) && (obj2 == null || !df.a(i5))) ? 0 : 3;
        }
        Object obj3 = i == 0 ? 1 : null;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            b[] b = hk.b(string);
            b[] b2 = hk.b(string2);
            if (!(b == null && b2 == null)) {
                if (b != null) {
                    Object[] objArr;
                    a aVar = new a();
                    if (b2 == null) {
                        objArr = new Object[]{b};
                    } else if (hk.a(b, b2)) {
                        objArr = new Object[]{b, b2};
                    } else {
                        StringBuilder stringBuilder = new StringBuilder(" Can't morph from ");
                        stringBuilder.append(string);
                        stringBuilder.append(" to ");
                        stringBuilder.append(string2);
                        throw new InflateException(stringBuilder.toString());
                    }
                    return PropertyValuesHolder.ofObject(str, aVar, objArr);
                } else if (b2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, new a(), new Object[]{b2});
                }
            }
            return propertyValuesHolder;
        }
        TypeEvaluator typeEvaluator = i == 3 ? dg.a : null;
        int dimension;
        if (obj3 != null) {
            float dimension2;
            if (obj != null) {
                float dimension3 = i4 == 5 ? typedArray.getDimension(i2, MapboxConstants.MINIMUM_ZOOM) : typedArray.getFloat(i2, MapboxConstants.MINIMUM_ZOOM);
                if (obj2 != null) {
                    dimension2 = i5 == 5 ? typedArray.getDimension(i3, MapboxConstants.MINIMUM_ZOOM) : typedArray.getFloat(i3, MapboxConstants.MINIMUM_ZOOM);
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension3, dimension2});
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension3});
                }
            } else {
                dimension2 = i5 == 5 ? typedArray.getDimension(i3, MapboxConstants.MINIMUM_ZOOM) : typedArray.getFloat(i3, MapboxConstants.MINIMUM_ZOOM);
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str, new float[]{dimension2});
            }
        } else if (obj != null) {
            i2 = i4 == 5 ? (int) typedArray.getDimension(i2, MapboxConstants.MINIMUM_ZOOM) : df.a(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (obj2 != null) {
                dimension = i5 == 5 ? (int) typedArray.getDimension(i3, MapboxConstants.MINIMUM_ZOOM) : df.a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i2, dimension});
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{i2});
            }
        } else if (obj2 != null) {
            dimension = i5 == 5 ? (int) typedArray.getDimension(i3, MapboxConstants.MINIMUM_ZOOM) : df.a(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, new int[]{dimension});
        }
        PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolder;
        if (propertyValuesHolder2 == null || typeEvaluator == null) {
            return propertyValuesHolder2;
        }
        propertyValuesHolder2.setEvaluator(typeEvaluator);
        return propertyValuesHolder2;
    }

    private static ValueAnimator a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = hi.a(resources, theme, attributeSet, db.g);
        TypedArray a2 = hi.a(resources, theme, attributeSet, db.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        df.a(valueAnimator, a, a2, f, xmlPullParser);
        int a3 = hi.a(a, xmlPullParser, "interpolator", 0);
        if (a3 > 0) {
            valueAnimator.setInterpolator(de.a(context, a3));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray typedArray3 = typedArray;
        TypedArray typedArray4 = typedArray2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long a = (long) hi.a(typedArray3, xmlPullParser2, "duration", 1, (int) MapboxConstants.ANIMATION_DURATION);
        long a2 = (long) hi.a(typedArray3, xmlPullParser2, "startOffset", 2, 0);
        int a3 = hi.a(typedArray3, xmlPullParser2, "valueType", 7, 4);
        if (hi.a(xmlPullParser2, "valueFrom") && hi.a(xmlPullParser2, "valueTo")) {
            if (a3 == 4) {
                TypedValue peekValue = typedArray3.peekValue(5);
                Object obj = peekValue != null ? 1 : null;
                a3 = obj != null ? peekValue.type : 0;
                TypedValue peekValue2 = typedArray3.peekValue(6);
                Object obj2 = peekValue2 != null ? 1 : null;
                a3 = ((obj == null || !df.a(a3)) && (obj2 == null || !df.a(obj2 != null ? peekValue2.type : 0))) ? 0 : 3;
            }
            if (df.a(typedArray3, a3, 5, 6, "") != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{df.a(typedArray3, a3, 5, 6, "")});
            }
        }
        valueAnimator2.setDuration(a);
        valueAnimator2.setStartDelay(a2);
        valueAnimator2.setRepeatCount(hi.a(typedArray3, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(hi.a(typedArray3, xmlPullParser2, "repeatMode", 4, 1));
        if (typedArray4 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String b = hi.b(typedArray4, xmlPullParser2, "pathData", 1);
            if (b != null) {
                String b2 = hi.b(typedArray4, xmlPullParser2, "propertyXName", 2);
                String b3 = hi.b(typedArray4, xmlPullParser2, "propertyYName", 3);
                if (b2 == null && b3 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(typedArray2.getPositionDescription());
                    stringBuilder.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(stringBuilder.toString());
                }
                df.a(hk.a(b), objectAnimator, 0.5f * f, b2, b3);
                return;
            }
            objectAnimator.setPropertyName(hi.b(typedArray4, xmlPullParser2, "propertyName", 0));
        }
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        float[] fArr;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(MapboxConstants.MINIMUM_ZOOM));
        float f2 = MapboxConstants.MINIMUM_ZOOM;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        pathMeasure = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[min];
        float[] fArr4 = new float[2];
        f2 /= (float) (min - 1);
        int i2 = 0;
        float f3 = MapboxConstants.MINIMUM_ZOOM;
        int i3 = 0;
        while (true) {
            fArr = null;
            if (i2 >= min) {
                break;
            }
            pathMeasure.getPosTan(f3, fArr4, null);
            fArr2[i2] = fArr4[i];
            fArr3[i2] = fArr4[1];
            f3 += f2;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f3 > ((Float) arrayList.get(i4)).floatValue()) {
                f3 -= ((Float) arrayList.get(i4)).floatValue();
                pathMeasure.nextContour();
                i3 = i4;
            }
            i2++;
            i = 0;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr2) : null;
        if (str4 != null) {
            fArr = PropertyValuesHolder.ofFloat(str4, fArr3);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{fArr});
        } else if (fArr == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, fArr});
        }
    }

    private static void a(Keyframe[] keyframeArr, float f, int i, int i2) {
        f /= (float) ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f);
            i++;
        }
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01cb  */
    private static android.animation.PropertyValuesHolder[] a(android.content.Context r23, android.content.res.Resources r24, android.content.res.Resources.Theme r25, org.xmlpull.v1.XmlPullParser r26, android.util.AttributeSet r27) {
        /*
        r0 = r24;
        r1 = r25;
        r2 = r26;
        r4 = 0;
    L_0x0007:
        r5 = r26.getEventType();
        r6 = 3;
        if (r5 == r6) goto L_0x01e0;
    L_0x000e:
        r8 = 1;
        if (r5 == r8) goto L_0x01e0;
    L_0x0011:
        r9 = 2;
        if (r5 == r9) goto L_0x0018;
    L_0x0014:
        r26.next();
        goto L_0x0007;
    L_0x0018:
        r5 = r26.getName();
        r10 = "propertyValuesHolder";
        r5 = r5.equals(r10);
        if (r5 == 0) goto L_0x01da;
    L_0x0024:
        r5 = defpackage.db.i;
        r10 = r27;
        r5 = defpackage.hi.a(r0, r1, r10, r5);
        r11 = "propertyName";
        r11 = defpackage.hi.b(r5, r2, r11, r6);
        r12 = 4;
        r13 = "valueType";
        r9 = defpackage.hi.a(r5, r2, r13, r9, r12);
        r14 = r9;
        r13 = 0;
    L_0x003b:
        r15 = r26.next();
        if (r15 == r6) goto L_0x0102;
    L_0x0041:
        if (r15 == r8) goto L_0x0102;
    L_0x0043:
        r15 = r26.getName();
        r3 = "keyframe";
        r3 = r15.equals(r3);
        if (r3 == 0) goto L_0x00fc;
    L_0x004f:
        r3 = "value";
        if (r14 != r12) goto L_0x0079;
    L_0x0053:
        r14 = android.util.Xml.asAttributeSet(r26);
        r15 = defpackage.db.j;
        r14 = defpackage.hi.a(r0, r1, r14, r15);
        r15 = defpackage.hi.a(r14, r2, r3);
        if (r15 == 0) goto L_0x0066;
    L_0x0063:
        r18 = 1;
        goto L_0x0068;
    L_0x0066:
        r18 = 0;
    L_0x0068:
        if (r18 == 0) goto L_0x0074;
    L_0x006a:
        r15 = r15.type;
        r15 = defpackage.df.a(r15);
        if (r15 == 0) goto L_0x0074;
    L_0x0072:
        r15 = 3;
        goto L_0x0075;
    L_0x0074:
        r15 = 0;
    L_0x0075:
        r14.recycle();
        r14 = r15;
    L_0x0079:
        r15 = android.util.Xml.asAttributeSet(r26);
        r7 = defpackage.db.j;
        r7 = defpackage.hi.a(r0, r1, r15, r7);
        r15 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r8 = "fraction";
        r8 = defpackage.hi.a(r7, r2, r8, r6, r15);
        r15 = defpackage.hi.a(r7, r2, r3);
        if (r15 == 0) goto L_0x0094;
    L_0x0091:
        r19 = 1;
        goto L_0x0096;
    L_0x0094:
        r19 = 0;
    L_0x0096:
        if (r14 != r12) goto L_0x00a6;
    L_0x0098:
        if (r19 == 0) goto L_0x00a4;
    L_0x009a:
        r15 = r15.type;
        r15 = defpackage.df.a(r15);
        if (r15 == 0) goto L_0x00a4;
    L_0x00a2:
        r15 = 3;
        goto L_0x00a7;
    L_0x00a4:
        r15 = 0;
        goto L_0x00a7;
    L_0x00a6:
        r15 = r14;
    L_0x00a7:
        if (r19 == 0) goto L_0x00c8;
    L_0x00a9:
        if (r15 == 0) goto L_0x00bd;
    L_0x00ab:
        r12 = 1;
        if (r15 == r12) goto L_0x00b3;
    L_0x00ae:
        if (r15 == r6) goto L_0x00b3;
    L_0x00b0:
        r3 = 0;
        r12 = 0;
        goto L_0x00d3;
    L_0x00b3:
        r12 = 0;
        r3 = defpackage.hi.a(r7, r2, r3, r12, r12);
        r3 = android.animation.Keyframe.ofInt(r8, r3);
        goto L_0x00d3;
    L_0x00bd:
        r12 = 0;
        r15 = 0;
        r3 = defpackage.hi.a(r7, r2, r3, r12, r15);
        r3 = android.animation.Keyframe.ofFloat(r8, r3);
        goto L_0x00d3;
    L_0x00c8:
        if (r15 != 0) goto L_0x00cf;
    L_0x00ca:
        r3 = android.animation.Keyframe.ofFloat(r8);
        goto L_0x00d3;
    L_0x00cf:
        r3 = android.animation.Keyframe.ofInt(r8);
    L_0x00d3:
        r8 = "interpolator";
        r12 = 1;
        r8 = defpackage.hi.a(r7, r2, r8, r12);
        if (r8 <= 0) goto L_0x00e6;
    L_0x00dc:
        r12 = r23;
        r8 = defpackage.de.a(r12, r8);
        r3.setInterpolator(r8);
        goto L_0x00e8;
    L_0x00e6:
        r12 = r23;
    L_0x00e8:
        r7.recycle();
        if (r3 == 0) goto L_0x00f8;
    L_0x00ed:
        if (r13 != 0) goto L_0x00f5;
    L_0x00ef:
        r7 = new java.util.ArrayList;
        r7.<init>();
        r13 = r7;
    L_0x00f5:
        r13.add(r3);
    L_0x00f8:
        r26.next();
        goto L_0x00fe;
    L_0x00fc:
        r12 = r23;
    L_0x00fe:
        r8 = 1;
        r12 = 4;
        goto L_0x003b;
    L_0x0102:
        r12 = r23;
        if (r13 == 0) goto L_0x01c0;
    L_0x0106:
        r3 = r13.size();
        if (r3 <= 0) goto L_0x01c0;
    L_0x010c:
        r7 = 0;
        r8 = r13.get(r7);
        r8 = (android.animation.Keyframe) r8;
        r7 = r3 + -1;
        r7 = r13.get(r7);
        r7 = (android.animation.Keyframe) r7;
        r15 = r7.getFraction();
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r20 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1));
        if (r20 >= 0) goto L_0x013c;
    L_0x0125:
        r17 = 0;
        r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1));
        if (r15 >= 0) goto L_0x012f;
    L_0x012b:
        r7.setFraction(r6);
        goto L_0x013c;
    L_0x012f:
        r15 = r13.size();
        r7 = defpackage.df.a(r7, r6);
        r13.add(r15, r7);
        r3 = r3 + 1;
    L_0x013c:
        r7 = r8.getFraction();
        r15 = 0;
        r17 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1));
        if (r17 == 0) goto L_0x0157;
    L_0x0145:
        r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1));
        if (r7 >= 0) goto L_0x014d;
    L_0x0149:
        r8.setFraction(r15);
        goto L_0x0157;
    L_0x014d:
        r7 = defpackage.df.a(r8, r15);
        r8 = 0;
        r13.add(r8, r7);
        r3 = r3 + 1;
    L_0x0157:
        r7 = new android.animation.Keyframe[r3];
        r13.toArray(r7);
        r8 = 0;
    L_0x015d:
        if (r8 >= r3) goto L_0x01b3;
    L_0x015f:
        r13 = r7[r8];
        r15 = r13.getFraction();
        r6 = 0;
        r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1));
        if (r15 >= 0) goto L_0x01ac;
    L_0x016a:
        if (r8 != 0) goto L_0x0170;
    L_0x016c:
        r13.setFraction(r6);
        goto L_0x01ac;
    L_0x0170:
        r6 = r3 + -1;
        if (r8 != r6) goto L_0x017a;
    L_0x0174:
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r13.setFraction(r15);
        goto L_0x01ac;
    L_0x017a:
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r13 = r8 + 1;
        r15 = r8;
    L_0x017f:
        if (r13 >= r6) goto L_0x0195;
    L_0x0181:
        r21 = r7[r13];
        r21 = r21.getFraction();
        r17 = 0;
        r21 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1));
        if (r21 >= 0) goto L_0x0197;
    L_0x018d:
        r15 = r13 + 1;
        r22 = r15;
        r15 = r13;
        r13 = r22;
        goto L_0x017f;
    L_0x0195:
        r17 = 0;
    L_0x0197:
        r6 = r15 + 1;
        r6 = r7[r6];
        r6 = r6.getFraction();
        r13 = r8 + -1;
        r13 = r7[r13];
        r13 = r13.getFraction();
        r6 = r6 - r13;
        defpackage.df.a(r7, r6, r8, r15);
        goto L_0x01ae;
    L_0x01ac:
        r17 = 0;
    L_0x01ae:
        r8 = r8 + 1;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x015d;
    L_0x01b3:
        r3 = android.animation.PropertyValuesHolder.ofKeyframe(r11, r7);
        r6 = 3;
        if (r14 != r6) goto L_0x01c1;
    L_0x01ba:
        r6 = defpackage.dg.a;
        r3.setEvaluator(r6);
        goto L_0x01c1;
    L_0x01c0:
        r3 = 0;
    L_0x01c1:
        if (r3 != 0) goto L_0x01c9;
    L_0x01c3:
        r6 = 0;
        r7 = 1;
        r3 = defpackage.df.a(r5, r9, r6, r7, r11);
    L_0x01c9:
        if (r3 == 0) goto L_0x01d5;
    L_0x01cb:
        if (r4 != 0) goto L_0x01d2;
    L_0x01cd:
        r4 = new java.util.ArrayList;
        r4.<init>();
    L_0x01d2:
        r4.add(r3);
    L_0x01d5:
        r5.recycle();
        goto L_0x0014;
    L_0x01da:
        r12 = r23;
        r10 = r27;
        goto L_0x0014;
    L_0x01e0:
        r6 = 0;
        if (r4 == 0) goto L_0x01f9;
    L_0x01e3:
        r0 = r4.size();
        r3 = new android.animation.PropertyValuesHolder[r0];
    L_0x01e9:
        if (r6 >= r0) goto L_0x01f6;
    L_0x01eb:
        r1 = r4.get(r6);
        r1 = (android.animation.PropertyValuesHolder) r1;
        r3[r6] = r1;
        r6 = r6 + 1;
        goto L_0x01e9;
    L_0x01f6:
        r16 = r3;
        goto L_0x01fb;
    L_0x01f9:
        r16 = 0;
    L_0x01fb:
        return r16;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }
}

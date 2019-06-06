package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import defpackage.hg.b;
import defpackage.hg.c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: hn */
final class hn extends hp {
    static final Method a;
    private static final Class b;
    private static final Constructor c;
    private static final Method d;

    static {
        Class cls;
        Method method;
        Method method2;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            constructor = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            method2 = constructor;
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = constructor;
            method2 = cls;
            method = method2;
        }
        c = constructor;
        b = cls;
        a = method;
        d = method2;
    }

    hn() {
    }

    private static Typeface a(Object obj) {
        try {
            Array.set(Array.newInstance(b, 1), 0, obj);
            return (Typeface) d.invoke(null, new Object[]{r0});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Object a() {
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public final Typeface a(Context context, b bVar, Resources resources, int i) {
        Object a = hn.a();
        for (c cVar : bVar.a) {
            ByteBuffer a2 = hq.a(context, resources, cVar.d);
            if (a2 == null || !hn.a(a, a2, 0, cVar.b, cVar.c)) {
                return null;
            }
        }
        return hn.a(a);
    }

    public final Typeface a(Context context, ip.b[] bVarArr, int i) {
        Object a = hn.a();
        jh jhVar = new jh();
        for (ip.b bVar : bVarArr) {
            Uri uri = bVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) jhVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = hq.a(context, null, uri);
                jhVar.put(uri, byteBuffer);
            }
            if (!hn.a(a, byteBuffer, bVar.b, bVar.c, bVar.d)) {
                return null;
            }
        }
        return Typeface.create(hn.a(a), i);
    }
}

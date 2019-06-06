package defpackage;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventType;
import defpackage.aknv.a;
import java.util.Hashtable;
import java.util.StringTokenizer;

/* renamed from: akoe */
public final class akoe {
    private static Hashtable e;
    private static Object[] f = new Object[0];
    private static Class g;
    private Class a;
    private ClassLoader b;
    private String c;
    private int d = 0;

    static {
        Hashtable hashtable = new Hashtable();
        e = hashtable;
        hashtable.put("void", Void.TYPE);
        e.put(Event.BOOLEAN, Boolean.TYPE);
        e.put("byte", Byte.TYPE);
        e.put("char", Character.TYPE);
        e.put("short", Short.TYPE);
        e.put("int", Integer.TYPE);
        e.put("long", Long.TYPE);
        e.put("float", Float.TYPE);
        e.put("double", Double.TYPE);
    }

    public akoe(String str, Class cls) {
        this.c = str;
        this.a = cls;
        this.b = cls.getClassLoader();
    }

    public static aknv a(a aVar, Object obj, Object obj2) {
        return new akof(aVar, obj, obj2, f);
    }

    public static aknv a(a aVar, Object obj, Object obj2, Object obj3) {
        return new akof(aVar, obj, obj2, new Object[]{obj3});
    }

    public static aknv a(a aVar, Object obj, Object obj2, Object[] objArr) {
        return new akof(aVar, obj, obj2, objArr);
    }

    private akob a(int i) {
        return new akoj(this.a, this.c, i);
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    static Class a(String str, ClassLoader classLoader) {
        if (str.equals(EventType.ANY)) {
            return null;
        }
        Class cls = (Class) e.get(str);
        if (cls != null) {
            return cls;
        }
        if (classLoader != null) {
            return Class.forName(str, false, classLoader);
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            Class cls2 = g;
            if (cls2 == null) {
                cls2 = akoe.a("java.lang.ClassNotFoundException");
                g = cls2;
            }
            return cls2;
        }
    }

    public final a a(String str, aknx aknx, int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        return new akof.a(i2, str, aknx, a(i));
    }

    public final akoa a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str;
        int parseInt = Integer.parseInt(str, 16);
        str8 = str3;
        Class a = akoe.a(str3, this.b);
        str8 = ":";
        String str9 = str4;
        StringTokenizer stringTokenizer = new StringTokenizer(str4, str8);
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i = 0; i < countTokens; i++) {
            clsArr[i] = akoe.a(stringTokenizer.nextToken(), this.b);
        }
        stringTokenizer = new StringTokenizer(str5, str8);
        countTokens = stringTokenizer.countTokens();
        String[] strArr = new String[countTokens];
        for (int i2 = 0; i2 < countTokens; i2++) {
            strArr[i2] = stringTokenizer.nextToken();
        }
        stringTokenizer = new StringTokenizer(str6, str8);
        int countTokens2 = stringTokenizer.countTokens();
        Class[] clsArr2 = new Class[countTokens2];
        for (int i3 = 0; i3 < countTokens2; i3++) {
            clsArr2[i3] = akoe.a(stringTokenizer.nextToken(), this.b);
        }
        return new akoh(parseInt, str2, a, clsArr, strArr, clsArr2, akoe.a(str7, this.b));
    }
}

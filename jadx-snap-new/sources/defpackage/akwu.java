package defpackage;

import defpackage.akgx.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: akwu */
final class akwu<R, T> {
    static final Pattern a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    final a c;
    final akwi<R, T> d;
    final akwk<akhw, R> e;
    private final akhm f;
    private final String g;
    private final String h;
    private final akhl i;
    private final akho j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final akwp<?>[] n;

    /* renamed from: akwu$a */
    static final class a<T, R> {
        final akwt a;
        final Annotation[] b;
        final Annotation[][] c;
        final Type[] d;
        Type e;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        String j;
        boolean k;
        boolean l;
        boolean m;
        String n;
        akhl o;
        akho p;
        akwp<?>[] q;
        akwk<akhw, T> r;
        akwi<T, R> s;
        private Method t;
        private boolean u;
        private boolean v;
        private Set<String> w;

        a(akwt akwt, Method method) {
            this.a = akwt;
            this.t = method;
            this.b = method.getAnnotations();
            this.d = method.getGenericParameterTypes();
            this.c = method.getParameterAnnotations();
        }

        /* JADX WARNING: Missing block: B:19:0x0036, code skipped:
            if ("android.net.Uri".equals(((java.lang.Class) r12).getName()) != false) goto L_0x0042;
     */
        private defpackage.akwp<?> a(int r11, java.lang.reflect.Type r12, java.lang.annotation.Annotation[] r13, java.lang.annotation.Annotation r14) {
            /*
            r10 = this;
            r0 = r14 instanceof defpackage.akyh;
            r1 = "@Path parameters may not be used with @Url.";
            r2 = 1;
            r3 = 0;
            if (r0 == 0) goto L_0x006e;
        L_0x0008:
            r13 = r10.i;
            if (r13 != 0) goto L_0x0065;
        L_0x000c:
            r13 = r10.u;
            if (r13 != 0) goto L_0x005e;
        L_0x0010:
            r13 = r10.v;
            if (r13 != 0) goto L_0x0055;
        L_0x0014:
            r13 = r10.n;
            if (r13 != 0) goto L_0x0048;
        L_0x0018:
            r10.i = r2;
            r13 = defpackage.akhm.class;
            if (r12 == r13) goto L_0x0042;
        L_0x001e:
            r13 = java.lang.String.class;
            if (r12 == r13) goto L_0x0042;
        L_0x0022:
            r13 = java.net.URI.class;
            if (r12 == r13) goto L_0x0042;
        L_0x0026:
            r13 = r12 instanceof java.lang.Class;
            if (r13 == 0) goto L_0x0039;
        L_0x002a:
            r12 = (java.lang.Class) r12;
            r12 = r12.getName();
            r13 = "android.net.Uri";
            r12 = r13.equals(r12);
            if (r12 == 0) goto L_0x0039;
        L_0x0038:
            goto L_0x0042;
        L_0x0039:
            r12 = new java.lang.Object[r3];
            r13 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x0042:
            r11 = new akwp$m;
            r11.<init>();
            return r11;
        L_0x0048:
            r12 = new java.lang.Object[r2];
            r13 = r10.j;
            r12[r3] = r13;
            r13 = "@Url cannot be used with @%s URL";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x0055:
            r12 = new java.lang.Object[r3];
            r13 = "A @Url parameter must not come after a @Query";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x005e:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r1, r12);
            throw r11;
        L_0x0065:
            r12 = new java.lang.Object[r3];
            r13 = "Multiple @Url method annotations found.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x006e:
            r0 = r14 instanceof defpackage.akyc;
            r4 = 2;
            if (r0 == 0) goto L_0x00ea;
        L_0x0073:
            r0 = r10.v;
            if (r0 != 0) goto L_0x00e1;
        L_0x0077:
            r0 = r10.i;
            if (r0 != 0) goto L_0x00da;
        L_0x007b:
            r0 = r10.n;
            if (r0 == 0) goto L_0x00cd;
        L_0x007f:
            r10.u = r2;
            r14 = (defpackage.akyc) r14;
            r0 = r14.a();
            r1 = defpackage.akwu.b;
            r1 = r1.matcher(r0);
            r1 = r1.matches();
            if (r1 == 0) goto L_0x00ba;
        L_0x0093:
            r1 = r10.w;
            r1 = r1.contains(r0);
            if (r1 == 0) goto L_0x00ab;
        L_0x009b:
            r11 = r10.a;
            r11 = r11.a(r12, r13);
            r12 = new akwp$h;
            r13 = r14.b();
            r12.<init>(r0, r11, r13);
            return r12;
        L_0x00ab:
            r12 = new java.lang.Object[r4];
            r13 = r10.n;
            r12[r3] = r13;
            r12[r2] = r0;
            r13 = "URL \"%s\" does not contain \"{%s}\".";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x00ba:
            r12 = new java.lang.Object[r4];
            r13 = defpackage.akwu.a;
            r13 = r13.pattern();
            r12[r3] = r13;
            r12[r2] = r0;
            r13 = "@Path parameter name must match %s. Found: %s";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x00cd:
            r12 = new java.lang.Object[r2];
            r13 = r10.j;
            r12[r3] = r13;
            r13 = "@Path can only be used with relative url on @%s";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x00da:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r1, r12);
            throw r11;
        L_0x00e1:
            r12 = new java.lang.Object[r3];
            r13 = "A @Path parameter must not come after a @Query.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x00ea:
            r0 = r14 instanceof defpackage.akyd;
            r1 = "<String>)";
            r5 = " must include generic type (e.g., ";
            if (r0 == 0) goto L_0x0172;
        L_0x00f2:
            r14 = (defpackage.akyd) r14;
            r0 = r14.a();
            r14 = r14.b();
            r4 = defpackage.akwv.a(r12);
            r10.v = r2;
            r2 = java.lang.Iterable.class;
            r2 = r2.isAssignableFrom(r4);
            if (r2 == 0) goto L_0x0148;
        L_0x010a:
            r2 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r2 == 0) goto L_0x0124;
        L_0x010e:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r11 = defpackage.akwv.a(r3, r12);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$i;
            r12.<init>(r0, r11, r14);
            r11 = r12.a();
            return r11;
        L_0x0124:
            r12 = new java.lang.StringBuilder;
            r12.<init>();
            r13 = r4.getSimpleName();
            r12.append(r13);
            r12.append(r5);
            r13 = r4.getSimpleName();
            r12.append(r13);
            r12.append(r1);
            r12 = r12.toString();
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x0148:
            r11 = r4.isArray();
            if (r11 == 0) goto L_0x0166;
        L_0x014e:
            r11 = r4.getComponentType();
            r11 = defpackage.akwu.a(r11);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$i;
            r12.<init>(r0, r11, r14);
            r11 = r12.b();
            return r11;
        L_0x0166:
            r11 = r10.a;
            r11 = r11.a(r12, r13);
            r12 = new akwp$i;
            r12.<init>(r0, r11, r14);
            return r12;
        L_0x0172:
            r0 = r14 instanceof defpackage.akyf;
            if (r0 == 0) goto L_0x01f2;
        L_0x0176:
            r14 = (defpackage.akyf) r14;
            r14 = r14.a();
            r0 = defpackage.akwv.a(r12);
            r10.v = r2;
            r2 = java.lang.Iterable.class;
            r2 = r2.isAssignableFrom(r0);
            if (r2 == 0) goto L_0x01c8;
        L_0x018a:
            r2 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r2 == 0) goto L_0x01a4;
        L_0x018e:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r11 = defpackage.akwv.a(r3, r12);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$k;
            r12.<init>(r11, r14);
            r11 = r12.a();
            return r11;
        L_0x01a4:
            r12 = new java.lang.StringBuilder;
            r12.<init>();
            r13 = r0.getSimpleName();
            r12.append(r13);
            r12.append(r5);
            r13 = r0.getSimpleName();
            r12.append(r13);
            r12.append(r1);
            r12 = r12.toString();
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x01c8:
            r11 = r0.isArray();
            if (r11 == 0) goto L_0x01e6;
        L_0x01ce:
            r11 = r0.getComponentType();
            r11 = defpackage.akwu.a(r11);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$k;
            r12.<init>(r11, r14);
            r11 = r12.b();
            return r11;
        L_0x01e6:
            r11 = r10.a;
            r11 = r11.a(r12, r13);
            r12 = new akwp$k;
            r12.<init>(r11, r14);
            return r12;
        L_0x01f2:
            r0 = r14 instanceof defpackage.akye;
            r6 = "Map must include generic types (e.g., Map<String, String>)";
            if (r0 == 0) goto L_0x024f;
        L_0x01f8:
            r0 = defpackage.akwv.a(r12);
            r1 = java.util.Map.class;
            r1 = r1.isAssignableFrom(r0);
            if (r1 == 0) goto L_0x0246;
        L_0x0204:
            r1 = java.util.Map.class;
            r12 = defpackage.akwv.a(r12, r0, r1);
            r0 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r0 == 0) goto L_0x023f;
        L_0x020e:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r0 = defpackage.akwv.a(r3, r12);
            r1 = java.lang.String.class;
            if (r1 != r0) goto L_0x022e;
        L_0x0218:
            r11 = defpackage.akwv.a(r2, r12);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$j;
            r14 = (defpackage.akye) r14;
            r13 = r14.a();
            r12.<init>(r11, r13);
            return r12;
        L_0x022e:
            r12 = java.lang.String.valueOf(r0);
            r13 = "@QueryMap keys must be of type String: ";
            r12 = r13.concat(r12);
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x023f:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r6, r12);
            throw r11;
        L_0x0246:
            r12 = new java.lang.Object[r3];
            r13 = "@QueryMap parameter type must be Map.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x024f:
            r0 = r14 instanceof defpackage.akxs;
            if (r0 == 0) goto L_0x02cd;
        L_0x0253:
            r14 = (defpackage.akxs) r14;
            r14 = r14.a();
            r0 = defpackage.akwv.a(r12);
            r2 = java.lang.Iterable.class;
            r2 = r2.isAssignableFrom(r0);
            if (r2 == 0) goto L_0x02a3;
        L_0x0265:
            r2 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r2 == 0) goto L_0x027f;
        L_0x0269:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r11 = defpackage.akwv.a(r3, r12);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$d;
            r12.<init>(r14, r11);
            r11 = r12.a();
            return r11;
        L_0x027f:
            r12 = new java.lang.StringBuilder;
            r12.<init>();
            r13 = r0.getSimpleName();
            r12.append(r13);
            r12.append(r5);
            r13 = r0.getSimpleName();
            r12.append(r13);
            r12.append(r1);
            r12 = r12.toString();
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x02a3:
            r11 = r0.isArray();
            if (r11 == 0) goto L_0x02c1;
        L_0x02a9:
            r11 = r0.getComponentType();
            r11 = defpackage.akwu.a(r11);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$d;
            r12.<init>(r14, r11);
            r11 = r12.b();
            return r11;
        L_0x02c1:
            r11 = r10.a;
            r11 = r11.a(r12, r13);
            r12 = new akwp$d;
            r12.<init>(r14, r11);
            return r12;
        L_0x02cd:
            r0 = r14 instanceof defpackage.akxt;
            if (r0 == 0) goto L_0x0322;
        L_0x02d1:
            r14 = defpackage.akwv.a(r12);
            r0 = java.util.Map.class;
            r0 = r0.isAssignableFrom(r14);
            if (r0 == 0) goto L_0x0319;
        L_0x02dd:
            r0 = java.util.Map.class;
            r12 = defpackage.akwv.a(r12, r14, r0);
            r14 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r14 == 0) goto L_0x0312;
        L_0x02e7:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r14 = defpackage.akwv.a(r3, r12);
            r0 = java.lang.String.class;
            if (r0 != r14) goto L_0x0301;
        L_0x02f1:
            r11 = defpackage.akwv.a(r2, r12);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$e;
            r12.<init>(r11);
            return r12;
        L_0x0301:
            r12 = java.lang.String.valueOf(r14);
            r13 = "@HeaderMap keys must be of type String: ";
            r12 = r13.concat(r12);
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x0312:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r6, r12);
            throw r11;
        L_0x0319:
            r12 = new java.lang.Object[r3];
            r13 = "@HeaderMap parameter type must be Map.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x0322:
            r0 = r14 instanceof defpackage.akxm;
            if (r0 == 0) goto L_0x03b3;
        L_0x0326:
            r0 = r10.l;
            if (r0 == 0) goto L_0x03aa;
        L_0x032a:
            r14 = (defpackage.akxm) r14;
            r0 = r14.a();
            r14 = r14.b();
            r10.f = r2;
            r2 = defpackage.akwv.a(r12);
            r4 = java.lang.Iterable.class;
            r4 = r4.isAssignableFrom(r2);
            if (r4 == 0) goto L_0x0380;
        L_0x0342:
            r4 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r4 == 0) goto L_0x035c;
        L_0x0346:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r11 = defpackage.akwv.a(r3, r12);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$b;
            r12.<init>(r0, r11, r14);
            r11 = r12.a();
            return r11;
        L_0x035c:
            r12 = new java.lang.StringBuilder;
            r12.<init>();
            r13 = r2.getSimpleName();
            r12.append(r13);
            r12.append(r5);
            r13 = r2.getSimpleName();
            r12.append(r13);
            r12.append(r1);
            r12 = r12.toString();
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x0380:
            r11 = r2.isArray();
            if (r11 == 0) goto L_0x039e;
        L_0x0386:
            r11 = r2.getComponentType();
            r11 = defpackage.akwu.a(r11);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r12 = new akwp$b;
            r12.<init>(r0, r11, r14);
            r11 = r12.b();
            return r11;
        L_0x039e:
            r11 = r10.a;
            r11 = r11.a(r12, r13);
            r12 = new akwp$b;
            r12.<init>(r0, r11, r14);
            return r12;
        L_0x03aa:
            r12 = new java.lang.Object[r3];
            r13 = "@Field parameters can only be used with form encoding.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x03b3:
            r0 = r14 instanceof defpackage.akxn;
            if (r0 == 0) goto L_0x041d;
        L_0x03b7:
            r0 = r10.l;
            if (r0 == 0) goto L_0x0414;
        L_0x03bb:
            r0 = defpackage.akwv.a(r12);
            r1 = java.util.Map.class;
            r1 = r1.isAssignableFrom(r0);
            if (r1 == 0) goto L_0x040b;
        L_0x03c7:
            r1 = java.util.Map.class;
            r12 = defpackage.akwv.a(r12, r0, r1);
            r0 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r0 == 0) goto L_0x0404;
        L_0x03d1:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r0 = defpackage.akwv.a(r3, r12);
            r1 = java.lang.String.class;
            if (r1 != r0) goto L_0x03f3;
        L_0x03db:
            r11 = defpackage.akwv.a(r2, r12);
            r12 = r10.a;
            r11 = r12.a(r11, r13);
            r10.f = r2;
            r12 = new akwp$c;
            r14 = (defpackage.akxn) r14;
            r13 = r14.a();
            r12.<init>(r11, r13);
            return r12;
        L_0x03f3:
            r12 = java.lang.String.valueOf(r0);
            r13 = "@FieldMap keys must be of type String: ";
            r12 = r13.concat(r12);
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x0404:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r6, r12);
            throw r11;
        L_0x040b:
            r12 = new java.lang.Object[r3];
            r13 = "@FieldMap parameter type must be Map.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x0414:
            r12 = new java.lang.Object[r3];
            r13 = "@FieldMap parameters can only be used with form encoding.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x041d:
            r0 = r14 instanceof defpackage.akya;
            if (r0 == 0) goto L_0x0598;
        L_0x0421:
            r0 = r10.m;
            if (r0 == 0) goto L_0x058f;
        L_0x0425:
            r14 = (defpackage.akya) r14;
            r10.g = r2;
            r0 = r14.a();
            r6 = defpackage.akwv.a(r12);
            r7 = r0.isEmpty();
            if (r7 == 0) goto L_0x04bb;
        L_0x0437:
            r13 = java.lang.Iterable.class;
            r13 = r13.isAssignableFrom(r6);
            r14 = "@Part annotation must supply a name or use MultipartBody.Part parameter type.";
            if (r13 == 0) goto L_0x0489;
        L_0x0441:
            r13 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r13 == 0) goto L_0x0465;
        L_0x0445:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r12 = defpackage.akwv.a(r3, r12);
            r13 = defpackage.akhp.b.class;
            r12 = defpackage.akwv.a(r12);
            r12 = r13.isAssignableFrom(r12);
            if (r12 == 0) goto L_0x045e;
        L_0x0457:
            r11 = defpackage.akwp.l.a;
            r11 = r11.a();
            return r11;
        L_0x045e:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r14, r12);
            throw r11;
        L_0x0465:
            r12 = new java.lang.StringBuilder;
            r12.<init>();
            r13 = r6.getSimpleName();
            r12.append(r13);
            r12.append(r5);
            r13 = r6.getSimpleName();
            r12.append(r13);
            r12.append(r1);
            r12 = r12.toString();
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x0489:
            r12 = r6.isArray();
            if (r12 == 0) goto L_0x04a9;
        L_0x048f:
            r12 = r6.getComponentType();
            r13 = defpackage.akhp.b.class;
            r12 = r13.isAssignableFrom(r12);
            if (r12 == 0) goto L_0x04a2;
        L_0x049b:
            r11 = defpackage.akwp.l.a;
            r11 = r11.b();
            return r11;
        L_0x04a2:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r14, r12);
            throw r11;
        L_0x04a9:
            r12 = defpackage.akhp.b.class;
            r12 = r12.isAssignableFrom(r6);
            if (r12 == 0) goto L_0x04b4;
        L_0x04b1:
            r11 = defpackage.akwp.l.a;
            return r11;
        L_0x04b4:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r14, r12);
            throw r11;
        L_0x04bb:
            r7 = 4;
            r7 = new java.lang.String[r7];
            r8 = "Content-Disposition";
            r7[r3] = r8;
            r8 = new java.lang.StringBuilder;
            r9 = "form-data; name=\"";
            r8.<init>(r9);
            r8.append(r0);
            r0 = "\"";
            r8.append(r0);
            r0 = r8.toString();
            r7[r2] = r0;
            r0 = "Content-Transfer-Encoding";
            r7[r4] = r0;
            r0 = 3;
            r14 = r14.b();
            r7[r0] = r14;
            r14 = defpackage.akhl.a(r7);
            r0 = java.lang.Iterable.class;
            r0 = r0.isAssignableFrom(r6);
            r2 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.";
            if (r0 == 0) goto L_0x0543;
        L_0x04f0:
            r0 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r0 == 0) goto L_0x051f;
        L_0x04f4:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r12 = defpackage.akwv.a(r3, r12);
            r0 = defpackage.akhp.b.class;
            r1 = defpackage.akwv.a(r12);
            r0 = r0.isAssignableFrom(r1);
            if (r0 != 0) goto L_0x0518;
        L_0x0506:
            r11 = r10.a;
            r0 = r10.b;
            r11 = r11.a(r12, r13, r0);
            r12 = new akwp$f;
            r12.<init>(r14, r11);
            r11 = r12.a();
            return r11;
        L_0x0518:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r2, r12);
            throw r11;
        L_0x051f:
            r12 = new java.lang.StringBuilder;
            r12.<init>();
            r13 = r6.getSimpleName();
            r12.append(r13);
            r12.append(r5);
            r13 = r6.getSimpleName();
            r12.append(r13);
            r12.append(r1);
            r12 = r12.toString();
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x0543:
            r0 = r6.isArray();
            if (r0 == 0) goto L_0x0572;
        L_0x0549:
            r12 = r6.getComponentType();
            r12 = defpackage.akwu.a(r12);
            r0 = defpackage.akhp.b.class;
            r0 = r0.isAssignableFrom(r12);
            if (r0 != 0) goto L_0x056b;
        L_0x0559:
            r11 = r10.a;
            r0 = r10.b;
            r11 = r11.a(r12, r13, r0);
            r12 = new akwp$f;
            r12.<init>(r14, r11);
            r11 = r12.b();
            return r11;
        L_0x056b:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r2, r12);
            throw r11;
        L_0x0572:
            r0 = defpackage.akhp.b.class;
            r0 = r0.isAssignableFrom(r6);
            if (r0 != 0) goto L_0x0588;
        L_0x057a:
            r11 = r10.a;
            r0 = r10.b;
            r11 = r11.a(r12, r13, r0);
            r12 = new akwp$f;
            r12.<init>(r14, r11);
            return r12;
        L_0x0588:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r2, r12);
            throw r11;
        L_0x058f:
            r12 = new java.lang.Object[r3];
            r13 = "@Part parameters can only be used with multipart encoding.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x0598:
            r0 = r14 instanceof defpackage.akyb;
            if (r0 == 0) goto L_0x0619;
        L_0x059c:
            r0 = r10.m;
            if (r0 == 0) goto L_0x0610;
        L_0x05a0:
            r10.g = r2;
            r0 = defpackage.akwv.a(r12);
            r1 = java.util.Map.class;
            r1 = r1.isAssignableFrom(r0);
            if (r1 == 0) goto L_0x0607;
        L_0x05ae:
            r1 = java.util.Map.class;
            r12 = defpackage.akwv.a(r12, r0, r1);
            r0 = r12 instanceof java.lang.reflect.ParameterizedType;
            if (r0 == 0) goto L_0x0600;
        L_0x05b8:
            r12 = (java.lang.reflect.ParameterizedType) r12;
            r0 = defpackage.akwv.a(r3, r12);
            r1 = java.lang.String.class;
            if (r1 != r0) goto L_0x05ef;
        L_0x05c2:
            r12 = defpackage.akwv.a(r2, r12);
            r0 = defpackage.akhp.b.class;
            r1 = defpackage.akwv.a(r12);
            r0 = r0.isAssignableFrom(r1);
            if (r0 != 0) goto L_0x05e6;
        L_0x05d2:
            r11 = r10.a;
            r0 = r10.b;
            r11 = r11.a(r12, r13, r0);
            r14 = (defpackage.akyb) r14;
            r12 = new akwp$g;
            r13 = r14.a();
            r12.<init>(r11, r13);
            return r12;
        L_0x05e6:
            r12 = new java.lang.Object[r3];
            r13 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x05ef:
            r12 = java.lang.String.valueOf(r0);
            r13 = "@PartMap keys must be of type String: ";
            r12 = r13.concat(r12);
            r13 = new java.lang.Object[r3];
            r11 = r10.a(r11, r12, r13);
            throw r11;
        L_0x0600:
            r12 = new java.lang.Object[r3];
            r11 = r10.a(r11, r6, r12);
            throw r11;
        L_0x0607:
            r12 = new java.lang.Object[r3];
            r13 = "@PartMap parameter type must be Map.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x0610:
            r12 = new java.lang.Object[r3];
            r13 = "@PartMap parameters can only be used with multipart encoding.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x0619:
            r14 = r14 instanceof defpackage.akxk;
            if (r14 == 0) goto L_0x0671;
        L_0x061d:
            r14 = r10.l;
            if (r14 != 0) goto L_0x0668;
        L_0x0621:
            r14 = r10.m;
            if (r14 != 0) goto L_0x0668;
        L_0x0625:
            r14 = r10.h;
            if (r14 != 0) goto L_0x065f;
        L_0x0629:
            r14 = r10.a;	 Catch:{ RuntimeException -> 0x0639 }
            r0 = r10.b;	 Catch:{ RuntimeException -> 0x0639 }
            r11 = r14.a(r12, r13, r0);	 Catch:{ RuntimeException -> 0x0639 }
            r10.h = r2;
            r12 = new akwp$a;
            r12.<init>(r11);
            return r12;
        L_0x0639:
            r13 = move-exception;
            r14 = new java.lang.Object[r2];
            r14[r3] = r12;
            r12 = new java.lang.StringBuilder;
            r12.<init>();
            r0 = "Unable to create @Body converter for %s";
            r12.append(r0);
            r0 = " (parameter #";
            r12.append(r0);
            r11 = r11 + r2;
            r12.append(r11);
            r11 = ")";
            r12.append(r11);
            r11 = r12.toString();
            r11 = r10.a(r13, r11, r14);
            throw r11;
        L_0x065f:
            r12 = new java.lang.Object[r3];
            r13 = "Multiple @Body method annotations found.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x0668:
            r12 = new java.lang.Object[r3];
            r13 = "@Body parameters cannot be used with form or multi-part encoding.";
            r11 = r10.a(r11, r13, r12);
            throw r11;
        L_0x0671:
            r11 = 0;
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akwu$a.a(int, java.lang.reflect.Type, java.lang.annotation.Annotation[], java.lang.annotation.Annotation):akwp");
        }

        /* Access modifiers changed, original: final */
        public final akhl a(String[] strArr) {
            defpackage.akhl.a aVar = new defpackage.akhl.a();
            for (String str : strArr) {
                String str2;
                int indexOf = str2.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str2.length() - 1) {
                    throw a(null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str2);
                }
                String substring = str2.substring(0, indexOf);
                str2 = str2.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    akho a = akho.a(str2);
                    if (a != null) {
                        this.p = a;
                    } else {
                        throw a(null, "Malformed content type: %s", str2);
                    }
                }
                aVar.a(substring, str2);
            }
            return aVar.a();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x00a8 in {10, 11, 14, 16, 19, 21, 23} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final defpackage.akwi<T, R> a() {
            /*
            r8 = this;
            r0 = r8.t;
            r0 = r0.getGenericReturnType();
            r1 = defpackage.akwv.d(r0);
            r2 = 0;
            r3 = 0;
            r4 = 1;
            if (r1 != 0) goto L_0x009d;
            r1 = java.lang.Void.TYPE;
            if (r0 == r1) goto L_0x0094;
            r1 = r8.t;
            r1 = r1.getAnnotations();
            r5 = r8.a;	 Catch:{ RuntimeException -> 0x0088 }
            r6 = "returnType == null";	 Catch:{ RuntimeException -> 0x0088 }
            defpackage.akwv.a(r0, r6);	 Catch:{ RuntimeException -> 0x0088 }
            r6 = "annotations == null";	 Catch:{ RuntimeException -> 0x0088 }
            defpackage.akwv.a(r1, r6);	 Catch:{ RuntimeException -> 0x0088 }
            r1 = r5.d;	 Catch:{ RuntimeException -> 0x0088 }
            r1 = r1.indexOf(r2);	 Catch:{ RuntimeException -> 0x0088 }
            r1 = r1 + r4;	 Catch:{ RuntimeException -> 0x0088 }
            r2 = r5.d;	 Catch:{ RuntimeException -> 0x0088 }
            r2 = r2.size();	 Catch:{ RuntimeException -> 0x0088 }
            r6 = r1;	 Catch:{ RuntimeException -> 0x0088 }
            if (r6 >= r2) goto L_0x0047;	 Catch:{ RuntimeException -> 0x0088 }
            r7 = r5.d;	 Catch:{ RuntimeException -> 0x0088 }
            r7 = r7.get(r6);	 Catch:{ RuntimeException -> 0x0088 }
            r7 = (defpackage.akwi.a) r7;	 Catch:{ RuntimeException -> 0x0088 }
            r7 = r7.a(r0);	 Catch:{ RuntimeException -> 0x0088 }
            if (r7 == 0) goto L_0x0044;	 Catch:{ RuntimeException -> 0x0088 }
            return r7;	 Catch:{ RuntimeException -> 0x0088 }
            r6 = r6 + 1;	 Catch:{ RuntimeException -> 0x0088 }
            goto L_0x0033;	 Catch:{ RuntimeException -> 0x0088 }
            r2 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0088 }
            r6 = "Could not locate call adapter for ";	 Catch:{ RuntimeException -> 0x0088 }
            r2.<init>(r6);	 Catch:{ RuntimeException -> 0x0088 }
            r2.append(r0);	 Catch:{ RuntimeException -> 0x0088 }
            r6 = ".\n";	 Catch:{ RuntimeException -> 0x0088 }
            r2.append(r6);	 Catch:{ RuntimeException -> 0x0088 }
            r6 = "  Tried:";	 Catch:{ RuntimeException -> 0x0088 }
            r2.append(r6);	 Catch:{ RuntimeException -> 0x0088 }
            r6 = r5.d;	 Catch:{ RuntimeException -> 0x0088 }
            r6 = r6.size();	 Catch:{ RuntimeException -> 0x0088 }
            if (r1 >= r6) goto L_0x007e;	 Catch:{ RuntimeException -> 0x0088 }
            r7 = "\n   * ";	 Catch:{ RuntimeException -> 0x0088 }
            r2.append(r7);	 Catch:{ RuntimeException -> 0x0088 }
            r7 = r5.d;	 Catch:{ RuntimeException -> 0x0088 }
            r7 = r7.get(r1);	 Catch:{ RuntimeException -> 0x0088 }
            r7 = (defpackage.akwi.a) r7;	 Catch:{ RuntimeException -> 0x0088 }
            r7 = r7.getClass();	 Catch:{ RuntimeException -> 0x0088 }
            r7 = r7.getName();	 Catch:{ RuntimeException -> 0x0088 }
            r2.append(r7);	 Catch:{ RuntimeException -> 0x0088 }
            r1 = r1 + 1;	 Catch:{ RuntimeException -> 0x0088 }
            goto L_0x0061;	 Catch:{ RuntimeException -> 0x0088 }
            r1 = new java.lang.IllegalArgumentException;	 Catch:{ RuntimeException -> 0x0088 }
            r2 = r2.toString();	 Catch:{ RuntimeException -> 0x0088 }
            r1.<init>(r2);	 Catch:{ RuntimeException -> 0x0088 }
            throw r1;	 Catch:{ RuntimeException -> 0x0088 }
            r1 = move-exception;
            r2 = new java.lang.Object[r4];
            r2[r3] = r0;
            r0 = "Unable to create call adapter for %s";
            r0 = r8.a(r1, r0, r2);
            throw r0;
            r0 = new java.lang.Object[r3];
            r1 = "Service methods cannot return void.";
            r0 = r8.a(r2, r1, r0);
            throw r0;
            r1 = new java.lang.Object[r4];
            r1[r3] = r0;
            r0 = "Method return type must not include a type variable or wildcard: %s";
            r0 = r8.a(r2, r0, r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akwu$a.a():akwi");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x002b in {5, 7, 8, 10, 12} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final defpackage.akwp<?> a(int r6, java.lang.reflect.Type r7, java.lang.annotation.Annotation[] r8) {
            /*
            r5 = this;
            r0 = r8.length;
            r1 = 0;
            r2 = 0;
            r3 = r2;
            r2 = 0;
            if (r2 >= r0) goto L_0x001f;
            r4 = r8[r2];
            r4 = r5.a(r6, r7, r8, r4);
            if (r4 == 0) goto L_0x001c;
            if (r3 != 0) goto L_0x0013;
            r3 = r4;
            goto L_0x001c;
            r7 = new java.lang.Object[r1];
            r8 = "Multiple Retrofit annotations found, only one allowed.";
            r6 = r5.a(r6, r8, r7);
            throw r6;
            r2 = r2 + 1;
            goto L_0x0005;
            if (r3 == 0) goto L_0x0022;
            return r3;
            r7 = new java.lang.Object[r1];
            r8 = "No Retrofit annotation found.";
            r6 = r5.a(r6, r8, r7);
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akwu$a.a(int, java.lang.reflect.Type, java.lang.annotation.Annotation[]):akwp");
        }

        /* Access modifiers changed, original: final|varargs */
        public final RuntimeException a(int i, String str, Object... objArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" (parameter #");
            stringBuilder.append(i + 1);
            stringBuilder.append(")");
            return a(null, stringBuilder.toString(), objArr);
        }

        /* Access modifiers changed, original: final|varargs */
        public final RuntimeException a(Throwable th, String str, Object... objArr) {
            str = String.format(str, objArr);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("\n    for method ");
            stringBuilder.append(this.t.getDeclaringClass().getSimpleName());
            stringBuilder.append(".");
            stringBuilder.append(this.t.getName());
            return new IllegalArgumentException(stringBuilder.toString(), th);
        }

        /* Access modifiers changed, original: final */
        public final void a(String str, String str2, boolean z) {
            if (this.j == null) {
                this.j = str;
                this.k = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        if (akwu.a.matcher(str2.substring(indexOf + 1)).find()) {
                            throw a(null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", str2.substring(indexOf + 1));
                        }
                    }
                    this.n = str2;
                    this.w = akwu.a(str2);
                    return;
                }
                return;
            }
            throw a(null, "Only one HTTP method is allowed. Found: %s and %s.", this.j, str);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0088 in {6, 7, 10, 12, 15} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        final defpackage.akwk<defpackage.akhw, T> b() {
            /*
            r8 = this;
            r0 = r8.t;
            r0 = r0.getAnnotations();
            r1 = 1;
            r2 = r8.a;	 Catch:{ RuntimeException -> 0x0079 }
            r3 = r8.e;	 Catch:{ RuntimeException -> 0x0079 }
            r4 = "type == null";	 Catch:{ RuntimeException -> 0x0079 }
            defpackage.akwv.a(r3, r4);	 Catch:{ RuntimeException -> 0x0079 }
            r4 = "annotations == null";	 Catch:{ RuntimeException -> 0x0079 }
            defpackage.akwv.a(r0, r4);	 Catch:{ RuntimeException -> 0x0079 }
            r4 = r2.c;	 Catch:{ RuntimeException -> 0x0079 }
            r5 = 0;	 Catch:{ RuntimeException -> 0x0079 }
            r4 = r4.indexOf(r5);	 Catch:{ RuntimeException -> 0x0079 }
            r4 = r4 + r1;	 Catch:{ RuntimeException -> 0x0079 }
            r5 = r2.c;	 Catch:{ RuntimeException -> 0x0079 }
            r5 = r5.size();	 Catch:{ RuntimeException -> 0x0079 }
            r6 = r4;	 Catch:{ RuntimeException -> 0x0079 }
            if (r6 >= r5) goto L_0x0038;	 Catch:{ RuntimeException -> 0x0079 }
            r7 = r2.c;	 Catch:{ RuntimeException -> 0x0079 }
            r7 = r7.get(r6);	 Catch:{ RuntimeException -> 0x0079 }
            r7 = (defpackage.akwk.a) r7;	 Catch:{ RuntimeException -> 0x0079 }
            r7 = r7.a(r3, r0, r2);	 Catch:{ RuntimeException -> 0x0079 }
            if (r7 == 0) goto L_0x0035;	 Catch:{ RuntimeException -> 0x0079 }
            return r7;	 Catch:{ RuntimeException -> 0x0079 }
            r6 = r6 + 1;	 Catch:{ RuntimeException -> 0x0079 }
            goto L_0x0024;	 Catch:{ RuntimeException -> 0x0079 }
            r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0079 }
            r5 = "Could not locate ResponseBody converter for ";	 Catch:{ RuntimeException -> 0x0079 }
            r0.<init>(r5);	 Catch:{ RuntimeException -> 0x0079 }
            r0.append(r3);	 Catch:{ RuntimeException -> 0x0079 }
            r3 = ".\n";	 Catch:{ RuntimeException -> 0x0079 }
            r0.append(r3);	 Catch:{ RuntimeException -> 0x0079 }
            r3 = "  Tried:";	 Catch:{ RuntimeException -> 0x0079 }
            r0.append(r3);	 Catch:{ RuntimeException -> 0x0079 }
            r3 = r2.c;	 Catch:{ RuntimeException -> 0x0079 }
            r3 = r3.size();	 Catch:{ RuntimeException -> 0x0079 }
            if (r4 >= r3) goto L_0x006f;	 Catch:{ RuntimeException -> 0x0079 }
            r5 = "\n   * ";	 Catch:{ RuntimeException -> 0x0079 }
            r0.append(r5);	 Catch:{ RuntimeException -> 0x0079 }
            r5 = r2.c;	 Catch:{ RuntimeException -> 0x0079 }
            r5 = r5.get(r4);	 Catch:{ RuntimeException -> 0x0079 }
            r5 = (defpackage.akwk.a) r5;	 Catch:{ RuntimeException -> 0x0079 }
            r5 = r5.getClass();	 Catch:{ RuntimeException -> 0x0079 }
            r5 = r5.getName();	 Catch:{ RuntimeException -> 0x0079 }
            r0.append(r5);	 Catch:{ RuntimeException -> 0x0079 }
            r4 = r4 + 1;	 Catch:{ RuntimeException -> 0x0079 }
            goto L_0x0052;	 Catch:{ RuntimeException -> 0x0079 }
            r2 = new java.lang.IllegalArgumentException;	 Catch:{ RuntimeException -> 0x0079 }
            r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0079 }
            r2.<init>(r0);	 Catch:{ RuntimeException -> 0x0079 }
            throw r2;	 Catch:{ RuntimeException -> 0x0079 }
            r0 = move-exception;
            r1 = new java.lang.Object[r1];
            r2 = 0;
            r3 = r8.e;
            r1[r2] = r3;
            r2 = "Unable to create converter for %s";
            r0 = r8.a(r0, r2, r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akwu$a.b():akwk");
        }
    }

    akwu(a<R, T> aVar) {
        this.c = aVar.a.a;
        this.d = aVar.s;
        this.f = aVar.a.b;
        this.e = aVar.r;
        this.g = aVar.j;
        this.h = aVar.n;
        this.i = aVar.o;
        this.j = aVar.p;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.q;
    }

    static Class<?> a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            cls = Short.class;
        }
        return cls;
    }

    static Set<String> a(String str) {
        Matcher matcher = a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0054 in {2, 3, 7, 9, 11} preds:[]
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
    final defpackage.akht a(java.lang.Object... r11) {
        /*
        r10 = this;
        r9 = new akwr;
        r1 = r10.g;
        r2 = r10.f;
        r3 = r10.h;
        r4 = r10.i;
        r5 = r10.j;
        r6 = r10.k;
        r7 = r10.l;
        r8 = r10.m;
        r0 = r9;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r0 = r10.n;
        r1 = 0;
        if (r11 == 0) goto L_0x001d;
        r2 = r11.length;
        goto L_0x001e;
        r2 = 0;
        r3 = r0.length;
        if (r2 != r3) goto L_0x0032;
        if (r1 >= r2) goto L_0x002d;
        r3 = r0[r1];
        r4 = r11[r1];
        r3.a(r9, r4);
        r1 = r1 + 1;
        goto L_0x0021;
        r11 = r9.a();
        return r11;
        r11 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r3 = "Argument count (";
        r1.<init>(r3);
        r1.append(r2);
        r2 = ") doesn't match expected count (";
        r1.append(r2);
        r0 = r0.length;
        r1.append(r0);
        r0 = ")";
        r1.append(r0);
        r0 = r1.toString();
        r11.<init>(r0);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwu.a(java.lang.Object[]):akht");
    }
}

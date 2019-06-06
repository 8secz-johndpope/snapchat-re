package defpackage;

import android.util.Log;
import defpackage.apy.ad;
import defpackage.apy.ai;
import defpackage.apy.ak;
import defpackage.apy.am;
import defpackage.apy.l;
import defpackage.aqc.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.opencv.imgproc.Imgproc;
import org.xml.sax.SAXException;

/* renamed from: apt */
public final class apt {
    private d a = null;
    private boolean b = false;

    /* renamed from: apt$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[b.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0013 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Missing block: B:9:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.apt.b.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x000e }
            r1 = 1;
            r0[r1] = r1;	 Catch:{ NoSuchFieldError -> 0x000e }
        L_0x000e:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0013 }
            r1 = 2;
            r0[r1] = r1;	 Catch:{ NoSuchFieldError -> 0x0013 }
        L_0x0013:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0018 }
            r1 = 3;
            r0[r1] = r1;	 Catch:{ NoSuchFieldError -> 0x0018 }
        L_0x0018:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.apt$1.<clinit>():void");
        }
    }

    /* renamed from: apt$a */
    public static class a {
        public String a = null;
        public int b;
        public String c = null;

        public a(String str, int i, String str2) {
            this.a = str;
            this.b = i;
            this.c = str2;
        }
    }

    /* renamed from: apt$b */
    enum b {
        ;

        static {
            a = new int[]{1, 2, 3, 4};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    /* renamed from: apt$d */
    public enum d {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        tty,
        tv
    }

    /* renamed from: apt$e */
    public static class e {
        public g a = null;
        public ad b = null;

        public e(g gVar, ad adVar) {
            this.a = gVar;
            this.b = adVar;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(" {}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: apt$f */
    public static class f {
        List<e> a = null;

        public final void a(e eVar) {
            if (this.a == null) {
                this.a = new ArrayList();
            }
            for (int i = 0; i < this.a.size(); i++) {
                if (((e) this.a.get(i)).a.b > eVar.a.b) {
                    this.a.add(i, eVar);
                    return;
                }
            }
            this.a.add(eVar);
        }

        public final void a(f fVar) {
            List list = fVar.a;
            if (list != null) {
                if (this.a == null) {
                    this.a = new ArrayList(list.size());
                }
                for (e add : fVar.a) {
                    this.a.add(add);
                }
            }
        }

        public final String toString() {
            if (this.a == null) {
                return "";
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (e eVar : this.a) {
                stringBuilder.append(eVar.toString());
                stringBuilder.append(10);
            }
            return stringBuilder.toString();
        }
    }

    /* renamed from: apt$g */
    public static class g {
        public List<h> a = null;
        public int b = 0;

        public final int a() {
            List list = this.a;
            return list == null ? 0 : list.size();
        }

        public final h a(int i) {
            return (h) this.a.get(i);
        }

        public final boolean b() {
            List list = this.a;
            return list == null ? true : list.isEmpty();
        }

        public final void c() {
            this.b += 100;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (h append : this.a) {
                stringBuilder.append(append);
                stringBuilder.append(' ');
            }
            stringBuilder.append('(');
            stringBuilder.append(this.b);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    /* renamed from: apt$h */
    static class h {
        public int a = 0;
        public String b = null;
        public List<a> c = null;
        public List<String> d = null;

        public h(int i, String str) {
            if (i == 0) {
                i = 1;
            }
            this.a = i;
            this.b = str;
        }

        public final void a(String str, int i, String str2) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(new a(str, i, str2));
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
        public final java.lang.String toString() {
            /*
            r8 = this;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = r8.a;
            r2 = 3;
            r3 = 2;
            if (r1 != r3) goto L_0x0011;
        L_0x000b:
            r1 = "> ";
        L_0x000d:
            r0.append(r1);
            goto L_0x0016;
        L_0x0011:
            if (r1 != r2) goto L_0x0016;
        L_0x0013:
            r1 = "+ ";
            goto L_0x000d;
        L_0x0016:
            r1 = r8.b;
            if (r1 != 0) goto L_0x001c;
        L_0x001a:
            r1 = "*";
        L_0x001c:
            r0.append(r1);
            r1 = r8.c;
            if (r1 == 0) goto L_0x0065;
        L_0x0023:
            r1 = r1.iterator();
        L_0x0027:
            r4 = r1.hasNext();
            if (r4 == 0) goto L_0x0065;
        L_0x002d:
            r4 = r1.next();
            r4 = (defpackage.apt.a) r4;
            r5 = 91;
            r0.append(r5);
            r5 = r4.a;
            r0.append(r5);
            r5 = defpackage.apt.1.a;
            r6 = r4.b;
            r7 = 1;
            r6 = r6 - r7;
            r5 = r5[r6];
            if (r5 == r7) goto L_0x0055;
        L_0x0047:
            if (r5 == r3) goto L_0x004f;
        L_0x0049:
            if (r5 == r2) goto L_0x004c;
        L_0x004b:
            goto L_0x005f;
        L_0x004c:
            r5 = "|=";
            goto L_0x0051;
        L_0x004f:
            r5 = "~=";
        L_0x0051:
            r0.append(r5);
            goto L_0x005a;
        L_0x0055:
            r5 = 61;
            r0.append(r5);
        L_0x005a:
            r4 = r4.c;
            r0.append(r4);
        L_0x005f:
            r4 = 93;
            r0.append(r4);
            goto L_0x0027;
        L_0x0065:
            r1 = r8.d;
            if (r1 == 0) goto L_0x0082;
        L_0x0069:
            r1 = r1.iterator();
        L_0x006d:
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x0082;
        L_0x0073:
            r2 = r1.next();
            r2 = (java.lang.String) r2;
            r3 = 58;
            r0.append(r3);
            r0.append(r2);
            goto L_0x006d;
        L_0x0082:
            r0 = r0.toString();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.apt$h.toString():java.lang.String");
        }
    }

    /* renamed from: apt$c */
    static class c extends g {
        public c(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public final String a() {
            int i;
            if (c()) {
                i = this.b;
            } else {
                i = this.b;
                int i2 = this.b;
                char charAt = this.a.charAt(this.b);
                if (charAt == '-') {
                    charAt = j();
                }
                if ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= 'a' && charAt <= 'z') || charAt == '_')) {
                    while (true) {
                        i2 = j();
                        if ((i2 < 65 || i2 > 90) && ((i2 < 97 || i2 > Imgproc.COLOR_YUV2BGRA_YVYU) && ((i2 < 48 || i2 > 57) && i2 != 45))) {
                            if (i2 != 95) {
                                break;
                            }
                        }
                    }
                    i2 = this.b;
                }
                this.b = i;
                i = i2;
            }
            if (i == this.b) {
                return null;
            }
            String substring = this.a.substring(this.b, i);
            this.b = i;
            return substring;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x016a  */
        public final boolean a(defpackage.apt.g r14) {
            /*
            r13 = this;
            r0 = r13.c();
            r1 = 0;
            if (r0 == 0) goto L_0x0008;
        L_0x0007:
            return r1;
        L_0x0008:
            r0 = r13.b;
            r2 = r14.b();
            r3 = 3;
            r4 = 2;
            if (r2 != 0) goto L_0x002c;
        L_0x0012:
            r2 = 62;
            r2 = r13.a(r2);
            if (r2 == 0) goto L_0x001f;
        L_0x001a:
            r13.d();
            r2 = 2;
            goto L_0x002d;
        L_0x001f:
            r2 = 43;
            r2 = r13.a(r2);
            if (r2 == 0) goto L_0x002c;
        L_0x0027:
            r13.d();
            r2 = 3;
            goto L_0x002d;
        L_0x002c:
            r2 = 0;
        L_0x002d:
            r5 = 42;
            r5 = r13.a(r5);
            r6 = 1;
            r7 = 0;
            if (r5 == 0) goto L_0x003d;
        L_0x0037:
            r5 = new apt$h;
            r5.<init>(r2, r7);
            goto L_0x0050;
        L_0x003d:
            r5 = r13.a();
            if (r5 == 0) goto L_0x004f;
        L_0x0043:
            r8 = new apt$h;
            r8.<init>(r2, r5);
            r5 = r14.b;
            r5 = r5 + r6;
            r14.b = r5;
            r5 = r8;
            goto L_0x0050;
        L_0x004f:
            r5 = r7;
        L_0x0050:
            r8 = r13.c();
            if (r8 != 0) goto L_0x0168;
        L_0x0056:
            r8 = 46;
            r8 = r13.a(r8);
            if (r8 == 0) goto L_0x007c;
        L_0x005e:
            if (r5 != 0) goto L_0x0065;
        L_0x0060:
            r5 = new apt$h;
            r5.<init>(r2, r7);
        L_0x0065:
            r8 = r13.a();
            if (r8 == 0) goto L_0x0074;
        L_0x006b:
            r9 = "class";
            r5.a(r9, r4, r8);
        L_0x0070:
            r14.c();
            goto L_0x0050;
        L_0x0074:
            r14 = new org.xml.sax.SAXException;
            r0 = "Invalid \".class\" selector in <style> element";
            r14.<init>(r0);
            throw r14;
        L_0x007c:
            r8 = 35;
            r8 = r13.a(r8);
            if (r8 == 0) goto L_0x00a5;
        L_0x0084:
            if (r5 != 0) goto L_0x008b;
        L_0x0086:
            r5 = new apt$h;
            r5.<init>(r2, r7);
        L_0x008b:
            r8 = r13.a();
            if (r8 == 0) goto L_0x009d;
        L_0x0091:
            r9 = "id";
            r5.a(r9, r4, r8);
            r8 = r14.b;
            r8 = r8 + 10000;
            r14.b = r8;
            goto L_0x00a5;
        L_0x009d:
            r14 = new org.xml.sax.SAXException;
            r0 = "Invalid \"#id\" selector in <style> element";
            r14.<init>(r0);
            throw r14;
        L_0x00a5:
            if (r5 == 0) goto L_0x0168;
        L_0x00a7:
            r8 = 91;
            r8 = r13.a(r8);
            if (r8 == 0) goto L_0x011d;
        L_0x00af:
            r13.d();
            r8 = r13.a();
            r9 = "Invalid attribute selector in <style> element";
            if (r8 == 0) goto L_0x0117;
        L_0x00ba:
            r13.d();
            r10 = 61;
            r10 = r13.a(r10);
            if (r10 == 0) goto L_0x00c7;
        L_0x00c5:
            r10 = 2;
            goto L_0x00dc;
        L_0x00c7:
            r10 = "~=";
            r10 = r13.a(r10);
            if (r10 == 0) goto L_0x00d1;
        L_0x00cf:
            r10 = 3;
            goto L_0x00dc;
        L_0x00d1:
            r10 = "|=";
            r10 = r13.a(r10);
            if (r10 == 0) goto L_0x00db;
        L_0x00d9:
            r10 = 4;
            goto L_0x00dc;
        L_0x00db:
            r10 = 0;
        L_0x00dc:
            if (r10 == 0) goto L_0x0100;
        L_0x00de:
            r13.d();
            r11 = r13.c();
            if (r11 == 0) goto L_0x00e9;
        L_0x00e7:
            r11 = r7;
            goto L_0x00f4;
        L_0x00e9:
            r11 = r13.p();
            if (r11 == 0) goto L_0x00f0;
        L_0x00ef:
            goto L_0x00f4;
        L_0x00f0:
            r11 = r13.a();
        L_0x00f4:
            if (r11 == 0) goto L_0x00fa;
        L_0x00f6:
            r13.d();
            goto L_0x0101;
        L_0x00fa:
            r14 = new org.xml.sax.SAXException;
            r14.<init>(r9);
            throw r14;
        L_0x0100:
            r11 = r7;
        L_0x0101:
            r12 = 93;
            r12 = r13.a(r12);
            if (r12 == 0) goto L_0x0111;
        L_0x0109:
            if (r10 != 0) goto L_0x010c;
        L_0x010b:
            r10 = 1;
        L_0x010c:
            r5.a(r8, r10, r11);
            goto L_0x0070;
        L_0x0111:
            r14 = new org.xml.sax.SAXException;
            r14.<init>(r9);
            throw r14;
        L_0x0117:
            r14 = new org.xml.sax.SAXException;
            r14.<init>(r9);
            throw r14;
        L_0x011d:
            r2 = 58;
            r2 = r13.a(r2);
            if (r2 == 0) goto L_0x0168;
        L_0x0125:
            r2 = r13.b;
            r3 = r13.a();
            if (r3 == 0) goto L_0x0168;
        L_0x012d:
            r3 = 40;
            r3 = r13.a(r3);
            if (r3 == 0) goto L_0x014d;
        L_0x0135:
            r13.d();
            r3 = r13.a();
            if (r3 == 0) goto L_0x014d;
        L_0x013e:
            r13.d();
            r3 = 41;
            r3 = r13.a(r3);
            if (r3 != 0) goto L_0x014d;
        L_0x0149:
            r2 = r2 - r6;
            r13.b = r2;
            goto L_0x0168;
        L_0x014d:
            r3 = r13.a;
            r4 = r13.b;
            r2 = r3.substring(r2, r4);
            r3 = r5.d;
            if (r3 != 0) goto L_0x0160;
        L_0x0159:
            r3 = new java.util.ArrayList;
            r3.<init>();
            r5.d = r3;
        L_0x0160:
            r3 = r5.d;
            r3.add(r2);
            r14.c();
        L_0x0168:
            if (r5 == 0) goto L_0x017b;
        L_0x016a:
            r0 = r14.a;
            if (r0 != 0) goto L_0x0175;
        L_0x016e:
            r0 = new java.util.ArrayList;
            r0.<init>();
            r14.a = r0;
        L_0x0175:
            r14 = r14.a;
            r14.add(r5);
            return r6;
        L_0x017b:
            r13.b = r0;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.apt$c.a(apt$g):boolean");
        }

        public final String b() {
            if (c()) {
                return null;
            }
            int i = this.b;
            int i2 = this.b;
            int charAt = this.a.charAt(this.b);
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33) {
                Object obj = (charAt == 10 || charAt == 13) ? 1 : null;
                if (obj != null) {
                    break;
                }
                if (!g.a(charAt)) {
                    i2 = this.b + 1;
                }
                charAt = j();
            }
            if (this.b > i) {
                return this.a.substring(i, i2);
            }
            this.b = i;
            return null;
        }
    }

    public apt(d dVar) {
        this.a = dVar;
    }

    private static int a(List<ai> list, int i, ak akVar) {
        if (i < 0 || list.get(i) != akVar.q) {
            return -1;
        }
        int i2 = 0;
        for (am amVar : akVar.q.a()) {
            if (amVar == akVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    static List<d> a(c cVar) {
        ArrayList arrayList = new ArrayList();
        while (!cVar.c()) {
            try {
                arrayList.add(d.valueOf(cVar.b(',')));
                if (!cVar.e()) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    protected static List<String> a(String str) {
        c cVar = new c(str);
        List<String> list = null;
        while (!cVar.c()) {
            String a = cVar.a();
            if (a != null) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(a);
                cVar.d();
            } else {
                throw new SAXException("Invalid value for \"class\" attribute: ".concat(String.valueOf(str)));
            }
        }
        return list;
    }

    private static boolean a(f fVar, c cVar) {
        List list;
        if (cVar.c()) {
            list = null;
        } else {
            list = new ArrayList(1);
            g gVar = new g();
            while (!cVar.c() && cVar.a(gVar)) {
                if (cVar.e()) {
                    list.add(gVar);
                    gVar = new g();
                }
            }
            if (!gVar.b()) {
                list.add(gVar);
            }
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        if (cVar.a('{')) {
            cVar.d();
            ad d = apt.d(cVar);
            cVar.d();
            for (g eVar : list) {
                fVar.a(new e(eVar, d));
            }
            return true;
        }
        throw new SAXException("Malformed rule block in <style> element: missing '{'");
    }

    private static boolean a(g gVar, int i, List<ai> list, int i2) {
        while (true) {
            h a = gVar.a(i);
            ak akVar = (ak) list.get(i2);
            if (!apt.a(a, (List) list, i2, akVar)) {
                return false;
            }
            if (a.a == 1) {
                if (i == 0) {
                    return true;
                }
                while (i2 > 0) {
                    i2--;
                    if (apt.a(gVar, i - 1, (List) list, i2)) {
                        return true;
                    }
                }
                return false;
            } else if (a.a == 2) {
                i--;
                i2--;
            } else {
                int a2 = apt.a(list, i2, akVar);
                if (a2 <= 0) {
                    return false;
                }
                return apt.a(gVar, i - 1, list, i2, (ak) akVar.q.a().get(a2 - 1));
            }
        }
    }

    private static boolean a(g gVar, int i, List<ai> list, int i2, ak akVar) {
        while (true) {
            h a = gVar.a(i);
            if (!apt.a(a, (List) list, i2, akVar)) {
                return false;
            }
            if (a.a == 1) {
                if (i == 0) {
                    return true;
                }
                while (i2 >= 0) {
                    if (apt.a(gVar, i - 1, (List) list, i2)) {
                        return true;
                    }
                    i2--;
                }
                return false;
            } else if (a.a == 2) {
                return apt.a(gVar, i - 1, (List) list, i2);
            } else {
                int a2 = apt.a(list, i2, akVar);
                if (a2 <= 0) {
                    return false;
                }
                akVar = (ak) akVar.q.a().get(a2 - 1);
                i--;
            }
        }
    }

    protected static boolean a(g gVar, ak akVar) {
        List arrayList = new ArrayList();
        for (Object obj = akVar.q; obj != null; obj = ((am) obj).q) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return gVar.a() == 1 ? apt.a(gVar.a(0), arrayList, size, akVar) : apt.a(gVar, gVar.a() - 1, arrayList, size, akVar);
    }

    private static boolean a(h hVar, List<ai> list, int i, ak akVar) {
        if (hVar.b != null) {
            if (hVar.b.equalsIgnoreCase("G")) {
                if (!(akVar instanceof l)) {
                    return false;
                }
            } else if (!hVar.b.equals(akVar.getClass().getSimpleName().toLowerCase(Locale.US))) {
                return false;
            }
        }
        if (hVar.c != null) {
            for (a aVar : hVar.c) {
                if (aVar.a == "id") {
                    if (!aVar.c.equals(akVar.k)) {
                        return false;
                    }
                } else if (aVar.a != "class" || akVar.o == null || !akVar.o.contains(aVar.c)) {
                    return false;
                }
            }
        }
        if (hVar.d != null) {
            for (String equals : hVar.d) {
                if (equals.equals("first-child")) {
                    if (apt.a(list, i, akVar) != 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    static boolean a(List<d> list, d dVar) {
        for (d dVar2 : list) {
            if (dVar2 != d.all) {
                if (dVar2 == dVar) {
                }
            }
            return true;
        }
        return false;
    }

    private static void c(c cVar) {
        int i = 0;
        while (!cVar.c()) {
            int intValue = cVar.h().intValue();
            if (intValue != 59 || i != 0) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0) {
                    i--;
                    if (i == 0) {
                        break;
                    }
                }
            } else {
                return;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x0062 in {9, 11, 14, 17, 19} preds:[]
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
    private static defpackage.apy.ad d(defpackage.apt.c r4) {
        /*
        r0 = new apy$ad;
        r0.<init>();
        r1 = r4.a();
        r4.d();
        r2 = 58;
        r2 = r4.a(r2);
        if (r2 == 0) goto L_0x005a;
        r4.d();
        r2 = r4.b();
        if (r2 == 0) goto L_0x005a;
        r4.d();
        r3 = 33;
        r3 = r4.a(r3);
        if (r3 == 0) goto L_0x003f;
        r4.d();
        r3 = "important";
        r3 = r4.a(r3);
        if (r3 == 0) goto L_0x0037;
        r4.d();
        goto L_0x003f;
        r4 = new org.xml.sax.SAXException;
        r0 = "Malformed rule set in <style> element: found unexpected '!'";
        r4.<init>(r0);
        throw r4;
        r3 = 59;
        r4.a(r3);
        defpackage.aqc.a(r0, r1, r2);
        r4.d();
        r1 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r1 = r4.a(r1);
        if (r1 == 0) goto L_0x0053;
        return r0;
        r1 = r4.c();
        if (r1 != 0) goto L_0x005a;
        goto L_0x0005;
        r4 = new org.xml.sax.SAXException;
        r0 = "Malformed rule set in <style> element";
        r4.<init>(r0);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apt.d(apt$c):apy$ad");
    }

    /* Access modifiers changed, original: final */
    public final f b(c cVar) {
        f fVar = new f();
        while (!cVar.c()) {
            if (!(cVar.a("<!--") || cVar.a("-->"))) {
                if (cVar.a('@')) {
                    String a = cVar.a();
                    cVar.d();
                    if (a != null) {
                        if (this.b || !a.equals("media")) {
                            Log.w("AndroidSVG CSSParser", String.format("Ignoring @%s rule", new Object[]{a}));
                            apt.c(cVar);
                        } else {
                            List a2 = apt.a(cVar);
                            if (cVar.a('{')) {
                                cVar.d();
                                if (apt.a(a2, this.a)) {
                                    this.b = true;
                                    fVar.a(b(cVar));
                                    this.b = false;
                                } else {
                                    b(cVar);
                                }
                                if (!cVar.a('}')) {
                                    throw new SAXException("Invalid @media rule: expected '}' at end of rule set");
                                }
                            }
                            throw new SAXException("Invalid @media rule: missing rule set");
                        }
                        cVar.d();
                    } else {
                        throw new SAXException("Invalid '@' rule in <style> element");
                    }
                } else if (!apt.a(fVar, cVar)) {
                    break;
                }
            }
        }
        return fVar;
    }
}

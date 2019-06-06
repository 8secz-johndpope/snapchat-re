package defpackage;

import android.database.Cursor;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: aw */
public final class aw {
    private String a;
    private Map<String, a> b;
    private Set<b> c;
    private Set<d> d;

    /* renamed from: aw$a */
    public static class a {
        private String a;
        private String b;
        private int c;
        private boolean d;
        private int e;

        public a(String str, String str2, boolean z, int i) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            int i2 = 5;
            if (str2 != null) {
                str2 = str2.toUpperCase(Locale.US);
                if (str2.contains("INT")) {
                    i2 = 3;
                } else if (str2.contains("CHAR") || str2.contains("CLOB") || str2.contains("TEXT")) {
                    i2 = 2;
                } else if (!str2.contains("BLOB")) {
                    i2 = (str2.contains("REAL") || str2.contains("FLOA") || str2.contains("DOUB")) ? 4 : 1;
                }
            }
            this.c = i2;
        }

        private boolean a() {
            return this.e > 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                if (VERSION.SDK_INT >= 20) {
                    if (this.e != aVar.e) {
                        return false;
                    }
                } else if (a() != aVar.a()) {
                    return false;
                }
                if (this.a.equals(aVar.a) && this.d == aVar.d && this.c == aVar.c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Column{name='");
            stringBuilder.append(this.a);
            stringBuilder.append('\'');
            stringBuilder.append(", type='");
            stringBuilder.append(this.b);
            stringBuilder.append('\'');
            stringBuilder.append(", affinity='");
            stringBuilder.append(this.c);
            stringBuilder.append('\'');
            stringBuilder.append(", notNull=");
            stringBuilder.append(this.d);
            stringBuilder.append(", primaryKeyPosition=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: aw$b */
    public static class b {
        private String a;
        private String b;
        private String c;
        private List<String> d;
        private List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) ? this.e.equals(bVar.e) : false;
        }

        public final int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ForeignKey{referenceTable='");
            stringBuilder.append(this.a);
            stringBuilder.append('\'');
            stringBuilder.append(", onDelete='");
            stringBuilder.append(this.b);
            stringBuilder.append('\'');
            stringBuilder.append(", onUpdate='");
            stringBuilder.append(this.c);
            stringBuilder.append('\'');
            stringBuilder.append(", columnNames=");
            stringBuilder.append(this.d);
            stringBuilder.append(", referenceColumnNames=");
            stringBuilder.append(this.e);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* renamed from: aw$c */
    static class c implements Comparable<c> {
        final int a;
        final String b;
        final String c;
        private int d;

        c(int i, int i2, String str, String str2) {
            this.a = i;
            this.d = i2;
            this.b = str;
            this.c = str2;
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            c cVar = (c) obj;
            int i = this.a - cVar.a;
            return i == 0 ? this.d - cVar.d : i;
        }
    }

    /* renamed from: aw$d */
    public static class d {
        private String a;
        private boolean b;
        private List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b != dVar.b || !this.c.equals(dVar.c)) {
                return false;
            }
            String str = "index_";
            return this.a.startsWith(str) ? dVar.a.startsWith(str) : this.a.equals(dVar.a);
        }

        public final int hashCode() {
            String str = "index_";
            return ((((this.a.startsWith(str) ? str.hashCode() : this.a.hashCode()) * 31) + this.b) * 31) + this.c.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Index{name='");
            stringBuilder.append(this.a);
            stringBuilder.append('\'');
            stringBuilder.append(", unique=");
            stringBuilder.append(this.b);
            stringBuilder.append(", columns=");
            stringBuilder.append(this.c);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public aw(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        this.d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x0075 in {6, 12, 15, 17, 20} preds:[]
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
    private static defpackage.aw.d a(defpackage.aa r6, java.lang.String r7, boolean r8) {
        /*
        r0 = new java.lang.StringBuilder;
        r1 = "PRAGMA index_xinfo(`";
        r0.<init>(r1);
        r0.append(r7);
        r1 = "`)";
        r0.append(r1);
        r0 = r0.toString();
        r6 = r6.query(r0);
        r0 = "seqno";	 Catch:{ all -> 0x0070 }
        r0 = r6.getColumnIndex(r0);	 Catch:{ all -> 0x0070 }
        r1 = "cid";	 Catch:{ all -> 0x0070 }
        r1 = r6.getColumnIndex(r1);	 Catch:{ all -> 0x0070 }
        r2 = "name";	 Catch:{ all -> 0x0070 }
        r2 = r6.getColumnIndex(r2);	 Catch:{ all -> 0x0070 }
        r3 = -1;	 Catch:{ all -> 0x0070 }
        if (r0 == r3) goto L_0x006b;	 Catch:{ all -> 0x0070 }
        if (r1 == r3) goto L_0x006b;	 Catch:{ all -> 0x0070 }
        if (r2 != r3) goto L_0x0031;	 Catch:{ all -> 0x0070 }
        goto L_0x006b;	 Catch:{ all -> 0x0070 }
        r3 = new java.util.TreeMap;	 Catch:{ all -> 0x0070 }
        r3.<init>();	 Catch:{ all -> 0x0070 }
        r4 = r6.moveToNext();	 Catch:{ all -> 0x0070 }
        if (r4 == 0) goto L_0x0052;	 Catch:{ all -> 0x0070 }
        r4 = r6.getInt(r1);	 Catch:{ all -> 0x0070 }
        if (r4 < 0) goto L_0x0036;	 Catch:{ all -> 0x0070 }
        r4 = r6.getInt(r0);	 Catch:{ all -> 0x0070 }
        r5 = r6.getString(r2);	 Catch:{ all -> 0x0070 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0070 }
        r3.put(r4, r5);	 Catch:{ all -> 0x0070 }
        goto L_0x0036;	 Catch:{ all -> 0x0070 }
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0070 }
        r1 = r3.size();	 Catch:{ all -> 0x0070 }
        r0.<init>(r1);	 Catch:{ all -> 0x0070 }
        r1 = r3.values();	 Catch:{ all -> 0x0070 }
        r0.addAll(r1);	 Catch:{ all -> 0x0070 }
        r1 = new aw$d;	 Catch:{ all -> 0x0070 }
        r1.<init>(r7, r8, r0);	 Catch:{ all -> 0x0070 }
        r6.close();
        return r1;
        r6.close();
        r6 = 0;
        return r6;
        r7 = move-exception;
        r6.close();
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw.a(aa, java.lang.String, boolean):aw$d");
    }

    public static aw a(aa aaVar, String str) {
        return new aw(str, aw.c(aaVar, str), aw.b(aaVar, str), aw.d(aaVar, str));
    }

    private static List<c> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x00a6 in {11, 12, 13, 15, 18} preds:[]
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
    private static java.util.Set<defpackage.aw.b> b(defpackage.aa r18, java.lang.String r19) {
        /*
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = new java.lang.StringBuilder;
        r2 = "PRAGMA foreign_key_list(`";
        r1.<init>(r2);
        r2 = r19;
        r1.append(r2);
        r2 = "`)";
        r1.append(r2);
        r1 = r1.toString();
        r2 = r18;
        r1 = r2.query(r1);
        r2 = "id";	 Catch:{ all -> 0x00a1 }
        r2 = r1.getColumnIndex(r2);	 Catch:{ all -> 0x00a1 }
        r3 = "seq";	 Catch:{ all -> 0x00a1 }
        r3 = r1.getColumnIndex(r3);	 Catch:{ all -> 0x00a1 }
        r4 = "table";	 Catch:{ all -> 0x00a1 }
        r4 = r1.getColumnIndex(r4);	 Catch:{ all -> 0x00a1 }
        r5 = "on_delete";	 Catch:{ all -> 0x00a1 }
        r5 = r1.getColumnIndex(r5);	 Catch:{ all -> 0x00a1 }
        r6 = "on_update";	 Catch:{ all -> 0x00a1 }
        r6 = r1.getColumnIndex(r6);	 Catch:{ all -> 0x00a1 }
        r7 = defpackage.aw.a(r1);	 Catch:{ all -> 0x00a1 }
        r8 = r1.getCount();	 Catch:{ all -> 0x00a1 }
        r9 = 0;	 Catch:{ all -> 0x00a1 }
        if (r9 >= r8) goto L_0x009d;	 Catch:{ all -> 0x00a1 }
        r1.moveToPosition(r9);	 Catch:{ all -> 0x00a1 }
        r10 = r1.getInt(r3);	 Catch:{ all -> 0x00a1 }
        if (r10 != 0) goto L_0x009a;	 Catch:{ all -> 0x00a1 }
        r10 = r1.getInt(r2);	 Catch:{ all -> 0x00a1 }
        r15 = new java.util.ArrayList;	 Catch:{ all -> 0x00a1 }
        r15.<init>();	 Catch:{ all -> 0x00a1 }
        r14 = new java.util.ArrayList;	 Catch:{ all -> 0x00a1 }
        r14.<init>();	 Catch:{ all -> 0x00a1 }
        r11 = r7.iterator();	 Catch:{ all -> 0x00a1 }
        r12 = r11.hasNext();	 Catch:{ all -> 0x00a1 }
        if (r12 == 0) goto L_0x007f;	 Catch:{ all -> 0x00a1 }
        r12 = r11.next();	 Catch:{ all -> 0x00a1 }
        r12 = (defpackage.aw.c) r12;	 Catch:{ all -> 0x00a1 }
        r13 = r12.a;	 Catch:{ all -> 0x00a1 }
        if (r13 != r10) goto L_0x0064;	 Catch:{ all -> 0x00a1 }
        r13 = r12.b;	 Catch:{ all -> 0x00a1 }
        r15.add(r13);	 Catch:{ all -> 0x00a1 }
        r12 = r12.c;	 Catch:{ all -> 0x00a1 }
        r14.add(r12);	 Catch:{ all -> 0x00a1 }
        goto L_0x0064;	 Catch:{ all -> 0x00a1 }
        r10 = new aw$b;	 Catch:{ all -> 0x00a1 }
        r12 = r1.getString(r4);	 Catch:{ all -> 0x00a1 }
        r13 = r1.getString(r5);	 Catch:{ all -> 0x00a1 }
        r16 = r1.getString(r6);	 Catch:{ all -> 0x00a1 }
        r11 = r10;	 Catch:{ all -> 0x00a1 }
        r17 = r14;	 Catch:{ all -> 0x00a1 }
        r14 = r16;	 Catch:{ all -> 0x00a1 }
        r16 = r17;	 Catch:{ all -> 0x00a1 }
        r11.<init>(r12, r13, r14, r15, r16);	 Catch:{ all -> 0x00a1 }
        r0.add(r10);	 Catch:{ all -> 0x00a1 }
        r9 = r9 + 1;
        goto L_0x0047;
        r1.close();
        return r0;
        r0 = move-exception;
        r1.close();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw.b(aa, java.lang.String):java.util.Set");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0067 in {9, 10, 12, 14, 17} preds:[]
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
    private static java.util.Map<java.lang.String, defpackage.aw.a> c(defpackage.aa r9, java.lang.String r10) {
        /*
        r0 = new java.lang.StringBuilder;
        r1 = "PRAGMA table_info(`";
        r0.<init>(r1);
        r0.append(r10);
        r10 = "`)";
        r0.append(r10);
        r10 = r0.toString();
        r9 = r9.query(r10);
        r10 = new java.util.HashMap;
        r10.<init>();
        r0 = r9.getColumnCount();	 Catch:{ all -> 0x0062 }
        if (r0 <= 0) goto L_0x005e;	 Catch:{ all -> 0x0062 }
        r0 = "name";	 Catch:{ all -> 0x0062 }
        r0 = r9.getColumnIndex(r0);	 Catch:{ all -> 0x0062 }
        r1 = "type";	 Catch:{ all -> 0x0062 }
        r1 = r9.getColumnIndex(r1);	 Catch:{ all -> 0x0062 }
        r2 = "notnull";	 Catch:{ all -> 0x0062 }
        r2 = r9.getColumnIndex(r2);	 Catch:{ all -> 0x0062 }
        r3 = "pk";	 Catch:{ all -> 0x0062 }
        r3 = r9.getColumnIndex(r3);	 Catch:{ all -> 0x0062 }
        r4 = r9.moveToNext();	 Catch:{ all -> 0x0062 }
        if (r4 == 0) goto L_0x005e;	 Catch:{ all -> 0x0062 }
        r4 = r9.getString(r0);	 Catch:{ all -> 0x0062 }
        r5 = r9.getString(r1);	 Catch:{ all -> 0x0062 }
        r6 = r9.getInt(r2);	 Catch:{ all -> 0x0062 }
        if (r6 == 0) goto L_0x0050;	 Catch:{ all -> 0x0062 }
        r6 = 1;	 Catch:{ all -> 0x0062 }
        goto L_0x0051;	 Catch:{ all -> 0x0062 }
        r6 = 0;	 Catch:{ all -> 0x0062 }
        r7 = r9.getInt(r3);	 Catch:{ all -> 0x0062 }
        r8 = new aw$a;	 Catch:{ all -> 0x0062 }
        r8.<init>(r4, r5, r6, r7);	 Catch:{ all -> 0x0062 }
        r10.put(r4, r8);	 Catch:{ all -> 0x0062 }
        goto L_0x003a;
        r9.close();
        return r10;
        r10 = move-exception;
        r9.close();
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw.c(aa, java.lang.String):java.util.Map");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:30:0x0071 in {6, 14, 15, 19, 22, 24, 26, 29} preds:[]
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
    private static java.util.Set<defpackage.aw.d> d(defpackage.aa r8, java.lang.String r9) {
        /*
        r0 = new java.lang.StringBuilder;
        r1 = "PRAGMA index_list(`";
        r0.<init>(r1);
        r0.append(r9);
        r9 = "`)";
        r0.append(r9);
        r9 = r0.toString();
        r9 = r8.query(r9);
        r0 = "name";	 Catch:{ all -> 0x006c }
        r0 = r9.getColumnIndex(r0);	 Catch:{ all -> 0x006c }
        r1 = "origin";	 Catch:{ all -> 0x006c }
        r1 = r9.getColumnIndex(r1);	 Catch:{ all -> 0x006c }
        r2 = "unique";	 Catch:{ all -> 0x006c }
        r2 = r9.getColumnIndex(r2);	 Catch:{ all -> 0x006c }
        r3 = 0;	 Catch:{ all -> 0x006c }
        r4 = -1;	 Catch:{ all -> 0x006c }
        if (r0 == r4) goto L_0x0068;	 Catch:{ all -> 0x006c }
        if (r1 == r4) goto L_0x0068;	 Catch:{ all -> 0x006c }
        if (r2 != r4) goto L_0x0032;	 Catch:{ all -> 0x006c }
        goto L_0x0068;	 Catch:{ all -> 0x006c }
        r4 = new java.util.HashSet;	 Catch:{ all -> 0x006c }
        r4.<init>();	 Catch:{ all -> 0x006c }
        r5 = r9.moveToNext();	 Catch:{ all -> 0x006c }
        if (r5 == 0) goto L_0x0064;	 Catch:{ all -> 0x006c }
        r5 = r9.getString(r1);	 Catch:{ all -> 0x006c }
        r6 = "c";	 Catch:{ all -> 0x006c }
        r5 = r6.equals(r5);	 Catch:{ all -> 0x006c }
        if (r5 == 0) goto L_0x0037;	 Catch:{ all -> 0x006c }
        r5 = r9.getString(r0);	 Catch:{ all -> 0x006c }
        r6 = r9.getInt(r2);	 Catch:{ all -> 0x006c }
        r7 = 1;	 Catch:{ all -> 0x006c }
        if (r6 != r7) goto L_0x0055;	 Catch:{ all -> 0x006c }
        goto L_0x0056;	 Catch:{ all -> 0x006c }
        r7 = 0;	 Catch:{ all -> 0x006c }
        r5 = defpackage.aw.a(r8, r5, r7);	 Catch:{ all -> 0x006c }
        if (r5 != 0) goto L_0x0060;
        r9.close();
        return r3;
        r4.add(r5);	 Catch:{ all -> 0x006c }
        goto L_0x0037;
        r9.close();
        return r4;
        r9.close();
        return r3;
        r8 = move-exception;
        r9.close();
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw.d(aa, java.lang.String):java.util.Set");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aw awVar = (aw) obj;
        String str = this.a;
        if (!str == null ? str.equals(awVar.a) : awVar.a == null) {
            return false;
        }
        Map map = this.b;
        if (!map == null ? map.equals(awVar.b) : awVar.b == null) {
            return false;
        }
        Set set = this.c;
        if (!set == null ? set.equals(awVar.c) : awVar.c == null) {
            return false;
        }
        Set set2 = this.d;
        if (set2 != null) {
            Set set3 = awVar.d;
            if (set3 != null) {
                return set2.equals(set3);
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.b;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TableInfo{name='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append(", columns=");
        stringBuilder.append(this.b);
        stringBuilder.append(", foreignKeys=");
        stringBuilder.append(this.c);
        stringBuilder.append(", indices=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

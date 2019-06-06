package defpackage;

import android.database.Cursor;
import defpackage.pv.a;

/* renamed from: rx */
public final class rx implements rw {
    private final ap a;
    private final am b;
    private final at c;
    private final at d;
    private final at e;
    private final at f;
    private final at g;
    private final at h;
    private final at i;
    private final at j;

    public rx(ap apVar) {
        this.a = apVar;
        this.b = new am<rv>(apVar) {
            public final String a() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public final /* synthetic */ void a(ae aeVar, Object obj) {
                int i;
                StringBuilder stringBuilder;
                ae aeVar2 = aeVar;
                rv rvVar = (rv) obj;
                if (rvVar.b == null) {
                    aeVar2.bindNull(1);
                } else {
                    aeVar2.bindString(1, rvVar.b);
                }
                int i2 = 2;
                aeVar2.bindLong(2, (long) sb.a(rvVar.c));
                if (rvVar.d == null) {
                    aeVar2.bindNull(3);
                } else {
                    aeVar2.bindString(3, rvVar.d);
                }
                if (rvVar.e == null) {
                    aeVar2.bindNull(4);
                } else {
                    aeVar2.bindString(4, rvVar.e);
                }
                byte[] a = po.a(rvVar.f);
                if (a == null) {
                    aeVar2.bindNull(5);
                } else {
                    aeVar2.bindBlob(5, a);
                }
                a = po.a(rvVar.g);
                if (a == null) {
                    aeVar2.bindNull(6);
                } else {
                    aeVar2.bindBlob(6, a);
                }
                aeVar2.bindLong(7, rvVar.h);
                aeVar2.bindLong(8, rvVar.i);
                aeVar2.bindLong(9, rvVar.j);
                aeVar2.bindLong(10, (long) rvVar.l);
                pk pkVar = rvVar.m;
                int i3 = defpackage.sb.1.b[pkVar.ordinal()];
                String str = " to int";
                String str2 = "Could not convert ";
                if (i3 == 1) {
                    i = 0;
                } else if (i3 == 2) {
                    i = 1;
                } else {
                    stringBuilder = new StringBuilder(str2);
                    stringBuilder.append(pkVar);
                    stringBuilder.append(str);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                aeVar2.bindLong(11, (long) i);
                aeVar2.bindLong(12, rvVar.n);
                aeVar2.bindLong(13, rvVar.o);
                aeVar2.bindLong(14, rvVar.p);
                aeVar2.bindLong(15, rvVar.q);
                pm pmVar = rvVar.k;
                if (pmVar != null) {
                    pr prVar = pmVar.b;
                    int i4 = defpackage.sb.1.c[prVar.ordinal()];
                    if (i4 == 1) {
                        i2 = 0;
                    } else if (i4 == 2) {
                        i2 = 1;
                    } else if (i4 != 3) {
                        if (i4 == 4) {
                            i2 = 3;
                        } else if (i4 == 5) {
                            i2 = 4;
                        } else {
                            stringBuilder = new StringBuilder(str2);
                            stringBuilder.append(prVar);
                            stringBuilder.append(str);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    aeVar2.bindLong(16, (long) i2);
                    aeVar2.bindLong(17, (long) pmVar.c);
                    aeVar2.bindLong(18, (long) pmVar.d);
                    aeVar2.bindLong(19, (long) pmVar.e);
                    aeVar2.bindLong(20, (long) pmVar.f);
                    aeVar2.bindLong(21, pmVar.g);
                    aeVar2.bindLong(22, pmVar.h);
                    byte[] a2 = sb.a(pmVar.i);
                    if (a2 == null) {
                        aeVar2.bindNull(23);
                        return;
                    } else {
                        aeVar2.bindBlob(23, a2);
                        return;
                    }
                }
                aeVar2.bindNull(16);
                aeVar2.bindNull(17);
                aeVar2.bindNull(18);
                aeVar2.bindNull(19);
                aeVar2.bindNull(20);
                aeVar2.bindNull(21);
                aeVar2.bindNull(22);
                aeVar2.bindNull(23);
            }
        };
        this.c = new at(apVar) {
            public final String a() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.d = new at(apVar) {
            public final String a() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.e = new at(apVar) {
            public final String a() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f = new at(apVar) {
            public final String a() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.g = new at(apVar) {
            public final String a() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.h = new at(apVar) {
            public final String a() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.i = new at(apVar) {
            public final String a() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.j = new at(apVar) {
            public final String a() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x005d in {4, 5, 6, 11, 14} preds:[]
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
    public final int a(defpackage.pv.a r5, java.lang.String... r6) {
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "UPDATE workspec SET state=";
        r0.append(r1);
        r1 = "?";
        r0.append(r1);
        r1 = " WHERE id IN (";
        r0.append(r1);
        r1 = 1;
        defpackage.av.a(r0, r1);
        r2 = ")";
        r0.append(r2);
        r0 = r0.toString();
        r2 = r4.a;
        r0 = r2.a(r0);
        r5 = defpackage.sb.a(r5);
        r2 = (long) r5;
        r0.bindLong(r1, r2);
        r5 = 0;
        r1 = 0;
        if (r1 > 0) goto L_0x0042;
        r2 = r6[r5];
        r3 = 2;
        if (r2 != 0) goto L_0x003c;
        r0.bindNull(r3);
        goto L_0x003f;
        r0.bindString(r3, r2);
        r1 = r1 + 1;
        goto L_0x0031;
        r5 = r4.a;
        r5.c();
        r5 = r0.executeUpdateDelete();	 Catch:{ all -> 0x0056 }
        r6 = r4.a;	 Catch:{ all -> 0x0056 }
        r6.e();	 Catch:{ all -> 0x0056 }
        r6 = r4.a;
        r6.d();
        return r5;
        r5 = move-exception;
        r6 = r4.a;
        r6.d();
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.a(pv$a, java.lang.String[]):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0033 in {6, 8, 11} preds:[]
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
    public final java.util.List<java.lang.String> a() {
        /*
        r5 = this;
        r0 = 0;
        r1 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)";
        r1 = defpackage.as.a(r1, r0);
        r2 = r5.a;
        r2 = r2.a(r1);
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x002b }
        r4 = r2.getCount();	 Catch:{ all -> 0x002b }
        r3.<init>(r4);	 Catch:{ all -> 0x002b }
        r4 = r2.moveToNext();	 Catch:{ all -> 0x002b }
        if (r4 == 0) goto L_0x0024;	 Catch:{ all -> 0x002b }
        r4 = r2.getString(r0);	 Catch:{ all -> 0x002b }
        r3.add(r4);	 Catch:{ all -> 0x002b }
        goto L_0x0016;
        r2.close();
        r1.a();
        return r3;
        r0 = move-exception;
        r2.close();
        r1.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.a():java.util.List");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x01e1 in {10, 11, 14, 15, 18, 19, 22, 23, 25, 27, 29, 31, 33} preds:[]
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
    public final java.util.List<defpackage.rv> a(int r32) {
        /*
        r31 = this;
        r0 = 1;
        r1 = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))";
        r1 = defpackage.as.a(r1, r0);
        r2 = r32;
        r2 = (long) r2;
        r1.bindLong(r0, r2);
        r2 = r31;
        r3 = r2.a;
        r3 = r3.a(r1);
        r4 = "id";	 Catch:{ all -> 0x01d7 }
        r4 = r3.getColumnIndexOrThrow(r4);	 Catch:{ all -> 0x01d7 }
        r5 = "state";	 Catch:{ all -> 0x01d7 }
        r5 = r3.getColumnIndexOrThrow(r5);	 Catch:{ all -> 0x01d7 }
        r6 = "worker_class_name";	 Catch:{ all -> 0x01d7 }
        r6 = r3.getColumnIndexOrThrow(r6);	 Catch:{ all -> 0x01d7 }
        r7 = "input_merger_class_name";	 Catch:{ all -> 0x01d7 }
        r7 = r3.getColumnIndexOrThrow(r7);	 Catch:{ all -> 0x01d7 }
        r8 = "input";	 Catch:{ all -> 0x01d7 }
        r8 = r3.getColumnIndexOrThrow(r8);	 Catch:{ all -> 0x01d7 }
        r9 = "output";	 Catch:{ all -> 0x01d7 }
        r9 = r3.getColumnIndexOrThrow(r9);	 Catch:{ all -> 0x01d7 }
        r10 = "initial_delay";	 Catch:{ all -> 0x01d7 }
        r10 = r3.getColumnIndexOrThrow(r10);	 Catch:{ all -> 0x01d7 }
        r11 = "interval_duration";	 Catch:{ all -> 0x01d7 }
        r11 = r3.getColumnIndexOrThrow(r11);	 Catch:{ all -> 0x01d7 }
        r12 = "flex_duration";	 Catch:{ all -> 0x01d7 }
        r12 = r3.getColumnIndexOrThrow(r12);	 Catch:{ all -> 0x01d7 }
        r13 = "run_attempt_count";	 Catch:{ all -> 0x01d7 }
        r13 = r3.getColumnIndexOrThrow(r13);	 Catch:{ all -> 0x01d7 }
        r14 = "backoff_policy";	 Catch:{ all -> 0x01d7 }
        r14 = r3.getColumnIndexOrThrow(r14);	 Catch:{ all -> 0x01d7 }
        r15 = "backoff_delay_duration";	 Catch:{ all -> 0x01d7 }
        r15 = r3.getColumnIndexOrThrow(r15);	 Catch:{ all -> 0x01d7 }
        r0 = "period_start_time";	 Catch:{ all -> 0x01d7 }
        r0 = r3.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x01d7 }
        r2 = "minimum_retention_duration";	 Catch:{ all -> 0x01d7 }
        r2 = r3.getColumnIndexOrThrow(r2);	 Catch:{ all -> 0x01d7 }
        r16 = r1;
        r1 = "schedule_requested_at";	 Catch:{ all -> 0x01d5 }
        r1 = r3.getColumnIndexOrThrow(r1);	 Catch:{ all -> 0x01d5 }
        r32 = r1;	 Catch:{ all -> 0x01d5 }
        r1 = "required_network_type";	 Catch:{ all -> 0x01d5 }
        r1 = r3.getColumnIndexOrThrow(r1);	 Catch:{ all -> 0x01d5 }
        r17 = r2;	 Catch:{ all -> 0x01d5 }
        r2 = "requires_charging";	 Catch:{ all -> 0x01d5 }
        r2 = r3.getColumnIndexOrThrow(r2);	 Catch:{ all -> 0x01d5 }
        r18 = r0;	 Catch:{ all -> 0x01d5 }
        r0 = "requires_device_idle";	 Catch:{ all -> 0x01d5 }
        r0 = r3.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x01d5 }
        r19 = r15;	 Catch:{ all -> 0x01d5 }
        r15 = "requires_battery_not_low";	 Catch:{ all -> 0x01d5 }
        r15 = r3.getColumnIndexOrThrow(r15);	 Catch:{ all -> 0x01d5 }
        r20 = r14;	 Catch:{ all -> 0x01d5 }
        r14 = "requires_storage_not_low";	 Catch:{ all -> 0x01d5 }
        r14 = r3.getColumnIndexOrThrow(r14);	 Catch:{ all -> 0x01d5 }
        r21 = r13;	 Catch:{ all -> 0x01d5 }
        r13 = "trigger_content_update_delay";	 Catch:{ all -> 0x01d5 }
        r13 = r3.getColumnIndexOrThrow(r13);	 Catch:{ all -> 0x01d5 }
        r22 = r12;	 Catch:{ all -> 0x01d5 }
        r12 = "trigger_max_content_delay";	 Catch:{ all -> 0x01d5 }
        r12 = r3.getColumnIndexOrThrow(r12);	 Catch:{ all -> 0x01d5 }
        r23 = r11;	 Catch:{ all -> 0x01d5 }
        r11 = "content_uri_triggers";	 Catch:{ all -> 0x01d5 }
        r11 = r3.getColumnIndexOrThrow(r11);	 Catch:{ all -> 0x01d5 }
        r24 = r10;	 Catch:{ all -> 0x01d5 }
        r10 = new java.util.ArrayList;	 Catch:{ all -> 0x01d5 }
        r25 = r9;	 Catch:{ all -> 0x01d5 }
        r9 = r3.getCount();	 Catch:{ all -> 0x01d5 }
        r10.<init>(r9);	 Catch:{ all -> 0x01d5 }
        r9 = r3.moveToNext();	 Catch:{ all -> 0x01d5 }
        if (r9 == 0) goto L_0x01ce;	 Catch:{ all -> 0x01d5 }
        r9 = r3.getString(r4);	 Catch:{ all -> 0x01d5 }
        r26 = r4;	 Catch:{ all -> 0x01d5 }
        r4 = r3.getString(r6);	 Catch:{ all -> 0x01d5 }
        r27 = r6;	 Catch:{ all -> 0x01d5 }
        r6 = new pm;	 Catch:{ all -> 0x01d5 }
        r6.<init>();	 Catch:{ all -> 0x01d5 }
        r28 = r3.getInt(r1);	 Catch:{ all -> 0x01d5 }
        r29 = r1;	 Catch:{ all -> 0x01d5 }
        r1 = defpackage.sb.c(r28);	 Catch:{ all -> 0x01d5 }
        r6.b = r1;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getInt(r2);	 Catch:{ all -> 0x01d5 }
        r28 = 0;	 Catch:{ all -> 0x01d5 }
        if (r1 == 0) goto L_0x00eb;	 Catch:{ all -> 0x01d5 }
        r1 = 1;	 Catch:{ all -> 0x01d5 }
        goto L_0x00ec;	 Catch:{ all -> 0x01d5 }
        r1 = 0;	 Catch:{ all -> 0x01d5 }
        r6.c = r1;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getInt(r0);	 Catch:{ all -> 0x01d5 }
        if (r1 == 0) goto L_0x00f6;	 Catch:{ all -> 0x01d5 }
        r1 = 1;	 Catch:{ all -> 0x01d5 }
        goto L_0x00f7;	 Catch:{ all -> 0x01d5 }
        r1 = 0;	 Catch:{ all -> 0x01d5 }
        r6.d = r1;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getInt(r15);	 Catch:{ all -> 0x01d5 }
        if (r1 == 0) goto L_0x0101;	 Catch:{ all -> 0x01d5 }
        r1 = 1;	 Catch:{ all -> 0x01d5 }
        goto L_0x0102;	 Catch:{ all -> 0x01d5 }
        r1 = 0;	 Catch:{ all -> 0x01d5 }
        r6.e = r1;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getInt(r14);	 Catch:{ all -> 0x01d5 }
        if (r1 == 0) goto L_0x010c;	 Catch:{ all -> 0x01d5 }
        r1 = 1;	 Catch:{ all -> 0x01d5 }
        goto L_0x010d;	 Catch:{ all -> 0x01d5 }
        r1 = 0;	 Catch:{ all -> 0x01d5 }
        r6.f = r1;	 Catch:{ all -> 0x01d5 }
        r28 = r0;	 Catch:{ all -> 0x01d5 }
        r0 = r3.getLong(r13);	 Catch:{ all -> 0x01d5 }
        r6.g = r0;	 Catch:{ all -> 0x01d5 }
        r0 = r3.getLong(r12);	 Catch:{ all -> 0x01d5 }
        r6.h = r0;	 Catch:{ all -> 0x01d5 }
        r0 = r3.getBlob(r11);	 Catch:{ all -> 0x01d5 }
        r0 = defpackage.sb.a(r0);	 Catch:{ all -> 0x01d5 }
        r6.i = r0;	 Catch:{ all -> 0x01d5 }
        r0 = new rv;	 Catch:{ all -> 0x01d5 }
        r0.<init>(r9, r4);	 Catch:{ all -> 0x01d5 }
        r1 = r3.getInt(r5);	 Catch:{ all -> 0x01d5 }
        r1 = defpackage.sb.a(r1);	 Catch:{ all -> 0x01d5 }
        r0.c = r1;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getString(r7);	 Catch:{ all -> 0x01d5 }
        r0.e = r1;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getBlob(r8);	 Catch:{ all -> 0x01d5 }
        r1 = defpackage.po.a(r1);	 Catch:{ all -> 0x01d5 }
        r0.f = r1;	 Catch:{ all -> 0x01d5 }
        r1 = r25;	 Catch:{ all -> 0x01d5 }
        r4 = r3.getBlob(r1);	 Catch:{ all -> 0x01d5 }
        r4 = defpackage.po.a(r4);	 Catch:{ all -> 0x01d5 }
        r0.g = r4;	 Catch:{ all -> 0x01d5 }
        r25 = r1;	 Catch:{ all -> 0x01d5 }
        r9 = r2;	 Catch:{ all -> 0x01d5 }
        r4 = r24;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01d5 }
        r0.h = r1;	 Catch:{ all -> 0x01d5 }
        r24 = r4;	 Catch:{ all -> 0x01d5 }
        r2 = r5;	 Catch:{ all -> 0x01d5 }
        r1 = r23;	 Catch:{ all -> 0x01d5 }
        r4 = r3.getLong(r1);	 Catch:{ all -> 0x01d5 }
        r0.i = r4;	 Catch:{ all -> 0x01d5 }
        r23 = r1;	 Catch:{ all -> 0x01d5 }
        r5 = r2;	 Catch:{ all -> 0x01d5 }
        r4 = r22;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01d5 }
        r0.j = r1;	 Catch:{ all -> 0x01d5 }
        r1 = r21;	 Catch:{ all -> 0x01d5 }
        r2 = r3.getInt(r1);	 Catch:{ all -> 0x01d5 }
        r0.l = r2;	 Catch:{ all -> 0x01d5 }
        r2 = r20;	 Catch:{ all -> 0x01d5 }
        r20 = r3.getInt(r2);	 Catch:{ all -> 0x01d5 }
        r21 = r1;	 Catch:{ all -> 0x01d5 }
        r1 = defpackage.sb.b(r20);	 Catch:{ all -> 0x01d5 }
        r0.m = r1;	 Catch:{ all -> 0x01d5 }
        r22 = r4;	 Catch:{ all -> 0x01d5 }
        r1 = r19;	 Catch:{ all -> 0x01d5 }
        r19 = r5;	 Catch:{ all -> 0x01d5 }
        r4 = r3.getLong(r1);	 Catch:{ all -> 0x01d5 }
        r0.n = r4;	 Catch:{ all -> 0x01d5 }
        r5 = r1;	 Catch:{ all -> 0x01d5 }
        r20 = r2;	 Catch:{ all -> 0x01d5 }
        r4 = r18;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01d5 }
        r0.o = r1;	 Catch:{ all -> 0x01d5 }
        r18 = r4;	 Catch:{ all -> 0x01d5 }
        r2 = r5;	 Catch:{ all -> 0x01d5 }
        r1 = r17;	 Catch:{ all -> 0x01d5 }
        r4 = r3.getLong(r1);	 Catch:{ all -> 0x01d5 }
        r0.p = r4;	 Catch:{ all -> 0x01d5 }
        r4 = r32;	 Catch:{ all -> 0x01d5 }
        r17 = r1;	 Catch:{ all -> 0x01d5 }
        r5 = r2;	 Catch:{ all -> 0x01d5 }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01d5 }
        r0.q = r1;	 Catch:{ all -> 0x01d5 }
        r0.k = r6;	 Catch:{ all -> 0x01d5 }
        r10.add(r0);	 Catch:{ all -> 0x01d5 }
        r32 = r4;
        r2 = r9;
        r4 = r26;
        r6 = r27;
        r0 = r28;
        r1 = r29;
        r30 = r19;
        r19 = r5;
        r5 = r30;
        goto L_0x00be;
        r3.close();
        r16.a();
        return r10;
        r0 = move-exception;
        goto L_0x01da;
        r0 = move-exception;
        r16 = r1;
        r3.close();
        r16.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.a(int):java.util.List");
    }

    public final void a(String str) {
        ae b = this.c.b();
        this.a.c();
        if (str == null) {
            try {
                b.bindNull(1);
            } catch (Throwable th) {
                this.a.d();
                this.c.a(b);
            }
        } else {
            b.bindString(1, str);
        }
        b.executeUpdateDelete();
        this.a.e();
        this.a.d();
        this.c.a(b);
    }

    public final void a(String str, long j) {
        ae b = this.e.b();
        this.a.c();
        try {
            b.bindLong(1, j);
            if (str == null) {
                b.bindNull(2);
            } else {
                b.bindString(2, str);
            }
            b.executeUpdateDelete();
            this.a.e();
        } finally {
            this.a.d();
            this.e.a(b);
        }
    }

    public final void a(String str, po poVar) {
        ae b = this.d.b();
        this.a.c();
        try {
            byte[] a = po.a(poVar);
            if (a == null) {
                b.bindNull(1);
            } else {
                b.bindBlob(1, a);
            }
            if (str == null) {
                b.bindNull(2);
            } else {
                b.bindString(2, str);
            }
            b.executeUpdateDelete();
            this.a.e();
        } finally {
            this.a.d();
            this.d.a(b);
        }
    }

    public final void a(rv rvVar) {
        this.a.c();
        try {
            this.b.a(rvVar);
            this.a.e();
        } finally {
            this.a.d();
        }
    }

    public final int b() {
        ae b = this.i.b();
        this.a.c();
        try {
            int executeUpdateDelete = b.executeUpdateDelete();
            this.a.e();
            return executeUpdateDelete;
        } finally {
            this.a.d();
            this.i.a(b);
        }
    }

    public final int b(String str, long j) {
        ae b = this.h.b();
        this.a.c();
        try {
            b.bindLong(1, j);
            if (str == null) {
                b.bindNull(2);
            } else {
                b.bindString(2, str);
            }
            int executeUpdateDelete = b.executeUpdateDelete();
            this.a.e();
            return executeUpdateDelete;
        } finally {
            this.a.d();
            this.h.a(b);
        }
    }

    public final rv b(String str) {
        Throwable th;
        String str2 = str;
        ad a = as.a("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str2);
        }
        Cursor a2 = this.a.a(a);
        as asVar;
        try {
            int columnIndexOrThrow = a2.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a2.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a2.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a2.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a2.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a2.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a2.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a2.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a2.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a2.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a2.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a2.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a2.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a2.getColumnIndexOrThrow("minimum_retention_duration");
            asVar = a;
            try {
                rv rvVar;
                int columnIndexOrThrow15 = a2.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a2.getColumnIndexOrThrow("required_network_type");
                int i = columnIndexOrThrow14;
                columnIndexOrThrow14 = a2.getColumnIndexOrThrow("requires_charging");
                int i2 = columnIndexOrThrow13;
                columnIndexOrThrow13 = a2.getColumnIndexOrThrow("requires_device_idle");
                int i3 = columnIndexOrThrow12;
                columnIndexOrThrow12 = a2.getColumnIndexOrThrow("requires_battery_not_low");
                int i4 = columnIndexOrThrow11;
                columnIndexOrThrow11 = a2.getColumnIndexOrThrow("requires_storage_not_low");
                int i5 = columnIndexOrThrow10;
                columnIndexOrThrow10 = a2.getColumnIndexOrThrow("trigger_content_update_delay");
                int i6 = columnIndexOrThrow9;
                columnIndexOrThrow9 = a2.getColumnIndexOrThrow("trigger_max_content_delay");
                int i7 = columnIndexOrThrow8;
                columnIndexOrThrow8 = a2.getColumnIndexOrThrow("content_uri_triggers");
                if (a2.moveToFirst()) {
                    str2 = a2.getString(columnIndexOrThrow);
                    String string = a2.getString(columnIndexOrThrow3);
                    int i8 = columnIndexOrThrow7;
                    pm pmVar = new pm();
                    pmVar.b = sb.c(a2.getInt(columnIndexOrThrow16));
                    columnIndexOrThrow16 = a2.getInt(columnIndexOrThrow14);
                    boolean z = false;
                    pmVar.c = columnIndexOrThrow16 != 0;
                    pmVar.d = a2.getInt(columnIndexOrThrow13) != 0;
                    pmVar.e = a2.getInt(columnIndexOrThrow12) != 0;
                    if (a2.getInt(columnIndexOrThrow11) != 0) {
                        z = true;
                    }
                    pmVar.f = z;
                    pmVar.g = a2.getLong(columnIndexOrThrow10);
                    pmVar.h = a2.getLong(columnIndexOrThrow9);
                    pmVar.i = sb.a(a2.getBlob(columnIndexOrThrow8));
                    rvVar = new rv(str2, string);
                    rvVar.c = sb.a(a2.getInt(columnIndexOrThrow2));
                    rvVar.e = a2.getString(columnIndexOrThrow4);
                    rvVar.f = po.a(a2.getBlob(columnIndexOrThrow5));
                    rvVar.g = po.a(a2.getBlob(columnIndexOrThrow6));
                    rvVar.h = a2.getLong(i8);
                    rvVar.i = a2.getLong(i7);
                    rvVar.j = a2.getLong(i6);
                    rvVar.l = a2.getInt(i5);
                    rvVar.m = sb.b(a2.getInt(i4));
                    rvVar.n = a2.getLong(i3);
                    rvVar.o = a2.getLong(i2);
                    rvVar.p = a2.getLong(i);
                    rvVar.q = a2.getLong(columnIndexOrThrow15);
                    rvVar.k = pmVar;
                } else {
                    rvVar = null;
                }
                a2.close();
                asVar.a();
                return rvVar;
            } catch (Throwable th2) {
                th = th2;
                a2.close();
                asVar.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            asVar = a;
            a2.close();
            asVar.a();
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x01db in {10, 11, 14, 15, 18, 19, 22, 23, 25, 27, 29, 31, 33} preds:[]
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
    public final java.util.List<defpackage.rv> c() {
        /*
        r32 = this;
        r0 = 0;
        r1 = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        r1 = defpackage.as.a(r1, r0);
        r2 = r32;
        r3 = r2.a;
        r3 = r3.a(r1);
        r4 = "id";	 Catch:{ all -> 0x01d1 }
        r4 = r3.getColumnIndexOrThrow(r4);	 Catch:{ all -> 0x01d1 }
        r5 = "state";	 Catch:{ all -> 0x01d1 }
        r5 = r3.getColumnIndexOrThrow(r5);	 Catch:{ all -> 0x01d1 }
        r6 = "worker_class_name";	 Catch:{ all -> 0x01d1 }
        r6 = r3.getColumnIndexOrThrow(r6);	 Catch:{ all -> 0x01d1 }
        r7 = "input_merger_class_name";	 Catch:{ all -> 0x01d1 }
        r7 = r3.getColumnIndexOrThrow(r7);	 Catch:{ all -> 0x01d1 }
        r8 = "input";	 Catch:{ all -> 0x01d1 }
        r8 = r3.getColumnIndexOrThrow(r8);	 Catch:{ all -> 0x01d1 }
        r9 = "output";	 Catch:{ all -> 0x01d1 }
        r9 = r3.getColumnIndexOrThrow(r9);	 Catch:{ all -> 0x01d1 }
        r10 = "initial_delay";	 Catch:{ all -> 0x01d1 }
        r10 = r3.getColumnIndexOrThrow(r10);	 Catch:{ all -> 0x01d1 }
        r11 = "interval_duration";	 Catch:{ all -> 0x01d1 }
        r11 = r3.getColumnIndexOrThrow(r11);	 Catch:{ all -> 0x01d1 }
        r12 = "flex_duration";	 Catch:{ all -> 0x01d1 }
        r12 = r3.getColumnIndexOrThrow(r12);	 Catch:{ all -> 0x01d1 }
        r13 = "run_attempt_count";	 Catch:{ all -> 0x01d1 }
        r13 = r3.getColumnIndexOrThrow(r13);	 Catch:{ all -> 0x01d1 }
        r14 = "backoff_policy";	 Catch:{ all -> 0x01d1 }
        r14 = r3.getColumnIndexOrThrow(r14);	 Catch:{ all -> 0x01d1 }
        r15 = "backoff_delay_duration";	 Catch:{ all -> 0x01d1 }
        r15 = r3.getColumnIndexOrThrow(r15);	 Catch:{ all -> 0x01d1 }
        r0 = "period_start_time";	 Catch:{ all -> 0x01d1 }
        r0 = r3.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x01d1 }
        r2 = "minimum_retention_duration";	 Catch:{ all -> 0x01d1 }
        r2 = r3.getColumnIndexOrThrow(r2);	 Catch:{ all -> 0x01d1 }
        r16 = r1;
        r1 = "schedule_requested_at";	 Catch:{ all -> 0x01cf }
        r1 = r3.getColumnIndexOrThrow(r1);	 Catch:{ all -> 0x01cf }
        r17 = r1;	 Catch:{ all -> 0x01cf }
        r1 = "required_network_type";	 Catch:{ all -> 0x01cf }
        r1 = r3.getColumnIndexOrThrow(r1);	 Catch:{ all -> 0x01cf }
        r18 = r2;	 Catch:{ all -> 0x01cf }
        r2 = "requires_charging";	 Catch:{ all -> 0x01cf }
        r2 = r3.getColumnIndexOrThrow(r2);	 Catch:{ all -> 0x01cf }
        r19 = r0;	 Catch:{ all -> 0x01cf }
        r0 = "requires_device_idle";	 Catch:{ all -> 0x01cf }
        r0 = r3.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x01cf }
        r20 = r15;	 Catch:{ all -> 0x01cf }
        r15 = "requires_battery_not_low";	 Catch:{ all -> 0x01cf }
        r15 = r3.getColumnIndexOrThrow(r15);	 Catch:{ all -> 0x01cf }
        r21 = r14;	 Catch:{ all -> 0x01cf }
        r14 = "requires_storage_not_low";	 Catch:{ all -> 0x01cf }
        r14 = r3.getColumnIndexOrThrow(r14);	 Catch:{ all -> 0x01cf }
        r22 = r13;	 Catch:{ all -> 0x01cf }
        r13 = "trigger_content_update_delay";	 Catch:{ all -> 0x01cf }
        r13 = r3.getColumnIndexOrThrow(r13);	 Catch:{ all -> 0x01cf }
        r23 = r12;	 Catch:{ all -> 0x01cf }
        r12 = "trigger_max_content_delay";	 Catch:{ all -> 0x01cf }
        r12 = r3.getColumnIndexOrThrow(r12);	 Catch:{ all -> 0x01cf }
        r24 = r11;	 Catch:{ all -> 0x01cf }
        r11 = "content_uri_triggers";	 Catch:{ all -> 0x01cf }
        r11 = r3.getColumnIndexOrThrow(r11);	 Catch:{ all -> 0x01cf }
        r25 = r10;	 Catch:{ all -> 0x01cf }
        r10 = new java.util.ArrayList;	 Catch:{ all -> 0x01cf }
        r26 = r9;	 Catch:{ all -> 0x01cf }
        r9 = r3.getCount();	 Catch:{ all -> 0x01cf }
        r10.<init>(r9);	 Catch:{ all -> 0x01cf }
        r9 = r3.moveToNext();	 Catch:{ all -> 0x01cf }
        if (r9 == 0) goto L_0x01c8;	 Catch:{ all -> 0x01cf }
        r9 = r3.getString(r4);	 Catch:{ all -> 0x01cf }
        r27 = r4;	 Catch:{ all -> 0x01cf }
        r4 = r3.getString(r6);	 Catch:{ all -> 0x01cf }
        r28 = r6;	 Catch:{ all -> 0x01cf }
        r6 = new pm;	 Catch:{ all -> 0x01cf }
        r6.<init>();	 Catch:{ all -> 0x01cf }
        r29 = r3.getInt(r1);	 Catch:{ all -> 0x01cf }
        r30 = r1;	 Catch:{ all -> 0x01cf }
        r1 = defpackage.sb.c(r29);	 Catch:{ all -> 0x01cf }
        r6.b = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r2);	 Catch:{ all -> 0x01cf }
        r29 = 1;	 Catch:{ all -> 0x01cf }
        if (r1 == 0) goto L_0x00e5;	 Catch:{ all -> 0x01cf }
        r1 = 1;	 Catch:{ all -> 0x01cf }
        goto L_0x00e6;	 Catch:{ all -> 0x01cf }
        r1 = 0;	 Catch:{ all -> 0x01cf }
        r6.c = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r0);	 Catch:{ all -> 0x01cf }
        if (r1 == 0) goto L_0x00f0;	 Catch:{ all -> 0x01cf }
        r1 = 1;	 Catch:{ all -> 0x01cf }
        goto L_0x00f1;	 Catch:{ all -> 0x01cf }
        r1 = 0;	 Catch:{ all -> 0x01cf }
        r6.d = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r15);	 Catch:{ all -> 0x01cf }
        if (r1 == 0) goto L_0x00fb;	 Catch:{ all -> 0x01cf }
        r1 = 1;	 Catch:{ all -> 0x01cf }
        goto L_0x00fc;	 Catch:{ all -> 0x01cf }
        r1 = 0;	 Catch:{ all -> 0x01cf }
        r6.e = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r14);	 Catch:{ all -> 0x01cf }
        if (r1 == 0) goto L_0x0106;	 Catch:{ all -> 0x01cf }
        r1 = 1;	 Catch:{ all -> 0x01cf }
        goto L_0x0107;	 Catch:{ all -> 0x01cf }
        r1 = 0;	 Catch:{ all -> 0x01cf }
        r6.f = r1;	 Catch:{ all -> 0x01cf }
        r29 = r0;	 Catch:{ all -> 0x01cf }
        r0 = r3.getLong(r13);	 Catch:{ all -> 0x01cf }
        r6.g = r0;	 Catch:{ all -> 0x01cf }
        r0 = r3.getLong(r12);	 Catch:{ all -> 0x01cf }
        r6.h = r0;	 Catch:{ all -> 0x01cf }
        r0 = r3.getBlob(r11);	 Catch:{ all -> 0x01cf }
        r0 = defpackage.sb.a(r0);	 Catch:{ all -> 0x01cf }
        r6.i = r0;	 Catch:{ all -> 0x01cf }
        r0 = new rv;	 Catch:{ all -> 0x01cf }
        r0.<init>(r9, r4);	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r5);	 Catch:{ all -> 0x01cf }
        r1 = defpackage.sb.a(r1);	 Catch:{ all -> 0x01cf }
        r0.c = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getString(r7);	 Catch:{ all -> 0x01cf }
        r0.e = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getBlob(r8);	 Catch:{ all -> 0x01cf }
        r1 = defpackage.po.a(r1);	 Catch:{ all -> 0x01cf }
        r0.f = r1;	 Catch:{ all -> 0x01cf }
        r1 = r26;	 Catch:{ all -> 0x01cf }
        r4 = r3.getBlob(r1);	 Catch:{ all -> 0x01cf }
        r4 = defpackage.po.a(r4);	 Catch:{ all -> 0x01cf }
        r0.g = r4;	 Catch:{ all -> 0x01cf }
        r26 = r1;	 Catch:{ all -> 0x01cf }
        r9 = r2;	 Catch:{ all -> 0x01cf }
        r4 = r25;	 Catch:{ all -> 0x01cf }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01cf }
        r0.h = r1;	 Catch:{ all -> 0x01cf }
        r25 = r4;	 Catch:{ all -> 0x01cf }
        r2 = r5;	 Catch:{ all -> 0x01cf }
        r1 = r24;	 Catch:{ all -> 0x01cf }
        r4 = r3.getLong(r1);	 Catch:{ all -> 0x01cf }
        r0.i = r4;	 Catch:{ all -> 0x01cf }
        r24 = r1;	 Catch:{ all -> 0x01cf }
        r5 = r2;	 Catch:{ all -> 0x01cf }
        r4 = r23;	 Catch:{ all -> 0x01cf }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01cf }
        r0.j = r1;	 Catch:{ all -> 0x01cf }
        r1 = r22;	 Catch:{ all -> 0x01cf }
        r2 = r3.getInt(r1);	 Catch:{ all -> 0x01cf }
        r0.l = r2;	 Catch:{ all -> 0x01cf }
        r2 = r21;	 Catch:{ all -> 0x01cf }
        r21 = r3.getInt(r2);	 Catch:{ all -> 0x01cf }
        r22 = r1;	 Catch:{ all -> 0x01cf }
        r1 = defpackage.sb.b(r21);	 Catch:{ all -> 0x01cf }
        r0.m = r1;	 Catch:{ all -> 0x01cf }
        r23 = r4;	 Catch:{ all -> 0x01cf }
        r1 = r20;	 Catch:{ all -> 0x01cf }
        r20 = r5;	 Catch:{ all -> 0x01cf }
        r4 = r3.getLong(r1);	 Catch:{ all -> 0x01cf }
        r0.n = r4;	 Catch:{ all -> 0x01cf }
        r5 = r1;	 Catch:{ all -> 0x01cf }
        r21 = r2;	 Catch:{ all -> 0x01cf }
        r4 = r19;	 Catch:{ all -> 0x01cf }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01cf }
        r0.o = r1;	 Catch:{ all -> 0x01cf }
        r19 = r4;	 Catch:{ all -> 0x01cf }
        r2 = r5;	 Catch:{ all -> 0x01cf }
        r1 = r18;	 Catch:{ all -> 0x01cf }
        r4 = r3.getLong(r1);	 Catch:{ all -> 0x01cf }
        r0.p = r4;	 Catch:{ all -> 0x01cf }
        r18 = r1;	 Catch:{ all -> 0x01cf }
        r5 = r2;	 Catch:{ all -> 0x01cf }
        r4 = r17;	 Catch:{ all -> 0x01cf }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01cf }
        r0.q = r1;	 Catch:{ all -> 0x01cf }
        r0.k = r6;	 Catch:{ all -> 0x01cf }
        r10.add(r0);	 Catch:{ all -> 0x01cf }
        r17 = r4;
        r2 = r9;
        r4 = r27;
        r6 = r28;
        r0 = r29;
        r1 = r30;
        r31 = r20;
        r20 = r5;
        r5 = r31;
        goto L_0x00b8;
        r3.close();
        r16.a();
        return r10;
        r0 = move-exception;
        goto L_0x01d4;
        r0 = move-exception;
        r16 = r1;
        r3.close();
        r16.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.c():java.util.List");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0059 in {2, 3, 10, 12, 15} preds:[]
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
    public final java.util.List<defpackage.rv.a> c(java.lang.String r7) {
        /*
        r6 = this;
        r0 = 1;
        r1 = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        r1 = defpackage.as.a(r1, r0);
        if (r7 != 0) goto L_0x000d;
        r1.bindNull(r0);
        goto L_0x0010;
        r1.bindString(r0, r7);
        r7 = r6.a;
        r7 = r7.a(r1);
        r0 = "id";	 Catch:{ all -> 0x0051 }
        r0 = r7.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x0051 }
        r2 = "state";	 Catch:{ all -> 0x0051 }
        r2 = r7.getColumnIndexOrThrow(r2);	 Catch:{ all -> 0x0051 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0051 }
        r4 = r7.getCount();	 Catch:{ all -> 0x0051 }
        r3.<init>(r4);	 Catch:{ all -> 0x0051 }
        r4 = r7.moveToNext();	 Catch:{ all -> 0x0051 }
        if (r4 == 0) goto L_0x004a;	 Catch:{ all -> 0x0051 }
        r4 = new rv$a;	 Catch:{ all -> 0x0051 }
        r4.<init>();	 Catch:{ all -> 0x0051 }
        r5 = r7.getString(r0);	 Catch:{ all -> 0x0051 }
        r4.a = r5;	 Catch:{ all -> 0x0051 }
        r5 = r7.getInt(r2);	 Catch:{ all -> 0x0051 }
        r5 = defpackage.sb.a(r5);	 Catch:{ all -> 0x0051 }
        r4.b = r5;	 Catch:{ all -> 0x0051 }
        r3.add(r4);	 Catch:{ all -> 0x0051 }
        goto L_0x002b;
        r7.close();
        r1.a();
        return r3;
        r0 = move-exception;
        r7.close();
        r1.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.c(java.lang.String):java.util.List");
    }

    public final int d(String str) {
        ae b = this.f.b();
        this.a.c();
        if (str == null) {
            try {
                b.bindNull(1);
            } catch (Throwable th) {
                this.a.d();
                this.f.a(b);
            }
        } else {
            b.bindString(1, str);
        }
        int executeUpdateDelete = b.executeUpdateDelete();
        this.a.e();
        this.a.d();
        this.f.a(b);
        return executeUpdateDelete;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x01db in {10, 11, 14, 15, 18, 19, 22, 23, 25, 27, 29, 31, 33} preds:[]
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
    public final java.util.List<defpackage.rv> d() {
        /*
        r32 = this;
        r0 = 0;
        r1 = "SELECT * FROM workspec WHERE state=0";
        r1 = defpackage.as.a(r1, r0);
        r2 = r32;
        r3 = r2.a;
        r3 = r3.a(r1);
        r4 = "id";	 Catch:{ all -> 0x01d1 }
        r4 = r3.getColumnIndexOrThrow(r4);	 Catch:{ all -> 0x01d1 }
        r5 = "state";	 Catch:{ all -> 0x01d1 }
        r5 = r3.getColumnIndexOrThrow(r5);	 Catch:{ all -> 0x01d1 }
        r6 = "worker_class_name";	 Catch:{ all -> 0x01d1 }
        r6 = r3.getColumnIndexOrThrow(r6);	 Catch:{ all -> 0x01d1 }
        r7 = "input_merger_class_name";	 Catch:{ all -> 0x01d1 }
        r7 = r3.getColumnIndexOrThrow(r7);	 Catch:{ all -> 0x01d1 }
        r8 = "input";	 Catch:{ all -> 0x01d1 }
        r8 = r3.getColumnIndexOrThrow(r8);	 Catch:{ all -> 0x01d1 }
        r9 = "output";	 Catch:{ all -> 0x01d1 }
        r9 = r3.getColumnIndexOrThrow(r9);	 Catch:{ all -> 0x01d1 }
        r10 = "initial_delay";	 Catch:{ all -> 0x01d1 }
        r10 = r3.getColumnIndexOrThrow(r10);	 Catch:{ all -> 0x01d1 }
        r11 = "interval_duration";	 Catch:{ all -> 0x01d1 }
        r11 = r3.getColumnIndexOrThrow(r11);	 Catch:{ all -> 0x01d1 }
        r12 = "flex_duration";	 Catch:{ all -> 0x01d1 }
        r12 = r3.getColumnIndexOrThrow(r12);	 Catch:{ all -> 0x01d1 }
        r13 = "run_attempt_count";	 Catch:{ all -> 0x01d1 }
        r13 = r3.getColumnIndexOrThrow(r13);	 Catch:{ all -> 0x01d1 }
        r14 = "backoff_policy";	 Catch:{ all -> 0x01d1 }
        r14 = r3.getColumnIndexOrThrow(r14);	 Catch:{ all -> 0x01d1 }
        r15 = "backoff_delay_duration";	 Catch:{ all -> 0x01d1 }
        r15 = r3.getColumnIndexOrThrow(r15);	 Catch:{ all -> 0x01d1 }
        r0 = "period_start_time";	 Catch:{ all -> 0x01d1 }
        r0 = r3.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x01d1 }
        r2 = "minimum_retention_duration";	 Catch:{ all -> 0x01d1 }
        r2 = r3.getColumnIndexOrThrow(r2);	 Catch:{ all -> 0x01d1 }
        r16 = r1;
        r1 = "schedule_requested_at";	 Catch:{ all -> 0x01cf }
        r1 = r3.getColumnIndexOrThrow(r1);	 Catch:{ all -> 0x01cf }
        r17 = r1;	 Catch:{ all -> 0x01cf }
        r1 = "required_network_type";	 Catch:{ all -> 0x01cf }
        r1 = r3.getColumnIndexOrThrow(r1);	 Catch:{ all -> 0x01cf }
        r18 = r2;	 Catch:{ all -> 0x01cf }
        r2 = "requires_charging";	 Catch:{ all -> 0x01cf }
        r2 = r3.getColumnIndexOrThrow(r2);	 Catch:{ all -> 0x01cf }
        r19 = r0;	 Catch:{ all -> 0x01cf }
        r0 = "requires_device_idle";	 Catch:{ all -> 0x01cf }
        r0 = r3.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x01cf }
        r20 = r15;	 Catch:{ all -> 0x01cf }
        r15 = "requires_battery_not_low";	 Catch:{ all -> 0x01cf }
        r15 = r3.getColumnIndexOrThrow(r15);	 Catch:{ all -> 0x01cf }
        r21 = r14;	 Catch:{ all -> 0x01cf }
        r14 = "requires_storage_not_low";	 Catch:{ all -> 0x01cf }
        r14 = r3.getColumnIndexOrThrow(r14);	 Catch:{ all -> 0x01cf }
        r22 = r13;	 Catch:{ all -> 0x01cf }
        r13 = "trigger_content_update_delay";	 Catch:{ all -> 0x01cf }
        r13 = r3.getColumnIndexOrThrow(r13);	 Catch:{ all -> 0x01cf }
        r23 = r12;	 Catch:{ all -> 0x01cf }
        r12 = "trigger_max_content_delay";	 Catch:{ all -> 0x01cf }
        r12 = r3.getColumnIndexOrThrow(r12);	 Catch:{ all -> 0x01cf }
        r24 = r11;	 Catch:{ all -> 0x01cf }
        r11 = "content_uri_triggers";	 Catch:{ all -> 0x01cf }
        r11 = r3.getColumnIndexOrThrow(r11);	 Catch:{ all -> 0x01cf }
        r25 = r10;	 Catch:{ all -> 0x01cf }
        r10 = new java.util.ArrayList;	 Catch:{ all -> 0x01cf }
        r26 = r9;	 Catch:{ all -> 0x01cf }
        r9 = r3.getCount();	 Catch:{ all -> 0x01cf }
        r10.<init>(r9);	 Catch:{ all -> 0x01cf }
        r9 = r3.moveToNext();	 Catch:{ all -> 0x01cf }
        if (r9 == 0) goto L_0x01c8;	 Catch:{ all -> 0x01cf }
        r9 = r3.getString(r4);	 Catch:{ all -> 0x01cf }
        r27 = r4;	 Catch:{ all -> 0x01cf }
        r4 = r3.getString(r6);	 Catch:{ all -> 0x01cf }
        r28 = r6;	 Catch:{ all -> 0x01cf }
        r6 = new pm;	 Catch:{ all -> 0x01cf }
        r6.<init>();	 Catch:{ all -> 0x01cf }
        r29 = r3.getInt(r1);	 Catch:{ all -> 0x01cf }
        r30 = r1;	 Catch:{ all -> 0x01cf }
        r1 = defpackage.sb.c(r29);	 Catch:{ all -> 0x01cf }
        r6.b = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r2);	 Catch:{ all -> 0x01cf }
        r29 = 1;	 Catch:{ all -> 0x01cf }
        if (r1 == 0) goto L_0x00e5;	 Catch:{ all -> 0x01cf }
        r1 = 1;	 Catch:{ all -> 0x01cf }
        goto L_0x00e6;	 Catch:{ all -> 0x01cf }
        r1 = 0;	 Catch:{ all -> 0x01cf }
        r6.c = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r0);	 Catch:{ all -> 0x01cf }
        if (r1 == 0) goto L_0x00f0;	 Catch:{ all -> 0x01cf }
        r1 = 1;	 Catch:{ all -> 0x01cf }
        goto L_0x00f1;	 Catch:{ all -> 0x01cf }
        r1 = 0;	 Catch:{ all -> 0x01cf }
        r6.d = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r15);	 Catch:{ all -> 0x01cf }
        if (r1 == 0) goto L_0x00fb;	 Catch:{ all -> 0x01cf }
        r1 = 1;	 Catch:{ all -> 0x01cf }
        goto L_0x00fc;	 Catch:{ all -> 0x01cf }
        r1 = 0;	 Catch:{ all -> 0x01cf }
        r6.e = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r14);	 Catch:{ all -> 0x01cf }
        if (r1 == 0) goto L_0x0106;	 Catch:{ all -> 0x01cf }
        r1 = 1;	 Catch:{ all -> 0x01cf }
        goto L_0x0107;	 Catch:{ all -> 0x01cf }
        r1 = 0;	 Catch:{ all -> 0x01cf }
        r6.f = r1;	 Catch:{ all -> 0x01cf }
        r29 = r0;	 Catch:{ all -> 0x01cf }
        r0 = r3.getLong(r13);	 Catch:{ all -> 0x01cf }
        r6.g = r0;	 Catch:{ all -> 0x01cf }
        r0 = r3.getLong(r12);	 Catch:{ all -> 0x01cf }
        r6.h = r0;	 Catch:{ all -> 0x01cf }
        r0 = r3.getBlob(r11);	 Catch:{ all -> 0x01cf }
        r0 = defpackage.sb.a(r0);	 Catch:{ all -> 0x01cf }
        r6.i = r0;	 Catch:{ all -> 0x01cf }
        r0 = new rv;	 Catch:{ all -> 0x01cf }
        r0.<init>(r9, r4);	 Catch:{ all -> 0x01cf }
        r1 = r3.getInt(r5);	 Catch:{ all -> 0x01cf }
        r1 = defpackage.sb.a(r1);	 Catch:{ all -> 0x01cf }
        r0.c = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getString(r7);	 Catch:{ all -> 0x01cf }
        r0.e = r1;	 Catch:{ all -> 0x01cf }
        r1 = r3.getBlob(r8);	 Catch:{ all -> 0x01cf }
        r1 = defpackage.po.a(r1);	 Catch:{ all -> 0x01cf }
        r0.f = r1;	 Catch:{ all -> 0x01cf }
        r1 = r26;	 Catch:{ all -> 0x01cf }
        r4 = r3.getBlob(r1);	 Catch:{ all -> 0x01cf }
        r4 = defpackage.po.a(r4);	 Catch:{ all -> 0x01cf }
        r0.g = r4;	 Catch:{ all -> 0x01cf }
        r26 = r1;	 Catch:{ all -> 0x01cf }
        r9 = r2;	 Catch:{ all -> 0x01cf }
        r4 = r25;	 Catch:{ all -> 0x01cf }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01cf }
        r0.h = r1;	 Catch:{ all -> 0x01cf }
        r25 = r4;	 Catch:{ all -> 0x01cf }
        r2 = r5;	 Catch:{ all -> 0x01cf }
        r1 = r24;	 Catch:{ all -> 0x01cf }
        r4 = r3.getLong(r1);	 Catch:{ all -> 0x01cf }
        r0.i = r4;	 Catch:{ all -> 0x01cf }
        r24 = r1;	 Catch:{ all -> 0x01cf }
        r5 = r2;	 Catch:{ all -> 0x01cf }
        r4 = r23;	 Catch:{ all -> 0x01cf }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01cf }
        r0.j = r1;	 Catch:{ all -> 0x01cf }
        r1 = r22;	 Catch:{ all -> 0x01cf }
        r2 = r3.getInt(r1);	 Catch:{ all -> 0x01cf }
        r0.l = r2;	 Catch:{ all -> 0x01cf }
        r2 = r21;	 Catch:{ all -> 0x01cf }
        r21 = r3.getInt(r2);	 Catch:{ all -> 0x01cf }
        r22 = r1;	 Catch:{ all -> 0x01cf }
        r1 = defpackage.sb.b(r21);	 Catch:{ all -> 0x01cf }
        r0.m = r1;	 Catch:{ all -> 0x01cf }
        r23 = r4;	 Catch:{ all -> 0x01cf }
        r1 = r20;	 Catch:{ all -> 0x01cf }
        r20 = r5;	 Catch:{ all -> 0x01cf }
        r4 = r3.getLong(r1);	 Catch:{ all -> 0x01cf }
        r0.n = r4;	 Catch:{ all -> 0x01cf }
        r5 = r1;	 Catch:{ all -> 0x01cf }
        r21 = r2;	 Catch:{ all -> 0x01cf }
        r4 = r19;	 Catch:{ all -> 0x01cf }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01cf }
        r0.o = r1;	 Catch:{ all -> 0x01cf }
        r19 = r4;	 Catch:{ all -> 0x01cf }
        r2 = r5;	 Catch:{ all -> 0x01cf }
        r1 = r18;	 Catch:{ all -> 0x01cf }
        r4 = r3.getLong(r1);	 Catch:{ all -> 0x01cf }
        r0.p = r4;	 Catch:{ all -> 0x01cf }
        r18 = r1;	 Catch:{ all -> 0x01cf }
        r5 = r2;	 Catch:{ all -> 0x01cf }
        r4 = r17;	 Catch:{ all -> 0x01cf }
        r1 = r3.getLong(r4);	 Catch:{ all -> 0x01cf }
        r0.q = r1;	 Catch:{ all -> 0x01cf }
        r0.k = r6;	 Catch:{ all -> 0x01cf }
        r10.add(r0);	 Catch:{ all -> 0x01cf }
        r17 = r4;
        r2 = r9;
        r4 = r27;
        r6 = r28;
        r0 = r29;
        r1 = r30;
        r31 = r20;
        r20 = r5;
        r5 = r31;
        goto L_0x00b8;
        r3.close();
        r16.a();
        return r10;
        r0 = move-exception;
        goto L_0x01d4;
        r0 = move-exception;
        r16 = r1;
        r3.close();
        r16.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.d():java.util.List");
    }

    public final int e(String str) {
        ae b = this.g.b();
        this.a.c();
        if (str == null) {
            try {
                b.bindNull(1);
            } catch (Throwable th) {
                this.a.d();
                this.g.a(b);
            }
        } else {
            b.bindString(1, str);
        }
        int executeUpdateDelete = b.executeUpdateDelete();
        this.a.e();
        this.a.d();
        this.g.a(b);
        return executeUpdateDelete;
    }

    public final a f(String str) {
        ad a = as.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        Cursor a2 = this.a.a(a);
        try {
            a a3 = a2.moveToFirst() ? sb.a(a2.getInt(0)) : null;
            a2.close();
            a.a();
            return a3;
        } catch (Throwable th) {
            a2.close();
            a.a();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0041 in {2, 3, 10, 12, 15} preds:[]
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
    public final java.util.List<defpackage.po> g(java.lang.String r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        r1 = defpackage.as.a(r1, r0);
        if (r4 != 0) goto L_0x000d;
        r1.bindNull(r0);
        goto L_0x0010;
        r1.bindString(r0, r4);
        r4 = r3.a;
        r4 = r4.a(r1);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0039 }
        r2 = r4.getCount();	 Catch:{ all -> 0x0039 }
        r0.<init>(r2);	 Catch:{ all -> 0x0039 }
        r2 = r4.moveToNext();	 Catch:{ all -> 0x0039 }
        if (r2 == 0) goto L_0x0032;	 Catch:{ all -> 0x0039 }
        r2 = 0;	 Catch:{ all -> 0x0039 }
        r2 = r4.getBlob(r2);	 Catch:{ all -> 0x0039 }
        r2 = defpackage.po.a(r2);	 Catch:{ all -> 0x0039 }
        r0.add(r2);	 Catch:{ all -> 0x0039 }
        goto L_0x001f;
        r4.close();
        r1.a();
        return r0;
        r0 = move-exception;
        r4.close();
        r1.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.g(java.lang.String):java.util.List");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x003d in {2, 3, 10, 12, 15} preds:[]
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
    public final java.util.List<java.lang.String> h(java.lang.String r4) {
        /*
        r3 = this;
        r0 = 1;
        r1 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        r1 = defpackage.as.a(r1, r0);
        if (r4 != 0) goto L_0x000d;
        r1.bindNull(r0);
        goto L_0x0010;
        r1.bindString(r0, r4);
        r4 = r3.a;
        r4 = r4.a(r1);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0035 }
        r2 = r4.getCount();	 Catch:{ all -> 0x0035 }
        r0.<init>(r2);	 Catch:{ all -> 0x0035 }
        r2 = r4.moveToNext();	 Catch:{ all -> 0x0035 }
        if (r2 == 0) goto L_0x002e;	 Catch:{ all -> 0x0035 }
        r2 = 0;	 Catch:{ all -> 0x0035 }
        r2 = r4.getString(r2);	 Catch:{ all -> 0x0035 }
        r0.add(r2);	 Catch:{ all -> 0x0035 }
        goto L_0x001f;
        r4.close();
        r1.a();
        return r0;
        r0 = move-exception;
        r4.close();
        r1.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.h(java.lang.String):java.util.List");
    }
}

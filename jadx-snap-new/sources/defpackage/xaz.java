package defpackage;

import android.content.Context;
import com.snap.spectacles.base.persistence.SpectaclesDatabase;
import defpackage.xba.a;

/* renamed from: xaz */
public class xaz implements a {
    private static au d = new 1();
    private static au e = new 3();
    private static au f = new 4();
    private static au g = new 5();
    private static au h = new 6();
    private static au i = new 7();
    private static au j = new 8();
    private static au k = new 9();
    private static au l = new 10();
    private static au m = new 2();
    public SpectaclesDatabase a;
    private final Context b;
    private final String c = "SELECT name from sqlite_master where name like 'spectacles_%' or name like 'snap_bluetooth_device'";

    /* renamed from: xaz$1 */
    static class 1 extends au {
        1() {
            super(1, 2);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x005b in {5, 7, 10} preds:[]
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
        public final void a(defpackage.aa r6) {
            /*
            r5 = this;
            r0 = "ALTER TABLE snap_bluetooth_device ADD COLUMN synced_from_server INTEGER NOT NULL DEFAULT 0";
            r6.execSQL(r0);
            r0 = "CREATE TABLE IF NOT EXISTS `spectacles_transfer_channel_info` (`device_serial_number` TEXT NOT NULL, `content_transfer_mode` INTEGER NOT NULL, `wifi_direct_retry_count` INTEGER NOT NULL, `wifi_ap_fallback_session_count` INTEGER NOT NULL, PRIMARY KEY(`device_serial_number`), FOREIGN KEY(`device_serial_number`) REFERENCES `snap_bluetooth_device`(`device_serial_number`) ON UPDATE NO ACTION ON DELETE CASCADE)";
            r6.execSQL(r0);
            r0 = "CREATE INDEX IF NOT EXISTS `index_spectacles_transfer_channel_info_device_serial_number` ON `spectacles_transfer_channel_info` (`device_serial_number`)";
            r6.execSQL(r0);
            r0 = "SELECT * FROM snap_bluetooth_device";
            r0 = r6.query(r0);
            r1 = r0.moveToNext();	 Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0052;	 Catch:{ all -> 0x0056 }
            r1 = 0;	 Catch:{ all -> 0x0056 }
            r2 = r0.getString(r1);	 Catch:{ all -> 0x0056 }
            r3 = new android.content.ContentValues;	 Catch:{ all -> 0x0056 }
            r3.<init>();	 Catch:{ all -> 0x0056 }
            r4 = "device_serial_number";	 Catch:{ all -> 0x0056 }
            r3.put(r4, r2);	 Catch:{ all -> 0x0056 }
            r2 = "content_transfer_mode";	 Catch:{ all -> 0x0056 }
            r4 = defpackage.xdk.WIFI_DIRECT;	 Catch:{ all -> 0x0056 }
            r4 = r4.ordinal();	 Catch:{ all -> 0x0056 }
            r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0056 }
            r3.put(r2, r4);	 Catch:{ all -> 0x0056 }
            r2 = "wifi_direct_retry_count";	 Catch:{ all -> 0x0056 }
            r4 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0056 }
            r3.put(r2, r4);	 Catch:{ all -> 0x0056 }
            r2 = "wifi_ap_fallback_session_count";	 Catch:{ all -> 0x0056 }
            r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x0056 }
            r3.put(r2, r1);	 Catch:{ all -> 0x0056 }
            r1 = "spectacles_transfer_channel_info";	 Catch:{ all -> 0x0056 }
            r2 = 5;	 Catch:{ all -> 0x0056 }
            r6.insert(r1, r2, r3);	 Catch:{ all -> 0x0056 }
            goto L_0x0015;
            r0.close();
            return;
            r6 = move-exception;
            r0.close();
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xaz$1.a(aa):void");
        }
    }

    /* renamed from: xaz$3 */
    static class 3 extends au {
        3() {
            super(2, 3);
        }

        public final void a(aa aaVar) {
            aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_update_event` (`update_version` TEXT NOT NULL, `update_type` INTEGER NOT NULL, `update_timestamp` INTEGER NOT NULL, `seen_timestamp` INTEGER NOT NULL, `tapped_timestamp` INTEGER NOT NULL, `is_active` INTEGER NOT NULL, PRIMARY KEY(`update_version`))");
        }
    }

    /* renamed from: xaz$4 */
    static class 4 extends au {
        4() {
            super(3, 4);
        }

        public final void a(aa aaVar) {
            aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_media_geo_location` (`mId` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `longitude` REAL NOT NULL, `latitude` REAL NOT NULL, PRIMARY KEY(`mId`))");
            aaVar.execSQL("ALTER TABLE snap_bluetooth_device  ADD COLUMN auto_import_to_camera_roll INTEGER NOT NULL DEFAULT 0");
            aaVar.execSQL("ALTER TABLE snap_bluetooth_device  ADD COLUMN pairing_success_timestamp INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: xaz$5 */
    static class 5 extends au {
        5() {
            super(4, 5);
        }

        public final void a(aa aaVar) {
            aaVar.execSQL("ALTER TABLE spectacles_media_geo_location  ADD COLUMN filter_type INTEGER NOT NULL DEFAULT 0");
            aaVar.execSQL("ALTER TABLE spectacles_media_geo_location  ADD COLUMN filter_metadata TEXT NOT NULL DEFAULT '[]'");
        }
    }

    /* renamed from: xaz$6 */
    static class 6 extends au {
        6() {
            super(5, 6);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x007d in {6, 7, 10, 13, 15, 18} preds:[]
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
        public final void a(defpackage.aa r10) {
            /*
            r9 = this;
            r0 = "ALTER TABLE snap_bluetooth_device ADD COLUMN pairing_code BLOB NOT NULL DEFAULT '[]'";
            r10.execSQL(r0);
            r0 = "SELECT * FROM snap_bluetooth_device";
            r0 = r10.query(r0);
            r1 = r0.moveToNext();	 Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x0074;	 Catch:{ all -> 0x0078 }
            r1 = 0;	 Catch:{ all -> 0x0078 }
            r2 = "device_serial_number";	 Catch:{ all -> 0x0078 }
            r2 = r0.getColumnIndex(r2);	 Catch:{ all -> 0x0078 }
            r2 = r0.getString(r2);	 Catch:{ all -> 0x0078 }
            r3 = "service_uuid";	 Catch:{ all -> 0x0078 }
            r3 = r0.getColumnIndex(r3);	 Catch:{ all -> 0x0078 }
            r3 = r0.getString(r3);	 Catch:{ all -> 0x0078 }
            r4 = defpackage.xds.d.PROTO;	 Catch:{ all -> 0x0078 }
            r4 = r4.mServiceUUID;	 Catch:{ all -> 0x0078 }
            r4 = r4.toString();	 Catch:{ all -> 0x0078 }
            r4 = android.text.TextUtils.equals(r3, r4);	 Catch:{ all -> 0x0078 }
            if (r4 == 0) goto L_0x003b;	 Catch:{ all -> 0x0078 }
            r1 = defpackage.xcs.LAGUNA;	 Catch:{ all -> 0x0078 }
            r1 = r1.a();	 Catch:{ all -> 0x0078 }
            goto L_0x004c;	 Catch:{ all -> 0x0078 }
            r4 = defpackage.xds.d.SNAP;	 Catch:{ all -> 0x0078 }
            r4 = r4.mServiceUUID;	 Catch:{ all -> 0x0078 }
            r4 = r4.toString();	 Catch:{ all -> 0x0078 }
            r3 = android.text.TextUtils.equals(r3, r4);	 Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x004c;	 Catch:{ all -> 0x0078 }
            r1 = defpackage.xcs.MALIBU;	 Catch:{ all -> 0x0078 }
            goto L_0x0036;	 Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x000b;	 Catch:{ all -> 0x0078 }
            r6 = new android.content.ContentValues;	 Catch:{ all -> 0x0078 }
            r6.<init>();	 Catch:{ all -> 0x0078 }
            r3 = "pairing_code";	 Catch:{ all -> 0x0078 }
            r6.put(r3, r1);	 Catch:{ all -> 0x0078 }
            r4 = "snap_bluetooth_device";	 Catch:{ all -> 0x0078 }
            r5 = 5;	 Catch:{ all -> 0x0078 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0078 }
            r3 = "device_serial_number='";	 Catch:{ all -> 0x0078 }
            r1.<init>(r3);	 Catch:{ all -> 0x0078 }
            r1.append(r2);	 Catch:{ all -> 0x0078 }
            r2 = "'";	 Catch:{ all -> 0x0078 }
            r1.append(r2);	 Catch:{ all -> 0x0078 }
            r7 = r1.toString();	 Catch:{ all -> 0x0078 }
            r8 = 0;	 Catch:{ all -> 0x0078 }
            r3 = r10;	 Catch:{ all -> 0x0078 }
            r3.update(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0078 }
            goto L_0x000b;
            r0.close();
            return;
            r10 = move-exception;
            r0.close();
            throw r10;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xaz$6.a(aa):void");
        }
    }

    /* renamed from: xaz$7 */
    static class 7 extends au {
        7() {
            super(6, 7);
        }

        public final void a(aa aaVar) {
            aaVar.execSQL("ALTER TABLE snap_bluetooth_device ADD COLUMN calibration_data BLOB");
        }
    }

    /* renamed from: xaz$8 */
    static class 8 extends au {
        8() {
            super(7, 8);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0086 in {8, 14, 15, 17, 19, 22} preds:[]
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
        public final void a(defpackage.aa r12) {
            /*
            r11 = this;
            r0 = new xhg;
            r0.<init>();
            r0 = "ALTER TABLE snap_bluetooth_device ADD COLUMN preferred_export_type INTEGER NOT NULL DEFAULT 0";
            r12.execSQL(r0);
            r0 = "SELECT * FROM snap_bluetooth_device";
            r0 = r12.query(r0);
            r1 = r0.moveToNext();	 Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x007d;	 Catch:{ all -> 0x0081 }
            r1 = "pairing_code";	 Catch:{ all -> 0x0081 }
            r1 = r0.getColumnIndex(r1);	 Catch:{ all -> 0x0081 }
            r1 = r0.getBlob(r1);	 Catch:{ all -> 0x0081 }
            r2 = "device_serial_number";	 Catch:{ all -> 0x0081 }
            r2 = r0.getColumnIndex(r2);	 Catch:{ all -> 0x0081 }
            r2 = r0.getString(r2);	 Catch:{ all -> 0x0081 }
            r3 = "auto_import_to_camera_roll";	 Catch:{ all -> 0x0081 }
            r3 = r0.getColumnIndex(r3);	 Catch:{ all -> 0x0081 }
            r3 = r0.getInt(r3);	 Catch:{ all -> 0x0081 }
            r4 = 0;	 Catch:{ all -> 0x0081 }
            r5 = 1;	 Catch:{ all -> 0x0081 }
            if (r3 != r5) goto L_0x0010;	 Catch:{ all -> 0x0081 }
            r3 = defpackage.xhg.b(r1);	 Catch:{ all -> 0x0081 }
            if (r3 == 0) goto L_0x0040;	 Catch:{ all -> 0x0081 }
            r4 = 2;	 Catch:{ all -> 0x0081 }
            goto L_0x0053;	 Catch:{ all -> 0x0081 }
            r3 = defpackage.xhg.c(r1);	 Catch:{ all -> 0x0081 }
            if (r3 != 0) goto L_0x0052;	 Catch:{ all -> 0x0081 }
            r3 = defpackage.xhg.a(r1);	 Catch:{ all -> 0x0081 }
            if (r3 != 0) goto L_0x0052;	 Catch:{ all -> 0x0081 }
            r1 = defpackage.xhg.d(r1);	 Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0053;	 Catch:{ all -> 0x0081 }
            r4 = 1;	 Catch:{ all -> 0x0081 }
            r8 = new android.content.ContentValues;	 Catch:{ all -> 0x0081 }
            r8.<init>();	 Catch:{ all -> 0x0081 }
            r1 = "preferred_export_type";	 Catch:{ all -> 0x0081 }
            r3 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0081 }
            r8.put(r1, r3);	 Catch:{ all -> 0x0081 }
            r6 = "snap_bluetooth_device";	 Catch:{ all -> 0x0081 }
            r7 = 5;	 Catch:{ all -> 0x0081 }
            r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0081 }
            r3 = "device_serial_number='";	 Catch:{ all -> 0x0081 }
            r1.<init>(r3);	 Catch:{ all -> 0x0081 }
            r1.append(r2);	 Catch:{ all -> 0x0081 }
            r2 = "'";	 Catch:{ all -> 0x0081 }
            r1.append(r2);	 Catch:{ all -> 0x0081 }
            r9 = r1.toString();	 Catch:{ all -> 0x0081 }
            r10 = 0;	 Catch:{ all -> 0x0081 }
            r5 = r12;	 Catch:{ all -> 0x0081 }
            r5.update(r6, r7, r8, r9, r10);	 Catch:{ all -> 0x0081 }
            goto L_0x0010;
            r0.close();
            return;
            r12 = move-exception;
            r0.close();
            throw r12;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xaz$8.a(aa):void");
        }
    }

    /* renamed from: xaz$9 */
    static class 9 extends au {
        9() {
            super(8, 9);
        }

        public final void a(aa aaVar) {
            aaVar.execSQL("ALTER TABLE snap_bluetooth_device ADD COLUMN location_data_enabled INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: xaz$10 */
    static class 10 extends au {
        10() {
            super(9, 10);
        }

        public final void a(aa aaVar) {
            aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_firmware_update_metadata` (`downloaded_to_client_timestamp` INTEGER NOT NULL, `transferred_to_firmware_timestamp` INTEGER NOT NULL, `firmware_update_file_id` TEXT NOT NULL, PRIMARY KEY(`firmware_update_file_id`))");
        }
    }

    /* renamed from: xaz$2 */
    static class 2 extends au {
        2() {
            super(10, 11);
        }

        public final void a(aa aaVar) {
            aaVar.execSQL("ALTER TABLE snap_bluetooth_device ADD COLUMN context_notifications_enabled INTEGER NOT NULL DEFAULT 0");
            aaVar.execSQL("ALTER TABLE snap_bluetooth_device ADD COLUMN snap_context_notification_color_selection INTEGER NOT NULL DEFAULT 0");
        }
    }

    public xaz(Context context) {
        this.b = context;
        this.a = (SpectaclesDatabase) ao.a(this.b, SpectaclesDatabase.class, "SPECTACLES_SQLITE").a(d, e, f, g, h, i, j, k, l, m).a();
    }

    public final xff a() {
        return this.a.h();
    }

    public final void a(Runnable runnable) {
        SpectaclesDatabase spectaclesDatabase = this.a;
        spectaclesDatabase.c();
        try {
            runnable.run();
            spectaclesDatabase.e();
        } finally {
            spectaclesDatabase.d();
        }
    }

    public final xfc b() {
        return this.a.n();
    }

    public final xes c() {
        return this.a.j();
    }

    public final xev d() {
        return this.a.k();
    }

    public final xfs e() {
        return this.a.m();
    }

    public final void f() {
        this.a.j().a();
        this.a.k().a();
        this.a.m().a();
        this.a.n().a();
        this.a.o().a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x007b in {7, 10, 16, 19, 26, 28, 30} preds:[]
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
    public final java.lang.String g() {
        /*
        r9 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r9.a;
        r2 = 0;
        r3 = "SELECT name from sqlite_master where name like 'spectacles_%' or name like 'snap_bluetooth_device'";
        r1 = r1.a(r3, r2);
        r3 = 0;
        r4 = r1.moveToNext();	 Catch:{ Exception -> 0x0061 }
        if (r4 == 0) goto L_0x005b;	 Catch:{ Exception -> 0x0061 }
        r4 = "name";	 Catch:{ Exception -> 0x0061 }
        r4 = r1.getColumnIndex(r4);	 Catch:{ Exception -> 0x0061 }
        r4 = r1.getString(r4);	 Catch:{ Exception -> 0x0061 }
        r5 = "SELECT * FROM ";	 Catch:{ Exception -> 0x0061 }
        r6 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x0061 }
        r5 = r5.concat(r6);	 Catch:{ Exception -> 0x0061 }
        r6 = r9.a;	 Catch:{ Exception -> 0x0061 }
        r5 = r6.a(r5, r2);	 Catch:{ Exception -> 0x0061 }
        r0.append(r4);	 Catch:{ Exception -> 0x003f }
        r6 = android.database.DatabaseUtils.dumpCursorToString(r5);	 Catch:{ Exception -> 0x003f }
        r0.append(r6);	 Catch:{ Exception -> 0x003f }
        r5.close();	 Catch:{ Exception -> 0x0061 }
        goto L_0x000e;
        r2 = move-exception;
        goto L_0x0057;
        r6 = move-exception;
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003d }
        r8 = "Failed to dump spectacles sqlite table ";	 Catch:{ all -> 0x003d }
        r7.<init>(r8);	 Catch:{ all -> 0x003d }
        r7.append(r4);	 Catch:{ all -> 0x003d }
        r7.append(r6);	 Catch:{ all -> 0x003d }
        r4 = r7.toString();	 Catch:{ all -> 0x003d }
        r6 = new java.lang.Object[r3];	 Catch:{ all -> 0x003d }
        defpackage.xhq.a(r4, r6);	 Catch:{ all -> 0x003d }
        goto L_0x0039;
        r5.close();	 Catch:{ Exception -> 0x0061 }
        throw r2;	 Catch:{ Exception -> 0x0061 }
        r1.close();
        goto L_0x0072;
        r0 = move-exception;
        goto L_0x0077;
        r2 = move-exception;
        r4 = "Failed to get spectacles table names ";	 Catch:{ all -> 0x005f }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x005f }
        r2 = r4.concat(r2);	 Catch:{ all -> 0x005f }
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x005f }
        defpackage.xhq.a(r2, r3);	 Catch:{ all -> 0x005f }
        goto L_0x005b;
        r0 = r0.toString();
        return r0;
        r1.close();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xaz.g():java.lang.String");
    }
}

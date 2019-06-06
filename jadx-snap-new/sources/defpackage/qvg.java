package defpackage;

import android.database.Cursor;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MultiRecipientSendingSnapModel;
import com.snap.core.db.record.MultiRecipientSendingSnapModel.DeleteSendingFeedCell;
import com.snap.core.db.record.MultiRecipientSendingSnapModel.DeleteSendingFeedCellForMessage;
import com.snap.core.db.record.MultiRecipientSendingSnapModel.SetSendingMessage;
import com.snap.core.db.record.MultiRecipientSendingSnapRecord;
import com.snap.core.db.record.MultiRecipientSendingSnapRecord.SendingMessage;
import java.util.HashMap;

/* renamed from: qvg */
public final class qvg {
    final HashMap<MessageClientStatus, Integer> a = ajzm.c(ajxs.a(MessageClientStatus.SENDING, Integer.valueOf(3)), ajxs.a(MessageClientStatus.QUEUED, Integer.valueOf(2)), ajxs.a(MessageClientStatus.FAILED, Integer.valueOf(1)));
    public final DbClient b = this.h.getDbClient(this.c);
    private final idd c = pry.a.callsite("MultiRecipientSendingSnapRepository");
    private final ajxe<DeleteSendingFeedCell> d = ajxh.a(new a(this));
    private final ajxe<DeleteSendingFeedCellForMessage> e = ajxh.a(new b(this));
    private final ajxe<SetSendingMessage> f = ajxh.a(new e(this));
    private final ajxe g = ajxh.a(new f(this.b));
    private final SnapDb h;
    private final ihh i;

    /* renamed from: qvg$a */
    static final class a extends akcs implements akbk<DeleteSendingFeedCell> {
        private /* synthetic */ qvg a;

        a(qvg qvg) {
            this.a = qvg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteSendingFeedCell(((pa) this.a.g.b()));
        }
    }

    /* renamed from: qvg$b */
    static final class b extends akcs implements akbk<DeleteSendingFeedCellForMessage> {
        private /* synthetic */ qvg a;

        b(qvg qvg) {
            this.a = qvg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DeleteSendingFeedCellForMessage(((pa) this.a.g.b()));
        }
    }

    /* renamed from: qvg$e */
    static final class e extends akcs implements akbk<SetSendingMessage> {
        private /* synthetic */ qvg a;

        e(qvg qvg) {
            this.a = qvg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SetSendingMessage(((pa) this.a.g.b()), MultiRecipientSendingSnapRecord.FACTORY);
        }
    }

    /* renamed from: qvg$d */
    public static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ qvg a;

        public d(qvg qvg) {
            this.a = qvg;
        }

        /* JADX WARNING: Missing block: B:6:0x003e, code skipped:
            if (r5 == null) goto L_0x0040;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r9) {
            /*
            r8 = this;
            r9 = (java.util.List) r9;
            r0 = "sendingMessages";
            defpackage.akcr.b(r9, r0);
            r0 = new java.util.LinkedHashMap;
            r0.<init>();
            r0 = (java.util.Map) r0;
            r1 = new java.util.LinkedHashMap;
            r1.<init>();
            r1 = (java.util.Map) r1;
            r9 = (java.lang.Iterable) r9;
            r9 = r9.iterator();
        L_0x001b:
            r2 = r9.hasNext();
            if (r2 == 0) goto L_0x0093;
        L_0x0021:
            r2 = r9.next();
            r2 = (com.snap.core.db.record.MultiRecipientSendingSnapRecord.SendingMessage) r2;
            r3 = r2.recipientsList();
            r3 = r0.get(r3);
            r3 = (com.snap.core.db.column.MessageClientStatus) r3;
            r4 = 0;
            if (r3 == 0) goto L_0x0040;
        L_0x0034:
            r5 = r8.a;
            r5 = r5.a;
            r5 = r5.get(r3);
            r5 = (java.lang.Integer) r5;
            if (r5 != 0) goto L_0x0044;
        L_0x0040:
            r5 = java.lang.Integer.valueOf(r4);
        L_0x0044:
            r6 = "currentStatus?.let { fee…rity[currentStatus] }?: 0";
            defpackage.akcr.a(r5, r6);
            r5 = r5.intValue();
            r6 = r8.a;
            r6 = r6.a;
            r7 = r2.clientStatus();
            r6 = r6.get(r7);
            r6 = (java.lang.Integer) r6;
            if (r6 != 0) goto L_0x0061;
        L_0x005d:
            r6 = java.lang.Integer.valueOf(r4);
        L_0x0061:
            r4 = "feedPriority[it.clientStatus()]?: 0";
            defpackage.akcr.a(r6, r4);
            r4 = r6.intValue();
            if (r3 == 0) goto L_0x006e;
        L_0x006c:
            if (r4 <= r5) goto L_0x001b;
        L_0x006e:
            r3 = r2.recipientsList();
            r4 = "it.recipientsList()";
            defpackage.akcr.a(r3, r4);
            r5 = r2.clientStatus();
            r6 = "it.clientStatus()";
            defpackage.akcr.a(r5, r6);
            r0.put(r3, r5);
            r3 = r2.recipientsList();
            defpackage.akcr.a(r3, r4);
            r4 = "it";
            defpackage.akcr.a(r2, r4);
            r1.put(r3, r2);
            goto L_0x001b;
        L_0x0093:
            r9 = r1.values();
            r9 = (java.lang.Iterable) r9;
            r9 = defpackage.ajyu.k(r9);
            return r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qvg$d.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: qvg$c */
    public static final class c extends akcq implements akbl<Cursor, SendingMessage> {
        public c(ainw ainw) {
            super(1, ainw);
        }

        public final String getName() {
            return "map";
        }

        public final akej getOwner() {
            return akde.a(ainw.class);
        }

        public final String getSignature() {
            return "map(Landroid/database/Cursor;)Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            akcr.b(cursor, "p1");
            return (SendingMessage) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: qvg$f */
    static final class f extends akcq implements akbk<pa> {
        f(DbClient dbClient) {
            super(0, dbClient);
        }

        public final String getName() {
            return "getWritableDatabase";
        }

        public final akej getOwner() {
            return akde.a(DbClient.class);
        }

        public final String getSignature() {
            return "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;";
        }

        public final /* synthetic */ Object invoke() {
            return ((DbClient) this.receiver).getWritableDatabase();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(qvg.class), "writableDatabase", "getWritableDatabase()Landroidx/sqlite/db/SupportSQLiteDatabase;");
    }

    public qvg(SnapDb snapDb, ihh ihh) {
        akcr.b(snapDb, "snapDb");
        akcr.b(ihh, "clock");
        this.h = snapDb;
        this.i = ihh;
    }

    public final void a(String str) {
        akcr.b(str, MultiRecipientSendingSnapModel.RECIPIENTSLIST);
        ((DeleteSendingFeedCell) this.d.b()).bind(str);
        this.b.executeUpdateDelete((ainy) this.d.b());
    }

    public final void a(String str, String str2) {
        akcr.b(str, MultiRecipientSendingSnapModel.RECIPIENTSLIST);
        akcr.b(str2, "messageId");
        ((DeleteSendingFeedCellForMessage) this.e.b()).bind(str, str2);
        this.b.executeUpdateDelete((ainy) this.e.b());
    }

    public final void a(String str, String str2, String str3, MessageClientStatus messageClientStatus) {
        akcr.b(str, MultiRecipientSendingSnapModel.RECIPIENTSLIST);
        akcr.b(str2, MultiRecipientSendingSnapModel.FEEDDISPLAYNAME);
        akcr.b(str3, "messageId");
        akcr.b(messageClientStatus, "clientStatus");
        ((SetSendingMessage) this.f.b()).bind(str, str2, str3, messageClientStatus, this.i.a());
        this.b.executeUpdateDelete((ainy) this.f.b());
    }
}

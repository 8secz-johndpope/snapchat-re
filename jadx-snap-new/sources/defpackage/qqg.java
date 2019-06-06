package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.LegacyMessageQueries;
import com.snap.core.db.record.LegacyMessagingSnapQueries;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.MessageRecord;
import com.snap.core.db.record.MessageRecord.GetContentForMessageModel;
import com.snap.core.db.record.MessagingSnapRecord;
import com.snap.core.db.record.MessagingSnapRecord.DirectSnapInfo;
import defpackage.pun.a;
import java.util.Set;

@ftr(a = "snap/*")
/* renamed from: qqg */
public final class qqg extends ggm {
    final gee a;
    final ajwy<qqf> b;
    final pvu c;
    final SnapDb d;
    final aipn<ftl> e;
    private final ajxe f = ajxh.a(new a(this));
    private final String g;
    private final pqu h;

    /* renamed from: qqg$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qqg a;
        private /* synthetic */ Set b;
        private /* synthetic */ boolean c;
        private /* synthetic */ Set d;

        d(qqg qqg, Set set, boolean z, Set set2) {
            this.a = qqg;
            this.b = set;
            this.c = z;
            this.d = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            GetContentForMessageModel getContentForMessageModel = (GetContentForMessageModel) obj;
            akcr.b(getContentForMessageModel, "it");
            Object content = getContentForMessageModel.content();
            if (content == null) {
                akcr.a();
            }
            akcr.a(content, "it.content()!!");
            pun a = a.a(content);
            String str = "it.key()";
            qqg qqg;
            Set set;
            boolean z;
            Set set2;
            if (this.a.c.a(a.d) && ((ftl) this.a.e.get()).a((fth) qpy.USE_DIRECT_DOWNLOAD_URL_FOR_SNAPS)) {
                qqg = this.a;
                obj = getContentForMessageModel.key();
                akcr.a(obj, str);
                set = this.b;
                z = this.c;
                set2 = this.d;
                if (a.d != null) {
                    qqf qqf = (qqf) qqg.b.get();
                    String c = qwh.c(obj);
                    String str2 = a.f;
                    String str3 = a.g;
                    aesg aesg = a.d;
                    if (aesg == null) {
                        akcr.a();
                    }
                    content = aesg.a;
                    akcr.a(content, "info.directDownloadUrl!!.url");
                    return qqf.a(qqi.a(c, str2, str3, content, true), set, z, set2);
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            qqg = this.a;
            obj = getContentForMessageModel.key();
            akcr.a(obj, str);
            set = this.b;
            z = this.c;
            set2 = this.d;
            ggh ggh = new ggh(a.f, a.g);
            boolean a2 = ggh.a();
            gie a3 = gii.a(ggh.b(), ggh.c());
            aeqy aeqy = new aeqy();
            aeqy.a = qwh.c(obj);
            aeqy.b = Boolean.valueOf(a2);
            obj = qqg.a.a(qqg.a(aeqy, set, (gfl) a3, set2)).a(z);
            akcr.a(obj, "contentManager.submit(bu…tResult(closeOnTerminate)");
            return obj;
        }
    }

    /* renamed from: qqg$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qqg a;
        private /* synthetic */ Set b;
        private /* synthetic */ boolean c;
        private /* synthetic */ Set d;

        e(qqg qqg, Set set, boolean z, Set set2) {
            this.a = qqg;
            this.b = set;
            this.c = z;
            this.d = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            DirectSnapInfo directSnapInfo = (DirectSnapInfo) obj;
            akcr.b(directSnapInfo, "info");
            qqg qqg;
            Set set;
            boolean z;
            Set set2;
            if (this.a.c.a(directSnapInfo.directDownloadUrl()) && ((ftl) this.a.e.get()).a((fth) qpy.USE_DIRECT_DOWNLOAD_URL_FOR_SNAPS)) {
                qqg = this.a;
                set = this.b;
                z = this.c;
                set2 = this.d;
                qqf qqf = (qqf) qqg.b.get();
                String a = qqg.a(directSnapInfo);
                String mediaKey = directSnapInfo.mediaKey();
                String mediaIv = directSnapInfo.mediaIv();
                aesg directDownloadUrl = directSnapInfo.directDownloadUrl();
                if (directDownloadUrl == null) {
                    akcr.a();
                }
                obj = directDownloadUrl.a;
                akcr.a(obj, "info.directDownloadUrl()!!.url");
                return qqf.a(qqi.a(a, mediaKey, mediaIv, obj, true), set, z, set2);
            }
            qqg = this.a;
            set = this.b;
            z = this.c;
            set2 = this.d;
            ggh ggh = new ggh(directSnapInfo.mediaKey(), directSnapInfo.mediaIv());
            boolean a2 = ggh.a();
            gie a3 = gii.a(ggh.b(), ggh.c());
            aeqy aeqy = new aeqy();
            aeqy.a = qqg.a(directSnapInfo);
            aeqy.b = Boolean.valueOf(a2);
            obj = qqg.a.a(qqg.a(aeqy, set, (gfl) a3, set2)).a(z);
            akcr.a(obj, "contentManager.submit(bu…tResult(closeOnTerminate)");
            return obj;
        }
    }

    /* renamed from: qqg$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ qqg a;

        a(qqg qqg) {
            this.a = qqg;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d.getDbClient(pry.a.callsite("DirectSnapUriHandler"));
        }
    }

    /* renamed from: qqg$b */
    static final class b extends akcq implements akbl<Cursor, DirectSnapInfo> {
        b(ainw ainw) {
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
            return (DirectSnapInfo) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: qqg$c */
    static final class c extends akcq implements akbl<Cursor, GetContentForMessageModel> {
        c(ainw ainw) {
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
            return (GetContentForMessageModel) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(qqg.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    public qqg(pqu pqu, gee gee, ajwy<qqf> ajwy, pvu pvu, SnapDb snapDb, aipn<ftl> aipn, Uri uri) {
        akcr.b(pqu, "chatSnapContentType");
        akcr.b(gee, "contentManager");
        akcr.b(ajwy, "directDownloadUriHandler");
        akcr.b(pvu, "messagingUriHandlerHelper");
        akcr.b(snapDb, "snapDb");
        akcr.b(aipn, "configProvider");
        akcr.b(uri, "baseUrl");
        this.h = pqu;
        this.a = gee;
        this.b = ajwy;
        this.c = pvu;
        this.d = snapDb;
        this.e = aipn;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri.toString());
        stringBuilder.append("/ph/blob");
        this.g = stringBuilder.toString();
    }

    private final DbClient a() {
        return (DbClient) this.f.b();
    }

    static String a(DirectSnapInfo directSnapInfo) {
        Object snapId = directSnapInfo.snapId();
        akcr.a(snapId, "info.snapId()");
        return qwh.c(snapId);
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        String str;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object obj = uri.getPathSegments().get(1);
        akcr.a(obj, "uri.pathSegments[1]");
        long parseLong = Long.parseLong((String) obj);
        if (((ftl) this.e.get()).a((fth) qpy.ENABLE_SNAP_DATA_REFACTOR)) {
            obj = MessageRecord.FACTORY.getContentForMessages(new long[]{parseLong});
            akcr.a(obj, "MessageRecord.FACTORY.ge…s(longArrayOf(snapRowId))");
            obj = a().queryAndMapToOne(obj, new c(LegacyMessageQueries.GET_CONTENT_FOR_MESSAGE_MODEL_ROW_MAPPER)).e().a((ajfc) new d(this, set, z, set2));
            str = "dbClient.queryAndMapToOn…  }\n                    }";
        } else {
            obj = MessagingSnapRecord.FACTORY.getDownloadInfoForDirectSnaps(parseLong);
            akcr.a(obj, "MessagingSnapRecord.FACT…ForDirectSnaps(snapRowId)");
            obj = a().queryAndMapToOne("ch:getDownloadInfoForDirectSnaps", obj, new b(LegacyMessagingSnapQueries.DOWNLOAD_INFO_FOR_DIRECT_SNAP_MAPPER)).e();
            akcr.a(obj, "dbClient.queryAndMapToOn…          .firstOrError()");
            obj = obj.a((ajfc) new e(this, set, z, set2));
            str = "getDownloadInfoForDirect…  }\n                    }";
        }
        akcr.a(obj, str);
        return obj;
    }

    /* Access modifiers changed, original: final */
    public final gew a(aeqy aeqy, Set<rzg> set, gfl gfl, Set<? extends gdy> set2) {
        Object obj = aeqy.a;
        akcr.a(obj, "request.id");
        Object e = new sbm.a(this.g, sac.POST).b(new gma(aeqy)).e();
        akcr.a(e, "SimpleRequest.Builder<An…                 .build()");
        return new gew(obj, e, null, gfl, this.h, set, set2, 268);
    }
}

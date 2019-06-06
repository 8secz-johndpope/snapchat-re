package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.LegacyMessageQueries;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.MessageRecord;
import com.snap.core.db.record.MessageRecord.GetContentForMessageModel;
import com.snap.core.db.record.MessageRecord.MischiefPlayableSnapInfo;
import defpackage.pun.a;
import java.util.Set;

@ftr(a = "group/#")
/* renamed from: qqh */
public final class qqh extends ggm {
    final pqu a;
    final SnapDb b;
    final ajwy<pqr> c;
    private final ajxe d = ajxh.a(new a(this));
    private final ajwy<ftl> e;

    /* renamed from: qqh$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ qqh a;
        private /* synthetic */ Uri b;
        private /* synthetic */ Set c;
        private /* synthetic */ boolean d;
        private /* synthetic */ Set e;

        b(qqh qqh, Uri uri, Set set, boolean z, Set set2) {
            this.a = qqh;
            this.b = uri;
            this.c = set;
            this.d = z;
            this.e = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            pqo pqo = (pqo) obj;
            akcr.b(pqo, "chatMediaDownloadInfo");
            pqr pqr = (pqr) this.a.c.get();
            Uri uri = this.b;
            akcr.b(uri, MessageMediaRefModel.URI);
            Object obj2 = (String) uri.getPathSegments().get(1);
            akcr.a(obj2, "getCacheKey(uri)");
            return pqr.a(pqo, obj2, true, this.c, this.d, this.e, this.a.a);
        }
    }

    /* renamed from: qqh$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            GetContentForMessageModel getContentForMessageModel = (GetContentForMessageModel) obj;
            akcr.b(getContentForMessageModel, DdmlDataModel.RECORD);
            Object content = getContentForMessageModel.content();
            if (content != null) {
                akcr.a(content, "record.content() ?: thro…ytes should not be null\")");
                content = getContentForMessageModel.content();
                if (content == null) {
                    akcr.a();
                }
                akcr.a(content, "record.content()!!");
                pun a = a.a(content);
                Object key = getContentForMessageModel.key();
                akcr.a(key, "record.key()");
                String str = a.e;
                gcp gcp = a.h;
                if (gcp == null) {
                    gcp = gcp.IMAGE;
                }
                gcp gcp2 = gcp;
                Object Feed_key = getContentForMessageModel.Feed_key();
                akcr.a(Feed_key, "record.Feed_key()");
                Object senderUsername = getContentForMessageModel.senderUsername();
                akcr.a(senderUsername, "record.senderUsername()");
                return new pqo(key, str, gcp2, Feed_key, senderUsername, a.f, a.g, a.d);
            }
            throw new IllegalStateException("message content bytes should not be null");
        }
    }

    /* renamed from: qqh$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            MischiefPlayableSnapInfo mischiefPlayableSnapInfo = (MischiefPlayableSnapInfo) obj;
            akcr.b(mischiefPlayableSnapInfo, "info");
            Object key = mischiefPlayableSnapInfo.key();
            akcr.a(key, "info.key()");
            String mediaId = mischiefPlayableSnapInfo.mediaId();
            Object snapType = mischiefPlayableSnapInfo.snapType();
            akcr.a(snapType, "info.snapType()");
            Object conversationId = mischiefPlayableSnapInfo.conversationId();
            akcr.a(conversationId, "info.conversationId()");
            Object senderId = mischiefPlayableSnapInfo.senderId();
            akcr.a(senderId, "info.senderId()");
            return new pqo(key, mediaId, snapType, conversationId, senderId, mischiefPlayableSnapInfo.cryptoKey(), mischiefPlayableSnapInfo.cryptoIV(), mischiefPlayableSnapInfo.directDownloadUrl());
        }
    }

    /* renamed from: qqh$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ qqh a;

        a(qqh qqh) {
            this.a = qqh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.getDbClient(pry.a.callsite("GroupSnapUriHandler"));
        }
    }

    /* renamed from: qqh$c */
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

    /* renamed from: qqh$e */
    static final class e extends akcq implements akbl<Cursor, MischiefPlayableSnapInfo> {
        e(ainw ainw) {
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
            return (MischiefPlayableSnapInfo) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(qqh.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    public qqh(pqu pqu, SnapDb snapDb, ajwy<pqr> ajwy, ajwy<ftl> ajwy2) {
        akcr.b(pqu, "chatSnapContentType");
        akcr.b(snapDb, "snapDb");
        akcr.b(ajwy, "chatMediaUriHandlerHelper");
        akcr.b(ajwy2, "configProvider");
        this.a = pqu;
        this.b = snapDb;
        this.c = ajwy;
        this.e = ajwy2;
    }

    private final DbClient a() {
        return (DbClient) this.d.b();
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        String str;
        String str2 = MessageMediaRefModel.URI;
        akcr.b(uri, str2);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        akcr.b(uri, str2);
        Object obj = uri.getPathSegments().get(1);
        akcr.a(obj, "uri.pathSegments[1]");
        long parseLong = Long.parseLong((String) obj);
        if (((ftl) this.e.get()).a((fth) qpy.ENABLE_SNAP_DATA_REFACTOR)) {
            obj = MessageRecord.FACTORY.getContentForMessages(new long[]{parseLong});
            akcr.a(obj, "MessageRecord.FACTORY.ge…ages(longArrayOf(snapId))");
            obj = a().queryAndMapToOneOrError(obj, new c(LegacyMessageQueries.GET_CONTENT_FOR_MESSAGE_MODEL_ROW_MAPPER)).f(d.a);
            str = "dbClient.queryAndMapToOn…rl)\n                    }";
        } else {
            obj = MessageRecord.FACTORY.getMessageMediaInfoForSnapId(parseLong);
            akcr.a(obj, "MessageRecord.FACTORY.ge…ediaInfoForSnapId(snapId)");
            obj = a().queryAndMapToOneOrError("GroupSnapUri:resolve", obj, new e(LegacyMessageQueries.MISCHIEF_INFO_MAPPER)).f(f.a);
            str = "dbClient.queryAndMapToOn…())\n                    }";
        }
        akcr.a(obj, str);
        Object a = obj.a((ajfc) new b(this, uri, set, z, set2));
        akcr.a(a, "resolveMediaInfo(uri)\n  …      )\n                }");
        return a;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2, ajdx<gej> ajdx) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        akcr.b(ajdx, "contentResultFrom");
        throw new UnsupportedOperationException("Group snap don't support fallback uri");
    }
}

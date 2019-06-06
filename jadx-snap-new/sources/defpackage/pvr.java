package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.brightcove.player.event.Event;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.ReplyMedia;
import com.snap.core.db.record.LegacyMessageQueries;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.MessageModel.GetMessageMediaInfoForKeyModel;
import com.snap.core.db.record.MessageRecord;
import com.snap.core.db.record.MessageRecord.MessageMediaForKeyInfo;
import defpackage.gcp.a;
import java.util.Set;

@ftr(a = "chat_media/*/*")
/* renamed from: pvr */
public final class pvr extends ggm {
    final pqu a;
    final SnapDb b;
    final ajwy<pqr> c;
    private final ajxe d = ajxh.a(new a(this));
    private final ajwy<gee> e;

    /* renamed from: pvr$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ pvr a;
        private /* synthetic */ Uri b;
        private /* synthetic */ Set c;
        private /* synthetic */ boolean d;
        private /* synthetic */ Set e;

        b(pvr pvr, Uri uri, Set set, boolean z, Set set2) {
            this.a = pvr;
            this.b = uri;
            this.c = set;
            this.d = z;
            this.e = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            pqo pqo = (pqo) obj;
            akcr.b(pqo, "chatMediaDownloadInfo");
            return ((pqr) this.a.c.get()).a(pqo, this.a.a(this.b), false, this.c, this.d, this.e, this.a.a);
        }
    }

    /* renamed from: pvr$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ pvr a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ Integer d;

        d(pvr pvr, String str, String str2, Integer num) {
            this.a = pvr;
            this.b = str;
            this.c = str2;
            this.d = num;
        }

        public final /* synthetic */ Object apply(Object obj) {
            MessageMediaForKeyInfo messageMediaForKeyInfo = (MessageMediaForKeyInfo) obj;
            String str = "info";
            akcr.b(messageMediaForKeyInfo, str);
            GetMessageMediaInfoForKeyModel getMessageMediaInfoForKeyModel = messageMediaForKeyInfo;
            Object obj2 = this.b;
            String str2 = "messageId";
            akcr.a(obj2, str2);
            Object obj3 = this.c;
            String str3 = "mediaId";
            akcr.a(obj3, str3);
            Integer num = this.d;
            akcr.b(getMessageMediaInfoForKeyModel, str);
            akcr.b(obj2, str2);
            akcr.b(obj3, str3);
            str2 = "info.senderId()";
            str3 = "info.conversationId()";
            Object senderId;
            if (akcr.a(getMessageMediaInfoForKeyModel.type(), aesq.SNAP.a())) {
                ReplyMedia snapReplyMedia = getMessageMediaInfoForKeyModel.snapReplyMedia();
                if (snapReplyMedia != null) {
                    str = snapReplyMedia.getType();
                    if (str != null) {
                        ReplyMedia snapReplyMedia2 = getMessageMediaInfoForKeyModel.snapReplyMedia();
                        if (snapReplyMedia2 != null) {
                            String cryptoKey = snapReplyMedia2.getCryptoKey();
                            if (cryptoKey != null) {
                                snapReplyMedia2 = getMessageMediaInfoForKeyModel.snapReplyMedia();
                                if (snapReplyMedia2 != null) {
                                    String cryptoIv = snapReplyMedia2.getCryptoIv();
                                    if (cryptoIv != null) {
                                        gcp a = a.a(str);
                                        Object conversationId = getMessageMediaInfoForKeyModel.conversationId();
                                        akcr.a(conversationId, str3);
                                        senderId = getMessageMediaInfoForKeyModel.senderId();
                                        akcr.a(senderId, str2);
                                        return new pqo(obj2, obj3, a, conversationId, senderId, cryptoKey, cryptoIv, null);
                                    }
                                }
                                throw new IllegalStateException("snapReplyMedia.cryptoIv should not be null");
                            }
                        }
                        throw new IllegalStateException("snapReplyMedia.cryptoKey should not be null");
                    }
                }
                throw new IllegalStateException("snapReplyMedia.type should not be null");
            }
            Object type = getMessageMediaInfoForKeyModel.type();
            if (type != null) {
                akcr.a(type, "info.type()\n            …type should not be null\")");
                senderId = getMessageMediaInfoForKeyModel.content();
                if (senderId != null) {
                    akcr.a(senderId, "info.content()\n         …ytes should not be null\")");
                    prm a2 = pro.a(pul.a(type, senderId), obj3, num);
                    gcp a3 = a.a(a2.b);
                    String conversationId2 = getMessageMediaInfoForKeyModel.conversationId();
                    akcr.a((Object) conversationId2, str3);
                    String senderId2 = getMessageMediaInfoForKeyModel.senderId();
                    akcr.a((Object) senderId2, str2);
                    return new pqo(obj2, obj3, a3, conversationId2, senderId2, a2.c, a2.d, a2.g);
                }
                throw new IllegalStateException("message content bytes should not be null");
            }
            throw new IllegalStateException("message record type should not be null");
        }
    }

    /* renamed from: pvr$a */
    static final class a extends akcs implements akbk<DbClient> {
        private /* synthetic */ pvr a;

        a(pvr pvr) {
            this.a = pvr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.getDbClient(pry.a.callsite("ChatMediaUriHandler"));
        }
    }

    /* renamed from: pvr$c */
    static final class c extends akcq implements akbl<Cursor, MessageMediaForKeyInfo> {
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
            return (MessageMediaForKeyInfo) ((ainw) this.receiver).map(cursor);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(pvr.class), "dbClient", "getDbClient()Lcom/snap/core/db/api/DbClient;");
    }

    public pvr(pqu pqu, SnapDb snapDb, ajwy<gee> ajwy, ajwy<pqr> ajwy2) {
        akcr.b(pqu, "chatSnapContentType");
        akcr.b(snapDb, "snapDb");
        akcr.b(ajwy, "contentManager");
        akcr.b(ajwy2, "chatMediaUriHandlerHelper");
        this.a = pqu;
        this.b = snapDb;
        this.e = ajwy;
        this.c = ajwy2;
    }

    private final DbClient a() {
        return (DbClient) this.d.b();
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object a = c(uri).a((ajfc) new b(this, uri, set, z, set2));
        akcr.a(a, "resolveMediaInfo(uri)\n  …      )\n                }");
        return a;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2, ajdx<gej> ajdx) {
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        Set<rzg> set3 = set;
        akcr.b(set, "schedulingContexts");
        Set<? extends gdy> set4 = set2;
        akcr.b(set4, "cacheAccessControls");
        akcr.b(ajdx, "contentResultFrom");
        gee gee = (gee) this.e.get();
        String a = a(uri);
        sak sak = null;
        Object a2 = gee.a(new gew(a, sak, gem.a((ajdx) ajdx), null, this.a, set3, set4, 278)).a(z);
        akcr.a(a2, "contentManager.get().sub…tResult(closeOnTerminate)");
        return a2;
    }

    public final String a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        pqr pqr = (pqr) this.c.get();
        Object obj = uri.getPathSegments().get(1);
        akcr.a(obj, "uri.pathSegments[1]");
        String str = (String) obj;
        Object obj2 = uri.getPathSegments().get(2);
        akcr.a(obj2, "uri.pathSegments[2]");
        return pqr.a(str, (String) obj2);
    }

    public final Set<gdy> b(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return ajzs.a(gdy.PREFER_FALLBACK_URI);
    }

    public final ajdx<pqo> c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String str = (String) uri.getPathSegments().get(1);
        String str2 = (String) uri.getPathSegments().get(2);
        String queryParameter = uri.getQueryParameter(Event.INDEX);
        Integer d = queryParameter != null ? akga.d(queryParameter) : null;
        Object messageMediaInfoForKey = MessageRecord.FACTORY.getMessageMediaInfoForKey(str);
        akcr.a(messageMediaInfoForKey, "MessageRecord.FACTORY.ge…ediaInfoForKey(messageId)");
        Object f = a().queryAndMapToOneOrError(messageMediaInfoForKey, new c(LegacyMessageQueries.MESSAGE_MEDIA_INFO_KEY_MAPPER)).f(new d(this, str, str2, d));
        akcr.a(f, "dbClient.queryAndMapToOn…aIndex)\n                }");
        return f;
    }
}

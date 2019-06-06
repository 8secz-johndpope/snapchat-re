package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.gson.reflect.TypeToken;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.LegacyStorySnapQueries;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StoryRecord;
import com.snap.core.db.record.StorySnapRecord;
import com.snap.core.db.record.StorySnapRecord.StorySnapDownload;
import java.util.Map;

@ftr(a = "story/*/*/*")
/* renamed from: yjm */
public final class yjm extends yjd {
    final ajxe e;
    final evg f;
    final aipn<iha> g;
    private final ajxe h;
    private volatile DbClient i = this.k.getDbClient((ide) yhy.j);
    private volatile int j = this.k.getSessionId();
    private final SnapDb k;

    /* renamed from: yjm$c */
    static final class c extends akcs implements akbk<ilv> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) this.a.get();
        }
    }

    /* renamed from: yjm$a */
    static final class a extends akcs implements akbk<ftl> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: yjm$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ yjm a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;

        e(yjm yjm, String str, String str2) {
            this.a = yjm;
            this.b = str;
            this.c = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            StorySnapDownload storySnapDownload = (StorySnapDownload) obj;
            akcr.b(storySnapDownload, DdmlDataModel.RECORD);
            yjm yjm = this.a;
            String mediaUrl = storySnapDownload.mediaUrl();
            String ruleFileParams = storySnapDownload.ruleFileParams();
            gcp snapType = storySnapDownload.snapType();
            String str2 = "record.snapType()";
            akcr.a((Object) snapType, str2);
            if (ruleFileParams != null) {
                int i = 0;
                int i2 = (((ftl) yjm.e.b()).a((fth) yiz.USE_COF_USER_STORY_VIDEO_MEDIA_SELECTION) && (snapType == gcp.VIDEO || snapType == gcp.VIDEO_NO_SOUND)) ? 1 : 0;
                str = "method";
                if (i2 == 1) {
                    yjm.a().c(int.MEDIA_SELECTION_METHOD.a(str, "cof"), 1);
                    Object a = ((iha) yjm.g.get()).a(ruleFileParams, new b().getType());
                    akcr.a(a, "serializationHelper.get(…                 mapType)");
                    Map map = (Map) a;
                    acce acce = new acce();
                    acce.a = new alqk();
                    Object obj2 = acce.a;
                    String str3 = "inputSignal.mediaMetadata";
                    akcr.a(obj2, str3);
                    akcr.b(snapType, "snapType");
                    switch (gcs.c[snapType.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            i = 1;
                            break;
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 16:
                            i = 2;
                            break;
                        case 17:
                            i = 3;
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                            i = -1;
                            break;
                        default:
                            throw new ajxk();
                    }
                    obj2.a(i);
                    Object obj3 = acce.a;
                    akcr.a(obj3, str3);
                    if (obj3.a() != -1) {
                        String g = yjm.f.g(yiz.STORY_VIDEO_MEDIA_SELECTION, acce);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(g);
                        stringBuilder.append("_URL");
                        String stringBuilder2 = stringBuilder.toString();
                        boolean containsKey = map.containsKey(stringBuilder2);
                        yjm.a().c(int.MEDIA_SELECTION_RESULT.a("requested", g).a("available", containsKey), 1);
                        if (containsKey) {
                            mediaUrl = (String) map.get(stringBuilder2);
                        }
                    }
                } else {
                    yjm.a().c(int.MEDIA_SELECTION_METHOD.a(str, "legacy"), 1);
                }
            }
            str = mediaUrl;
            StringBuilder stringBuilder3 = new StringBuilder("Resolving snapId=");
            stringBuilder3.append(storySnapDownload.snapId());
            stringBuilder3.append(", snapType=");
            stringBuilder3.append(storySnapDownload.snapType());
            stringBuilder3.append(", storyId=");
            stringBuilder3.append(this.b);
            stringBuilder3.append(", clientId=");
            stringBuilder3.append(this.c);
            stringBuilder3.append(" to ");
            stringBuilder3.append(str);
            String mediaId = storySnapDownload.mediaId();
            Object snapType2 = storySnapDownload.snapType();
            akcr.a(snapType2, str2);
            return new gfe(mediaId, snapType2, str, storySnapDownload.mediaKey(), storySnapDownload.mediaIv(), 0, false);
        }
    }

    /* renamed from: yjm$d */
    static final class d extends akcq implements akbl<Cursor, StorySnapDownload> {
        d(ainw ainw) {
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
            return (StorySnapDownload) ((ainw) this.receiver).map(cursor);
        }
    }

    /* renamed from: yjm$b */
    public static final class b extends TypeToken<Map<String, ? extends String>> {
        b() {
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yjm.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;"), new akdc(akde.a(yjm.class), "compositeConfig", "getCompositeConfig()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;")};
    }

    public yjm(yjp yjp, gee gee, SnapDb snapDb, Uri uri, evg evg, ajwy<ftl> ajwy, aipn<iha> aipn, yjh yjh, ajwy<ilv> ajwy2) {
        akcr.b(yjp, "storiesSnapContentType");
        akcr.b(gee, "contentManager");
        akcr.b(snapDb, "snapDb");
        akcr.b(uri, "baseUrl");
        akcr.b(evg, "circumstanceEngine");
        akcr.b(ajwy, "compositeConfigProvider");
        akcr.b(aipn, "serializationHelper");
        akcr.b(yjh, "additionalImageResolver");
        akcr.b(ajwy2, "grapheneProvider");
        super(gee, yjp, uri, yjh);
        this.k = snapDb;
        this.f = evg;
        this.g = aipn;
        this.h = ajxh.a(new c(ajwy2));
        this.e = ajxh.a(new a(ajwy));
    }

    private final DbClient b() {
        Object obj;
        if (this.j != this.k.getSessionId()) {
            obj = this.i;
            akcr.a(obj, "_dbClient");
            synchronized (obj) {
                if (this.j != this.k.getSessionId()) {
                    this.j = this.k.getSessionId();
                    this.i = this.k.getDbClient((ide) yhy.j);
                }
            }
        }
        obj = this.i;
        akcr.a(obj, "_dbClient");
        return obj;
    }

    public final ajdx<gfe> a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String str = (String) uri.getPathSegments().get(1);
        String str2 = (String) uri.getPathSegments().get(2);
        Object obj = uri.getPathSegments().get(3);
        akcr.a(obj, "uri.pathSegments[3]");
        obj = StorySnapRecord.FACTORY.getDownloadDataForStorySnap(StoryRecord.FACTORY, str, str2, StoryKind.values()[Integer.parseInt((String) obj)]);
        akcr.a(obj, "StorySnapRecord.FACTORY.…lues()[storyKindOrdinal])");
        obj = b().queryAndMapToOneOrError("StoriesUriHandler", obj, new d(LegacyStorySnapQueries.STORY_SNAP_DOWNLOAD_MAPPER)).f(new e(this, str2, str));
        akcr.a(obj, "dbClient.queryAndMapToOn… false)\n                }");
        return obj;
    }

    /* Access modifiers changed, original: final */
    public final ilv a() {
        return (ilv) this.h.b();
    }
}

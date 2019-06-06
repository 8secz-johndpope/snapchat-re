package defpackage;

import android.net.Uri;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.StorySnapRecord.PlayableStorySnapRecord;

/* renamed from: yoo */
public final class yoo {
    private final gfu a;

    /* renamed from: yoo$a */
    public static final class a {
        public final b a;
        public final gej b;

        public a(b bVar, gej gej) {
            akcr.b(bVar, "status");
            this.a = bVar;
            this.b = gej;
        }
    }

    /* renamed from: yoo$b */
    public enum b {
        DOWNLOADING,
        SUCCESS,
        FAIL
    }

    /* renamed from: yoo$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            return gej.a() ? new a(b.SUCCESS, gej) : new a(b.DOWNLOADING, gej);
        }
    }

    /* renamed from: yoo$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            return gej.a() ? new a(b.SUCCESS, gej) : new a(b.FAIL, gej);
        }
    }

    /* renamed from: yoo$e */
    static final class e<T> implements ajfl<a> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, Tags.CAPTION);
            return aVar.a != b.DOWNLOADING;
        }
    }

    /* renamed from: yoo$f */
    public static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            return Boolean.valueOf(gej.a());
        }
    }

    public yoo(gfu gfu) {
        akcr.b(gfu, "contentResolver");
        this.a = gfu;
    }

    private static Uri a(PlayableStorySnapRecord playableStorySnapRecord) {
        String clientId = playableStorySnapRecord.clientId();
        String str = "Required value was null.";
        if (clientId != null) {
            String storyId = playableStorySnapRecord.storyId();
            if (storyId != null) {
                StoryKind kind = playableStorySnapRecord.kind();
                if (kind != null) {
                    return yjl.a(clientId, storyId, kind);
                }
                throw new IllegalStateException(str.toString());
            }
            throw new IllegalStateException(str.toString());
        }
        throw new IllegalStateException(str.toString());
    }

    private final ajdx<gej> d(PlayableStorySnapRecord playableStorySnapRecord, idl idl) {
        return this.a.a(yoo.a(playableStorySnapRecord), idl, true, new gdy[0]);
    }

    public final ajdp<a> a(PlayableStorySnapRecord playableStorySnapRecord, idl idl) {
        akcr.b(playableStorySnapRecord, DdmlDataModel.RECORD);
        akcr.b(idl, "uiPage");
        Object j = ajdx.a((ajeb) c(playableStorySnapRecord, idl).f(c.a), (ajeb) d(playableStorySnapRecord, idl).f(d.a)).c((ajfl) e.a).j();
        akcr.a(j, "Single.concat(readCache(…WNLOADING}.toObservable()");
        return j;
    }

    public final ajcx b(PlayableStorySnapRecord playableStorySnapRecord, idl idl) {
        akcr.b(playableStorySnapRecord, DdmlDataModel.RECORD);
        akcr.b(idl, "uiPage");
        return this.a.a(yoo.a(playableStorySnapRecord), idl, 1.0f);
    }

    public final ajdx<gej> c(PlayableStorySnapRecord playableStorySnapRecord, idl idl) {
        return this.a.a(yoo.a(playableStorySnapRecord), idl, true, gdy.READ_CACHE_ONLY);
    }
}

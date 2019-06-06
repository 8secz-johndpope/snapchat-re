package defpackage;

import android.net.Uri;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapRecord.PlayableStorySnapRecord;
import com.snap.core.db.record.UnlockablesModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: hmc */
public final class hmc implements hmi<hjh> {
    private final List<hbj> a = ajyl.a(hbj.FRIEND_STORY_CARD);
    private final yhx b;
    private final zfw c;

    /* renamed from: hmc$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hmc a;
        private /* synthetic */ hjh b;
        private /* synthetic */ idl c;
        private /* synthetic */ ajfb d;

        a(hmc hmc, hjh hjh, idl idl, ajfb ajfb) {
            this.a = hmc;
            this.b = hjh;
            this.c = idl;
            this.d = ajfb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "snaps");
            if (list.isEmpty()) {
                return ajvo.a(ajsn.a);
            }
            for (Object next : list) {
                Boolean viewed = ((PlayableStorySnapRecord) next).viewed();
                Object obj2 = null;
                if (!(viewed == null || viewed.booleanValue())) {
                    obj2 = 1;
                    continue;
                }
                if (obj2 != null) {
                    break;
                }
            }
            Object next2 = null;
            PlayableStorySnapRecord playableStorySnapRecord = (PlayableStorySnapRecord) next2;
            if (playableStorySnapRecord == null) {
                playableStorySnapRecord = (PlayableStorySnapRecord) ajyu.f(list);
            }
            String clientId = playableStorySnapRecord.clientId();
            akcr.a((Object) clientId, "snap.clientId()");
            String storyId = playableStorySnapRecord.storyId();
            if (storyId == null) {
                akcr.a();
            }
            akcr.a((Object) storyId, "snap.storyId()!!");
            StoryKind kind = playableStorySnapRecord.kind();
            if (kind == null) {
                akcr.a();
            }
            akcr.a((Object) kind, "snap.kind()!!");
            Uri a = yjl.a(clientId, storyId, kind);
            Object snapId = playableStorySnapRecord.snapId();
            akcr.a(snapId, "snap.snapId()");
            return ajdx.b((Object) new gnt(snapId, a, this.c, gnr.SNAP, 1.0f, this.d));
        }
    }

    /* renamed from: hmc$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ hmc a;
        private /* synthetic */ hjh b;
        private /* synthetic */ int c;
        private /* synthetic */ idl d;
        private /* synthetic */ float e;
        private /* synthetic */ ajfb f;

        b(hmc hmc, hjh hjh, int i, idl idl, float f, ajfb ajfb) {
            this.a = hmc;
            this.b = hjh;
            this.c = i;
            this.d = idl;
            this.e = f;
            this.f = ajfb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            String str = "snaps";
            akcr.b(list, str);
            if (list.isEmpty()) {
                return ajyw.a;
            }
            akcr.b(list, str);
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (akcr.a(((PlayableStorySnapRecord) next).viewed(), Boolean.FALSE)) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            if ((list2.isEmpty() ^ 1) != 0) {
                list = list2;
            }
            Iterable<PlayableStorySnapRecord> c = ajyu.c((Iterable) list, this.c);
            Collection arrayList2 = new ArrayList(ajyn.a((Iterable) c, 10));
            for (PlayableStorySnapRecord playableStorySnapRecord : c) {
                String clientId = playableStorySnapRecord.clientId();
                akcr.a((Object) clientId, "snap.clientId()");
                String storyId = playableStorySnapRecord.storyId();
                if (storyId == null) {
                    akcr.a();
                }
                akcr.a((Object) storyId, "snap.storyId()!!");
                StoryKind kind = playableStorySnapRecord.kind();
                if (kind == null) {
                    akcr.a();
                }
                akcr.a((Object) kind, "snap.kind()!!");
                Uri a = yjl.a(clientId, storyId, kind);
                Object snapId = playableStorySnapRecord.snapId();
                akcr.a(snapId, "snap.snapId()");
                arrayList2.add(new gnt(snapId, a, this.d, gnr.SNAP, this.e, this.f));
            }
            return ajyu.k((List) arrayList2);
        }
    }

    public hmc(yhx yhx, zfw zfw) {
        akcr.b(yhx, "storiesDataProvider");
        akcr.b(zfw, "schedulers");
        this.b = yhx;
        this.c = zfw;
    }

    public final /* synthetic */ ajdx a(Object obj, int i, float f, idl idl, ajfb ajfb) {
        hjh hjh = (hjh) obj;
        akcr.b(hjh, UnlockablesModel.DATA);
        akcr.b(idl, "uiPage");
        obj = this.b.b(hjh.C()).a((ajdw) this.c.b()).f(new b(this, hjh, i, idl, f, ajfb));
        akcr.a(obj, "storiesDataProvider.play…  }\n                    }");
        return obj;
    }

    public final /* synthetic */ ajdx a(Object obj, idl idl, ajfb ajfb) {
        hjh hjh = (hjh) obj;
        akcr.b(hjh, UnlockablesModel.DATA);
        akcr.b(idl, "uiPage");
        akcr.b(ajfb, "prefetchStateObserver");
        obj = this.b.b(hjh.C()).a((ajdw) this.c.b()).a((ajfc) new a(this, hjh, idl, ajfb));
        akcr.a(obj, "storiesDataProvider.play…  }\n                    }");
        return obj;
    }

    public final List<hbj> a() {
        return this.a;
    }
}

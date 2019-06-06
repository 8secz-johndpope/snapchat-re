package defpackage;

import com.snap.core.db.query.LegacyFriendsFeedQueries.WithFriendAndStory;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: rdx */
public final class rdx {
    static final Map<Integer, ajxm<Object, Integer>> h = new LinkedHashMap();
    public final znh<WithFriendAndStory> a;
    public final rbj b;
    final boolean c;
    final rbf d;
    final rbi e;
    final abkq f;
    public final boolean g;

    /* renamed from: rdx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static int a(int i, Object obj) {
            akcr.b(obj, "thing");
            ajxm ajxm = (ajxm) rdx.h.get(Integer.valueOf(i));
            if (ajxm == null) {
                ajxm = new ajxm(null, Integer.valueOf(0));
            }
            if (ajxm.a == obj) {
                return ((Number) ajxm.b).intValue();
            }
            int intValue = ((Number) ajxm.b).intValue() + 1;
            rdx.h.put(Integer.valueOf(i), new ajxm(obj, Integer.valueOf(intValue)));
            return intValue;
        }
    }

    static {
        a aVar = new a();
    }

    public rdx(znh<WithFriendAndStory> znh, rbj rbj, boolean z, rbf rbf, rbi rbi, abkq abkq, boolean z2) {
        akcr.b(znh, "records");
        akcr.b(rbj, "config");
        akcr.b(rbf, "activeConversationState");
        akcr.b(rbi, "friendmojiMap");
        akcr.b(abkq, "userSession");
        this.a = znh;
        this.b = rbj;
        this.c = z;
        this.d = rbf;
        this.e = rbi;
        this.f = abkq;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rdx) {
                rdx rdx = (rdx) obj;
                if (akcr.a(this.a, rdx.a) && akcr.a(this.b, rdx.b)) {
                    if ((this.c == rdx.c ? 1 : null) != null && akcr.a(this.d, rdx.d) && akcr.a(this.e, rdx.e) && akcr.a(this.f, rdx.f)) {
                        if ((this.g == rdx.g ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        znh znh = this.a;
        int i = 0;
        int hashCode = (znh != null ? znh.hashCode() : 0) * 31;
        rbj rbj = this.b;
        hashCode = (hashCode + (rbj != null ? rbj.hashCode() : 0)) * 31;
        int i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        rbf rbf = this.d;
        hashCode = (hashCode + (rbf != null ? rbf.hashCode() : 0)) * 31;
        rbi rbi = this.e;
        hashCode = (hashCode + (rbi != null ? rbi.hashCode() : 0)) * 31;
        abkq abkq = this.f;
        if (abkq != null) {
            i = abkq.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.g;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("\n        records=");
        stringBuilder.append(a.a(0, this.a));
        stringBuilder.append(",\n        activeConversationState=");
        stringBuilder.append(a.a(1, this.d));
        stringBuilder.append(",\n        ");
        return stringBuilder.toString();
    }
}

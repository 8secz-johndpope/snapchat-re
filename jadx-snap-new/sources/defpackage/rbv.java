package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* renamed from: rbv */
public final class rbv {
    @SerializedName("last_interacted_ts")
    Long a;
    @SerializedName("types")
    List<rbu> b;

    /* renamed from: rbv$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        private static Long a(qzf qzf, Map<String, Long> map) {
            Long l = (Long) map.get(qzf.id);
            return (l != null && l.longValue() == 0) ? null : l;
        }

        public static rbv a(qwx qwx, Map<String, Long> map) {
            akcr.b(qwx, "feedTopPromptStore");
            akcr.b(map, "promptToFirstTimeShownMap");
            Long valueOf = Long.valueOf(qwx.b());
            if (valueOf.longValue() == 0) {
                valueOf = null;
            }
            return new rbv(valueOf, ajym.b((Object[]) new rbu[]{new rbu(qzf.BIRTHDAY_PARTY, qwx.a(qzf.BIRTHDAY_PARTY), a.a(qzf.BIRTHDAY_PARTY, (Map) map)), new rbu(qzf.NOTIFICATION_PERMISSION, qwx.a(qzf.NOTIFICATION_PERMISSION), a.a(qzf.NOTIFICATION_PERMISSION, (Map) map)), new rbu(qzf.PHONE_NUMBER_VERIFICATION, qwx.a(qzf.PHONE_NUMBER_VERIFICATION), a.a(qzf.PHONE_NUMBER_VERIFICATION, (Map) map)), new rbu(qzf.EMAIL_VERIFICATION, qwx.a(qzf.EMAIL_VERIFICATION), a.a(qzf.EMAIL_VERIFICATION, (Map) map)), new rbu(qzf.CONTACT_SYNC, qwx.a(qzf.CONTACT_SYNC), a.a(qzf.CONTACT_SYNC, (Map) map))}));
        }
    }

    static {
        a aVar = new a();
    }

    public rbv(Long l, List<rbu> list) {
        akcr.b(list, "topPromptStates");
        this.a = l;
        this.b = list;
    }

    public final void a(qzf qzf) {
        akcr.b(qzf, "promptType");
        for (rbu rbu : this.b) {
            if (rbu.a == qzf) {
                rbu.b++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            rbv rbv = (rbv) obj;
            return (akcr.a(this.a, rbv.a) ^ 1) == 0 && (akcr.a(this.b, rbv.b) ^ 1) == 0;
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.messaging.friendsfeed.ui.data.TopPromptsSyncedState");
        }
    }

    public final int hashCode() {
        Long l = this.a;
        return ((l != null ? l.hashCode() : 0) * 31) + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TopPromptsSyncedState(lastInteractedTimestamp=");
        stringBuilder.append(this.a);
        stringBuilder.append(", topPromptStates=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

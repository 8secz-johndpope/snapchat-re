package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: rbu */
public final class rbu {
    @SerializedName("type")
    qzf a;
    @SerializedName("interacted_count")
    int b;
    @SerializedName("first_time_shown_ts")
    Long c;

    /* renamed from: rbu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public rbu(qzf qzf, int i, Long l) {
        akcr.b(qzf, "promptType");
        this.a = qzf;
        this.b = i;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            rbu rbu = (rbu) obj;
            return this.a == rbu.a && this.b == rbu.b && (akcr.a(this.c, rbu.c) ^ 1) == 0;
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.messaging.friendsfeed.ui.data.TopPromptState");
        }
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        Long l = this.c;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TopPromptState(promptType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", interactedPromptCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(", firstTimeShownTs=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

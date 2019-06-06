package defpackage;

import com.brightcove.player.media.ErrorFields;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageRecord.WithFriend;

/* renamed from: qdk */
public final class qdk {
    final boolean a;
    final long b;
    final Long c;
    final MessageClientStatus d;
    final boolean e;
    final boolean f;
    private final String g;
    private final boolean h;

    /* renamed from: qdk$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static qdk a(WithFriend withFriend) {
            akcr.b(withFriend, ErrorFields.MESSAGE);
            boolean released = withFriend.released();
            long timestamp = withFriend.timestamp();
            Long seenTimestamp = withFriend.seenTimestamp();
            String type = withFriend.type();
            if (type == null) {
                type = "";
            }
            String str = type;
            MessageClientStatus clientStatus = withFriend.clientStatus();
            if (clientStatus == null) {
                clientStatus = MessageClientStatus.OK;
            }
            return new qdk(released, timestamp, seenTimestamp, str, clientStatus, withFriend.isSaved(), withFriend.isPreserved(), withFriend.isGroup());
        }
    }

    static {
        a aVar = new a();
    }

    public qdk(boolean z, long j, Long l, String str, MessageClientStatus messageClientStatus, boolean z2, boolean z3, boolean z4) {
        akcr.b(str, "type");
        akcr.b(messageClientStatus, "clientStatus");
        this.a = z;
        this.b = j;
        this.c = l;
        this.g = str;
        this.d = messageClientStatus;
        this.e = z2;
        this.f = z3;
        this.h = z4;
    }
}

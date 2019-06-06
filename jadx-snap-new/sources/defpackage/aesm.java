package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.util.Locale;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aesn.class)
/* renamed from: aesm */
public class aesm extends aezl implements aezk {
    @SerializedName("type")
    public String o;
    @SerializedName("id")
    public String p;
    @SerializedName("app_engine_target")
    public String q;

    /* renamed from: aesm$a */
    public enum a {
        INVALID_MESSAGE_TYPE("invalid_message_type"),
        CONNECT("connect"),
        DISCONNECT("disconnect"),
        DISCONNECT_CLIENT("disconnect_client"),
        PRESENCE("presence"),
        PRESENCE_V2("presence_v2"),
        SNAP_STATE("snap_state"),
        MESSAGE_PRESERVATION("message_preservation"),
        MESSAGE_STATE("message_state"),
        MESSAGE_RELEASE("message_release"),
        CHAT_MESSAGE("chat_message"),
        PING("ping"),
        PING_RESPONSE("ping_response"),
        ERROR("error"),
        PROTOCOL_ERROR("protocol_error"),
        CONVERSATION_MESSAGE_RESPONSE("conversation_message_response"),
        CONNECT_RESPONSE("connect_response"),
        CASH_STATE("cash_state"),
        CASH_RAIN("cash_rain"),
        RECEIVED_SNAP("received_snap"),
        CONNECTED_CALL("connected_call"),
        CHATV3_MESSAGE_RELEASE("chatv3_message_release"),
        CHATV3_SNAP_STATE("chatv3_snap_state"),
        CHATV3_UPDATE_MESSAGE("chatv3_update_message"),
        NOTIFICATION("notification"),
        VOLATILE_MESSAGE("volatile_message"),
        MESSAGE_ERASE("message_erase"),
        UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
        
        private final String value;

        private a(String str) {
            this.value = str;
        }

        public static a a(String str) {
            if (str == null) {
                return UNRECOGNIZED_VALUE;
            }
            try {
                return a.valueOf(str.toUpperCase(Locale.US));
            } catch (Exception unused) {
                return UNRECOGNIZED_VALUE;
            }
        }

        public final String a() {
            return this.value;
        }

        public final String toString() {
            return this.value;
        }
    }

    public final a b() {
        return a.a(this.o);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aesm)) {
            aesm aesm = (aesm) obj;
            return Objects.equal(this.o, aesm.o) && Objects.equal(this.p, aesm.p) && Objects.equal(this.q, aesm.q);
        }
    }

    public int hashCode() {
        String str = this.o;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.p;
        hashCode = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        str2 = this.q;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }
}

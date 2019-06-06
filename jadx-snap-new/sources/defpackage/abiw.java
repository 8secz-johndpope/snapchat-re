package defpackage;

/* renamed from: abiw */
public abstract class abiw implements abjb {
    public abja c() {
        return null;
    }

    public abjc d() {
        return abjc.NONE;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CallRequest{convoId=");
        stringBuilder.append(a());
        stringBuilder.append(",callAction=");
        stringBuilder.append(c());
        stringBuilder.append(",callingMedia=");
        stringBuilder.append(d());
        stringBuilder.append(",talkCorePayload=");
        stringBuilder.append(b() == null ? "NULL" : "...");
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

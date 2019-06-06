package defpackage;

/* renamed from: aq */
public final class aq {
    public static String a(String str) {
        StringBuilder stringBuilder = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"");
        stringBuilder.append(str);
        stringBuilder.append("\")");
        return stringBuilder.toString();
    }
}

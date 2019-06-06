package defpackage;

import java.util.LinkedHashMap;

/* renamed from: aipz */
public final class aipz {
    public static <K, V> LinkedHashMap<K, V> a(int i) {
        return new LinkedHashMap(aipz.b(i));
    }

    private static int b(int i) {
        return i < 3 ? i + 1 : i < AudioPlayer.INFINITY_LOOP_COUNT ? (int) ((((float) i) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
    }
}

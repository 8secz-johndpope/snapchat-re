package defpackage;

import android.content.Context;
import com.snap.core.db.column.FriendSuggestionPlacement;

/* renamed from: ist */
public final class ist {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final FriendSuggestionPlacement f;
    private final long g;
    private final Context h;
    private final iqt i;

    public ist(long j, String str, String str2, String str3, int i, Context context, String str4, iqt iqt, FriendSuggestionPlacement friendSuggestionPlacement) {
        akcr.b(str, "username");
        akcr.b(context, "context");
        akcr.b(str4, "displayName");
        akcr.b(iqt, "source");
        akcr.b(friendSuggestionPlacement, "friendSuggestionPlacement");
        this.g = j;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.h = context;
        this.e = str4;
        this.i = iqt;
        this.f = friendSuggestionPlacement;
    }
}

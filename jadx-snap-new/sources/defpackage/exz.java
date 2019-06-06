package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: exz */
public interface exz {

    /* renamed from: exz$a */
    public interface a {
        void onDismissedAlert();
    }

    /* renamed from: exz$b */
    public interface b {
        void didSelectYes(boolean z);
    }

    void a(Context context, CharSequence charSequence, String str, String str2, b bVar, zjm zjm);

    void a(Context context, String str, String str2, a aVar, zjm zjm);

    void a(Context context, String str, String str2, String str3, b bVar, OnDismissListener onDismissListener, zjm zjm);

    void a(Context context, String str, String str2, String str3, b bVar, zjm zjm);

    void a(Context context, String str, String str2, zjm zjm);
}

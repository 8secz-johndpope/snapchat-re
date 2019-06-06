package defpackage;

import android.annotation.TargetApi;
import defpackage.beg.a;
import defpackage.beg.c;
import java.util.UUID;

@TargetApi(18)
/* renamed from: bek */
public interface bek {
    byte[] executeKeyRequest(UUID uuid, a aVar);

    byte[] executeProvisionRequest(UUID uuid, c cVar);
}

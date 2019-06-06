package defpackage;

import com.google.common.base.Preconditions;
import java.net.URI;

/* renamed from: aixe */
public final class aixe extends aivo {
    public final /* synthetic */ aivn a(URI uri, aiud aiud) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        Object obj = (String) Preconditions.checkNotNull(uri.getPath(), "targetPath");
        Preconditions.checkArgument(obj.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", obj, (Object) uri);
        String substring = obj.substring(1);
        uri.getAuthority();
        return new aixd(substring, aiud, aixo.m, aixo.a ? aixo.l : aixo.k);
    }

    public final String a() {
        return "dns";
    }
}

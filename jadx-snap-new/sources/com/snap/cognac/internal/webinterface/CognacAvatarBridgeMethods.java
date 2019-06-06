package com.snap.cognac.internal.webinterface;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Base64;
import android.util.LruCache;
import com.google.common.collect.ImmutableSet;
import com.snap.bitmoji.net.BitmojiFsnHttpInterface;
import com.snapchat.bridgeWebview.Message;
import defpackage.acbq;
import defpackage.afnd;
import defpackage.aipn;
import defpackage.ajdx;
import defpackage.aklc;
import defpackage.dds;
import defpackage.eym;
import defpackage.fgb;
import defpackage.fgz;
import defpackage.fha;
import defpackage.fha.b;
import defpackage.fhc;
import defpackage.gdy;
import defpackage.gej;
import defpackage.gfr.a;
import defpackage.gfu;
import defpackage.jwe;
import defpackage.jwj;
import defpackage.kaz;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.Set;

public class CognacAvatarBridgeMethods extends fgz {
    private static final String BITMOJI_3D_BASE_URL = "https://us-east1-aws.api.snapchat.com/olympus/generate_gltf/";
    private static final String TAG = "CognacAvatarBridgeMethods";
    private static final Set<String> methods = ImmutableSet.of("fetchAvatar2D", "fetchAvatar3D");
    private static final LruCache<String, String> sStrangerAvatarCache = new LruCache(50);
    private final jwe mBitmapLoaderFactory;
    private final aipn<BitmojiFsnHttpInterface> mBitmojiFsnHttpInterface;
    private final aipn<gfu> mContentResolver;
    private final fgb mConversation;

    public CognacAvatarBridgeMethods(acbq acbq, fgb fgb, aipn<BitmojiFsnHttpInterface> aipn, aipn<gfu> aipn2, jwe jwe) {
        super(acbq);
        this.mConversation = fgb;
        this.mBitmojiFsnHttpInterface = aipn;
        this.mContentResolver = aipn2;
        this.mBitmapLoaderFactory = jwe;
    }

    private String buildUrl(String str) {
        StringBuilder stringBuilder = new StringBuilder(BITMOJI_3D_BASE_URL);
        stringBuilder.append(str);
        stringBuilder.append("?lod=3");
        return stringBuilder.toString();
    }

    private String encodeBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    private ajdx<String> fetch3dBitmoji(String str) {
        return ((gfu) this.mContentResolver.get()).a(a.b().buildUpon().appendPath("cognac-3d-bitmoji").appendPath(buildUrl(str)).build(), eym.b, true, new gdy[0]).f(-$$Lambda$CognacAvatarBridgeMethods$SuHfT1G7wuJopoSwnfR6CVDPI1Q.INSTANCE);
    }

    private ajdx<String> fetchBitmoji(Message message, String str, String str2) {
        return this.mBitmapLoaderFactory.a().a(dds.a(str2, str, afnd.COGNAC), eym.b).f(new -$$Lambda$CognacAvatarBridgeMethods$1hsQTMkqnKMG4AlRr6E2qXTfGJw(this, str2));
    }

    static /* synthetic */ String lambda$fetch3dBitmoji$5(gej gej) {
        return "data:model/gltf-binary;base64,".concat(String.valueOf(Base64.encodeToString(aklc.a(gej.b()), 0)));
    }

    public void fetchAvatar2D(Message message) {
        Object obj = message.params;
        if (!isValidParamsMap(obj)) {
            errorCallback(message, fha.a.INVALID_PARAM, b.INVALID_PARAM);
        }
        Map map = (Map) obj;
        this.mDisposable.a(fetchBitmoji(message, (String) map.get("variant"), (String) map.get("avatarId")).a(new -$$Lambda$CognacAvatarBridgeMethods$Zee11tvy9_BD1maGJQNYE0CGGNE(this, message), new -$$Lambda$CognacAvatarBridgeMethods$DyS7i5AMvXzTNXG65mjx3ZDFWvU(this, message)));
    }

    public void fetchAvatar3D(Message message) {
        Object obj = message.params;
        if (!isValidParamsMap(obj)) {
            errorCallback(message, fha.a.INVALID_PARAM, b.INVALID_PARAM);
        }
        this.mDisposable.a(fetch3dBitmoji((String) ((Map) obj).get("avatarId")).a(new -$$Lambda$CognacAvatarBridgeMethods$PzbTJgz5RbhEkgkt5WVQEKAclpw(this, message), new -$$Lambda$CognacAvatarBridgeMethods$GjCyuFF2qvda2VkY0nfID3DV5R0(this, message)));
    }

    public Set<String> getMethods() {
        return methods;
    }

    public /* synthetic */ void lambda$fetchAvatar2D$0$CognacAvatarBridgeMethods(Message message, String str) {
        this.mBridgeWebview.a(message, this.mGson.a.toJson(fhc.create(str, null)));
    }

    public /* synthetic */ void lambda$fetchAvatar2D$1$CognacAvatarBridgeMethods(Message message, Throwable th) {
        errorCallback(message, fha.a.RESOURCE_NOT_AVAILABLE, b.RESOURCE_NOT_AVAILABLE);
    }

    public /* synthetic */ void lambda$fetchAvatar3D$2$CognacAvatarBridgeMethods(Message message, String str) {
        this.mBridgeWebview.a(message, this.mGson.a.toJson(fhc.create(str, null)));
    }

    public /* synthetic */ void lambda$fetchAvatar3D$3$CognacAvatarBridgeMethods(Message message, Throwable th) {
        errorCallback(message, fha.a.RESOURCE_NOT_AVAILABLE, b.RESOURCE_NOT_AVAILABLE);
    }

    public /* synthetic */ String lambda$fetchBitmoji$4$CognacAvatarBridgeMethods(String str, kaz kaz) {
        Object obj;
        if (kaz == null) {
            obj = null;
        } else {
            try {
                obj = encodeBitmap(((jwj) kaz.a()).a());
            } catch (Throwable th) {
                if (kaz != null) {
                    kaz.dispose();
                }
            }
        }
        str = "data:image/png;base64,".concat(String.valueOf(obj));
        if (kaz != null) {
            kaz.dispose();
        }
        return str;
    }
}

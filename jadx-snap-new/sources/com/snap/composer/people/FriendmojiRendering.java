package com.snap.composer.people;

import com.snap.composer.actions.ComposerRunnableAction;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import java.util.LinkedHashMap;
import java.util.Map;

public interface FriendmojiRendering extends ComposerJsConvertible {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        static final class a extends akcs implements akbl<Object[], String> {
            private /* synthetic */ FriendmojiRendering a;

            a(FriendmojiRendering friendmojiRendering) {
                this.a = friendmojiRendering;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "_params");
                return this.a.render(FriendmojiRenderRequest.Companion.fromJavaScript(JSConversions.INSTANCE.getParameterOrNull(objArr, 0)));
            }
        }

        private Companion() {
        }

        public final FriendmojiRendering fromJavaScript(Object obj) {
            if (obj instanceof Map) {
                obj = JSConversions.INSTANCE.unwrapNativeInstance(((Map) obj).get("$nativeInstance"));
            }
            FriendmojiRendering friendmojiRendering = (FriendmojiRendering) (!(obj instanceof FriendmojiRendering) ? null : obj);
            if (friendmojiRendering != null) {
                return friendmojiRendering;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
            stringBuilder.append(obj);
            stringBuilder.append(" to FriendmojiRendering");
            throw new AttributeError(stringBuilder.toString());
        }

        public final Map<String, Object> toJavaScript(FriendmojiRendering friendmojiRendering) {
            akcr.b(friendmojiRendering, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("render", new ComposerRunnableAction(new a(friendmojiRendering)));
            linkedHashMap.put("$nativeInstance", JSConversions.INSTANCE.wrapNativeInstance(friendmojiRendering));
            return linkedHashMap;
        }
    }

    public static final class DefaultImpls {
        public static Object toJavaScript(FriendmojiRendering friendmojiRendering) {
            return FriendmojiRendering.Companion.toJavaScript(friendmojiRendering);
        }
    }

    String render(FriendmojiRenderRequest friendmojiRenderRequest);

    Object toJavaScript();
}

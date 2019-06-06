package com.snap.composer.people;

import com.snap.composer.actions.ComposerAction;
import com.snap.composer.actions.ComposerRunnableAction;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akbw;
import defpackage.akcr;
import defpackage.akcs;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface SuggestedFriendStoring extends ComposerJsConvertible {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        static final class a extends akcs implements akbl<Object[], ajxw> {
            private /* synthetic */ SuggestedFriendStoring a;

            static final class a extends akcs implements akbw<List<? extends SuggestedFriend>, Map<String, ? extends Object>, ajxw> {
                private /* synthetic */ ComposerAction a;

                a(ComposerAction composerAction) {
                    this.a = composerAction;
                    super(2);
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    SuggestedFriend[] suggestedFriendArr;
                    List list = (List) obj;
                    Map map = (Map) obj2;
                    Object[] objArr = new Object[2];
                    if (list != null) {
                        int size = list.size();
                        suggestedFriendArr = new SuggestedFriend[size];
                        for (int i = 0; i < size; i++) {
                            SuggestedFriend suggestedFriend = (SuggestedFriend) list.get(i);
                            if (suggestedFriend == null) {
                                suggestedFriend = null;
                            }
                            suggestedFriendArr[i] = suggestedFriend;
                        }
                    } else {
                        suggestedFriendArr = null;
                    }
                    objArr[0] = suggestedFriendArr;
                    if (map == null) {
                        map = null;
                    }
                    objArr[1] = map;
                    this.a.perform(objArr);
                    return ajxw.a;
                }
            }

            a(SuggestedFriendStoring suggestedFriendStoring) {
                this.a = suggestedFriendStoring;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "_params");
                JSConversions jSConversions = JSConversions.INSTANCE;
                String asString = jSConversions.asString(jSConversions.getParameterOrNull(objArr, 0));
                Object parameterOrNull = JSConversions.INSTANCE.getParameterOrNull(objArr, 1);
                if (!(parameterOrNull instanceof ComposerAction)) {
                    parameterOrNull = null;
                }
                ComposerAction composerAction = (ComposerAction) parameterOrNull;
                if (composerAction != null) {
                    this.a.getSuggestedFriends(asString, new a(composerAction));
                    return ajxw.a;
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                stringBuilder.append(JSConversions.INSTANCE.getParameterOrNull(objArr, 1));
                stringBuilder.append(" to ComposerAction");
                throw new AttributeError(stringBuilder.toString());
            }
        }

        static final class b extends akcs implements akbl<Object[], ajxw> {
            private /* synthetic */ SuggestedFriendStoring a;

            b(SuggestedFriendStoring suggestedFriendStoring) {
                this.a = suggestedFriendStoring;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "_params");
                this.a.hideSuggestedFriend(HideSuggestedFriendRequest.Companion.fromJavaScript(JSConversions.INSTANCE.getParameterOrNull(objArr, 0)));
                return ajxw.a;
            }
        }

        static final class c extends akcs implements akbl<Object[], ComposerRunnableAction> {
            private /* synthetic */ SuggestedFriendStoring a;

            static final class a extends akcs implements akbk<ajxw> {
                private /* synthetic */ ComposerAction a;

                a(ComposerAction composerAction) {
                    this.a = composerAction;
                    super(0);
                }

                public final /* synthetic */ Object invoke() {
                    this.a.perform(new Object[0]);
                    return ajxw.a;
                }
            }

            c(SuggestedFriendStoring suggestedFriendStoring) {
                this.a = suggestedFriendStoring;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "_params");
                Object parameterOrNull = JSConversions.INSTANCE.getParameterOrNull(objArr, 0);
                if (!(parameterOrNull instanceof ComposerAction)) {
                    parameterOrNull = null;
                }
                ComposerAction composerAction = (ComposerAction) parameterOrNull;
                if (composerAction != null) {
                    final akbk onSuggestedFriendsUpdated = this.a.onSuggestedFriendsUpdated(new a(composerAction));
                    return new ComposerRunnableAction(new akbl<Object[], ajxw>() {
                        public final /* synthetic */ Object invoke(Object obj) {
                            akcr.b((Object[]) obj, "_params");
                            onSuggestedFriendsUpdated.invoke();
                            return ajxw.a;
                        }
                    });
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                stringBuilder.append(JSConversions.INSTANCE.getParameterOrNull(objArr, 0));
                stringBuilder.append(" to ComposerAction");
                throw new AttributeError(stringBuilder.toString());
            }
        }

        private Companion() {
        }

        public final SuggestedFriendStoring fromJavaScript(Object obj) {
            if (obj instanceof Map) {
                obj = JSConversions.INSTANCE.unwrapNativeInstance(((Map) obj).get("$nativeInstance"));
            }
            SuggestedFriendStoring suggestedFriendStoring = (SuggestedFriendStoring) (!(obj instanceof SuggestedFriendStoring) ? null : obj);
            if (suggestedFriendStoring != null) {
                return suggestedFriendStoring;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
            stringBuilder.append(obj);
            stringBuilder.append(" to SuggestedFriendStoring");
            throw new AttributeError(stringBuilder.toString());
        }

        public final Map<String, Object> toJavaScript(SuggestedFriendStoring suggestedFriendStoring) {
            akcr.b(suggestedFriendStoring, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("getSuggestedFriends", new ComposerRunnableAction(new a(suggestedFriendStoring)));
            linkedHashMap.put("hideSuggestedFriend", new ComposerRunnableAction(new b(suggestedFriendStoring)));
            linkedHashMap.put("onSuggestedFriendsUpdated", new ComposerRunnableAction(new c(suggestedFriendStoring)));
            linkedHashMap.put("$nativeInstance", JSConversions.INSTANCE.wrapNativeInstance(suggestedFriendStoring));
            return linkedHashMap;
        }
    }

    public static final class DefaultImpls {
        public static Object toJavaScript(SuggestedFriendStoring suggestedFriendStoring) {
            return SuggestedFriendStoring.Companion.toJavaScript(suggestedFriendStoring);
        }
    }

    void getSuggestedFriends(String str, akbw<? super List<SuggestedFriend>, ? super Map<String, ? extends Object>, ajxw> akbw);

    void hideSuggestedFriend(HideSuggestedFriendRequest hideSuggestedFriendRequest);

    akbk<ajxw> onSuggestedFriendsUpdated(akbk<ajxw> akbk);

    Object toJavaScript();
}

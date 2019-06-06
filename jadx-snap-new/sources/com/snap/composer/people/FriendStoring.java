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

public interface FriendStoring extends ComposerJsConvertible {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        static final class a extends akcs implements akbl<Object[], ajxw> {
            private /* synthetic */ FriendStoring a;

            static final class a extends akcs implements akbw<List<? extends Friend>, Map<String, ? extends Object>, ajxw> {
                private /* synthetic */ ComposerAction a;

                a(ComposerAction composerAction) {
                    this.a = composerAction;
                    super(2);
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    Friend[] friendArr;
                    List list = (List) obj;
                    Map map = (Map) obj2;
                    Object[] objArr = new Object[2];
                    if (list != null) {
                        int size = list.size();
                        friendArr = new Friend[size];
                        for (int i = 0; i < size; i++) {
                            Friend friend = (Friend) list.get(i);
                            if (friend == null) {
                                friend = null;
                            }
                            friendArr[i] = friend;
                        }
                    } else {
                        friendArr = null;
                    }
                    objArr[0] = friendArr;
                    if (map == null) {
                        map = null;
                    }
                    objArr[1] = map;
                    this.a.perform(objArr);
                    return ajxw.a;
                }
            }

            a(FriendStoring friendStoring) {
                this.a = friendStoring;
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
                    this.a.getFriends(new a(composerAction));
                    return ajxw.a;
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                stringBuilder.append(JSConversions.INSTANCE.getParameterOrNull(objArr, 0));
                stringBuilder.append(" to ComposerAction");
                throw new AttributeError(stringBuilder.toString());
            }
        }

        static final class b extends akcs implements akbl<Object[], ajxw> {
            private /* synthetic */ FriendStoring a;

            static final class a extends akcs implements akbw<List<? extends Friend>, Map<String, ? extends Object>, ajxw> {
                private /* synthetic */ ComposerAction a;

                a(ComposerAction composerAction) {
                    this.a = composerAction;
                    super(2);
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    Friend[] friendArr;
                    List list = (List) obj;
                    Map map = (Map) obj2;
                    Object[] objArr = new Object[2];
                    if (list != null) {
                        int size = list.size();
                        friendArr = new Friend[size];
                        for (int i = 0; i < size; i++) {
                            Friend friend = (Friend) list.get(i);
                            if (friend == null) {
                                friend = null;
                            }
                            friendArr[i] = friend;
                        }
                    } else {
                        friendArr = null;
                    }
                    objArr[0] = friendArr;
                    if (map == null) {
                        map = null;
                    }
                    objArr[1] = map;
                    this.a.perform(objArr);
                    return ajxw.a;
                }
            }

            b(FriendStoring friendStoring) {
                this.a = friendStoring;
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
                    this.a.getBestFriends(new a(composerAction));
                    return ajxw.a;
                }
                StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                stringBuilder.append(JSConversions.INSTANCE.getParameterOrNull(objArr, 0));
                stringBuilder.append(" to ComposerAction");
                throw new AttributeError(stringBuilder.toString());
            }
        }

        static final class c extends akcs implements akbl<Object[], ajxw> {
            private /* synthetic */ FriendStoring a;

            static final class a extends akcs implements akbl<Boolean, ajxw> {
                private /* synthetic */ ComposerAction a;

                a(ComposerAction composerAction) {
                    this.a = composerAction;
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    this.a.perform(new Object[]{Boolean.valueOf(((Boolean) obj).booleanValue())});
                    return ajxw.a;
                }
            }

            c(FriendStoring friendStoring) {
                this.a = friendStoring;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                Object[] objArr = (Object[]) obj;
                akcr.b(objArr, "_params");
                AddFriendRequest fromJavaScript = AddFriendRequest.Companion.fromJavaScript(JSConversions.INSTANCE.getParameterOrNull(objArr, 0));
                akbl parameterOrNull = JSConversions.INSTANCE.getParameterOrNull(objArr, 1);
                akbl akbl = null;
                if (parameterOrNull != null) {
                    if (parameterOrNull instanceof ComposerAction) {
                        akbl = parameterOrNull;
                    }
                    ComposerAction composerAction = (ComposerAction) akbl;
                    if (composerAction != null) {
                        akbl = new a(composerAction);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                        stringBuilder.append(parameterOrNull);
                        stringBuilder.append(" to ComposerAction");
                        throw new AttributeError(stringBuilder.toString());
                    }
                }
                this.a.addFriend(fromJavaScript, akbl);
                return ajxw.a;
            }
        }

        static final class d extends akcs implements akbl<Object[], ComposerRunnableAction> {
            private /* synthetic */ FriendStoring a;

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

            d(FriendStoring friendStoring) {
                this.a = friendStoring;
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
                    final akbk onFriendsUpdated = this.a.onFriendsUpdated(new a(composerAction));
                    return new ComposerRunnableAction(new akbl<Object[], ajxw>() {
                        public final /* synthetic */ Object invoke(Object obj) {
                            akcr.b((Object[]) obj, "_params");
                            onFriendsUpdated.invoke();
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

        public final FriendStoring fromJavaScript(Object obj) {
            if (obj instanceof Map) {
                obj = JSConversions.INSTANCE.unwrapNativeInstance(((Map) obj).get("$nativeInstance"));
            }
            FriendStoring friendStoring = (FriendStoring) (!(obj instanceof FriendStoring) ? null : obj);
            if (friendStoring != null) {
                return friendStoring;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
            stringBuilder.append(obj);
            stringBuilder.append(" to FriendStoring");
            throw new AttributeError(stringBuilder.toString());
        }

        public final Map<String, Object> toJavaScript(FriendStoring friendStoring) {
            akcr.b(friendStoring, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("getFriends", new ComposerRunnableAction(new a(friendStoring)));
            linkedHashMap.put("getBestFriends", new ComposerRunnableAction(new b(friendStoring)));
            linkedHashMap.put("addFriend", new ComposerRunnableAction(new c(friendStoring)));
            linkedHashMap.put("onFriendsUpdated", new ComposerRunnableAction(new d(friendStoring)));
            linkedHashMap.put("$nativeInstance", JSConversions.INSTANCE.wrapNativeInstance(friendStoring));
            return linkedHashMap;
        }
    }

    public static final class DefaultImpls {
        public static Object toJavaScript(FriendStoring friendStoring) {
            return FriendStoring.Companion.toJavaScript(friendStoring);
        }
    }

    void addFriend(AddFriendRequest addFriendRequest, akbl<? super Boolean, ajxw> akbl);

    void getBestFriends(akbw<? super List<Friend>, ? super Map<String, ? extends Object>, ajxw> akbw);

    void getFriends(akbw<? super List<Friend>, ? super Map<String, ? extends Object>, ajxw> akbw);

    akbk<ajxw> onFriendsUpdated(akbk<ajxw> akbk);

    Object toJavaScript();
}

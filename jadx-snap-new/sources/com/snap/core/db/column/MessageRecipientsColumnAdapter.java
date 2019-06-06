package com.snap.core.db.column;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.snap.core.model.FriendMessageRecipient;
import com.snap.core.model.GroupMessageRecipient;
import com.snap.core.model.MessageRecipient;
import com.snap.core.model.StorySnapRecipient;
import defpackage.absw;
import defpackage.ainu;
import defpackage.akcr;
import java.lang.reflect.Type;
import java.util.List;

public final class MessageRecipientsColumnAdapter implements ainu<List<? extends MessageRecipient>, String> {
    private final Gson gson = new GsonBuilder().registerTypeAdapterFactory(this.typeFactory).create();
    private final Type type = new MessageRecipientsColumnAdapter$type$1().getType();
    private final absw<MessageRecipient> typeFactory = absw.a(MessageRecipient.class).b(FriendMessageRecipient.class).b(GroupMessageRecipient.class).b(StorySnapRecipient.class);

    public final List<MessageRecipient> decode(String str) {
        Object fromJson = this.gson.fromJson(str, this.type);
        akcr.a(fromJson, "gson.fromJson<List<Messa…sageRecipientsJson, type)");
        return (List) fromJson;
    }

    public final String encode(List<? extends MessageRecipient> list) {
        akcr.b(list, "messageRecipients");
        Object toJson = this.gson.toJson((Object) list, this.type);
        akcr.a(toJson, "gson.toJson(messageRecipients, type)");
        return toJson;
    }
}

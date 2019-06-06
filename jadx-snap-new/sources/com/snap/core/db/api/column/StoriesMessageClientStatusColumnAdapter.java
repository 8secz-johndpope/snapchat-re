package com.snap.core.db.api.column;

import com.snap.core.db.api.model.IntegerEnumColumn;
import com.snap.core.db.column.MessageClientStatus;
import defpackage.ainu;
import defpackage.ajxt;
import defpackage.akcr;
import java.util.NoSuchElementException;

public final class StoriesMessageClientStatusColumnAdapter implements ainu<MessageClientStatus, Long> {
    public final MessageClientStatus decode(Long l) {
        if (l == null || ((int) l.longValue()) < 0 || ((int) l.longValue()) >= MessageClientStatus.values().length) {
            return MessageClientStatus.OK;
        }
        Object enumConstants = MessageClientStatus.class.getEnumConstants();
        akcr.a(enumConstants, "MessageClientStatus::class.java.enumConstants");
        int length = enumConstants.length;
        int i = 0;
        while (i < length) {
            Object obj = enumConstants[i];
            MessageClientStatus messageClientStatus = (MessageClientStatus) obj;
            if (messageClientStatus != null) {
                if ((((IntegerEnumColumn) messageClientStatus).getIntValue() == ((int) l.longValue()) ? 1 : null) != null) {
                    akcr.a(obj, "MessageClientStatus::cla…seValue.toInt()\n        }");
                    return messageClientStatus;
                }
                i++;
            } else {
                throw new ajxt("null cannot be cast to non-null type com.snap.core.db.api.model.IntegerEnumColumn");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final Long encode(MessageClientStatus messageClientStatus) {
        akcr.b(messageClientStatus, "value");
        return Long.valueOf((long) messageClientStatus.getIntValue());
    }
}

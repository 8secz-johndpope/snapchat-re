package com.snap.core.db.api.column;

import defpackage.ainu;
import defpackage.akcr;

public abstract class JsonEnumColumnAdapter<J extends Enum<J>, I extends Enum<I>> implements ainu<J, Long> {
    private final Class<I> cls;
    private final IntegerEnumColumnAdapter<I> integerEnumColumnAdapter = new IntegerEnumColumnAdapter(this.cls);

    public JsonEnumColumnAdapter(Class<I> cls) {
        akcr.b(cls, "cls");
        this.cls = cls;
    }

    public J decode(Long l) {
        return toJson(this.integerEnumColumnAdapter.decode(l));
    }

    public Long encode(J j) {
        akcr.b(j, "value");
        return this.integerEnumColumnAdapter.encode(fromJson(j));
    }

    public abstract I fromJson(J j);

    public abstract J toJson(I i);
}

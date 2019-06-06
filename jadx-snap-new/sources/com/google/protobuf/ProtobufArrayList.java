package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;

final class ProtobufArrayList<E> extends AbstractProtobufList<E> {
    private static final ProtobufArrayList<Object> EMPTY_LIST;
    private final List<E> list;

    static {
        ProtobufArrayList protobufArrayList = new ProtobufArrayList();
        EMPTY_LIST = protobufArrayList;
        protobufArrayList.makeImmutable();
    }

    ProtobufArrayList() {
        this(new ArrayList(10));
    }

    private ProtobufArrayList(List<E> list) {
        this.list = list;
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return EMPTY_LIST;
    }

    public final void add(int i, E e) {
        ensureIsMutable();
        this.list.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.list.get(i);
    }

    public final ProtobufArrayList<E> mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.list);
            return new ProtobufArrayList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        ensureIsMutable();
        Object remove = this.list.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        ensureIsMutable();
        Object obj = this.list.set(i, e);
        this.modCount++;
        return obj;
    }

    public final int size() {
        return this.list.size();
    }
}

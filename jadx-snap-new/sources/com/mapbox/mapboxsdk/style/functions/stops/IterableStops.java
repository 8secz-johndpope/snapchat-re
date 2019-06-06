package com.mapbox.mapboxsdk.style.functions.stops;

import defpackage.ppy;
import java.util.Iterator;

public abstract class IterableStops<I, O, S> extends Stops<I, O> implements Iterable<S> {
    public abstract int size();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(it.next());
            if (it.hasNext()) {
                stringBuilder.append(ppy.b);
            }
        }
        return String.format("%s: [%s]", new Object[]{super.toString(), stringBuilder.toString()});
    }

    /* Access modifiers changed, original: 0000 */
    public Object[] toValueObjects(Stop<I, O>[] stopArr) {
        if (stopArr == null) {
            return null;
        }
        Object[] objArr = new Object[stopArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = stopArr[i].toValueObject();
        }
        return objArr;
    }
}

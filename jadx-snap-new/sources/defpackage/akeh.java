package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: akeh */
public interface akeh<R> extends akeg {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    List<Object> getParameters();

    akeq getReturnType();

    List<Object> getTypeParameters();

    aker getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}

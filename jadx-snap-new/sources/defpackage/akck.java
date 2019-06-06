package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: akck */
public abstract class akck implements akeh, Serializable {
    public static final Object NO_RECEIVER = a.a;
    protected final Object receiver;
    private transient akeh reflected;

    /* renamed from: akck$a */
    static class a implements Serializable {
        static final a a = new a();

        private a() {
        }
    }

    public akck() {
        this(NO_RECEIVER);
    }

    protected akck(Object obj) {
        this.receiver = obj;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public akeh compute() {
        akeh akeh = this.reflected;
        if (akeh != null) {
            return akeh;
        }
        akeh = computeReflected();
        this.reflected = akeh;
        return akeh;
    }

    public abstract akeh computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public akej getOwner() {
        throw new AbstractMethodError();
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* Access modifiers changed, original: protected */
    public akeh getReflected() {
        akck compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new akbj();
    }

    public akeq getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public aker getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}

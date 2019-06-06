package defpackage;

import defpackage.ajbl.f;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ajbs */
public final class ajbs {
    public static final ajbt a = ajbs.a(ajbt.class.getClassLoader());
    private static final Logger b = Logger.getLogger(ajbs.class.getName());

    private ajbs() {
    }

    private static ajbt a(ClassLoader classLoader) {
        try {
            return (ajbt) ajay.a(Class.forName("io.opencensus.impl.tags.TagsComponentImpl", true, classLoader), ajbt.class);
        } catch (ClassNotFoundException e) {
            b.log(Level.FINE, "Couldn't load full implementation for TagsComponent, now trying to load lite implementation.", e);
            try {
                return (ajbt) ajay.a(Class.forName("io.opencensus.impllite.tags.TagsComponentImplLite", true, classLoader), ajbt.class);
            } catch (ClassNotFoundException e2) {
                b.log(Level.FINE, "Couldn't load lite implementation for TagsComponent, now using default implementation for TagsComponent.", e2);
                return new f();
            }
        }
    }
}

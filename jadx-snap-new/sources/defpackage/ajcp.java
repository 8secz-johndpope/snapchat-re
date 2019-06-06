package defpackage;

import defpackage.ajcl.a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ajcp */
public final class ajcp {
    public static final ajcl a = ajcp.a(ajcl.class.getClassLoader());
    private static final Logger b = Logger.getLogger(ajcp.class.getName());

    private ajcp() {
    }

    private static ajcl a(ClassLoader classLoader) {
        try {
            return (ajcl) ajay.a(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), ajcl.class);
        } catch (ClassNotFoundException e) {
            b.log(Level.FINE, "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", e);
            try {
                return (ajcl) ajay.a(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), ajcl.class);
            } catch (ClassNotFoundException e2) {
                b.log(Level.FINE, "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", e2);
                return new a();
            }
        }
    }
}

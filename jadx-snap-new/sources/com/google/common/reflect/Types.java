package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import defpackage.ppy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

final class Types {
    private static final Joiner COMMA_JOINER = Joiner.on(ppy.d).useForNull("null");
    private static final Function<Type, String> TYPE_NAME = new Function<Type, String>() {
        public final String apply(Type type) {
            return JavaVersion.CURRENT.typeName(type);
        }
    };

    enum JavaVersion {
        JAVA6 {
        },
        JAVA7 {
        },
        JAVA8 {
            /* Access modifiers changed, original: final */
            public final String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        },
        JAVA9 {
            /* Access modifiers changed, original: final */
            public final String typeName(Type type) {
                return JAVA8.typeName(type);
            }
        };
        
        static final JavaVersion CURRENT = null;

        /* Access modifiers changed, original: 0000 */
        public String typeName(Type type) {
            return Types.toString(type);
        }
    }

    static String toString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}

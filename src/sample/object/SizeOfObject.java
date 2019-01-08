package sample.object;

import java.lang.instrument.Instrumentation;
public class SizeOfObject {

    private static Instrumentation instrumentation;

    public static void premain(String args, Instrumentation inst) {
        instrumentation = inst;
    }

    public static long getObjectSize(Object o) {
    	System.out.println(instrumentation.getObjectSize(o));
        return instrumentation.getObjectSize(o);
    }
}
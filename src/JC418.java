public class JC418 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());    }

    /* public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length > 3) {
            return stackTraceElements[3].getClassName() + "#" + stackTraceElements[3].getMethodName();
        }
        return null;
    } */

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
        if (stackTraceElements.length > 2) {
            return stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
        }
        return null;
    }
}

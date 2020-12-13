public class test2 {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String stackElement;
        stackElement = stackTraceElements[3].getClassName() + "#" + stackTraceElements[3].getMethodName();
        if (stackElement.contains("main")) {
            stackElement = null;
        }
        return stackElement;
    }
}

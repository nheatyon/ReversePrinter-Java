package com.nheatyon.rprinter;

public abstract class ReversePrinter {

    protected static void print(String s, Object... args) {
        String methodName = new Throwable().getStackTrace()[1].getMethodName();
        String clearedOutput = methodName
                .replaceAll("\\d+", "")
                .replaceAll("(.)([A-Z])", "$1 $2");
        switch (s) {
            case "System.out.println" -> System.out.println(clearedOutput);
            case "System.out.printf" -> System.out.printf(clearedOutput, args);
            case "System.out.print" -> System.out.print(clearedOutput);
            default -> throw new IllegalArgumentException("Unknown method: " + s);
        }
    }
}

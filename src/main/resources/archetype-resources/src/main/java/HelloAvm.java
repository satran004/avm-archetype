package ${package};

import avm.BlockchainRuntime;
import org.aion.avm.tooling.abi.Callable;

public class HelloAvm
{
    private static String myStr = "Hello AVM";

    @Callable
    public static void sayHello() {
        BlockchainRuntime.println("Hello Avm");
    }

    @Callable
    public static String greet(String name) {
        return "Hello " + name;
    }

    @Callable
    public static String getString() {
        BlockchainRuntime.println("Current string is " + myStr);
        return myStr;
    }

    @Callable
    public static void setString(String newStr) {
        myStr = newStr;
        BlockchainRuntime.println("New string is " + myStr);
    }

}

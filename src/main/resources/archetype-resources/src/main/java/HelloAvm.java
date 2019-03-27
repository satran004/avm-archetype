package ${package};

import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;
import org.aion.avm.api.BlockchainRuntime;

public class HelloAvm
{
    @Callable
    public static void sayHello() {
        BlockchainRuntime.println("Hello Avm");
    }

    @Callable
    public static String greet(String name) {
        return "Hello " + name;
    }

}

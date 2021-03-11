package alex.learn.base.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapDumpProducer {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while(true){
            list.add("To see your local history of changes in a file, invoke Local History | Show" +
                    " History from the context menu. You can navigate through different file versions, " +
                    "see the differences and roll back to any previous version.Use the same context menu " +
                    "item to see the history of changes on a directory. You will never lose any code with this feature!");
        }

    }
}

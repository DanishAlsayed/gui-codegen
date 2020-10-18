import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.File;

public class MainClassWriterTest {
    @Test
    void q6() throws Exception {
        Node node = JsonParser.parse(new File("src"+ File.separator +"test"+ File.separator +"resources").getAbsolutePath() + File.separator + "Q6.json");
        MainClassWriter mcw = new MainClassWriter(node, "file:///home/data/qwangbp/lineitem.tbl","file:///home/data/qwangbp/testQ6.out");
        mcw.write("src"+ File.separator +"test"+ File.separator +"resources");
    }

    @AfterEach
    void message() {
        System.out.println("inspect the generated class manually at the specified path and remove it");
    }
}

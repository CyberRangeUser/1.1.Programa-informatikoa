import org.junit.*;

public class ProgramaInformatikoaTest {
    @Test 
    public void test(){
        ProgramaInformatikoa pi= new ProgramaInformatikoa();
        Assert.assertEquals("Helo", pi.says());

    }
}
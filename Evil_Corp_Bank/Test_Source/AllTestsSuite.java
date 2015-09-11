import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ Integration1.class, Integration2.class, Test1.class,
		Test2.class, Test3.class })
public class AllTestsSuite {

}

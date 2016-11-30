package dubbo_l;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dubbo.test.DubboProviderTestService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/spring-context.xml" })
public class DubboTest {

	@Autowired
	private DubboProviderTestService dubboProviderTestService;
	
	@Test
	public void testProvider(){
		System.out.println("===测试dubbo==="+dubboProviderTestService.getHelloWord());
	}
	
}

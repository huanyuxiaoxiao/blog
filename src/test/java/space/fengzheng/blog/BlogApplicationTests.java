package space.fengzheng.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import space.fengzheng.blog.model.BlogEntity;
import space.fengzheng.blog.repository.BlogRepository;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {
    @Resource
    private BlogRepository blogRepository;


	@Test
	public void contextLoads() {
	    BlogEntity blogEntity=new BlogEntity();
	    blogEntity.setContext("测试");
	    blogRepository.save(blogEntity);
	}

}

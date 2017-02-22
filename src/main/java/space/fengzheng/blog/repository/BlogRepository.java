package space.fengzheng.blog.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import space.fengzheng.blog.model.BlogEntity;

/**
 * Created by Tibers on 17/2/22.
 */
public interface BlogRepository extends ElasticsearchRepository<BlogEntity, String> {

}

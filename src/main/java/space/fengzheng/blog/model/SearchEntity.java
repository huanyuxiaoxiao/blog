package space.fengzheng.blog.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * Created by Tibers on 17/2/22.
 */
@Getter
@Setter
@Document(indexName = "blog", type = "SearchEntity", shards = 1, refreshInterval = "-1")
public class SearchEntity {
    @Id
    private String id;
    private String search;
    private String ip;
    private String userAgent;
    private Date createTime;

    public SearchEntity() {
        this.createTime = new Date();
    }
}

package space.fengzheng.blog.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;
import space.fengzheng.blog.constant.Constants;

import java.util.Date;
import java.util.List;

/**
 * Created by Tibers on 17/2/22.
 */
@Getter
@Setter
@Document(indexName = "blog", type = "BlogEntity", shards = 1, refreshInterval = "-1")
public class BlogEntity {
    @Id
    private String id;
    @Field(type = FieldType.String, index = FieldIndex.analyzed, searchAnalyzer = "ik", analyzer = "ik")
    private String title;
    @Field(type = FieldType.String, index = FieldIndex.not_analyzed)
    private List<String> label;
    @Field(type = FieldType.String, index = FieldIndex.analyzed, searchAnalyzer = "ik", analyzer = "ik")
    private String context;
    private Date createTime;
    private Integer isTop;
    private Integer isPublish;


    public BlogEntity() {
        this.createTime = new Date();
        this.isTop = Constants.INT_FALSE;
        this.isPublish = Constants.INT_TRUE;
    }
}

package com.cybersoft.coza_store21.entity.ids;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TagBlogIds implements Serializable {

    @Column(name = "tag_id")
    private int tagId;

    @Column(name = "blog_id")
    private int blogId;

    public TagBlogIds() {
    }

    public TagBlogIds(int tagId, int blogId) {
        this.tagId = tagId;
        this.blogId = blogId;
    }
}

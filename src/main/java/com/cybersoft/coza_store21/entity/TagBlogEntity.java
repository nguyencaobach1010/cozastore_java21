package com.cybersoft.coza_store21.entity;

import com.cybersoft.coza_store21.entity.ids.TagBlogIds;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity(name = "tag_blog")
public class TagBlogEntity {
    @EmbeddedId
    private TagBlogIds ids;

    @ManyToOne
    @JoinColumn(name = "tag_id", insertable = false,updatable = false)
    private TagEntity tag;

    @ManyToOne
    @JoinColumn(name = "blog_id", insertable = false,updatable = false)
    private BlogEntity blog;
}

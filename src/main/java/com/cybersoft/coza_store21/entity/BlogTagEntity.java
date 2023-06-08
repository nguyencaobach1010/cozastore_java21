package com.cybersoft.coza_store21.entity;

import javax.persistence.*;

@Entity(name = "BLOG_TAG")
public class BlogTagEntity {
    @Id
    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BlogEntity blog_id;

    @Id
    @ManyToOne
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private TagEntity tag_id;

    public BlogEntity getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(BlogEntity blog_id) {
        this.blog_id = blog_id;
    }

    public TagEntity getTag_id() {
        return tag_id;
    }

    public void setTag_id(TagEntity tag_id) {
        this.tag_id = tag_id;
    }
}

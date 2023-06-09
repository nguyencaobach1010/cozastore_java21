package com.cybersoft.coza_store21.entity;

import com.cybersoft.coza_store21.entity.ids.CategoryTagIds;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "category_tag")
public class CategoryTag {
    @EmbeddedId
    private CategoryTagIds ids;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false,updatable = false)
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "tag_id", insertable = false,updatable = false)
    private TagEntity tag;
}

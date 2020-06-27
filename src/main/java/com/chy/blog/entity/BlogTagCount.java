package com.chy.blog.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BlogTagCount {
    private Integer tagId;

    private String tagName;

    private Integer tagCount;

}

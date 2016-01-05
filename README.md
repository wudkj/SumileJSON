## 使用SumileJSON来快速解析JSON ##
version=1.1

**SumileJSON**用来解析多层嵌套的JSON格式数据 

### 模拟要解析的数据 ###
    {
    "status": "ok",
    "count": 10,
    "count_total": 64,
    "pages": 7,
    "posts": [
        {
            "id": 1155,
            "type": "post",
            "slug": "%ef%bc%88%ae%b2%e8%a7%a3",
            "url": "http://sumile.cn/archives/1155.html",
            "status": "publish",
            "title": "（转）程序员必须知道的10大基础实用算法及其讲解",
            "title_plain": "（转）程序员必须知道的10大基础实用算法及其讲解",
            "content": "<完全二<b>归并及其讲解</a></p>",
            "excerpt": "<p>算法一：快速排序算法快速排序是由东尼·霍尔所发展的一种排序算法。在平均状况下，排序 n 个项目要Ο(n lo[&hellip;]</p>",
            "date": "2015-12-2516:36:46",
            "modified": "2015-12-2516:58:09",
            "categories": [
                {
                    "id": 167,
                    "slug": "%e7%bc%96%e7%a8%8b%e5%9f%ba%e7%a1%80",
                    "title": "编程基础",
                    "description": "",
                    "parent": 0,
                    "post_count": 1
                },
                {
                    "id": 168,
                    "slug": "%e7%ae%97%e6%b3%95",
                    "title": "算法",
                    "description": "",
                    "parent": 167,
                    "post_count": 1
                }
            ],
            "tags": [],
            "author": {
                "id": 1,
                "slug": "sinvader",
                "name": "sinvader",
                "first_name": "",
                "last_name": "",
                "nickname": "sinvader",
                "url": "",
                "description": ""
            },
            "comments": [],
            "attachments": [
                {
                    "id": 1157,
                    "url": "http://sumile.cn/wp-content/uploads/2015/12/Animated_BFS.gif",
                    "slug": "animated_bfs",
                    "title": "Animated_BFS",
                    "description": "",
                    "caption": "",
                    "parent": 1155,
                    "mime_type": "image/gif",
                    "images": {
                        "full": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Animated_BFS.gif",
                            "width": 187,
                            "height": 175
                        },
                        "thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Animated_BFS-150x150.gif",
                            "width": 150,
                            "height": 150
                        },
                        "medium": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Animated_BFS.gif",
                            "width": 187,
                            "height": 175
                        },
                        "medium_large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Animated_BFS.gif",
                            "width": 187,
                            "height": 175
                        },
                        "large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Animated_BFS.gif",
                            "width": 187,
                            "height": 175
                        },
                        "post-thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Animated_BFS-187x150.gif",
                            "width": 187,
                            "height": 150
                        },
                        "foundation-featured-image": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Animated_BFS.gif",
                            "width": 187,
                            "height": 175
                        }
                    }
                },
                {
                    "id": 1158,
                    "url": "http://sumile.cn/wp-content/uploads/2015/12/Dijkstra_Animation.gif",
                    "slug": "dijkstra_animation",
                    "title": "Dijkstra_Animation",
                    "description": "",
                    "caption": "",
                    "parent": 1155,
                    "mime_type": "image/gif",
                    "images": {
                        "full": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Dijkstra_Animation.gif",
                            "width": 283,
                            "height": 222
                        },
                        "thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Dijkstra_Animation-150x150.gif",
                            "width": 150,
                            "height": 150
                        },
                        "medium": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Dijkstra_Animation.gif",
                            "width": 283,
                            "height": 222
                        },
                        "medium_large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Dijkstra_Animation.gif",
                            "width": 283,
                            "height": 222
                        },
                        "large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Dijkstra_Animation.gif",
                            "width": 283,
                            "height": 222
                        },
                        "post-thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Dijkstra_Animation-220x150.gif",
                            "width": 220,
                            "height": 150
                        },
                        "foundation-featured-image": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Dijkstra_Animation.gif",
                            "width": 283,
                            "height": 222
                        }
                    }
                },
                {
                    "id": 1159,
                    "url": "http://sumile.cn/wp-content/uploads/2015/12/Merge_sort_animation2.gif",
                    "slug": "merge_sort_animation2",
                    "title": "Merge_sort_animation2",
                    "description": "",
                    "caption": "",
                    "parent": 1155,
                    "mime_type": "image/gif",
                    "images": {
                        "full": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Merge_sort_animation2.gif",
                            "width": 280,
                            "height": 237
                        },
                        "thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Merge_sort_animation2-150x150.gif",
                            "width": 150,
                            "height": 150
                        },
                        "medium": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Merge_sort_animation2.gif",
                            "width": 280,
                            "height": 237
                        },
                        "medium_large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Merge_sort_animation2.gif",
                            "width": 280,
                            "height": 237
                        },
                        "large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Merge_sort_animation2.gif",
                            "width": 280,
                            "height": 237
                        },
                        "post-thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Merge_sort_animation2-220x150.gif",
                            "width": 220,
                            "height": 150
                        },
                        "foundation-featured-image": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Merge_sort_animation2.gif",
                            "width": 280,
                            "height": 237
                        }
                    }
                },
                {
                    "id": 1160,
                    "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_heapsort_anim.gif",
                    "slug": "sorting_heapsort_anim",
                    "title": "Sorting_heapsort_anim",
                    "description": "",
                    "caption": "",
                    "parent": 1155,
                    "mime_type": "image/gif",
                    "images": {
                        "full": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_heapsort_anim.gif",
                            "width": 280,
                            "height": 214
                        },
                        "thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_heapsort_anim-150x150.gif",
                            "width": 150,
                            "height": 150
                        },
                        "medium": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_heapsort_anim.gif",
                            "width": 280,
                            "height": 214
                        },
                        "medium_large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_heapsort_anim.gif",
                            "width": 280,
                            "height": 214
                        },
                        "large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_heapsort_anim.gif",
                            "width": 280,
                            "height": 214
                        },
                        "post-thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_heapsort_anim-220x150.gif",
                            "width": 220,
                            "height": 150
                        },
                        "foundation-featured-image": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_heapsort_anim.gif",
                            "width": 280,
                            "height": 214
                        }
                    }
                },
                {
                    "id": 1161,
                    "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_quicksort_anim.gif",
                    "slug": "sorting_quicksort_anim",
                    "title": "Sorting_quicksort_anim",
                    "description": "",
                    "caption": "",
                    "parent": 1155,
                    "mime_type": "image/gif",
                    "images": {
                        "full": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_quicksort_anim.gif",
                            "width": 280,
                            "height": 214
                        },
                        "thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_quicksort_anim-150x150.gif",
                            "width": 150,
                            "height": 150
                        },
                        "medium": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_quicksort_anim.gif",
                            "width": 280,
                            "height": 214
                        },
                        "medium_large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_quicksort_anim.gif",
                            "width": 280,
                            "height": 214
                        },
                        "large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_quicksort_anim.gif",
                            "width": 280,
                            "height": 214
                        },
                        "post-thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_quicksort_anim-220x150.gif",
                            "width": 220,
                            "height": 150
                        },
                        "foundation-featured-image": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/Sorting_quicksort_anim.gif",
                            "width": 280,
                            "height": 214
                        }
                    }
                },
                {
                    "id": 1162,
                    "url": "http://sumile.cn/wp-content/uploads/2015/12/suanfa10.jpg",
                    "slug": "suanfa10",
                    "title": "suanfa10",
                    "description": "",
                    "caption": "",
                    "parent": 1155,
                    "mime_type": "image/jpeg",
                    "images": {
                        "full": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/suanfa10.jpg",
                            "width": 716,
                            "height": 297
                        },
                        "thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/suanfa10-150x150.jpg",
                            "width": 150,
                            "height": 150
                        },
                        "medium": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/suanfa10-300x124.jpg",
                            "width": 300,
                            "height": 124
                        },
                        "medium_large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/suanfa10.jpg",
                            "width": 716,
                            "height": 297
                        },
                        "large": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/suanfa10.jpg",
                            "width": 716,
                            "height": 297
                        },
                        "post-thumbnail": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/suanfa10-220x150.jpg",
                            "width": 220,
                            "height": 150
                        },
                        "foundation-featured-image": {
                            "url": "http://sumile.cn/wp-content/uploads/2015/12/suanfa10.jpg",
                            "width": 716,
                            "height": 297
                        }
                    }
                }
            ],
            "comment_count": 0,
            "comment_status": "open",
            "custom_fields": {
                "views": [
                    "146"
                ],
                "mytory_md_path": [
                    ""
                ],
                "mytory_md_text": [
                    ""
                ],
                "mytory_md_mode": [
                    "url"
                ],
                "duoshuo_thread_id": [
                    "6232137592683365121"
                ],
                "bigfa_ding": [
                    "1"
                ]
            }
        }
    ]
}
根据JSON格式创建Bean

    public class Bean {
	private String status;
	private String count;
	private String count_total;
	private String pages;
	private ArrayList<Bean_get_recent_posts2> posts;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getCount_total() {
		return count_total;
	}

	public void setCount_total(String count_total) {
		this.count_total = count_total;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public ArrayList<Bean_get_recent_posts2> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Bean_get_recent_posts2> posts) {
		this.posts = posts;
	}

	public static class Bean_get_recent_posts2 {
		private String slug;
		private String id;
		private String type;
		private String url;
		private String status;
		private String title_plain;
		private String title;
		private String excerpt;
		private String content;
		private String date;
		private String modified;
		private ArrayList<Tags> tags;
		private Author author;
		private ArrayList<Comments> comments;
		private ArrayList<Attachments> attachments;
		private ArrayList<Bean_get_recent_posts_categories> categories;

		public String getSlug() {
			return slug;
		}

		public void setSlug(String slug) {
			this.slug = slug;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTitle_plain() {
			return title_plain;
		}

		public void setTitle_plain(String title_plain) {
			this.title_plain = title_plain;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getExcerpt() {
			return excerpt;
		}

		public void setExcerpt(String excerpt) {
			this.excerpt = excerpt;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getModified() {
			return modified;
		}

		public void setModified(String modified) {
			this.modified = modified;
		}

		public ArrayList<Tags> getTags() {
			return tags;
		}

		public void setTags(ArrayList<Tags> tags) {
			this.tags = tags;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public ArrayList<Comments> getComments() {
			return comments;
		}

		public void setComments(ArrayList<Comments> comments) {
			this.comments = comments;
		}

		public ArrayList<Attachments> getAttachments() {
			return attachments;
		}

		public void setAttachments(ArrayList<Attachments> attachments) {
			this.attachments = attachments;
		}

		public ArrayList<Bean_get_recent_posts_categories> getCategories() {
			return categories;
		}

		public void setCategories(ArrayList<Bean_get_recent_posts_categories> categories) {
			this.categories = categories;
		}

		public static class Bean_get_recent_posts_categories {
			private String slug;
			private String title;
			private String description;
			private String parent;
			private String post_count;

			public String getSlug() {
				return slug;
			}

			public void setSlug(String slug) {
				this.slug = slug;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getParent() {
				return parent;
			}

			public void setParent(String parent) {
				this.parent = parent;
			}

			public String getPost_count() {
				return post_count;
			}

			public void setPost_count(String post_count) {
				this.post_count = post_count;
			}

		}

		public static class Tags {

		}

		public static class Comments {

		}

		public static class Attachments {
			private String id;
			private String url;
			private String slug;
			private String title;
			private String description;
			private String caption;
			private String parent;
			private String mime_type;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getSlug() {
				return slug;
			}

			public void setSlug(String slug) {
				this.slug = slug;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCaption() {
				return caption;
			}

			public void setCaption(String caption) {
				this.caption = caption;
			}

			public String getParent() {
				return parent;
			}

			public void setParent(String parent) {
				this.parent = parent;
			}

			public String getMime_type() {
				return mime_type;
			}

			public void setMime_type(String mime_type) {
				this.mime_type = mime_type;
			}
		}

		public static class Author {
			private String id;
			private String slug;
			private String name;
			private String first_name;
			private String last_name;
			private String nickname;
			private String url;
			private String description;

			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getSlug() {
				return slug;
			}

			public void setSlug(String slug) {
				this.slug = slug;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getFirst_name() {
				return first_name;
			}

			public void setFirst_name(String first_name) {
				this.first_name = first_name;
			}

			public String getLast_name() {
				return last_name;
			}

			public void setLast_name(String last_name) {
				this.last_name = last_name;
			}

			public String getNickname() {
				return nickname;
			}

			public void setNickname(String nickname) {
				this.nickname = nickname;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}
}

## Bean的创建规则 ##


1. 如果属性对应的是一个字符串或数字，其修饰符使用String
-----------------如（public String error;）

- 如果属性对应的是一个JSONArray，其修饰符使用ArrayList<Bean\>,这个里面的Bean要根据JSONArray里面的JSONObject进行编写。
-----------------如（public ArrayList<Bean2> data;）

- 如果属性对应的是一个JSONObject，其修饰符使用对象的类名----如：(public static class Author)
- ---------------
## 解析的调用 ##
    Bean s = (Bean) (SumileJson.parse(str, Bean.class));
上面的代码将JSON解析为最大的Bean，获取内部的数据可以使用下面的方法。

    	//获得对象中的值
		System.out.println(s.getStatus());
		//获得对象中的一个数组post，并获得其中的第一个的excerpt值
		System.out.println(s.getPosts().get(0).getExcerpt());
		//获得对象中的一个数组post，并获得这个数组中的第一个的categories中的第一个title
		System.out.println(s.getPosts().get(0).getCategories().get(0).getTitle());

## 以上代码的输出结果 ##
    ok
	<p>算法一：快速排序算法快速排序是由东尼·霍尔所发展的一种排序算法。在平均状况下，排序 n 个项目要Ο(n lo[&hellip;]</p>
	编程基础0
## 注意事项 ##
当前是写在Java项目里面的，直接把关键类拷贝到Android项目里面就可以了

如果遇到什么问题还望告诉我，可以发邮箱wudkj@163.com或者到[http://sumile.cn](http://sumile.cn "http://sumile.cn")留言告诉我，谢谢

# LICENSE #
----------
      Copyright   2015 wudkj
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
    http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
package cn.sumile.S;

import java.util.ArrayList;

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

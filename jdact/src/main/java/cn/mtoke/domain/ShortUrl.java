package cn.mtoke.domain;

public class ShortUrl {
	private String id;
	private String url;
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
	
	public ShortUrl() {
		super();
	}
	public ShortUrl(String id, String url) {
		super();
		this.id = id;
		this.url = url;
	}
	@Override
	public String toString() {
		return "ShortUrl [id=" + id + ", url=" + url + "]";
	}
	
}

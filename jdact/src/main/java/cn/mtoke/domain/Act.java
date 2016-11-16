package cn.mtoke.domain;

public class Act {
	private int id;
	private String name;
	private String url;
	private String time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public Act() {
		super();
	}
	public Act(String name, String url, String time) {
		super();
		this.name = name;
		this.url = url;
		this.time = time;
	}
	
	public Act(int id, String name, String url, String time) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Act [id=" + id + ", name=" + name + ", url=" + url + ", time="
				+ time + "]";
	}
	

}

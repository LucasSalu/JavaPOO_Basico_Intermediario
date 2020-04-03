import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private ArrayList<Comment> comment = new ArrayList<>();
	
	private static 	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Post(Date moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void Content(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	void addComment(Comment comment) {
		this.comment.add(comment);
		
	}
	void removeComment(Comment comment) {
		this.comment.remove(comment);
	}


	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title +"\n" );
		sb.append(String.format("Likes %d - ",likes));
		sb.append(Post.sdf.format(moment));
		sb.append("\n"+ content);
		for(Comment c : comment) {
			sb.append("\n" + c);
		}
		return sb.toString();
	}
	
	
	
	
}

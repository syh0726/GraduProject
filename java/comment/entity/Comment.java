package comment.entity;

import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity
@Table(name="comment")
public class Comment {
	@Id
	private int commentNum;
	private String writer;
	private String comment;
	@Temporal(TemporalType.TIMESTAMP)
	private Date regDate;
	private int postNum;
	
	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}

	

	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}


	public int getPostNum() {
		return postNum;
	}


	public void setPostNum(int postNum) {
		this.postNum = postNum;
	}


	public int getCommentNum() {
		return commentNum;
	}


	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	
	public Comment() {
		super();
	}
   
}

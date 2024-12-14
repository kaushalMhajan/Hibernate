package news.entities;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="article_table")
public class Article {
	
	@Id
	@Column(name="Id")
	private String articleId;
	
	@Column(name="subject")
	private String subject;
	
	@Column(name="headline")
	private String headLine;
	
	@Column(name="dateodpublish")
	private LocalDate dateOfPublication;
	
	public Article() {
		super();
	}
	
	
	public Article(String articleId, String subject, String headLine, LocalDate dateOfPublication) {
		super();
		this.articleId = articleId;
		this.subject = subject;
		this.headLine = headLine;
		this.dateOfPublication = dateOfPublication;
	}


	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getHeadLine() {
		return headLine;
	}
	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}
	public LocalDate getDateOfPublication() {
		return dateOfPublication;
	}
	public void setDateOfPublication(LocalDate dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}
	
	
	
}

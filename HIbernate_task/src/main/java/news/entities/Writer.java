package news.entities;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Writer_table")
public class Writer {
	@Id
	@Column(name="id")
	private String writer_Id;
	
	@Column(name="w_name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="article_id")
	private Collection<Article> articles;
	
	public Writer() {
		super();
	}

	public Writer(String writer_Id, String name, Collection<Article> articles) {
		super();
		this.writer_Id = writer_Id;
		this.name = name;
		this.articles = articles;
	}

	public String getWriter_Id() {
		return writer_Id;
	}

	public void setWriter_Id(String writer_Id) {
		this.writer_Id = writer_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Article> getArticles() {
		return articles;
	}

	public void setArticles(Collection<Article> articles) {
		this.articles = articles;
	}
	
	
}

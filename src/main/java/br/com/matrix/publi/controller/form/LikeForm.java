package br.com.matrix.publi.controller.form;

import br.com.matrix.publi.model.Like;

public class LikeForm {
	
	private Long id;
	private Long user_id;
	private Long post_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getPost_id() {
		return post_id;
	}
	public void setPost_id(Long post_id) {
		this.post_id = post_id;
	}
	
	public Like converter() {
		return new Like();
	}
	
}

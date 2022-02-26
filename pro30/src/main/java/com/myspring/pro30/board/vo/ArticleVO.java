package com.myspring.pro30.board.vo;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.sql.Date;
import org.springframework.stereotype.Component;

	@Component("articleVO")
	public class ArticleVO {
		
		private int articleNO;
		//private int originNO;
		private int parentNO;
		private int level;
		private String title;
		private String content;
		private String imageFileName;
		private String id;
		private Date writeDate;
		

		public int getArticleNO() {
			return articleNO;
		}
		public void setArticleNO(int articleNO) {
			this.articleNO = articleNO;
		}
		/*public int getOriginNO() {
			return originNO;
		}
		public void setOriginNO(int originNO) {
			this.originNO = originNO;
		}*/
		public int getParentNO() {
			return parentNO;
		}
		public void setParentNO(int parentNO) {
			this.parentNO = parentNO;
		}
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
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
		public void setContent(String content) {
			this.content = content;
		}
		public String getImageFileName() {
			return imageFileName;
		}
		public void setImageFileName(String imageFileName) {
			this.imageFileName = imageFileName;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Date getWriteDate() {
			return writeDate;
		}
		public void setWriteDate(Date writeDate) {
			this.writeDate = writeDate;
		}
	



}

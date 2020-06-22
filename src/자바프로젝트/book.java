package 자바프로젝트;

public class book {
private String name;
private String writer;
private String publisher;
public book(String name, String writer, String publisher) {
	super();
	this.name = name;
	this.writer = writer;
	this.publisher = publisher;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
}

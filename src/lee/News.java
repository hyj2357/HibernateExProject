package lee;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class News
{
	//��Ϣ��ı�ʶ����
	private int id;
	//��Ϣ����
	private String title;
	//��Ϣ����
	private String content;
	
	private String fullContent;
	//������
	public News()
	{
	}
	//��ʶ���Ե�setter��getter����
	public void setId(int id) 
	{
		this.id = id; 
	}
	public int getId()
	{
		return (this.id); 
	}
	//��Ϣ�����setter������getter����
	public void setTitle(String title) 
	{
		this.title = title; 
	}
	public String getTitle() 
	{
		return (this.title); 
	}

	//��Ϣ���ݵ�setter������getter����
	public void setContent(String content)
	{
		this.content = content; 
	}
	public String getContent()
	{
		return (this.content); 
	}
	
	public String getFullContent() {
		return fullContent;
	}
	public void setFullContent(String fullcontent) {
		this.fullContent = fullcontent;
	}
}

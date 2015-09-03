
public class Essay extends GradeActivity 
{
    private int spelling;
    private int grammer;
    private int content;
    
    public Essay(int spelling,int grammer,int content)
    {
    	this.spelling = spelling;
    	this.grammer = grammer;
    	this.content = content;
    }
    public int getSpelling()
	{
		if (spelling > 35)
			spelling = 0;
		return spelling;
	}
	public int getGrammer()
	{
		if(grammer > 25)
			grammer = 0;
		return grammer;
	}
	public int getContent()
	{
		if(content > 40)
			content = 0;
		return content;
	}
}

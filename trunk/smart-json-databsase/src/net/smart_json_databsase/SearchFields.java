package net.smart_json_databsase;


public class SearchFields {

	
	public static SearchFields Where(String key, String value)
	{
		SearchFields search = new SearchFields();
		search.query.append(" WHERE data LIKE \"%" + key +"_:_"+value+"%\"");
		return search;
	}
	
	public static SearchFields Where(String key, int value)
	{
		SearchFields search = new SearchFields();
		search.query.append(" WHERE data LIKE \"%" + key +"_:"+ value + "%\"");
		return search;
	}
	
	public static SearchFields Where(String key, double value)
	{
		SearchFields search = new SearchFields();
		search.query.append(" WHERE data LIKE \"%" + key +"_:"+ value + "%\"");
		return search;
	}
	
	private StringBuffer query = new StringBuffer();
	//private ArrayList<String> params = new ArrayList<String>();
	
	private SearchFields()
	{
		
	}
	
	public SearchFields And(String key, String value)
	{
		this.query.append(" AND data LIKE \"%" + key +"_:_"+value+"%\"");
		return this;
	}
	
	public SearchFields And(String key, int value)
	{
		this.query.append(" AND data LIKE \"%" + key +"_:"+ value + "%\"");
		return this;
	}
	
	public SearchFields And(String key, double value)
	{
		this.query.append(" AND data LIKE \"%" + key +"_:"+ value + "%\"");
		return this;
	}
	
	
	public SearchFields Or(String key, String value)
	{
		this.query.append(" OR data LIKE \"%" + key +"_:_"+value+"%\"");
		return this;
	}
	
	public SearchFields Or(String key, int value)
	{
		this.query.append(" OR data LIKE \"%" + key +"_:"+ value + "%\"");
		return this;
	}
	
	public SearchFields Or(String key, double value)
	{
		this.query.append(" OR data LIKE \"%" + key +"_:"+ value + "%\"");
		return this;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.query.toString();
	}
	
	
}

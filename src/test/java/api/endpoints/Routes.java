package api.endpoints;


// Maintaining the Main URL
public class Routes {
	
	public static String base_url = "https://petstore.swagger.io/v2";
	
	//user module URL
	
	public static String post_url =   base_url+"/user";
	public static String get_url =    base_url+ "/user/{username}";
	public static String update_url = base_url+ "/user/{username}";
	public static String delete_url = base_url+ "/user/{username}";
	
	// We can create store and pet module URL here as well
	
	
	
}

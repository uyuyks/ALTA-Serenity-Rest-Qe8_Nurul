package starter.Utils;

public class Constant {
    public static String BaseURl = "https://reqres.in";
    public static final String DIR = System.getProperty("user.dir");
    public static final String REQUEST_JSON = DIR + "/src/test/resources/JSON/Request/";
    public static final String JSON_SCHEMA = DIR + "/src/test/resources/JSON/JsonSchema/";
    public static String GET_LIST_USER = BaseURl + "/api/users?page={page}";
    public static String GET_SINGLE_USER = BaseURl + "/api/users/{id}";
    public static String POST_CREATE_USER = BaseURl + "/api/users";
    public static String POST_REGISTER_USER = BaseURl + "/api/register";
    public static final String PUT_UPDATE_USER = BaseURl + "/api/users/{id}";
    public static final String DELETE_USER = BaseURl + "/api/users/{id}";
    public static String POST_LOGIN_USER = BaseURl + "/api/login";
}

package Base;

import API.APIClass;
import Utils.Utilities;

import javax.naming.Name;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static io.restassured.RestAssured.given;

public class BaseMethod
{
    public static void getMethod(){
        given().log().all().get(Utilities.uti()).
                then().log().all();
    }
    public static void postMethod(String Name, String Job){
        given().log().all().body(APIClass.API(Name,Job)).post("https://reqres.in/api/users").then().log().all().statusCode(201);
    }
    public static String getCurrentDateTime()
    {
        DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
        Date currentDate = new Date();
        return customFormat.format(currentDate);
    }
}

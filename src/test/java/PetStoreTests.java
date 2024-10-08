import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class PetStoreTests {

    private final String baseUrl = "https://petstore.swagger.io/v2";
    private final String username = "enesaydgd";  // Kullanıcı adı
    private final int userId = 5678;  // Kullanıcı ID'si

    @Test
    public void createUser() {
        String createUserPayload = "{\n" +
                "  \"id\": " + userId + ",\n" +
                "  \"username\": \"" + username + "\",\n" +
                "  \"firstName\": \"Enes\",\n" +
                "  \"lastName\": \"Aydogdu\",\n" +
                "  \"email\": \"1aydogduenes@gmail.com\",\n" +
                "  \"password\": \"abc123\",\n" +
                "  \"phone\": \"1234567890\",\n" +
                "  \"userStatus\": 1\n" +
                "}";

        given()
                .body(createUserPayload)
                .contentType(ContentType.JSON)
                .when()
                .post(baseUrl + "/user")
                .then()
                .statusCode(200);  // Başarılı yanıt bekleniyor
    }

    @Test
    public void verifyUser() {
        createUser();  // Kullanıcıyı oluştur
        given()
                .when()
                .get(baseUrl + "/user/" + username)
                .then()
                .statusCode(200)  // Kullanıcı bulundu
                .body("firstName", equalTo("Enes"))
                .body("lastName", equalTo("Aydogdu"));
    }

    @Test
    public void updateUser() {
        createUser();  // Kullanıcıyı oluştur

        String updateUserPayload = "{\n" +
                "  \"id\": " + userId + ",\n" +
                "  \"username\": \"" + username + "\",\n" +
                "  \"firstName\": \"Baran\",\n" +
                "  \"lastName\": \"Soylu\",\n" +
                "  \"email\": \"baransoylu@gmail.com\",\n" +
                "  \"password\": \"abc1234\",\n" +
                "  \"phone\": \"0987654321\",\n" +
                "  \"userStatus\": 1\n" +
                "}";

        given()
                .body(updateUserPayload)
                .contentType(ContentType.JSON)
                .when()
                .put(baseUrl + "/user/" + username)
                .then()
                .statusCode(200);  // Başarılı yanıt bekleniyor
    }

    @Test
    public void verifyUpdatedUser() {
        updateUser();  // Kullanıcıyı güncelle

        given()
                .when()
                .get(baseUrl + "/user/" + username)
                .then()
                .statusCode(200)  // Kullanıcı bulundu
                .body("firstName", equalTo("Baran"));
    }

    @Test
    public void deleteUser() {
        createUser();  // Kullanıcıyı oluştur

        given()
                .when()
                .delete(baseUrl + "/user/" + username)
                .then()
                .statusCode(200);  // Başarılı yanıt bekleniyor
    }
}

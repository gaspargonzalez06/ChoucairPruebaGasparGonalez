package co.com.choucair.certification.proyectobasegaspar.userinterface;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON =Target.the("button that shows us the form to Login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(tet(),'Ingresar')]"));

    public static final Target USER =Target.the("where do we write the user ").located(By.id("username"));

    public static final Target PASSWORD = Target.the("where do we write the password").located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("button to comfirm login").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
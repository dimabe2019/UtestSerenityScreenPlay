package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestUserInterface {

    public static final Target BTN_REGISTRO = Target.the("Boton para iniciar el registro").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
    public static final Target TXT_NOMBRE = Target.the("Campo para ingresar el nombre").locatedBy("//input[@id='firstName']");
    public static final Target TXT_APELLIDO = Target.the("Campo para ingresar el apellido").locatedBy("//input[@id='lastName']");
    public static final Target TXT_EMAIL = Target.the("Campo para ingresar el email").locatedBy("//input[@id='email']");
    public static final Target FECHAMES = Target.the("Seleccion del mes de nacimiento").locatedBy("//select[@id='birthMonth']");
    public static final Target FECHADIA = Target.the("Seleccion del dia de nacimiento").locatedBy("//select[@name='birthDay']");
    public static final Target FECHAANIO = Target.the("Seleccion del anio de nacimiento").locatedBy("//select[@id='birthYear']");
    public static final Target CAMPOIDIOMA = Target.the("Campo para ingresar el idioma").locatedBy("//input[@type='search']");
    public static final Target SELECIDIOMA = Target.the("Seleccion del idioma").locatedBy("//div[contains(text(),'Spanish')]");
    public static final Target BOTON1 = Target.the("Primer boton para avanzar al siguiente paso").locatedBy("//a[@aria-label='Next step - define your location']");
    public static final Target MENSAJE = Target.the("Mensaje para validar proceso").locatedBy("//span[contains(text(),'Add your address')]");
    public static final Target TXT_CIUDAD = Target.the("Campo para el ingreso de la ciudad").located(By.id("city"));
    public static final Target TXT_PAIS = Target.the("Campo para el ingreso del pais").locatedBy("//span[contains(text(),'Select a country')]");
    public static final Target BOTON2 = Target.the("Segundo boton para avanzar al siguiente paso").locatedBy("//a[@aria-label='Next step - select your devices']");
    public static final Target MARCACEL = Target.the("Campo para ingresar la marca del movil").locatedBy("//span[contains(text(),'Select Brand')]");
    public static final Target INPUTMARCACEL = Target.the("Seleccionar la marca del movil").locatedBy("//input[@placeholder='Select Brand']");
    public static final Target VERSIONCEL = Target.the("Campo para ingresar la version movil").locatedBy("//span[@aria-label='Select a Model']");
    public static final Target INPUTVERSIONCEL = Target.the("Seleccion version movil").locatedBy("//input[@placeholder='Select a Model']");
    public static final Target SOCEL = Target.the("Campo para el ingreso del sistema operativo movil").locatedBy("//span[@class='ui-select-placeholder text-muted']");
    public static final Target INPUTSOCEL = Target.the("Seleccion sistema operativo movil").locatedBy("//div[contains(text(),'Android 10')]");
    public static final Target BOTON3 = Target.the("Tercer boton para avanzar al siguiente paso").locatedBy("//a[@aria-label='Next - final step']");
    public static final Target PASSWORD = Target.the("Campo para ingresar la contrasena").located(By.id("password"));
    public static final Target CONFIRMPASSWORD = Target.the("Campo para ingresar la confirmacion de la contrasena").located(By.id("confirmPassword"));
    public static final Target TERMINOS = Target.the("Checkbox para terminos").located(By.id("termOfUse"));
    public static final Target POLITICAS = Target.the("Checkbox para politicas").located(By.id("privacySetting"));
    public static final Target BOTON4 = Target.the("Cuarto boton para finalizar el registro").located(By.id("laddaBtn"));
    public static final Target MENSAJEEXITOSO = Target.the("Mensaje para validar el registro exitoso").locatedBy("//h1");

}

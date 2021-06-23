package pages;

import org.openqa.selenium.By;

public class SelectTripPages {
    private static By btnVuelosSelect = By.xpath("//button[@class='select-cabin-button']");
    private static By lblTypeTrip = By.xpath("//span[@class='ff-name ff-name-branded-fare']");
    private static By btnTypeTrip = By.xpath("//button[@class='ff-price-container']");
    private static By btnBackPrincipal = By.xpath("//img[@alt='Avianca logo']//ancestor::a");
    private static By btnCerrarVentanaEmergente = By.xpath("//button[@aria-label='Cerrar ventana']");

    public static By getBtnVuelosSelect() {
        return btnVuelosSelect;
    }

    public static By getLblTypeTrip() {
        return lblTypeTrip;
    }

    public static By getBtnTypeTrip() {
        return btnTypeTrip;
    }

    public static By getBtnBackPrincipal() {
        return btnBackPrincipal;
    }

    public static By getBtnCerrarVentanaEmergente() {
        return btnCerrarVentanaEmergente;
    }
}


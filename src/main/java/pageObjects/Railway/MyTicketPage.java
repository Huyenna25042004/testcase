package pageObjects.Railway;

import common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class MyTicketPage {


    private final By btnCancelTicket = By.xpath("//input[@value='Cancel']");
    private final By ticketList = By.xpath("//div[@class='DivTable']");

    public boolean isMyTicketPageDisplayed() {
        String currentUrl = Constant.WEBDRIVER.getCurrentUrl();
        return currentUrl.contains("http://railwayb1.somee.com/Page/ManageTicket.cshtml");
    }

    public void cancelTicket() {
        Constant.WEBDRIVER.findElement(btnCancelTicket).click();
        Constant.WEBDRIVER.switchTo().alert().accept();
    }

    public boolean isTicketDisplayed() {
        return Constant.WEBDRIVER.findElements(ticketList).size() > 0;
    }
}

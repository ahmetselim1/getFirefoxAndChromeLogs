package com.fashionette.pages;

//import...

import com.fashionette.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){ PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//a[@title=\"Taschen\" and @data-flyout-target=\"taschen\"]")
    public WebElement bag;

    @FindBy(xpath = "//div[contains(@class,'flex-container')]//div[1]//div[1]//a[1]//div[1]//div[1]//img[1]")
    public WebElement valentino;

    @FindBy(xpath = "//*[@class=\"product-list__product-brand\"]")
    public WebElement productTitle;

    @FindBy(xpath = "//div[@class='btn btn--bigger-icon preventspinner btn-default']//div[@class='btn__content'][normalize-space()='In den Warenkorb']")
    public WebElement basket;

    @FindBy(xpath = "//div[@class='btn minicart__button minicart-dialog__go-to-cart']//span[contains(text(),'Zum Warenkorb')]")
    public WebElement buyButton;

    @FindBy(xpath = "//button[@id='checkout-start']")
    public WebElement checkOut;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Einloggen']")
    public WebElement login;

    @FindBy(xpath = "//div[@class='checkout-address row']//button[1]")
    public WebElement continueButton;

    @FindBy(xpath = "//div[contains(text(),'Eingegebene Rechnungsadresse verwenden')]")
    public WebElement confirmAddressButton;

    @FindBy(xpath = "//button[@name='PayPal Direct Payment']")
    public WebElement selectPayPal;

    @FindBy(xpath = "//div[@class='cart-item--brand']")
    public WebElement cartItemBrand;

    @FindBy(xpath = "//span[@class='cart-item--quantity ']")
    public WebElement cartItemQuantity;














}

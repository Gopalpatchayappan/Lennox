package com.assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends Base {

	public PojoClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='login-link btn NEEDS_AUTHENTICATION']")
	private WebElement sign;

	@FindBy(id = "j_username")
	private WebElement txtUserName;

	@FindBy(id = "j_password")
	private WebElement txtPassword;

	@FindBy(id = "loginSubmit")
	private WebElement txtLoginBtn;

	@FindBy(xpath = "//i[@class='far fa-bars v2-hamburger-menu']")
	private WebElement menuBtn;

	@FindBy(xpath = "(//a[@class='btn-v2'])[7]")
	private WebElement salesTool;

	@FindBy(xpath = "//a[(text()='Build a Proposal')]")
	private WebElement build_a_Proposal;

	@FindBy(xpath = "(//div[@class='moby-inner']//a[@class='button button-default create-lead-btn'])[2]")
	private WebElement selectLead;

	@FindBy(xpath = "(//i[@class='fas fa-plus btn-left'])[2]")
	private WebElement addLead;

	@FindBy(id = "firstName")
	private WebElement firstName;

	@FindBy(id = "lastName")
	private WebElement lastName;

	@FindBy(id = "phNo")
	private WebElement phNo;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "calender1")
	private WebElement calender;

	@FindBy(xpath = "(//a[@class='ui-state-default'])[10]")
	private WebElement date1;

	@FindBy(id = "scheduleRequestTime")
	private WebElement schedulResTime;

	@FindBy(id = "calender2")
	private WebElement calender1;

	@FindBy(xpath = "(//a[@class='ui-state-default'])[10]")
	private WebElement date2;

	@FindBy(xpath = "appointmentRequestTime")
	private WebElement appointTime;

	@FindBy(xpath = "//div[@class='leads-uploads-add']")
	private WebElement addDocument;

	@FindBy(xpath = "(//select[@name='documents[1].documentType'])[1]")
	private WebElement selectDocumentType;

	@FindBy(xpath = "(//a[@href='javascript:void(0)'])[3]")
	private WebElement selectFile;

	@FindBy(xpath = "//a[@class='btn btn-primary mr-15 add-documents-to-page mb-15']")
	private WebElement addLead1;

	@FindBy(id = "btn-addLeadsForm")
	private WebElement saveLead;

	@FindBy(xpath = "//div[@class='messages container']")
	private WebElement message;

	public WebElement getSign() {
		return sign;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtLoginBtn() {
		return txtLoginBtn;
	}

	public WebElement getMenuBtn() {
		return menuBtn;
	}

	public WebElement getSalesTool() {
		return salesTool;
	}

	public WebElement getBuild_a_Proposal() {
		return build_a_Proposal;
	}

	public WebElement getSelectLead() {
		return selectLead;
	}

	public WebElement getAddLead() {
		return addLead;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCalender() {
		return calender;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getSchedulResTime() {
		return schedulResTime;
	}

	public WebElement getCalender1() {
		return calender1;
	}

	public WebElement getDate2() {
		return date2;
	}

	public WebElement getAppointTime() {
		return appointTime;
	}

	public WebElement getAddDocument() {
		return addDocument;
	}

	public WebElement getSelectDocumentType() {
		return selectDocumentType;
	}

	public WebElement getSelectFile() {
		return selectFile;
	}

	public WebElement getAddLead1() {
		return addLead1;
	}

	public WebElement getSaveLead() {
		return saveLead;
	}

	public WebElement getMessage() {
		return message;
	}

}

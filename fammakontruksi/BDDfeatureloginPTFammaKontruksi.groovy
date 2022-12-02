package sanityloginpt.fammakontruksi
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class BDDfeatureloginPTFammaKontruksi {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Navigate To URL")
	def   Navigate_To_URL() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://famma-konstruksi.id/sigaka/')
		WebUI.click(findTestObject('Object Repository/sanity_PtFammaKontruksi/Page_Famma Nusantara - Konstruksi/a_Login Konstruksi_header-menu-toggle'))
		WebUI.click(findTestObject('Object Repository/sanity_PtFammaKontruksi/Page_Famma Nusantara - Konstruksi/a_Login Upah Tukang'))
	}

	@When("Input column Username and column Password")
	def  Input_column_Username_and_column_Password() {
		WebUI.setText(findTestObject('Object Repository/sanity_PtFammaKontruksi/Page_Login - Famma Nusantara-Konstruksi/input_Login_username'),
				'admin')
		WebUI.setEncryptedText(findTestObject('Object Repository/sanity_PtFammaKontruksi/Page_Login - Famma Nusantara-Konstruksi/input_Login_password'),
				'RAIVpflpDOg=')
	}

	@Then("I click button Login")
	def  I_click_button_Login() {
		WebUI.click(findTestObject('Object Repository/sanity_PtFammaKontruksi/Page_Login - Famma Nusantara-Konstruksi/button_Login'))
	}
}
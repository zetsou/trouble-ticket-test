import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-ticketing.mtn.ci/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Objets Page de Connexion/input_Utilisateur_form-control input-text ng-untouched ng-pristine ng-invalid'), 
    login)

WebUI.setText(findTestObject('Objets Page de Connexion/input_Mot de passe_form-control input-text ng-untouched ng-pristine ng-valid'), 
    GlobalVariable.password)

WebUI.click(findTestObject('Objets Page de Connexion/div_Se connecter'))

/*WebUI.verifyElementPresent(findTestObject('Objets de Création de ticket unitaire second/a_Ticket'), 10)*/
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Objets Page de Connexion/div_Erreur de connexion   Utilisateur non autoris'), 
    10)

WebUI.closeBrowser()


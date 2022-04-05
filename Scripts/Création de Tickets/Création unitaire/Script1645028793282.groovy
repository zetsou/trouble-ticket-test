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

WebUI.callTestCase(findTestCase('Page de connexion/Connexion/ConnexionTrue'), [('login') : 'itachi'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Objets de Création de ticket unitaire second/a_Ticket'))

WebUI.click(findTestObject('Objets de Création de ticket unitaire second/span_Nouveau ticket'))

WebUI.setText(findTestObject('Object Repository/Objets de Création de ticket unitaire second/input_Recherche_form-control rounded-pill ng-untouched ng-pristine ng-invalid'), 
    '0141294481')

WebUI.click(findTestObject('Object Repository/Objets de Création de ticket unitaire second/button_Recherche_btn btn-primary btn-sm rounded-circle btn-icon'))

WebUI.setText(findTestObject('Object Repository/Objets de Création de ticket unitaire second/input_Nom complet_form-control ng-untouched ng-pristine ng-invalid ng-star-inserted'), 
    'Tx Client')

WebUI.setText(findTestObject('Object Repository/Objets de Création de ticket unitaire second/input_Autre contact_form-control ng-untouched ng-pristine ng-invalid'), 
    '0141294481')

WebUI.click(findTestObject('Object Repository/Objets de Création de ticket unitaire second/button_Ajouter un ticket'))

WebUI.click(findTestObject('Objets de Création de ticket unitaire second/div_Catgorie_ng-select-container'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Objets de Création de Ticket unitaire/span_EQUIPE DE TEST SMILE'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Objets de Création de Ticket unitaire/div_Sous Catgorie 1_ng-select-container'))

WebUI.click(findTestObject('Objets de Création de Ticket unitaire/span_AUTOMATISATION'))

WebUI.click(findTestObject('Objets de Création de ticket unitaire second/div_Localisation_ng-select-container'))

WebUI.setText(findTestObject('Object Repository/Objets de Création de ticket unitaire second/input_Localisation_localisation'), 
    'yopo')

WebUI.click(findTestObject('Object Repository/Objets de Création de ticket unitaire second/span_Yopougon Ananeraie'))

WebUI.click(findTestObject('Objets de Création de Ticket unitaire/div_Trait par moi_ng-input'))

WebUI.click(findTestObject('Objets de Création de Ticket unitaire/div_Non'))

WebUI.setText(findTestObject('Object Repository/Objets de Création de ticket unitaire second/textarea_Description_form-control ng-untouc_77206a'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Objets de Création de ticket unitaire second/button_Enregistrement'))


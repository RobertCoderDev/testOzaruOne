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
import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.net.HttpURLConnection
import java.net.URL
import java.io.File

// Cargar el archivo de Excel
File excelFile = new File('C:\\Users\\arzat\\OneDrive\\Escritorio\\Brains\\data1.xlsx')
XSSFWorkbook workbook = new XSSFWorkbook(excelFile)

// Acceder a la primera hoja
def sheet = workbook.getSheetAt(0)

// Obtener el número total de filas
int totalRows = sheet.getLastRowNum()

// URL fija para la solicitud
String urlString = 'https://mamoru.ozaru.one/webhook'

for (int i = 0; i <= totalRows; i++) {
	def row = sheet.getRow(i)
	
	// Verificar si la fila es nula
	if (row == null) {
		println "Fila ${i+1} está vacía, saltando."
		continue
	}
	
	// Leer cada valor de la fila actual con validación de nulos y tipo de dato
	def source = row.getCell(0) != null ? row.getCell(0).getStringCellValue() : "" // Columna A
	def text = row.getCell(1) != null ? row.getCell(1).getStringCellValue() : ""   // Columna B
	def phone = row.getCell(2) != null ? row.getCell(2).toString() : ""            // Columna C
	def name = row.getCell(3) != null ? row.getCell(3).getStringCellValue() : ""   // Columna D
	def country = row.getCell(4) != null ? row.getCell(4).toString() : ""          // Columna E
	def dial = row.getCell(5) != null ? row.getCell(5).toString() : ""             // Columna F
	def urlImage = row.getCell(6) != null ? row.getCell(6).getStringCellValue() : "" // Columna G

	if (text != "") {
	// Construcción del body para texto
	String jsonInputString = """
    {
        "app": "ConUnBotProductivo",
        "timestamp": 1717603160697,
        "version": 2,
        "type": "message",
        "payload": {
            "id": "ABGHUhMyUGc2DwiQtcyhNGGufFojsdw4syRYq2A",
            "source": ${source},
            "type": "text",
            "payload": {
                "text": "${text}"
            }
        },
        "sender": {
            "phone": ${phone},
            "name": "${name}",
            "country_code": ${country},
            "dial_code": ${dial}
        }
    }
    """

	// Configurar la conexión HTTP para texto
	URL url = new URL(urlString)
	HttpURLConnection connection = (HttpURLConnection) url.openConnection()
	connection.setRequestMethod("POST")
	connection.setRequestProperty("Content-Type", "application/json")
	connection.setRequestProperty("Accept", "application/json")
	connection.setDoOutput(true)

	// Enviar el JSON como cuerpo de la solicitud para texto
	connection.outputStream.withWriter("UTF-8") { writer ->
		writer.write(jsonInputString)
	}

	// Obtener y verificar el código de respuesta del servidor para texto
	int responseCode = connection.getResponseCode()
	if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_CREATED) {
		InputStream responseStream = connection.getInputStream()
		String responseBody = responseStream.text
		responseStream.close()
		println "Respuesta del servidor para fila ${i+1} (texto): " + responseBody
	} else {
		println "Error en la solicitud para fila ${i+1} (texto): Código de respuesta HTTP " + responseCode
	}

	// Pausa de 25 segundos entre solicitudes de texto
	Thread.sleep(25000)
	}
	
	// Verificar si la columna G (urlImage) tiene un valor
	if (urlImage != "") {
		// Construcción del body para la imagen
		String jsonInputStringImage = """
        {
            "app": "ConUnBotProductivo",
            "timestamp": 1718141816794,
            "version": 2,
            "type": "message",
            "payload": {
                "id": "ABGHUhMyUGc2DwIQRAtdtgz9mN01avTFPY_3CA",
                "source": ${source},
                "type": "image",
                "payload": {
                    "caption": "A",
                    "url": "${urlImage}",
                    "contentType": "image/jpeg",
                    "urlExpiry": 1718746616794
                },
                "sender": {
                    "phone": ${phone},
                    "name": "${name}",
                    "country_code": ${country},
                    "dial_code": ${dial}
                }
            }
        }
        """
		
		// Configurar la conexión HTTP para imagen
		URL url = new URL(urlString)
		HttpURLConnection connectionImage = (HttpURLConnection) url.openConnection()
		connectionImage.setRequestMethod("POST")
		connectionImage.setRequestProperty("Content-Type", "application/json")
		connectionImage.setRequestProperty("Accept", "application/json")
		connectionImage.setDoOutput(true)

		// Enviar el JSON como cuerpo de la solicitud para imagen
		connectionImage.outputStream.withWriter("UTF-8") { writer ->
			writer.write(jsonInputStringImage)
		}

		// Obtener y verificar el código de respuesta del servidor para imagen
		int responseCodeImage = connectionImage.getResponseCode()
		if (responseCodeImage == HttpURLConnection.HTTP_OK || responseCodeImage == HttpURLConnection.HTTP_CREATED) {
			InputStream responseStreamImage = connectionImage.getInputStream()
			String responseBodyImage = responseStreamImage.text
			responseStreamImage.close()
			println "Respuesta del servidor para fila ${i+1} (imagen): " + responseBodyImage
		} else {
			println "Error en la solicitud para fila ${i+1} (imagen): Código de respuesta HTTP " + responseCodeImage
		}

		// Pausa de 25 segundos entre solicitudes de imagen
		Thread.sleep(25000)
	}
}

// Cerrar el archivo Excel
workbook.close()
<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Send_Message_CualesSonTareasDirector</name>
   <tag></tag>
   <elementGuidId>591892c7-6c9b-4bea-9f6c-d5f784157077</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;app\&quot;: \&quot;ConUnBotProductivo\&quot;,\n    \&quot;timestamp\&quot;: 1717603160697,\n    \&quot;version\&quot;: 2,\n    \&quot;type\&quot;: \&quot;message\&quot;,\n    \&quot;payload\&quot;: {\n        \&quot;id\&quot;: \&quot;ABGHUhMyUGc2DwIQtcyhNgGufrQjsw4wsYYqzA\&quot;,\n        \&quot;source\&quot;: \&quot;5213515006338\&quot;,\n        \&quot;type\&quot;: \&quot;text\&quot;,\n        \&quot;payload\&quot;: {\n            \&quot;text\&quot;: \&quot;Cuales osn las tareas de un director general?\&quot;\n        },\n        \&quot;sender\&quot;: {\n            \&quot;phone\&quot;: \&quot;5213515006338\&quot;,\n            \&quot;name\&quot;: \&quot;Misael\&quot;,\n            \&quot;country_code\&quot;: \&quot;52\&quot;,\n            \&quot;dial_code\&quot;: \&quot;13515006338\&quot;\n        }\n    }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>cf5f4e83-0851-41e0-8b31-5c995b3f2b98</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>User-Agent</name>
      <type>Main</type>
      <value>PostmanRuntime/7.41.2</value>
      <webElementGuid>6ef34043-cdbb-46da-9f73-04b7b3cbf048</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>*/*</value>
      <webElementGuid>0056630c-2b0c-4bb2-b92a-7ef4371f1d83</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Encoding</name>
      <type>Main</type>
      <value>gzip, deflate, br</value>
      <webElementGuid>60af8f3f-10dd-4254-a6ca-74b82232e3d4</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Connection</name>
      <type>Main</type>
      <value>keep-alive</value>
      <webElementGuid>3bef11a5-bb0c-4720-a775-8503126f1e69</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://mamoru.ozaru.one/webhook</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

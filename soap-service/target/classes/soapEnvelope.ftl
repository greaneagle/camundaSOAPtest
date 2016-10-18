<soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:tem="http://webservices.daehosting.com/temperature">
   <soap:Header/>
   <soap:Body>
      <tem:CelsiusToFahrenheit>
         <tem:nCelsius>${celsius}</tem:nCelsius>
      </tem:CelsiusToFahrenheit>
   </soap:Body>
</soap:Envelope>
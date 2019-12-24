# quotes

Aplikacija se integriše sa open API serverskom aplikacijom koja se nalazi na adresi http://quotes.rest.
Za razmenu HTTP zahteva koristi se RestTemplate i ObjectMapper za mapiranje JSON odgovora u POJO klasu.

Uz to ova aplikacija je i Eureka klijent pa je potrebno dodati i:
1. dodati spring-cloud-starter-netflix-eureka-client dependecy u pom.xml fajl
2. dodati anotaciju @EnableEurekaClient u @SpringBootApplication klasu
3. dodati dodatne properties u application.properties fajl

Napomena: Biblioteke koje smo u kod dodali kroz dependecy injection dodaju se na classpath naše aplikacije i taj kod nam je dostupan u folderu Maven Dependecies. 
To znači da žeti opis klase i njenih metoda možete videti iz koda kada je otvoren iz STS-a (Spring Tool Suite) - CTRL+klik na klasu koju želite da otvorite.

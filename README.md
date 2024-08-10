<p><b>Bu projede Amazon'da bir ürünü sepete ekleyerek anasayfaya dönülmesi hedeflenmiştir. </b></p> 

Bu otomaston projesinde; otomasyon aracı olarak Selenyum, yazılım dili olarak Java, ortam gelistiricisi olarak IntelliJ ve 
Framework olarak Cucumber kullanilarak BDD formatıyla yazılan testcase otomasyonla koşularak test edilmistir.

pom.xml dosyasında; 

<p><b>Selenyum için kullanilan kutuphane,</b></p> 

![image](https://github.com/user-attachments/assets/6900e092-edc4-4aee-aaac-5ece28b66015)

<p><b>JUnit için kullanilan kutuphane,</b></p> 

![image](https://github.com/user-attachments/assets/78649af5-3b12-49e4-9631-31865e42b793)


<p><b>Allure report için kullanilan kutuphane,</b></p> 

![image](https://github.com/user-attachments/assets/be7ab778-056f-4c75-bbac-4684f67419de)



<p><b>Page package'i altında Base classi olusturuldu.</b></p> 

![Ekran görüntüsü 2024-08-10 222903](https://github.com/user-attachments/assets/12792150-aa52-48a7-961f-e2a6160728a6)


<p><b>Base classi abstract olacak sekilde olusturuldu. Diger classlarda kullanilacak objeler, Base classında class seviyesinde tanimlandi ve initialize methodunda atamalari yapildi </b></p> 

![Ekran görüntüsü 2024-08-10 223002](https://github.com/user-attachments/assets/8182e1b9-ccd8-4933-a2ca-c4619ccd5a2b)


<p><b>Initialize methodu ile Driver classından çagirilarak olustulan objeler Driver calistikca kullanimi kolaylastirilmis oldu </b></p> 

![Ekran görüntüsü 2024-08-10 223038](https://github.com/user-attachments/assets/f5eb3024-acf5-4bd0-96c3-31969b585dfc)


<p><b>Diger classlarda ise Base classı extends edilerek Base classında olusturulan objelere erisim kolayligi saglandi </b></p> 

![Ekran görüntüsü 2024-08-10 223118](https://github.com/user-attachments/assets/1ed7f4a5-de41-426a-8d05-df330d0e691f)

![Ekran görüntüsü 2024-08-10 223129](https://github.com/user-attachments/assets/fae939d7-e414-4477-ba24-99d988de71f6)



<p><b>Feature directorysi altinda TestCaseler feature uzantili dosyalar olarak BDD formatiyla olusturuldu </b></p> 

TC01

![Ekran görüntüsü 2024-08-10 223227](https://github.com/user-attachments/assets/0a830321-f008-43f3-995b-2d6294afafe5)



<p><b>Test Raporlari</b></p>

<p><b>Testleri calistirdiktan sonra hem Cucumber report'a hem Allure report'a bakilarak incelemeler yapilmistir. </b></p> 

<p><b>Cucumber Rapor </b></p> 

![Ekran görüntüsü 2024-08-10 223400](https://github.com/user-attachments/assets/13ca81c1-2ae5-48e5-a8a4-9749b393309a)



<p><b>Allure Rapor </b></p> 

![Ekran görüntüsü 2024-08-10 222132](https://github.com/user-attachments/assets/44f376b7-c50d-4424-8176-b74dd95afc72)

![Ekran görüntüsü 2024-08-10 222142](https://github.com/user-attachments/assets/f288c905-1923-4de2-b273-620bcd62daa0)


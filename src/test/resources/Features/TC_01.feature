Feature: US_001 Amazonda sepetime ürün eklemek istiyorum

  @amazon
  Scenario: TC_001 Amazonda ürün sepete eklenerek anasayfaya geri dönülmeli


    Given Kullanici "amazonUrl" adresine gider
    When Anasayfanin acildigi dogrulanir
    When Searchboxa 'text' yazilarak aratilir
    And Acilan sayfada samsung icin sonuc bulundugu dogrulanir
    Then İkinci sayfa ikonuna tiklanir
    And Acilan sayfanin ilgili sayfa oldugu dogrulanir
    Then Ustten besinci satir birinci sutundaki urune tiklanir
    Then Urun detay sayfasinin acildigi dogrulanir
    Then Urun sepete eklenir
    Then Sepet sayfasinin acildigi dogrulanir
    Then Logoya tiklanarak ana sayfaya geri donulur

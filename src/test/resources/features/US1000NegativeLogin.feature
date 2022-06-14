Feature: US1000 Negative Login

@negativeLogin
  Scenario:
  TC03_b_Login_User_With_Wrong_email_and_password
  ( yanlis e-posta ve sifre ile kullanici oturum acma)

    When kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    Then kullanici signup-login butonuna tiklar
    Then kullanicinin Login to your account yazisinin gorunur oldugunu test eder
    Then kullanici yanlis email ve sifreyi  girer
    Then kullanici Your email or password is incorrect! yazisinin goruldugunu test eder

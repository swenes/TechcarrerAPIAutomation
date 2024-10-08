# Petstore API Test Otomasyonu

Bu proje, [Petstore API](https://petstore.swagger.io/) üzerinde kullanıcı işlemlerini otomatikleştirmek için yazılmış bir Java uygulamasıdır. **Rest Assured** kütüphanesi kullanılarak kullanıcı oluşturma, güncelleme, silme ve doğrulama işlemleri gerçekleştirilmiştir.

## Özellikler

- Yeni kullanıcı oluşturma
- Kullanıcı bilgilerini doğrulama
- Kullanıcı güncelleme
- Güncellenen kullanıcı bilgilerini doğrulama
- Kullanıcı silme

## Gereksinimler

- Java 8 veya üzeri
- Maven
- JUnit 5
- Rest Assured

## Kurulum

1. **Proje Klonlama**:

   ```bash
   git clone [https://github.com/kullanici_adi/proje_adi.git](https://github.com/swenes/TechcarrerAPIAutomation.git)
## Gereksinimler

- Java 8 veya üzeri
- Maven
- JUnit 5
- Rest Assured


## Test Senaryoları

### 1. Kullanıcı Oluşturma
- **Metod**: `createUser()`
- **Açıklama**: Belirtilen bilgilerle yeni bir kullanıcı oluşturur.

### 2. Kullanıcıyı Doğrulama
- **Metod**: `verifyUser()`
- **Açıklama**: Oluşturulan kullanıcının bilgilerini doğrular.

### 3. Kullanıcı Güncelleme
- **Metod**: `updateUser()`
- **Açıklama**: Var olan bir kullanıcının bilgilerini günceller.

### 4. Güncellenen Kullanıcıyı Doğrulama
- **Metod**: `verifyUpdatedUser()`
- **Açıklama**: Güncellenen kullanıcının bilgilerini doğrular.

### 5. Kullanıcı Silme
- **Metod**: `deleteUser()`
- **Açıklama**: Var olan bir kullanıcıyı siler.

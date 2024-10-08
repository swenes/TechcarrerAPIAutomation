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
   git clone https://github.com/swenes/TechcarrerAPIAutomation.git
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

![allureAutomation2](https://github.com/user-attachments/assets/d87bf76b-c4dd-440e-b86d-2ac1ecac2445)
![allureAutomation](https://github.com/user-attachments/assets/e1cad4c6-a22f-4932-86d8-0eb72e4a02d1)


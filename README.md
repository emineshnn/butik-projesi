# 💎 Butik Takı Satış Sistemi

Bu proje Java Spring Boot kullanılarak geliştirilmiş bir butik takı satış sistemi backend uygulamasıdır.

## Özellikler

- Ürün Listeleme
- Ürün Ekleme
- Ürün Güncelleme
- Ürün Silme
- Kategori Yönetimi
- Marka Yönetimi
- Tedarikçi Yönetimi
- Müşteri Yönetimi
- Sipariş Yönetimi
- PostgreSQL Veritabanı
- REST API

---

## Kullanılan Teknolojiler

- Java 25
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Docker
- Maven
- Lombok
- Validation
- Postman

---

## Veritabanı

PostgreSQL Docker üzerinde çalışmaktadır.

Database:

```
butikdb
```

---

## API Örnekleri

### Ürünleri Listele

GET

```
http://localhost:8080/api/products
```

### Ürün Ekle

POST

```
http://localhost:8080/api/products
```

Örnek JSON

```json
{
  "productName":"Altın Kolye",
  "description":"22 Ayar Altın Kolye",
  "price":1500,
  "stock":10,
  "imageUrl":"kolye.jpg"
}
```

---

## Proje Yapısı

```
controller
service
repository
entity
dto
config
exception
```

---

## Kurulum

1. Docker çalıştırılır.
2. PostgreSQL Container başlatılır.
3. IntelliJ üzerinden proje açılır.
4. Maven bağımlılıkları yüklenir.
5. Spring Boot çalıştırılır.
6. Postman ile API test edilir.

---

## Geliştirici

Emine
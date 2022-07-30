# javaKatmanl-Mimari

*Bu repositoryde java da katmanlı mimari örneğini kodladım.*

###### Başlıca paketler:

**Business**
  > Business katmanında sadece iş kuralları yazılmalıdır (if-else vs.).
  
**Core**
  > Core katmanında ise uygulamanın her yerinde kullanılacak olan kodlar yazılmalıdır.

**DataAccess**
  > DataAccess katmanının içeriği veriye erişmek ile ilgili olmalıdır. Bunun dışında kod yazılmamalıdır.  

**Entities**
  > Entities katmanında somut sınıflar bulunmalıdır (Product, Customer vb.).
  
**JLogger**
  > JLogger katmanı bu projeyle alakalı olmayan her hangi bir mikroservis olarak ele alınmıştır ve core katmanında bu servisin bağımlılıktan çıkarılarak kullanımı ele alınmıştır.
  
  
  ## Her katmanın içinde soyut ve somut katmanları bulunmalıdır.
  ```
  Bu iki katman içerisinde, soyut katmanda (Abstracts) interface ve abstract sınıflar bulunmalıdır.
  Concretes katmanında ise iş yapan sınıflar bulunabilir.
  
  ```
  

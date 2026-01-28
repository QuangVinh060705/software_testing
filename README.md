# Thực hành kiểm thử phần mềm

Dự án này phục vụ mục đích **thực hành và tổng hợp các kỹ thuật kiểm thử phần mềm**, bao gồm:
- Kiểm thử hộp đen bằng **bảng quyết định**
- Kiểm thử đơn vị cho chương trình Java
- Kiểm thử tự động giao diện người dùng bằng **Cypress**
- Kiểm thử hiệu năng hệ thống bằng **JMeter**

Dự án được tổ chức theo cấu trúc rõ ràng, phù hợp để nộp bài, báo cáo học phần và đánh giá thực hành.

---

## Mục tiêu dự án
- Hiểu và áp dụng quy trình kiểm thử phần mềm từ thủ công đến tự động
- Rèn luyện tư duy thiết kế ca kiểm thử
- Áp dụng kiểm thử hộp đen bằng bảng quyết định
- Thực hành kiểm thử đơn vị với JUnit 5 cho chương trình Java
- Thực hành kiểm thử giao diện người dùng bằng Cypress
- Thực hành kiểm thử hiệu năng hệ thống bằng JMeter
- Làm quen với quy trình quản lý mã nguồn trên GitHub

---

## Nội dung thực hành

### 1. Đánh giá giao diện người dùng
**Thời gian thực hiện:** 05/01

- Thực hành đánh giá giao diện người dùng thông qua trang:
  https://cantunsee.space/
- Phân tích các yếu tố:
  - Bố cục giao diện
  - Màu sắc
  - Tính dễ sử dụng
- Nhận diện các lỗi thiết kế giao diện thường gặp
- So sánh giao diện tốt và giao diện chưa tốt từ góc nhìn người dùng
  
![Ảnh kết quả](Picture/Screenshot 2026-01-05 142256.png)
---

### 2. Kiểm thử hộp đen bằng bảng quyết định
**Thời gian thực hiện:** 28/01

- Xây dựng bảng quyết định cho bài toán xử lý dữ liệu
- Xác định:
  - Điều kiện đầu vào
  - Hành động tương ứng
- Thiết kế ca kiểm thử dựa trên bảng quyết định
- Tài liệu minh chứng:
  - `Bảng quyết định.docx`
  - `Kiểm thử hộp đen.docx`

📁 Thư mục liên quan: `src`

---

### 3. Kiểm thử đơn vị chương trình Java
**Thời gian thực hiện:** 020/01

- Xây dựng chương trình phân tích điểm số học sinh
- Lớp xử lý chính: `StudentAnalyzer`
  - Đếm số học sinh giỏi (điểm ≥ 8.0)
  - Tính điểm trung bình hợp lệ
  - Loại bỏ dữ liệu không hợp lệ (điểm < 0 hoặc > 10)
- Viết ca kiểm thử cho:
  - Trường hợp hợp lệ
  - Trường hợp biên
  - Trường hợp dữ liệu sai
- Sử dụng JUnit 5 để kiểm thử tự động
- Lớp kiểm thử: `StudentAnalyzerTest`

📁 Thư mục liên quan:
- `src`
- `test`

---

### 4. Kiểm thử giao diện người dùng bằng Cypress
**Thời gian thực hiện:** 25/01

- Viết kịch bản kiểm thử tự động cho website giả lập
- Các chức năng được kiểm thử:
  - Đăng nhập
  - Thêm sản phẩm vào giỏ hàng
  - Thanh toán
- Mỗi chức năng được tách thành một kịch bản riêng

📁 Thư mục liên quan:

cypress-exercise/

└── cypress/e2e/

├── login_spec.cy.js

├── cart_spec.cy.js

└── checkout_spec.cy.js


---

### 5. Kiểm thử hiệu năng hệ thống bằng JMeter
**Thời gian thực hiện:** 26/01

- Thiết kế kịch bản kiểm thử hiệu năng cho website
- Thực hiện đo:
  - Thời gian phản hồi
  - Khả năng chịu tải
- Phân tích kết quả kiểm thử thông qua biểu đồ và hình ảnh

📁 Thư mục liên quan:

jmeter-exercise/

├── test-plan/

├── results/

├── results_1.png

├── results_2.png

└── results_3.png


---

## Công cụ và công nghệ sử dụng
- Java
- JUnit 5
- Maven
- Cypress
- JMeter
- Git và GitHub

---

## Yêu cầu môi trường
- Java phiên bản 11 trở lên
- Apache Maven
- Trình soạn thảo mã nguồn (IntelliJ IDEA, Eclipse hoặc Visual Studio Code)
- Trình duyệt hiện đại để chạy Cypress

---

## Cấu trúc thư mục dự án
software_testing

├── cypress-exercise

├── jmeter-exercise

├── src

│ ├── Bảng quyết định.docx

│ ├── Kiểm thử hộp đen.docx

│ └── StudentAnalyzer.java

├── test

│ └── StudentAnalyzerTest.java

└── README.md

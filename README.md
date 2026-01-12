# Software Testing Practice (JUnit 5)

Dự án thực hành **kiểm thử phần mềm (Software Testing)**, tập trung vào đánh giá giao diện người dùng và viết **Unit Test với JUnit 5** trong Java.

Mục tiêu của dự án là rèn luyện tư duy kiểm thử, kỹ năng viết test case, sử dụng Maven và quản lý mã nguồn bằng Git/GitHub.

---

## 🎯 Mục tiêu dự án
- Hiểu và áp dụng các nguyên tắc kiểm thử phần mềm
- Thực hành đánh giá giao diện người dùng (UI Testing)
- Viết Unit Test bằng JUnit 5 cho chương trình Java
- Làm quen với Maven và quy trình làm việc với GitHub

---

## 📌 Nội dung chính

### 1️⃣ Đánh giá giao diện người dùng  
**📅 Ngày thực hiện: 05/01**

- Thực hành đánh giá giao diện người dùng thông qua website: https://cantunsee.space/
- Phân tích các yếu tố về:
  - Bố cục giao diện
  - Màu sắc
  - Khả năng sử dụng (usability)
- Nhận diện các lỗi thiết kế UI thường gặp
- So sánh giao diện tốt và chưa tốt theo góc nhìn người dùng thực tế

---

### 2️⃣ Thực hành Unit Test với JUnit 5  
**📅 Ngày thực hiện: 08/01**

- Xây dựng chương trình Java phân tích điểm số học sinh
- Lớp chính: `StudentAnalyzer`
  - Đếm số học sinh giỏi (điểm ≥ 8.0)
  - Tính điểm trung bình hợp lệ
  - Loại bỏ dữ liệu không hợp lệ (điểm < 0 hoặc > 10)
- Viết Unit Test cho:
  - Trường hợp dữ liệu hợp lệ
  - Trường hợp biên
  - Trường hợp dữ liệu sai
- Sử dụng JUnit 5 để kiểm thử tự động
- Quản lý công việc bằng GitHub Issues
- Commit code gắn với từng issue cụ thể

---

## 🧰 Công nghệ sử dụng
- **Java**
- **JUnit 5**
- **Maven**
- **Git & GitHub**

---

## ⚙️ Yêu cầu môi trường
- Java 11 trở lên
- Apache Maven
- IDE (IntelliJ IDEA / Eclipse / VS Code)

---

## 📂 Cấu trúc dự án

software_testing
│── main/java
│── test/java
│── pom.xml
│── README.md


## 🚀 Hướng dẫn cài đặt & chạy kiểm thử

### 1. Clone repository
```bash
git clone https://github.com/QuangVinh060705/software_testing.git
cd software_testing
